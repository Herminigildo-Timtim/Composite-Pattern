import java.util.ArrayList;
import java.util.List;

class CompanyDirectory implements Employee{
    private String name;
    private List<Employee> employeeList = new ArrayList<Employee>();

    public CompanyDirectory(String name){
        this.name = name;
    }
    public CompanyDirectory(){
        this.name = "";
    }
    @Override
    public void showEmployeeDetails()
    {
        if(!this.name.isEmpty()){
            System.out.println("\nThis is the "+name+":\n");
        }
        for(Employee emp:employeeList)
        {
            emp.showEmployeeDetails();
        }
    }

    public void addEmployee(Employee emp)
    {
        employeeList.add(emp);
    }

    public void removeEmployee(Employee emp)
    {
        employeeList.remove(emp);
    }
}
