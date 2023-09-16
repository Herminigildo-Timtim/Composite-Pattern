public class Company {
    public static void main (String[] args)
    {
        Developer dev1 = new Developer("F1-01", "Mikka Ella Quiton", "Pro Developer");
        Developer dev2 = new Developer("F1-02", "Ashley Moriah Lazaraga", "Developer");
        Developer dev3 = new Developer("F1-03","Herminigildo Timtim","Noob Developer");
        CompanyDirectory developer = new CompanyDirectory("Developer");
        developer.addEmployee(dev1);
        developer.addEmployee(dev2);
        developer.addEmployee(dev3);

        Manager man1 = new Manager("01", "Ronell Padillo", "Classroom Manager");

        CompanyDirectory manager = new CompanyDirectory("Manager");
        manager.addEmployee(man1);

        CompanyDirectory company = new CompanyDirectory();
        company.addEmployee(manager);
        company.addEmployee(developer);
        company.showEmployeeDetails();
    }
}
