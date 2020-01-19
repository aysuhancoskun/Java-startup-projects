package studentregistration;
/**
 *
 * @author aysuhan
 */
import java.util.ArrayList;

public class Student {

    public String name;
    public String surname;
    public Integer student_id;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Integer getStudent_id() {
        return student_id;
    }

    public void setStudent_id(Integer student_id) {
        this.student_id = student_id;
    }
    
    public void displayMethod() {
        System.out.print("The name is " + name + " " + surname);
    }

}
