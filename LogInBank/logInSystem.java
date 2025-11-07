class logInSystem {

    private String name;
    private String email1;
    private String pass1; 
    private int accountBal;

    public logInSystem(String name, String email1, String pass1, int accountBal) {
        this.name = name;
        this.email1 = email1;
        this.pass1 = pass1;
        this.accountBal = accountBal;
    }

    public String getName() {
        return "Name: " + this.name;
    }

    public String getBal() {
        return "Balance: " + this.accountBal;
    }

    public void deposit(int amount) {
        if(amount > 0) {
            accountBal =+ amount;
            System.out.println("Depisited: " + amount);
        }else {
            System.out.println("Invalid amount!");
        }
    }

    public void withdraw(int amount) {
        if(amount > 0 && amount <= accountBal) {
            accountBal -= amount;
            System.out.println("Withdrawn: " + amount);
        }else if(amount > accountBal) {
            System.out.println("Insufficient funds!");
        }else {
            System.out.println("Invalid withdraw amount!");
        }
    }
}