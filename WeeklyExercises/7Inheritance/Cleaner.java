public class Cleaner extends Hospital_employees {
    public Cleaner(int empID) {
        super(empID);
    }
    public void job() {
        super.job();
        System.out.println("Cleaner :" + getEmpID() + "Scheduled cleaning...");
    }
}
