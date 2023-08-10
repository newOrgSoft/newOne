package exceptions;

public class BuildingNotFoundException extends Exception{

    @Override
    public String getMessage() {
        return "Building Not Found";
    }

}
