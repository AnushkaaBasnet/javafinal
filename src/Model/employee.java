package Model;

public class employee extends member{
    public employee(String name, double age, double contact, String address, double salaryperday, String department) {
        super(name, age, contact, address, salaryperday);
        this.department = department;
    }

    String department;

}
