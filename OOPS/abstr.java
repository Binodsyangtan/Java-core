abstract class Animal{
    abstract void sound();
}

class Dog extends Animal{
    void sound(){
        System.out.println("bark!");
    }
}

public class abstr {
    public static void main(String args[]){
        Animal dog = new Dog();
        dog.sound();
        
        //abstract vakele yesari lekhna mildina
        // Animal cat = new Animal();
    }
    
}
