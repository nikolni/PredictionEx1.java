package jaxb.error.handling.exception.prdworld;

public class RandomWrongParamException extends RuntimeException{
    private final String EXCEPTION_MESSAGE = "The Random function must get an integer as a parameter";

    @Override
    public String getMessage() {
        return EXCEPTION_MESSAGE;
    }
}
