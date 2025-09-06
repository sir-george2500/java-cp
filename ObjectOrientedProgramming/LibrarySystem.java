import java.util.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

// Library Management System - Complete Implementation

// Book.java
class Book {
    private String isbn;
    private String title;
    private String author;
    private String genre;
    private boolean isAvailable;
    private LocalDate publishDate;
    
    public Book(String isbn, String title, String author) {
        this(isbn, title, author, "General", LocalDate.now());
    }
    
    public Book(String isbn, String title, String author, String genre, LocalDate publishDate) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.publishDate = publishDate;
        this.isAvailable = true;
    }
    
    // Getters and setters
    public String getIsbn() { return isbn; }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public String getGenre() { return genre; }
    public boolean isAvailable() { return isAvailable; }
    public LocalDate getPublishDate() { return publishDate; }
    
    public void setAvailable(boolean available) { 
        isAvailable = available; 
    }
    
    @Override
    public String toString() {
        return String.format("%s by %s (ISBN: %s) - %s", 
            title, author, isbn, isAvailable ? "Available" : "Borrowed");
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Book book = (Book) obj;
        return isbn.equals(book.isbn);
    }
    
    @Override
    public int hashCode() {
        return isbn.hashCode();
    }
}

// Member.java
class Member {
    private String memberId;
    private String name;
    private String email;
    private List<Book> borrowedBooks;
    private LocalDate membershipDate;
    private static final int MAX_BOOKS = 5;
    
    public Member(String memberId, String name, String email) {
        this.memberId = memberId;
        this.name = name;
        this.email = email;
        this.borrowedBooks = new ArrayList<>();
        this.membershipDate = LocalDate.now();
    }
    
    public boolean canBorrowMore() {
        return borrowedBooks.size() < MAX_BOOKS;
    }
    
    public boolean borrowBook(Book book) {
        if (canBorrowMore() && !borrowedBooks.contains(book)) {
            borrowedBooks.add(book);
            return true;
        }
        return false;
    }
    
    public boolean returnBook(Book book) {
        return borrowedBooks.remove(book);
    }
    
    public void displayBorrowedBooks() {
        System.out.println("\n" + name + "'s borrowed books:");
        if (borrowedBooks.isEmpty()) {
            System.out.println("No books currently borrowed");
        } else {
            for (int i = 0; i < borrowedBooks.size(); i++) {
                System.out.println((i + 1) + ". " + borrowedBooks.get(i).getTitle());
            }
        }
    }
    
    // Getters
    public String getMemberId() { return memberId; }
    public String getName() { return name; }
    public String getEmail() { return email; }
    public List<Book> getBorrowedBooks() { return new ArrayList<>(borrowedBooks); }
    public LocalDate getMembershipDate() { return membershipDate; }
    public static int getMaxBooks() { return MAX_BOOKS; }
}

// Library.java
class Library {
    private Map<String, Book> books;
    private Map<String, Member> members;
    private List<String> transactionHistory;
    
    public Library() {
        books = new HashMap<>();
        members = new HashMap<>();
        transactionHistory = new ArrayList<>();
    }
    
    // Book management
    public void addBook(Book book) {
        books.put(book.getIsbn(), book);
        addTransaction("Added book: " + book.getTitle());
    }
    
    public boolean removeBook(String isbn) {
        Book removedBook = books.remove(isbn);
        if (removedBook != null) {
            addTransaction("Removed book: " + removedBook.getTitle());
            return true;
        }
        return false;
    }
    
    // Member management
    public void addMember(Member member) {
        members.put(member.getMemberId(), member);
        addTransaction("Added member: " + member.getName());
    }
    
    public boolean removeMember(String memberId) {
        Member member = members.get(memberId);
        if (member != null && member.getBorrowedBooks().isEmpty()) {
            members.remove(memberId);
            addTransaction("Removed member: " + member.getName());
            return true;
        }
        return false; // Cannot remove member with borrowed books
    }
    
    // Borrowing and returning
    public boolean borrowBook(String memberId, String isbn) {
        Member member = members.get(memberId);
        Book book = books.get(isbn);
        
        if (member == null) {
            System.out.println("Member not found");
            return false;
        }
        
        if (book == null) {
            System.out.println("Book not found");
            return false;
        }
        
        if (!book.isAvailable()) {
            System.out.println("Book is already borrowed");
            return false;
        }
        
        if (!member.canBorrowMore()) {
            System.out.println("Member has reached borrowing limit");
            return false;
        }
        
        book.setAvailable(false);
        member.borrowBook(book);
        String transaction = member.getName() + " borrowed " + book.getTitle();
        addTransaction(transaction);
        System.out.println("✅ " + transaction);
        return true;
    }
    
    public boolean returnBook(String memberId, String isbn) {
        Member member = members.get(memberId);
        Book book = books.get(isbn);
        
        if (member != null && book != null && !book.isAvailable()) {
            if (member.returnBook(book)) {
                book.setAvailable(true);
                String transaction = member.getName() + " returned " + book.getTitle();
                addTransaction(transaction);
                System.out.println("✅ " + transaction);
                return true;
            }
        }
        
        System.out.println("❌ Return failed - invalid member, book, or book not borrowed by this member");
        return false;
    }
    
    // Search functionality
    public List<Book> searchBooksByTitle(String title) {
        return books.values().stream()
            .filter(book -> book.getTitle().toLowerCase().contains(title.toLowerCase()))
            .toList();
    }
    
    public List<Book> searchBooksByAuthor(String author) {
        return books.values().stream()
            .filter(book -> book.getAuthor().toLowerCase().contains(author.toLowerCase()))
            .toList();
    }
    
    public List<Book> getAvailableBooks() {
        return books.values().stream()
            .filter(Book::isAvailable)
            .toList();
    }
    
    // Display methods
    public void displayAvailableBooks() {
        List<Book> availableBooks = getAvailableBooks();
        System.out.println("\n📚 Available Books (" + availableBooks.size() + "):");
        if (availableBooks.isEmpty()) {
            System.out.println("No books available");
        } else {
            availableBooks.forEach(book -> System.out.println("• " + book));
        }
    }
    
    public void displayAllMembers() {
        System.out.println("\n👥 Library Members (" + members.size() + "):");
        members.values().forEach(member -> {
            System.out.println("• " + member.getName() + " (ID: " + member.getMemberId() + 
                ") - " + member.getBorrowedBooks().size() + " books borrowed");
        });
    }
    
    public void displayTransactionHistory() {
        System.out.println("\n📋 Transaction History:");
        if (transactionHistory.isEmpty()) {
            System.out.println("No transactions yet");
        } else {
            for (int i = Math.max(0, transactionHistory.size() - 10); i < transactionHistory.size(); i++) {
                System.out.println((i + 1) + ". " + transactionHistory.get(i));
            }
        }
    }
    
    // Statistics
    public void displayStatistics() {
        int totalBooks = books.size();
        int availableBooks = (int) books.values().stream().filter(Book::isAvailable).count();
        int borrowedBooks = totalBooks - availableBooks;
        
        System.out.println("\n📊 Library Statistics:");
        System.out.println("Total Books: " + totalBooks);
        System.out.println("Available Books: " + availableBooks);
        System.out.println("Borrowed Books: " + borrowedBooks);
        System.out.println("Total Members: " + members.size());
        System.out.println("Total Transactions: " + transactionHistory.size());
    }
    
    private void addTransaction(String transaction) {
        String timestamp = LocalDate.now().format(DateTimeFormatter.ISO_LOCAL_DATE);
        transactionHistory.add("[" + timestamp + "] " + transaction);
    }
}