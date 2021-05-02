public class Student extends User {
    private String addresses;

    public Student(int id, String name, String Email, String addresses) {
        super(id, name, Email);
        this.addresses = addresses;
    }

    public String getAddresses() {
        return addresses;
    }

    public void setAddresses(String addresses) {
        this.addresses = addresses;
    }
}
