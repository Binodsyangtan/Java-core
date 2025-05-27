

public class Function {
    
    //function to call 
    public static void printName(String name){
        System.out.println(name);
    }

    // function to sum
    public static void printSum(int a, int b){
        int sum = a + b;
        System.out.println(sum);
    }

    public static void main(String[] args){
        //Methods
        printName("Binod");
        printName("Hello java world");

        //sum methods
        printSum(1 , 6); //a = 1 b = 6 ( ans will be 7)

    }
    
}
