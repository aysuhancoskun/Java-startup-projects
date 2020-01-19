package studentregistration;
/**
 *
 * @author aysuhan
 */
public class GraduateStudent extends Student {

    @Override
    public void displayMethod() {
        System.out.print("This is a graduate student.The name is " + name + " " + surname);
    }
}
