public class MethodsOverload {
    public static void main(String[] args) {

    double result = calcFeetAndInchesToCentimeters(43423);
        System.out.println(result);
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
        if ((feet >= 0) && (inches >= 0 && inches <= 12)) {
            return (feet * 12 + inches) * 2.54;
        }
        return -1;
    }

    public static double calcFeetAndInchesToCentimeters(double inches){
        if (inches >= 0) {
            double feet = inches / 12;
            double newInches = inches - feet * 12;
            return calcFeetAndInchesToCentimeters(feet, newInches);
        }
        return -1;
    }

}
