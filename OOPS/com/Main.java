package OOPS.com;

public class Main {
    public static void main(String[] args) {
        Hamburger hamburger=new Hamburger("basic","sausage",300.00,"white");

        double price=hamburger.itemizeHamburger();//300 single price then add these following prices and after that calculate the total price

        hamburger.addHamburgerAddition1("Tomato",100.20);
        hamburger.addHamburgerAddition2("Lettuce",100.20);
        hamburger.addHamburgerAddition3("cheese",200.22);
        hamburger.addHamburgerAddition4("spiecy",200.22);


        System.out.println("total burger price is "+hamburger.itemizeHamburger());//total price

        HealtyBurger healtyBurger=new HealtyBurger("Becon",400.00);

        healtyBurger.itemizeHamburger();

        healtyBurger.addHamburgerAddition1("egg",100.00);
        healtyBurger.addHamburgerAddition2("Lentils",200.00);
        System.out.println("total Healty Burger price is"+healtyBurger.itemizeHamburger());

        DeluxeBurger deluxeBurger=new DeluxeBurger();

        deluxeBurger.addHamburgerAddition3("re",400.00);
        deluxeBurger.itemizeHamburger();


        //hamburger.addHamburgerAddition3("");


    }

}
