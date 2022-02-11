package Practice;

import java.util.ArrayList;

public class EmployeeDetails {
    private String id;
    private ArrayList<Employee>myEmployee;

    public EmployeeDetails(String id) {
        this.id = id;
        this.myEmployee = new ArrayList<Employee>();
    }

    public boolean addNewAccount(Employee employee){
        System.out.println(employee);
      if(findEmployee(employee.getName())>=0){
          System.out.println("employee is already on file");
          return false;
      }
      myEmployee.add(employee);
      return true;

    }

    public boolean updateAccount(Employee oldEmployee,Employee newEmployee){
        int foundPosition=findEmployee(oldEmployee);
        if (foundPosition<0){
            System.out.println(oldEmployee.getName()+" , was not found");
            return false;
        }
        else if(findEmployee(newEmployee.getName()) != -1){
            System.out.println("Account with name "+newEmployee.getName()+" already exits. Update was not Successful");
            return false;
        }
        this.myEmployee.set(foundPosition,newEmployee);
        System.out.println(oldEmployee.getName()+" , was replaced with "+newEmployee.getName());
        return true;

    }
    public boolean removeAccount(Employee employee){
        int foundPosition=findEmployee(employee);

        if(foundPosition<0){
            System.out.println(employee.getName()+" , was not found");
            return false;
        }
        this.myEmployee.remove(foundPosition);
        System.out.println(employee.getName()+" , was deleted");
        return true;
    }

    private int findEmployee(Employee employee){
        System.out.println(employee);
        System.out.println("111111111111111");
        return this.myEmployee.indexOf(employee);

    }
    private int findEmployee(String employeeName){
        System.out.println(employeeName);
        System.out.println("-------");
        for (int i=0;i<this.myEmployee.size();i++){
            Employee employee=this.myEmployee.get(i);
            if (employee.getName().equals(employeeName)) {
                return i;
            }
        }
        return -1;
    }
    public String queryAccount(Employee employee){
        if(findEmployee(employee)>=0){
            return employee.getName();
        }
        return null;
    }
    public Employee queryEmployee(String name){
        int position=findEmployee(name);
        if (position>=0){
            return this.myEmployee.get(position);
        }
        return null;
    }
    public void printEmployee(){
        System.out.println("Employee list");
        for(int i=0;i<this.myEmployee.size();i++){
            System.out.println((i+1)+"."+this.myEmployee.get(i).getName()+"->"+this.myEmployee.get(i).getEmail()+"-->"+this.myEmployee.get(i).getPhone()+"--->"+this.myEmployee.get(i).getAge()+"--->"+this.myEmployee.get(i).getAddress());

        }
    }
}
