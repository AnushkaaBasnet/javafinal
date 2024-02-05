package Model;

public class member {
    String name;
    double age;
    double contact;
    String Address;
    double salaryperday;

    public member(String name, double age, double contact, String address, double salaryperday) {
        this.name = name;
        this.age = age;
        this.contact = contact;
        Address = address;
        this.salaryperday = salaryperday;
    }
    public double information(int leave){
        int workdays= 24-leave;
        return workdays *salaryperday;

    }

}
