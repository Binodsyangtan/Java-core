import java.util.Arrays;

public class Array {
    public static void main(String []args){

        int[] marks = {90, 98 , 87};

        //2D array 
        int[][] finalMarks = {{90, 98, 87}, {96,90,60}};

        //we can acces both like this 1 means second student mark 
        System.out.println(finalMarks[0][1]);

        //output 2
        System.out.println(finalMarks.length);

        //output 3
        System.out.println(marks.length);

        
        //Sort
        //before sort marks[0]-> 90
        System.out.println(marks[0]);
        Arrays.sort(marks);
        // after sort ans will be 87 coz 87 is small among them
        System.out.println(marks[0]);

        
        

    }
    
}
