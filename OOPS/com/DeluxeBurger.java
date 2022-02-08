package OOPS.com;

public class DeluxeBurger extends Hamburger{
    public DeluxeBurger() {
        super("Delux", "sousage&Becon", 700.00, "white");
        super.addHamburgerAddition1("chips",300.00);
        super.addHamburgerAddition2("Lentils",400.00);

    }

    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe burger");
    }
}
