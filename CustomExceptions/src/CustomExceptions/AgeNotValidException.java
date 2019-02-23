package CustomExceptions;

public class AgeNotValidException extends Exception{

    //private static final long serialVersionUID = -5288881993230864190L;

    public AgeNotValidException(String msg) {
        super(msg);
    }
}
