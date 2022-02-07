public class SwitchState {

    public static void Case(char a){


        switch(a){
            case ('A'):
                System.out.println("A");
                break;
            case ('B'):
                System.out.println("B");
                break;
            case ('C'):
                System.out.println("C");
                break;

            default:
                System.out.println("not found ");
        }
    }

    public static void days(int day){
        switch(day){
            case 0:
                System.out.println("Sunday");
                break;
            case 1:case -1:// awe can also add another statement
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("wednseday");
                break;
            case 4:
                System.out.println("thursday");
                break;
            case 5:
                System.out.println("friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("invalid");
                break;
        }
    }



    public static void main(String[] args) {


        days(3);
        Case('C');
    }
}
