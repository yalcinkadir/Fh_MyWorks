package LMS.provided;

public class Driver {
    private String name;
    private String phone;

    public Driver(String name, String phone) {
        super();
        this.name = name;
        this.phone = phone;
    }

    public final String getName() {
        return name;
    }

    public final void setName(String name) {
        this.name = name;
    }

    public final String getPhone() {
        return phone;
    }

    public final void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return String.format("%s %s", name, phone);
    }
}
