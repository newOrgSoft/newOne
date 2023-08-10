package exceptions;

public class UserTypeException extends Exception{
    @Override
    public String getMessage() {
        return "User Type not found Exception";
    }
}
