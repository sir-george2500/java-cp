import java.util.*;

public class Main{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        enum emoition{
            HAPPY,
            SAD,
            ANGRY,
            EXCITED,
            CONFUSED
        }

        // block game

        enum Days{
            MONDAY,
            TUESDAY,
            WEDNESDAY,
            THURSDAY,
            FRIDAY,
            SATURDAY,
            SUNDAY
        }


        System.out.println("Please Enter the number of the current day: ");
        int day = sc.nextInt();

        switch(day){
            case 1:
                System.out.println(Days.MONDAY);
                break;
            case 2:
                System.out.println(Days.TUESDAY);
                break;
            case 3:
                System.out.println(Days.WEDNESDAY);
                break;
            case 4:
                System.out.println(Days.THURSDAY);
                break;
            case 5:
                System.out.println(Days.FRIDAY);
                break;
            case 6:
                System.out.println(Days.SATURDAY);
                break;
            case 7:
                System.out.println(Days.SUNDAY);
                break;
            default:
                System.out.println("Invalid Input");
                break;
        }
    }
}