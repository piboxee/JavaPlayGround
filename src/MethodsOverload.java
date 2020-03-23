public class MethodsOverload {
    public static void main(String[] args) {

    double result = calcFeetAndInchesToCentimeters(43423, 32);
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
        if ((feet >= 0) && (inches >= 0 && inches <= 12)) {
            double cm = (feet * 12 + inches) * 2.54;
            System.out.println(feet + " feet and " + inches + " inches = " + cm + " centimeters.");
            return cm;
        } else if (feet >= 0 && inches >= 0) {
            double onlyInches = feet * 12 + inches;
            return calcFeetAndInchesToCentimeters(onlyInches);
        }
        return -1;
    }

    public static double calcFeetAndInchesToCentimeters(double inches){
        if (inches >= 0) {
            double feet = (int) inches / 12;
            double remainingInches = (int) inches % 12;
            return calcFeetAndInchesToCentimeters(feet, remainingInches);
        }
        return -1;
    }

}
