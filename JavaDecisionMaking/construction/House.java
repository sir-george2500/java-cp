package construction;

public class House{
    public int Room;
    protected int Bathroom;
    public String Address;
    public String KichtenType;
    private String owner;

    public void displayInfo(){
        System.out.println("Room: " + Room + ", Bathroom: " + Bathroom + ", Address: " + Address + ", Kichten Type: " + KichtenType);
    }
}



