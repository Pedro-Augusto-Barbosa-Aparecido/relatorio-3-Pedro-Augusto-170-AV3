public class ParticipantAlreadyExists extends RuntimeException {
    public ParticipantAlreadyExists() {
        super();
    }

    public ParticipantAlreadyExists(String message) {
        super(message);
    }

    public ParticipantAlreadyExists(String message, Throwable cause) {
        super(message, cause);
    }

    public ParticipantAlreadyExists(Throwable cause) {
        super(cause);
    }

    protected ParticipantAlreadyExists(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
