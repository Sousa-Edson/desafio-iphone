package exception;

public class ReproducaoException extends RuntimeException {

    public ReproducaoException(String message) {
        super(message);
    }

    public ReproducaoException(String message, Throwable cause) {
        super(message, cause);
    }
}
