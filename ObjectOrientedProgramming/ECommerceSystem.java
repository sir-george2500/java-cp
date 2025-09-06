import java.util.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

// E-commerce System - Complete Implementation

// Product hierarchy
abstract class Product {
    protected String id;
    protected String name;
    protected double price;
    protected int stock;
    protected String description;
    
    public Product(String id, String name, double price, int stock, String description) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.stock = stock;
        this.description = description;
    }
    
    public abstract String getCategory();
    public abstract Map<String, String> getSpecifications();
    
    public boolean isInStock() {
        return stock > 0;
    }
    
    public boolean reduceStock(int quantity) {
        if (stock >= quantity) {
            stock -= quantity;
            return true;
        }
        return false;
    }
    
    public void addStock(int quantity) {
        stock += quantity;
    }
    
    // Getters and setters
    public String getId() { return id; }
    public String getName() { return name; }
    public double getPrice() { return price; }
    public int getStock() { return stock; }
    public String getDescription() { return description; }
    
    public void setPrice(double price) { this.price = price; }
    public void setDescription(String description) { this.description = description; }
    
    @Override
    public String toString() {
        return String.format("%s - $%.2f (Stock: %d)", name, price, stock);
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Product product = (Product) obj;
        return id.equals(product.id);
    }
    
    @Override
    public int hashCode() {
        return id.hashCode();
    }
}

// Electronics product
class Electronics extends Product {
    private String brand;
    private int warrantyMonths;
    private String model;
    
    public Electronics(String id, String name, double price, int stock, String description,
                      String brand, int warrantyMonths, String model) {
        super(id, name, price, stock, description);
        this.brand = brand;
        this.warrantyMonths = warrantyMonths;
        this.model = model;
    }
    
    @Override
    public String getCategory() {
        return "Electronics";
    }
    
    @Override
    public Map<String, String> getSpecifications() {
        Map<String, String> specs = new HashMap<>();
        specs.put("Brand", brand);
        specs.put("Model", model);
        specs.put("Warranty", warrantyMonths + " months");
        return specs;
    }
    
    public String getBrand() { return brand; }
    public int getWarrantyMonths() { return warrantyMonths; }
    public String getModel() { return model; }
}

// Clothing product
class Clothing extends Product {
    private String size;
    private String color;
    private String material;
    
    public Clothing(String id, String name, double price, int stock, String description,
                   String size, String color, String material) {
        super(id, name, price, stock, description);
        this.size = size;
        this.color = color;
        this.material = material;
    }
    
    @Override
    public String getCategory() {
        return "Clothing";
    }
    
    @Override
    public Map<String, String> getSpecifications() {
        Map<String, String> specs = new HashMap<>();
        specs.put("Size", size);
        specs.put("Color", color);
        specs.put("Material", material);
        return specs;
    }
    
    public String getSize() { return size; }
    public String getColor() { return color; }
    public String getMaterial() { return material; }
}

// Books product
class Books extends Product {
    private String author;
    private String isbn;
    private int pages;
    private String publisher;
    
    public Books(String id, String name, double price, int stock, String description,
                String author, String isbn, int pages, String publisher) {
        super(id, name, price, stock, description);
        this.author = author;
        this.isbn = isbn;
        this.pages = pages;
        this.publisher = publisher;
    }
    
    @Override
    public String getCategory() {
        return "Books";
    }
    
    @Override
    public Map<String, String> getSpecifications() {
        Map<String, String> specs = new HashMap<>();
        specs.put("Author", author);
        specs.put("ISBN", isbn);
        specs.put("Pages", String.valueOf(pages));
        specs.put("Publisher", publisher);
        return specs;
    }
    
    public String getAuthor() { return author; }
    public String getIsbn() { return isbn; }
    public int getPages() { return pages; }
    public String getPublisher() { return publisher; }
}

// Shopping cart item
class CartItem {
    private Product product;
    private int quantity;
    
    public CartItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }
    
    public double getTotalPrice() {
        return product.getPrice() * quantity;
    }
    
    public Product getProduct() { return product; }
    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }
    
    @Override
    public String toString() {
        return String.format("%s x%d = $%.2f", product.getName(), quantity, getTotalPrice());
    }
}

// Shopping cart
class ShoppingCart {
    private Map<String, CartItem> items;
    
    public ShoppingCart() {
        items = new HashMap<>();
    }
    
    public void addItem(Product product, int quantity) {
        if (product.getStock() < quantity) {
            System.out.println("❌ Not enough stock for " + product.getName());
            return;
        }
        
        String productId = product.getId();
        if (items.containsKey(productId)) {
            CartItem existingItem = items.get(productId);
            int newQuantity = existingItem.getQuantity() + quantity;
            if (product.getStock() >= newQuantity) {
                existingItem.setQuantity(newQuantity);
                System.out.println("✅ Updated quantity for " + product.getName());
            } else {
                System.out.println("❌ Not enough stock to add more " + product.getName());
            }
        } else {
            items.put(productId, new CartItem(product, quantity));
            System.out.println("✅ Added " + quantity + "x " + product.getName() + " to cart");
        }
    }
    
