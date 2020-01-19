package studentregistration;
/**
 *
 * @author aysuhan
 */
public class SpecialStudent extends Student {

    @Override
    public void displayMethod() {
        System.out.print("This is a special student.The name is " + name +" "+surname);
    }
}
