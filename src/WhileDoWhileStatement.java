public class WhileDoWhileStatement {
    public static void main(String[] args) {

        int count = 0;
        while (count != 5) {
            System.out.println("Count value is " + count);
            count++;
        }

        count = 0;
        do {
            System.out.println("Count value was " + count);
            count++;
        }
        while (count != 5);

    }
}