    public void removeItem(String productId) {
        CartItem removed = items.remove(productId);
        if (removed != null) {
            System.out.println("✅ Removed " + removed.getProduct().getName() + " from cart");
        }
    }
    
    public void updateQuantity(String productId, int newQuantity) {
        CartItem item = items.get(productId);
        if (item != null) {
            if (newQuantity <= 0) {
                removeItem(productId);
            } else if (item.getProduct().getStock() >= newQuantity) {
                item.setQuantity(newQuantity);
                System.out.println("✅ Updated quantity for " + item.getProduct().getName());
            } else {
                System.out.println("❌ Not enough stock for requested quantity");
            }
        }
    }
    
    public double getTotalAmount() {
        return items.values().stream().mapToDouble(CartItem::getTotalPrice).sum();
    }
    
    public List<CartItem> getItems() {
        return new ArrayList<>(items.values());
    }
    
    public void clear() {
        items.clear();
    }
    
    public boolean isEmpty() {
        return items.isEmpty();
    }
    
    public void displayCart() {
        System.out.println("\n🛒 Shopping Cart:");
        if (isEmpty()) {
            System.out.println("Cart is empty");
        } else {
            items.values().forEach(item -> System.out.println("• " + item));
            System.out.println("Total: $" + String.format("%.2f", getTotalAmount()));
        }
    }
}

// Payment processing interfaces and implementations
interface PaymentProcessor {
    boolean processPayment(double amount, String paymentDetails);
    String getPaymentMethod();
}

class CreditCardProcessor implements PaymentProcessor {
    @Override
    public boolean processPayment(double amount, String cardNumber) {
        // Simulate payment processing
        System.out.println("💳 Processing credit card payment of $" + String.format("%.2f", amount));
        System.out.println("Card ending in: ****" + cardNumber.substring(cardNumber.length() - 4));
        // Simulate processing time
        try { Thread.sleep(1000); } catch (InterruptedException e) {}
        System.out.println("✅ Payment successful!");
        return true;
    }
    
    @Override
    public String getPaymentMethod() {
        return "Credit Card";
    }
}

class PayPalProcessor implements PaymentProcessor {
    @Override
    public boolean processPayment(double amount, String email) {
        System.out.println("🏦 Processing PayPal payment of $" + String.format("%.2f", amount));
        System.out.println("PayPal account: " + email);
        try { Thread.sleep(1500); } catch (InterruptedException e) {}
        System.out.println("✅ PayPal payment successful!");
        return true;
    }
    
    @Override
    public String getPaymentMethod() {
        return "PayPal";
    }
}

class BankTransferProcessor implements PaymentProcessor {
    @Override
    public boolean processPayment(double amount, String accountNumber) {
        System.out.println("🏛️ Processing bank transfer of $" + String.format("%.2f", amount));
        System.out.println("Account: ****" + accountNumber.substring(accountNumber.length() - 4));
        try { Thread.sleep(2000); } catch (InterruptedException e) {}
        System.out.println("✅ Bank transfer successful!");
        return true;
    }
    
    @Override
    public String getPaymentMethod() {
        return "Bank Transfer";
    }
}

// Order management
enum OrderStatus {
    PENDING, CONFIRMED, SHIPPED, DELIVERED, CANCELLED
}

class Order {
    private String orderId;
    private List<CartItem> items;
    private double totalAmount;
    private LocalDateTime orderDate;
    private OrderStatus status;
    private String paymentMethod;
    private String shippingAddress;
    
    public Order(String orderId, List<CartItem> items, double totalAmount, 
                String paymentMethod, String shippingAddress) {
        this.orderId = orderId;
        this.items = new ArrayList<>(items);
        this.totalAmount = totalAmount;
        this.paymentMethod = paymentMethod;
        this.shippingAddress = shippingAddress;
        this.orderDate = LocalDateTime.now();
        this.status = OrderStatus.PENDING;
    }
    
    public void updateStatus(OrderStatus newStatus) {
        this.status = newStatus;
        System.out.println("📦 Order " + orderId + " status updated to: " + newStatus);
    }
    
    public void displayOrder() {
        System.out.println("\n📋 Order Details:");
        System.out.println("Order ID: " + orderId);
        System.out.println("Date: " + orderDate.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")));
        System.out.println("Status: " + status);
        System.out.println("Payment Method: " + paymentMethod);
        System.out.println("Shipping Address: " + shippingAddress);
        System.out.println("\nItems:");
        items.forEach(item -> System.out.println("• " + item));
        System.out.println("Total: $" + String.format("%.2f", totalAmount));
    }
    
    // Getters
    public String getOrderId() { return orderId; }
    public List<CartItem> getItems() { return new ArrayList<>(items); }
    public double getTotalAmount() { return totalAmount; }
    public LocalDateTime getOrderDate() { return orderDate; }
    public OrderStatus getStatus() { return status; }
    public String getPaymentMethod() { return paymentMethod; }
    public String getShippingAddress() { return shippingAddress; }
}

// Customer class
class Customer {
    private String customerId;
    private String name;
    private String email;
    private String address;
    private List<Order> orderHistory;
    
