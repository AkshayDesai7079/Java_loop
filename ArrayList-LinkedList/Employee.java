package Practice;

public class Employee {
    private String name;
    private String email;
    private long phone;
    private int age;
    private String address;

    public Employee(String name, String email, long phone, int age, String address) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public long getPhone() {
        return phone;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phone=" + phone +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }

    public static Employee createAccount(String name, String email, long phone, int age, String address){
        return new Employee(name, email, phone, age, address);
    }
}
