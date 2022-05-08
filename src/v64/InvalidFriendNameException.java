package v64;

public class InvalidFriendNameException extends RuntimeException {

    private ErrorCode errorCode;

    public InvalidFriendNameException(ErrorCode errorCode, String message) {
        super(message);
        this.errorCode = errorCode;
    }

    public InvalidFriendNameException(ErrorCode errorCode, String message, Throwable cause) {
        super(message, cause);
        this.errorCode = errorCode;
    }

    public ErrorCode getErrorCode() {
        return errorCode;
    }
}
