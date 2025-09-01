class ifStatement {
    public static void main(String[] args) {

        int number = 10;

        // Outer if statement
        if (number > 0) {
            System.out.println("Number is positive.");

            // Inner if statement
            if (number % 2 == 0) {
                System.out.println("Number is even.");
            } else {
                System.out.println("Number is odd.");
            }
        } else {
            System.out.println("Number is not positive.");
        }
    }
}
