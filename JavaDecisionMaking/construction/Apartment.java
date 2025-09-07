package construction;

public class Apartment extends House{
    public int Balcony;
    public int Floor;

    @Override
    public void displayInfo(){
        this.Bathroom = 1; // Accessing protected member from superclass
        System.out.println("Room: " + Room + ", Bathroom: " + Bathroom + ", Address: " + Address + ", Kichten Type: " + KichtenType + ", Balcony: " + Balcony + ", Floor: " + Floor);
    }
}