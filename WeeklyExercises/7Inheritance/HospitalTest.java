public class HospitalTest {
    public static void main(String[] args) {
        Doctor doctor = new Doctor(001);
        Nurse nurse = new Nurse(002);
        Cleaner cleaner = new Cleaner(003);
        doctor.job();
        nurse.job();
        cleaner.job();
    }
}