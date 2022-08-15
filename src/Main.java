import exception.CheeseException;
import exception.CreamException;
import exception.ExceptionWrapper;

public class Main {
    public static void main(String[] args){
        try {
            refrigerator("cheese");
        }catch (Exception e){
            String msg = ExceptionWrapper.getMessage(e);
            System.out.println(msg);
        }
    }

    public  static  void refrigerator(String whatINeed) throws CheeseException, CreamException {
        if (whatINeed.equals("cheese")){
            throw new CheeseException();
        }
        else if (whatINeed.equals("cream")){
            throw new CreamException();
        }
        System.out.println(String.format("here you are , %s" , whatINeed));
    }
}
