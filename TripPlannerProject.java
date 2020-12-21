import java.util.Scanner;
public class TripPlannerProject {
    public static void main (String[] args) {
intro();
budget();
time();
distance();
    }
    public static void intro() {
        Scanner input=new Scanner(System.in);
        System.out.println("Welcome to vacation planner!!");
        System.out.print("What is your name?\n");
        String name = input.nextLine();
        System.out.println("Nice to meet you " +name);
        System.out.print("Where are you travelling to?\n");
        String location = input.nextLine();
        System.out.println("Great! " +location);
        System.out.print("Sounds like a fun trip!!\n\n");
        System.out.println("*************************");
    }

    public static void budget(){
        Scanner input=new Scanner(System.in);
        System.out.print("How many days are you going to spend travelling?\n");
        Integer days = input.nextInt();
        System.out.print("How much money, in USD, are you planning to spend on your trip?\n");
        Integer money = input.nextInt();
        System.out.print("What is the currency symbol for your travel destination?\n");
        String currency= input.next();
        System.out.println("How many " +currency+ " are there in 1 USD");
        double conversion = input.nextDouble();
        int hours = days*24;
        int minutes = hours*60;
        double dailybudget = money/days;
        double currencyconversion = money*conversion;
        double dailybudgetconversion = currencyconversion/days;
        System.out.println("If you are travelling for " + days + " days that is the same as " + hours + " hours or " + minutes +
                " Minutes,If you are going to spend " + money + " USD that means per day you can spend up to $"+dailybudget+
                " USD\nYour total budget in " +currency+ " is " +currencyconversion+" "+currency+ ", Which per day is "
                +dailybudgetconversion+ " " +currency+ "\n\n");
        System.out.println("*************************");
    }

    public static void time(){
        Scanner input=new Scanner(System.in);
        System.out.print("What is the time difference, in hours, between your home and your destination?\n");
        int timediff = input.nextInt();
        double midnight = 0.00+timediff ;
        double noon = 12.00+timediff;
        System.out.println("That means that when it is midnight at home it will be " +midnight%24+ " in your travel destination" +
                " and when it is noon at home it will be " +noon%24+ "\n\n");
        System.out.println("*************************");

    }

    public static void distance() {
        Scanner input=new Scanner(System.in);
        System.out.println("What is the square area of your destination country in km2?");
        double area = input.nextDouble();
        double miles = area*0.62137;
        System.out.println("In miles2 that is " +miles);
        System.out.println("*************************\n\n");

        System.out.println("THANK YOU FOR USING TRIP PLANNER!!! :)\n" + "Have a great and safe trip!");


    }
}
