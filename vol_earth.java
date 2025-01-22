public class vol_earth {
public static void main (String args[]){
    double radius_in_Km = 6378;
    double volume_in_Km3 = (4.0 / 3) * Math.PI * Math.pow(radius_in_Km, 3);
    double volume_in_Miles3 = volume_in_Km3 * 0.239913;
    System.out.println("The volume of earth in cubic kilometers is " + volume_in_Km3 + " and cubic miles is " + volume_in_Miles3);
}
}
