public class ForStatement {
    public static void main(String[] args) {

        // Different interest for loan amount
        for(int i = 2; i < 9; i++){
            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f",calculateInterest(10000.0, i)));
        }

        // Determining if the number is a prime number using the isPrime() method
        // Finding the first 10 prime numbers
        int count = 0;
        for(int i = 1; i < 50; i++){
            if(isPrime(i)){
                count++;
                System.out.println("Number " + i + " is prime number");
                if(count == 10){
                    System.out.println("Exiting for loop");
                    break;
                }
            }
        }
    }

    // Calculating interest
    public static double calculateInterest(double amount, double interestRate){
        return amount * (interestRate / 100);
    }

    // Checking for prime number
    public static boolean isPrime(int n){
        if(n == 1) {
            return false;
        }
        for(int i = 2; i <= (long) Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
}
