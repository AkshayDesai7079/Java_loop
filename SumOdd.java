public class SumOdd {


    public boolean isOdd(int num){
        if(num>0){
            if(num%2!=0){
                return true;
            }
            return false;
        }
        return false;

    }


    public boolean isEven(int num){
        if(num>0){
            if(num%2==0){
                return true;
            }
            return false;
        }
        return false;

    }
    public int sumEven(int start,int end){
        int sum=0;
        for(int i=1;i<100;i++){
            if(isEven(i)){
                if((end>=start) && ((start>=0) &&(end>=0))){
                    //System.out.println(i);
                    sum=sum+i;

                }else{
                    return -1;
                }
            }
        }
        System.out.println(sum);
        return sum;

    }
    public int sumOdd(int start,int end){
        int sum=0;
        for(int i=1;i<100;i++){
            if(isOdd(i)){
                if((end>=start) && ((start>=0) &&(end>=0))){
                    //System.out.println(i);
                    sum=sum+i;

                }else{
                    return -1;
                }
            }
        }
        System.out.println(sum);
        return sum;

    }


    public static void main(String[] args) {
        SumOdd so=new SumOdd();


        so.sumEven(1, 100);
        so.sumOdd(1, 100);


        int number = 502356997;
        int firstDigit = 0;
        int lastDigit = 0;

        lastDigit = number%10;
        System.out.println("Last digit: "+lastDigit);

        while(number!=0) {
            firstDigit = number%10;
            number /= 10;
        }
        System.out.println("First digit: "+firstDigit);

        int sum=firstDigit+lastDigit;
        System.out.println("sum"+sum);

    }
}
