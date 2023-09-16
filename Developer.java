class Developer implements Employee{
    private String name;
    private String empId;
    private String position;

    public Developer(String empId, String name, String position)
    {
        this.empId = empId;
        this.name = name;
        this.position = position;
    }

    @Override
    public void showEmployeeDetails() {
        System.out.println(empId+" " +name+ " " + position );
    }
}
