class Employee{
    private int id;
    private String name;
    private int salary;

    public Employee(){//constructor
        id=24;
        name="akshay";
        salary=30000;

    }
    //constuctor overload
    public Employee(int myId,String myName,int mySal){
        id=myId;
        name=myName;
        salary=mySal;
    }
    public Employee(int sal){
        salary=sal;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name=n;
    }
    public int getId(){
        return id;
    }
    public void setId(int i){
        id=i;
    }
    public int getSalary(){
        return salary;
    }
    public void setSalary(int sal){
        salary=sal;
    }
}

public class Constructor {
    public static void main(String[] args) {
        Employee emp=new Employee(4,"onkar",4000);//call the constuctor

        Employee obj=emp;
        System.out.println(emp.getId());
        System.out.println(emp.getName());
        System.out.println(emp.getSalary());
        System.out.println(obj.getSalary());//refrence from emp object
    }
}
