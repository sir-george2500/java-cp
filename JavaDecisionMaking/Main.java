import java.util.*;

public class Main{
    public static void main(String[] args){
      House house1 = new House();
      house1.Color = "Red";
      house1.Address = "123 Street, City";

      House house2 = new House();
      house2.Color = "Blue";
      house2.Address = "456 Avenue, City";


      Apartment apt1 = new Apartment();
      apt1.Color = "White Apartment";
      apt1.Address = "789 Boulevard, City Apartmetn";
      apt1.Floor = 5;
      apt1.UnitNumber = 502;
      apt1.displayInfo();
      // this for the apartment

      // and this for the house
      house1.displayInfo();
      house2.displayInfo();

    }
}