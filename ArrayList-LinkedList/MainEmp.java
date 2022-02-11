package Practice;


import java.util.Scanner;

public class MainEmp {
    private static Scanner scanner=new Scanner(System.in);

    private static EmployeeDetails employeeDetails=new EmployeeDetails("123");

    public static void main(String[] args) {
        boolean quit=false;

        semp();
        printActions();
        while (!quit){
            System.out.println("\n Enter action :(6 to show available actions");
            int action=scanner.nextInt();
            scanner.nextLine();

            switch (action){
                case 0:
                    System.out.println("\n shutting down");
                    quit=true;
                    break;
                case 1:
                    employeeDetails.printEmployee();
                    break;
                case 2:
                    addNewAccount();
                    break;
                case 3:
                    updateEmployee();
                    break;
                case 4:
                    removeEmployee();
                    break;
                case 5:
                    queryEmployee();
                    break;
                case 6:
                    printActions();
                    break;

            }
        }

    }
    private static void addNewAccount(){
        System.out.println("Enter new employee name: ");
        String name=scanner.nextLine();

        System.out.println("Enter a new empoyee email");
        String email=scanner.nextLine();


        System.out.println("Enter a phone number");
        long phone=scanner.nextLong();

        System.out.println("Enter a age");
        int age=scanner.nextInt();

        System.out.println("Enter a address");
        String address=scanner.nextLine();

        Employee newEmployee=Employee.createAccount(name,email,phone,age,address);

        if(employeeDetails.addNewAccount(newEmployee)){
            System.out.println("New contact added: Name "+name+" email "+email+" phone "+phone+" age "+age+" address "+address);
        }else {
            System.out.println("Cannot add, "+name+ " already on file");
        }
    }

    private static void updateEmployee(){
        System.out.println("Enter existing employee name");
        String name=scanner.nextLine();
        Employee existing=employeeDetails.queryEmployee(name);
        if(existing==null){
            System.out.println("employee not found");
            return;
        }
        System.out.println("enter new employee name");
        String newName=scanner.nextLine();

        System.out.println("Enter new employee email");
        String newemail=scanner.nextLine();

        System.out.println("Enter new employee phone");
        long newphone=scanner.nextLong();

        System.out.println("Enter new employee age");
        int neage=scanner.nextInt();

        System.out.println("Enter a new employee address");
        String newaddress=scanner.nextLine();

        Employee newemployee=Employee.createAccount(newName,newemail,newphone,neage,newaddress);

        if(employeeDetails.updateAccount(existing,newemployee)){
            System.out.println("Successfully updated record");
        }else {
            System.out.println("error updating record");
        }

    }
    private static void removeEmployee(){
        System.out.println("Enter existing employee name : ");
        String name=scanner.nextLine();

        Employee existing=employeeDetails.queryEmployee(name);
        if(existing==null){
            System.out.println("Contact not found");
            return;
        }
        if(employeeDetails.removeAccount(existing)){
            System.out.println("Successfully deleted");
        }else {
            System.out.println("Error deleting employee");
        }
    }
    private static void queryEmployee(){
        System.out.println("Enter existing employee name");
        String name=scanner.nextLine();
        Employee existing=employeeDetails.queryEmployee(name);
        if(existing==null){
            System.out.println("Contact not found");
            return;
        }
        System.out.println("Name: "+existing.getName()+" email "+existing.getEmail()+" phone "+existing.getPhone()+" age "+existing.getAge()+" address "+existing.getAddress());
    }

    private static void semp(){
        System.out.println("Welcome to this system");
    }
    private static void printActions(){
        System.out.println("\n Availlable actions: \npress");
        System.out.println("0  - to shutdown\n" +
                "1  - to print employee\n" +
                "2  - to add a new employee\n" +
                "3  - to update an existing employee\n" +
                "4  - to remove an existing employee\n" +
                "5  - query if an existing employee exists\n" +
                "6  - to print a list of available actions.");
        System.out.println("Choose your action: ");
    }
}
