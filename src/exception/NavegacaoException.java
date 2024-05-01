package exception;
public class NavegacaoException extends RuntimeException {

    public NavegacaoException(String message) {
        super(message);
    }

    public NavegacaoException(String message, Throwable cause) {
        super(message, cause);
    }
}
