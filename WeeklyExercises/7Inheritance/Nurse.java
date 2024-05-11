public class Nurse extends Hospital_employees {
    public Nurse(int empID) {
        super(empID);
    }

    public void job() {
        super.job();
        System.out.println("Nurse :" + getEmpID() + "Providing flu shots to paitents...");
    }
}