    public Customer(String customerId, String name, String email, String address) {
        this.customerId = customerId;
        this.name = name;
        this.email = email;
        this.address = address;
        this.orderHistory = new ArrayList<>();
    }
    
    public void addOrder(Order order) {
        orderHistory.add(order);
    }
    
    public void displayOrderHistory() {
        System.out.println("\n📚 Order History for " + name + ":");
        if (orderHistory.isEmpty()) {
            System.out.println("No orders yet");
        } else {
            orderHistory.forEach(order -> {
                System.out.println("• Order " + order.getOrderId() + 
                    " - $" + String.format("%.2f", order.getTotalAmount()) + 
                    " (" + order.getStatus() + ")");
            });
        }
    }
    
    // Getters
    public String getCustomerId() { return customerId; }
    public String getName() { return name; }
    public String getEmail() { return email; }
    public String getAddress() { return address; }
    public List<Order> getOrderHistory() { return new ArrayList<>(orderHistory); }
}

// Main E-commerce System
class ECommerceSystem {
    private Map<String, Product> products;
    private Map<String, Customer> customers;
    private Map<String, Order> orders;
    private int nextOrderId;
    
    public ECommerceSystem() {
        products = new HashMap<>();
        customers = new HashMap<>();
        orders = new HashMap<>();
        nextOrderId = 1000;
    }
    
    // Product management
    public void addProduct(Product product) {
        products.put(product.getId(), product);
        System.out.println("✅ Added product: " + product.getName());
    }
    
    public Product getProduct(String productId) {
        return products.get(productId);
    }
    
    public List<Product> searchProducts(String keyword) {
        return products.values().stream()
            .filter(product -> product.getName().toLowerCase().contains(keyword.toLowerCase()) ||
                             product.getDescription().toLowerCase().contains(keyword.toLowerCase()))
            .toList();
    }
    
    public List<Product> getProductsByCategory(String category) {
        return products.values().stream()
            .filter(product -> product.getCategory().equalsIgnoreCase(category))
            .toList();
    }
    
    // Customer management
    public void addCustomer(Customer customer) {
        customers.put(customer.getCustomerId(), customer);
        System.out.println("✅ Added customer: " + customer.getName());
    }
    
    public Customer getCustomer(String customerId) {
        return customers.get(customerId);
    }
    
    // Order processing
    public String processOrder(Customer customer, ShoppingCart cart, 
                              PaymentProcessor paymentProcessor, String paymentDetails) {
        if (cart.isEmpty()) {
            System.out.println("❌ Cannot process empty cart");
            return null;
        }
        
        // Check stock availability
        for (CartItem item : cart.getItems()) {
            if (item.getProduct().getStock() < item.getQuantity()) {
                System.out.println("❌ Insufficient stock for " + item.getProduct().getName());
                return null;
            }
        }
        
        double totalAmount = cart.getTotalAmount();
        
        // Process payment
        if (!paymentProcessor.processPayment(totalAmount, paymentDetails)) {
            System.out.println("❌ Payment failed");
            return null;
        }
        
        // Update stock
        for (CartItem item : cart.getItems()) {
            item.getProduct().reduceStock(item.getQuantity());
        }
        
        // Create order
        String orderId = "ORD" + (nextOrderId++);
        Order order = new Order(orderId, cart.getItems(), totalAmount, 
                               paymentProcessor.getPaymentMethod(), customer.getAddress());
        
        orders.put(orderId, order);
        customer.addOrder(order);
        cart.clear();
        
        order.updateStatus(OrderStatus.CONFIRMED);
        System.out.println("🎉 Order successfully created: " + orderId);
        
        return orderId;
    }
    
    public void displayProducts() {
        System.out.println("\n🛍️ Available Products:");
        if (products.isEmpty()) {
            System.out.println("No products available");
        } else {
            products.values().forEach(product -> {
                System.out.println("• [" + product.getCategory() + "] " + product);
            });
        }
    }
    
    public void displayStatistics() {
        System.out.println("\n📊 E-commerce Statistics:");
        System.out.println("Total Products: " + products.size());
        System.out.println("Total Customers: " + customers.size());
        System.out.println("Total Orders: " + orders.size());
        
        double totalRevenue = orders.values().stream()
            .filter(order -> order.getStatus() != OrderStatus.CANCELLED)
            .mapToDouble(Order::getTotalAmount)
            .sum();
        System.out.println("Total Revenue: $" + String.format("%.2f", totalRevenue));
    }
}