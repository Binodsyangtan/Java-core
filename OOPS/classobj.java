// package OOPS;



class Pen{
    String color;
    String type;

    public void write(){
        System.out.println(color + type + "writing something");
    }

    public void printColor(){
        System.out.println(this.color); // this means"this object i'm rightn now somehting like pointer"
    }
}
class Student{
    String name;
    int age;

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }

}


public class classobj {

    public static void main(String args[]){
        //student object 
        Student s1 = new Student();
        s1.name = "Binod syangtan";
        s1.age = 22;
        s1.printInfo();
        
       


    }
    
}
