import java.util.Scanner;
public class LinearRegression {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


    int sampleSize = collectSampleSize(input);
    double[] valuesOfX = collectValuesOfX(sampleSize, input);
    double[] valuesOfY = collectValuesOfY(sampleSize, input);
    double sumOfX = sumX(valuesOfX);
    double sumOfY = sumY(valuesOfY);
    double[] XTimesY = multiplyXandY(valuesOfX, valuesOfY);
    double sumXTimesY = findSumOfMultiplesOfXAndY(XTimesY);
    double[] squaresOfX = squaresOfX(valuesOfX);
    double sumSquaresOfX = sumOfSquaresOfX(squaresOfX);
    double squareSumOfX = squareOfSumOfX(sumOfX);
    double averageOfX = averageOfX(sumOfX, sampleSize);
    double averageOfY = averageOfY(sumOfY, sampleSize);
    double slope = calculateSlope(sampleSize, sumXTimesY, sumOfX, sumOfY, sumSquaresOfX, squareSumOfX);
    double yIntercept = calculateIntercept(averageOfX, averageOfY, slope);


    System.out.printf("%-10s %-10s %-10s %-10s%n", "X", "Y", "XY", "X^2");
    for(int count = 0; count < sampleSize; count++){
        System.out.printf("%-10f %-10f %-10f %-10f%n ", valuesOfX[count], valuesOfY[count], XTimesY[count], squaresOfX[count]);
    }

    System.out.printf("%-10f %-10f %-10f %-10f%n ", sumOfX, sumOfY, sumXTimesY, sumSquaresOfX);
    System.out.printf("y = %.2fx + %.2f", slope, yIntercept);






    }

    public static void print(String message){
        System.out.println(message);
    }

    public static int collectSampleSize(Scanner input){
        print("Enter sample size: ");
        while(true) {
            if (!input.hasNextInt()) {
                print("Invalid input");
                print("Enter sample size: ");
                input.nextLine();
                continue;
            }
            int size = input.nextInt();
            if (size >0) return size;
            print("Invalid input");
            print("Enter sample size: ");
        }
    }

    public static double[] collectValuesOfX(int size, Scanner input){
        double[] valuesOfX = new double[size];
        for(int count = 0; count < size; count++){
            print("Enter value for x" + String.valueOf(count+1) + ": ");
            while(!input.hasNextDouble()){
                print("Invalid input");
                print("Enter value for x" + String.valueOf(count+1) + ": ");
                input.nextLine();
            }
            valuesOfX[count] = input.nextDouble();
        }
        return valuesOfX;
    }

    public static double[] collectValuesOfY(int size, Scanner input) {
        double[] valuesOfY = new double[size];
        for(int count = 0; count < size; count++){
            print("Enter value for y" + String.valueOf(count+1) + ": ");
            while (!input.hasNextDouble()) {
                print("Invalid input");
                print("Enter value for y" + String.valueOf(count+1) + ": ");
                input.nextLine();
            }
            valuesOfY[count] = input.nextDouble();
        }
        return valuesOfY;
    }

    public static double[] squaresOfX(double[] X){
        double[] squaresOfX =  new double[X.length];
        for(int count = 0; count < X.length; count++){
            squaresOfX[count] = X[count] * X[count];
        }
        return squaresOfX;
    }

    public static double[] multiplyXandY(double[] X, double[] Y){
        double[] result = new double[X.length];
        for(int count = 0; count < X.length; count++){
            result[count] = X[count] * Y[count];
        }
        return result;
    }

    public static double findSumOfMultiplesOfXAndY(double[] multiplesOfXAndY){
        double sum = 0.0;
        for (double number : multiplesOfXAndY) {
            sum += number;
        }
        return sum;
    }

    public static double sumX(double[] X){
        double sum = 0.0;
        for (double number : X) {
            sum += number;
        }
        return sum;
    }

    public static double sumOfSquaresOfX(double[] squaresOfX){
        double sum = 0.0;
        for (double number : squaresOfX) {
            sum += number;
        }
        return sum;
    }

    public static double squareOfSumOfX(double sum){
        return sum * sum;
    }

    public static double sumY(double[] Y){
        double sum = 0.0;
        for (double number : Y) {
            sum += number;
        }
        return sum;
    }

    public static double averageOfX(double sumOfX, int sampleSize){
        return sumOfX /  sampleSize;
    }

    public static double averageOfY(double sumOfY, int sampleSize){
        return sumOfY / sampleSize;
    }

    public static double calculateSlope(int sampleSize, double sumOfMultiplesOfXAndY, double sumOfX, double sumOfY, double sumOfXSquares, double squareOfSumOfX){
        double numerator = (sampleSize * sumOfMultiplesOfXAndY) - (sumOfX * sumOfY);
        double denominator = (sampleSize * sumOfXSquares) - (squareOfSumOfX);
        return (numerator / denominator);
    }

    public static double calculateIntercept(double averageOfX, double averageOfY, double slope){
        return averageOfY - (slope * averageOfX);
    }


}