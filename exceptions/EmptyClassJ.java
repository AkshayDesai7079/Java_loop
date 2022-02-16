package org.excetions;

final class Demo{
    final String pancardNumber;

    public Demo(String pancardNumber) {
        this.pancardNumber = pancardNumber;
    }

    public String getPancardNumber() {
        return pancardNumber;
    }

}

public class EmptyClassJ {
    public static void main(String[] args) {
        Demo demo=new Demo("AF4578");
        String s1=demo.getPancardNumber();
        System.out.println("Pancard Number "+s1);

        //System.out.println(demo.getPancardNumber());
        //demo.getPancardNumber();
    }
}
