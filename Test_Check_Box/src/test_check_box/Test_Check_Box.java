package test_check_box;

/**
 *
 * @author aysuhan
 */
import java.util.Scanner;
public class Test_Check_Box 
{

    private static double dim_1;
    private static double dim_2;
    private static double dim_3;
    
    public static void main(String[] args) throws DimensionsTooLargeException 
    {
        try {
            System.out.print("Dimensions: "); 
            Scanner input = new Scanner(System.in);
            double dim1 = input.nextInt();
            double dim2 = input.nextInt();
            double dim3 = input.nextInt();
            
            CheckBox(dim1,dim2,dim3);
        }catch (DimensionsTooLargeException e) {
        System.out.println(e);
    }
    }

    public static void CheckBox(double dim1, double dim2, double dim3)throws DimensionsTooLargeException
    {
        if (dim1<=10.0 && dim2<=10.0 && dim3<=10.0 )
        {
        dim_1 = dim1;
        dim_2 = dim2;
        dim_3 = dim3;
        }
        else {
        throw new DimensionsTooLargeException();
    }
    }
    private Scanner input;

    /*   /**
    * @return the input
    */
    public Scanner getInput() {
        return input;
    }
    
    /**
     * @param input the input to set
     */
    public void setInput(Scanner input)
    {
        this.input = input;
    }
}
