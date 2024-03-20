import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
//        System.out.printf("Hello and welcome!");
//
//        for (int i = 1; i <= 5; i++) {
//            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
//            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
//            System.out.println("i = " + i);
//        }

        //This is my first Java file.

        System.out.println("Area of rectangle: "+findAreaRectangle(5,3));
        calculateCircle(5);
        System.out.println("Angle: "+findAngleTriangle(80, 65));
        System.out.println("Difference: "+calculateDateDifference("2023-03-11", "2024-03-11"));
        System.out.println("Initials: "+printInitials("John Doe"));

        System.out.println("Hello world!");
        System.out.println("Hello world!");
        System.out.println("Hello world!");
        System.out.println("Hello world!");
        System.out.println("Hello world!");
    }

    static int findAreaRectangle(int length, int width){
        return length * width;
    }

    static void calculateCircle(int radius) {
        int diameter;
        double circumference;
        double area;

        diameter = radius * 2;
        circumference =  Math.PI * diameter;
        area = Math.PI * Math.pow(radius, 2.0);

        System.out.println("Diameter: " + diameter);
        System.out.println("Circumference: " + circumference);
        System.out.println("Area: " + area);
    }

    static int findAngleTriangle(int a, int b){
        int angle;
        angle = 180 - a - b;
        return angle;
    }

    static long calculateDateDifference(String firstDate, String secondDate){
        long difference;
        LocalDate startDate = LocalDate.parse(firstDate);
        LocalDate endDate = LocalDate.parse(secondDate);

        return ChronoUnit.DAYS.between(startDate, endDate);
    }

    static String printInitials(String name){
        String initials = "";
        String[] substrings = name.split(" ");

        for (String letter : substrings) {
            initials += letter.charAt(0);
        }

        return initials.toUpperCase();
    }
}