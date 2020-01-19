package test_check_box;

/**
 *
 * @author aysuhan
 */
class DimensionsTooLargeException extends Exception 
{

    private static final long serialVersionUID = 1L;
    
    public DimensionsTooLargeException()
    {
    super("Dimensions can not exceeds the max limit!");
    }
    
}