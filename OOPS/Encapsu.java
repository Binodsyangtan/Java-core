
class Account {
    private String name;
    protected String email;
    private String password; // private cannot access form outside of this class

    // getters & setters
    public String getPassword() {
        return this.password;
    }

    // setter
    public void setPassword(String pass) {
        this.password = pass;
    }
    //getter
    public String getName() {
        return this.name;
    }
    //setter
    public void setName(String n) {
        this.name = n;
    }
}

public class Encapsu {
    public static void main(String args[]) {
        Account account1 = new Account();
        // account1.name = "Binod syangtan";
        account1.setName("Binod");
        System.out.println(account1.getName());

        account1.email = "binod@gmail.com";
        // account1.password = "abc"; //error cannot access private
        account1.setPassword("abcd");
        System.out.println(account1.getPassword());

    }

}
