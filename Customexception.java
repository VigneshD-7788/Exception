package Exception;
 class InvalidProductException extends Exception
{
    public InvalidProductException(String s)
    {
        // Call constructor of parent Exception
        super(s);
    }
}
public class Customexception {

    void productCheck(int weight) throws InvalidProductException{
        if(weight<100){
            throw new InvalidProductException("Product Invalid");
        }
    }

    public static void main(String args[])
    {
        Customexception obj = new Customexception();
        try
        {
            obj.productCheck(60);
        }
        catch (InvalidProductException e)
        {
            System.out.println("Caught the exception");
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Hello");
        }
    }
}

