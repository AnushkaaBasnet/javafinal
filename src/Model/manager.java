package Model;

public class manager extends member {
    public manager(String name, double age, double contact, String address, double salaryperday, String specialization) {
        super(name, age, contact, address, salaryperday);
        this.specialization = specialization;
    }

    String specialization;



}
