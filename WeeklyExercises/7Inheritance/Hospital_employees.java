public class Hospital_employees {
    private int empID;

    public Hospital_employees(int employeeID) {
        this.empID = employeeID;
    }

    public int getEmpID() {
        return empID;
    }

    public void job() {
        System.out.println("Emp :" + empID + " Doing their job...");
    }
}