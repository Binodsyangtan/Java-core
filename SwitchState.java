import java.util.Scanner;
public class SwitchState {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter any number between 1 - 7\t");
        int day = input.nextInt();
        
        switch (day) {
            case 1:
                System.out.println("today is sunday");
                break;
            case 2:
                System.out.println("today is monday");
                break;
            case 3:
                System.out.println("today is tuesday ");
                break;
            case 4:
                System.out.println("today is wednesday");
                break;
            case 5:
                System.out.println("today is thrusday");
                break;
            case 6:
                System.out.println("today is friday ");
                break;
            case 7:
                System.out.println("today is saturday");
                break;
            default:
                break;
        }
        input.close();
    }

}
