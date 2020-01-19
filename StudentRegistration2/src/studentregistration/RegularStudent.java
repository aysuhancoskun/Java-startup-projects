package studentregistration;
/**
 *
 * @author aysuhan
 */
public class RegularStudent extends Student {
    
    @Override
    public void displayMethod() {
        System.out.print("This is a regular student.The name is " + name + " " + surname);
    }
}
