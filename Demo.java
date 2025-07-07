//inner class change method behabiour without inherit or method override

class color{

    //method
    public void show(){
        System.out.println("color is red");
    }
}

public class Demo {
    public static void main(String args[]){
        
        color obj = new color()
        {
            public void show(){
                System.out.println("color is blue");
            }
        };

        obj.show();
    };

    
}