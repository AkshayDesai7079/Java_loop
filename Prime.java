public class Prime {
    public static boolean isPrime(int n){
        if(n==1){
            return false;
        }
        else{
            for(int i=2;i<=n/2;i++)//use i<= long)Math.sqrt(n){
                if(n%i==0){
                    return false;
                }

        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPrime(4));

        int count=0;
        for(int i=10;i<50;i++){//check the prime numbers within the range
            if(isPrime(i)){
                count++;
                System.out.println("Number " + i + " is a prime");
                if(count==3){ //if count == 3 the exist the loop
                    System.out.println("Existing for loop");
                    break;
                }
            }
        }

        int c=0;
        int sum=0;

        for(int i=1;i<1000;i++){
            if((i%3==0) && (i%5==0)){
                c=c+1;
                sum=sum+i;
                System.out.println(i);

            }
            // if(count==5){
            //      break;
            //  }
        }
        System.out.println("sum"+sum);
    }
}
