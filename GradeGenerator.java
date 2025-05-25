import java.util.Scanner;

public class GradeGenerator {
    public static void main(String []args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = input.nextLine();

        System.out.println("enter your roll number:");
        int roll = input.nextInt();

        System.out.println("enter marks for subject 1:");
        int s1 = input.nextInt();
        System.out.println("enter marks for subject 2:");
        int s2 = input.nextInt();
        System.out.println("enter marks for subject 3:");
        int s3 = input.nextInt();
        System.out.println("enter marks for subject 4:");
        int s4 = input.nextInt();
        System.out.println("enter marks for subject 5:");
        int s5 = input.nextInt();

        int total = s1 + s2 + s3 + s4 + s5 ;

        float average = total / 5.0f;

        String grade;

        if(average >=90){
            grade = "A+";
        }else if(average >=80){
            grade = "A";

        }else if(average >=70){
            grade = "B+";
        }else if(average >=60){
            grade = "B";
        }else if(average >= 50){
            grade = "c";
        }else{
            grade = "F";
        }


        System.out.println("-----------------------\t");
        System.out.println("      Report Card\t        ");

        System.out.println("--------------------\t");
        System.out.println("Name:" + name);
        System.out.println("Roll:" + roll);

        System.out.println("Marks:");
        System.out.println("Subject 1:" + s1);
        System.out.println("Subject 2:" + s2);
        System.out.println("Subject 3:" + s3);
        System.out.println("Subject 4:" + s4);
        System.out.println("Subject 5:" + s5);
        
        System.out.println("Total :" + total);

        System.out.println("Average:" + average);
        System.out.println("Grade:"  + grade);


        

        
        input.close();
    }


}
