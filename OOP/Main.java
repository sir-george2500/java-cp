public class Main{
    public static void main(String[] args){
//        polymorphism = grek word for poly - "many" morph - "form"
//        the ability of an object to identify as more than one type
//        duplicate ctrl D
//        highlight same occurences ctrl + alt + shift + j

        Car car = new Car();
        Boat boat = new Boat();
        Bicycle bicycle = new Bicycle();

//       Car[] racers = {car, boat, bicycle};
//       Boat[] racers = {car, boat, bicycle};
//       Bicycle[] racers = {car, boat, bicycle};

//        to solve this issue we use the power of polymorphism
       Vehicle[] racers = {car, boat, bicycle};
        // all objects are children of the Object class, but there are few other changes you have to make
//       Object[] racers = {car, boat, bicycle};

//       car.go();
//       boat.go();
//       bicycle.go();

//        a better approach is to use an enhance forloop
        for(Vehicle x: racers){
            // Calling the overridden go() method
            x.go();
        }

        System.out.println(car instanceof Vehicle);
        System.out.println(boat instanceof Vehicle);
        System.out.println(bicycle instanceof Vehicle);
    }
}