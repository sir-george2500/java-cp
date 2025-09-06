public class Apartment extends House{
    public int Floor;
    public int UnitNumber;
    @Override
    public void displayInfo(){
        this.Room = 3;
        super.displayInfo();
        System.out.println("Floor: " + Floor + ", Unit Number: " + UnitNumber);
    }
}