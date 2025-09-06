import java.util.*;

// Observer Pattern Implementation

// Observer interface
interface Observer {
    void update(String message);
    String getName();
}

// Subject class (Observable)
class Subject {
    private List<Observer> observers = new ArrayList<>();
    private String state;
    
    public void addObserver(Observer observer) {
        observers.add(observer);
        System.out.println(observer.getName() + " subscribed to notifications");
    }
    
    public void removeObserver(Observer observer) {
        observers.remove(observer);
        System.out.println(observer.getName() + " unsubscribed from notifications");
    }
    
    public void notifyObservers() {
        System.out.println("Notifying " + observers.size() + " subscribers:");
        for (Observer observer : observers) {
            observer.update(state);
        }
    }
    
    public void setState(String state) {
        this.state = state;
        notifyObservers();
    }
    
    public String getState() {
        return state;
    }
}

// Concrete Observer implementation
class NewsSubscriber implements Observer {
    private String name;
    private List<String> receivedNews;
    
    public NewsSubscriber(String name) {
        this.name = name;
        this.receivedNews = new ArrayList<>();
    }
    
    @Override
    public void update(String message) {
        receivedNews.add(message);
        System.out.println("📰 " + name + " received news: " + message);
    }
    
    @Override
    public String getName() {
        return name;
    }
    
    public List<String> getReceivedNews() {
        return new ArrayList<>(receivedNews);
    }
    
    public void showNewsHistory() {
        System.out.println("\n" + name + "'s news history:");
        for (int i = 0; i < receivedNews.size(); i++) {
            System.out.println((i + 1) + ". " + receivedNews.get(i));
        }
    }
}

// Another type of observer
class EmailSubscriber implements Observer {
    private String email;
    private boolean isActive;
    
    public EmailSubscriber(String email) {
        this.email = email;
        this.isActive = true;
    }
    
    @Override
    public void update(String message) {
        if (isActive) {
            System.out.println("📧 Email sent to " + email + ": " + message);
        }
    }
    
    @Override
    public String getName() {
        return "Email: " + email;
    }
    
    public void setActive(boolean active) {
        this.isActive = active;
    }
    
    public boolean isActive() {
        return isActive;
    }
}