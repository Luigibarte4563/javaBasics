public class LoginSystem {
    public static void main(String[] args) {
        String username = "student";
        String password = "12345";

        String inputUser = "student";   // assume user input
        String inputPass = "1234";      // assume user input

        if (inputUser == username && inputPass == password) {
            System.out.println("Login Successful!");
        } else if (inputUser == "" || inputPass == "") {
            System.out.println("Fields cannot be empty!");
        } else {
            System.out.println("Login Failed!");
        }
    }
}
