public class MethodOverloading {
    public static double cal(double feet,double inches){
       if ((feet<0) || ((inches<0) || (inches>12))){
           System.out.println("invalid");
           return -1;
       }
       double centimeters=(feet*12) * 2.54;

       centimeters += inches * 2.54;

       System.out.println(feet +" feet, " +inches +" inches,"+centimeters+"cm");
       return centimeters;

    }
    public static double cal(double inches){
        if(inches<0){
            return -1;
        }
        double feet=(int)inches/12;

        double rem=(int)inches%12;
        System.out.println(inches + " inches is equal to " + feet + " feet and " + rem + " inches");
        return rem;

    }
    public static void main(String[] args) {
        double c=cal(6, 1);

        if(c<0.0){
            System.out.println("invalid parameter");
        }
        cal(245);
    }
}
