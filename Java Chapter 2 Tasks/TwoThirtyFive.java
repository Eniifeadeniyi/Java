public class TwoThirtyFive {
public static void main(String[] args) {
        
double s = 2300000;
double wps = 2500;
double y = 20;
double tw = s * wps;
double py = tw / y;
double ph = py / (365 * 24);
double pm = ph / 60;

System.out.println("Total weight of the pyramid is " + tw + "kg");
System.out.println("Weight built per year is " + py + " kg/yr");
System.out.println("Weight built per hour is " + ph + " kg/hr");
System.out.println("Weight built per minute is " + pm + " kg/min");

}
}