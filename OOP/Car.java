public class Car extends Vehicle{


//    adding the @Override annotation to each of the methods
    @Override
    public void go(){
        System.out.println("*The car begins moving*");
    }
}

//since car extends vehicle, it also classify as vehivle