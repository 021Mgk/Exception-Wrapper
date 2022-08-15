package exception;

public class ExceptionWrapper {
    public static String getMessage(Exception e){
        if (e instanceof CheeseException){
            return "No cheese :)";
        }else  if (e instanceof  CreamException){
            return "No cream :)";
        }
        else {
            return "call admin ";
        }
    }
}
