//in java there is 4 type of inheritance

//parent class or base class
class Shape{
    //one funtion
    public void area(){

        System.out.println("display area");
    }
}


//child class or sub class
class Triangle extends Shape{
    public void area(int l, int h){
        System.out.println(1/2*l*h);
    }

}
//multilevel inheritance
// class EquilateralTriangle extends Shape{
//     public void area(int l, int h){
//         System.out.println(1/2*l*h);

//     }
// }

//hierarchical inheritance 
class Circle extends Shape{
    public void area(int r){
        System.out.println((3.14)*r*r);
    }
}


public class inherit {
    public static void main(String args[]){
        Triangle t1 = new Triangle();
        t1.color = "red"; //no error kinaki inherit gareko parent Shape vanne class bata color
    }
    
}
