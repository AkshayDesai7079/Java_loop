package Practice;

public class Practice2 extends Practice1 {
    private String stream;

    public Practice2(String name, String email, long phone,String stream) {
        super(name, email, phone);
        this.stream=stream;
    }

    @Override
    public float percentage() {
        float per=super.percentage();
        if(per>=70 && per<100){
            System.out.println("Congratulation you are pass and you got a A grade!!!!"+per);
        }else if(per>=70 && per<70){
            System.out.println("Congratulation you are pass and you got a B grade!!!!"+per);
        }else if(per>=40 && per<70){
            System.out.println("Congratulation you are pass and you got a C grade!!!"+per);
        }else {
            System.out.println("Sorry you are fail better luck next time"+per);
        }

     return per;
    }

    public String getStream() {
        return stream;
    }

    public void stream(String stream){
        System.out.println("Your stream is "+this.stream);

    }


    public static void main(String[] args) {
        Practice1 practice1=new Practice1("Akshay","a@gmail.com", 9167563153L);

        getDetails();

        System.out.println();


        //System.out.println("Your name is "+practice1.getName()+" email "+practice1.getEmail()+" phone number "+practice1.getPhone());
        Practice2 practice2=new Practice2("Akshay","a@gmail.com",987654L,"Science");

        System.out.println( practice2.percentage());
        //System.out.println(practice1.percentage());
        System.out.println(practice2.stream);

    }
}
