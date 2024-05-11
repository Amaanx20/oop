public class Doctor extends Hospital_employees {
    public Doctor(int empID) {
        super(empID);
    }

    public void job() {
        super.job();
        System.out.println("Doctor :" + getEmpID() + "Providing X-Ray Scans...");
    }
}