import java.sql.SQLOutput;
import java.util.Collection;

public class UnderstandObject {

    private Integer id;

    private String firstName;

    private String lastName;

    public static void main(String[] args) {

        UnderstandObject o1 = new UnderstandObject();
        UnderstandObject o2 = new UnderstandObject();

        o1.setId(1);
        o1.setFirstName("rohan");
        o1.setLastName("dahiya");

        o2.setId(2);
        o2.setFirstName("rohan");
        o2.setLastName("dahiya");

        System.out.println(o1.toString());
        System.out.println(o2.toString());

        System.out.println(o1.equals(o2));
        System.out.println(o1.hashCode());
        System.out.println(o2.hashCode());
    }

    @Override
    public String toString() {
        return "First Name:" + this.firstName + "Last Name:" + this.lastName;
    }

    @Override
    public boolean equals(Object obj) {
        UnderstandObject object = (UnderstandObject) obj;

        return this.firstName.equalsIgnoreCase(object.getFirstName());
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
