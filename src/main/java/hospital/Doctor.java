package hospital;

public class Doctor extends HospitalEmployee implements MedicalDuties {

    private String speciality;

    public Doctor(String employeeNumber, String name, String speciality) {
        super(employeeNumber, name);
        this.speciality = speciality;
    }

    @Override
    public void careForPatient(Patient sickPatient) {
        sickPatient.increaseHealthLevel(10);
    }

    @Override
    public void drawBlood(Patient sickPatient) {
        sickPatient.decreaseBloodLevel(5);
    }

    @Override
    public int calculatePay() {
        return 90000;
    }

}
