//polymorphism means many form
//for example a phone hava many form with diff apps like phone with camera, phone with calls etc

//there are two type of polymorphism 
//1.Compile-Time Polymorphism (Method Overloading)
//2.Run-Time Polymorphism (Method Overriding + Inheritance) (this i will study in inheritance)

//Compile-time polymorphism (mehtod overloading)

class Calculator{
    int add( int a, int b){
        return a + b ;
    }

    int add(int a , int b , int c){/* overloading same add  but diff parameter */
        return a + b + c;
    }

    double add (double a , double b ){/* overloading same add but diff parameter  */
        return a + b ;
    }

}
   
   
   
public class polymor {
    public static void main(String args[]){
        Calculator calc = new Calculator();
        System.out.println(calc.add(2,3));
        System.out.println(calc.add(2,3,8));
        System.out.println(calc.add(3,7));


    }
    
}
