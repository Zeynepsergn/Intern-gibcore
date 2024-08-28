package tr.gov.gib.gibcore.util;

public enum ServiceMessage {

    OK(true,"İşlem başarılı"),
    NO_OK(false,"İşlem başarısız"),
    FAIL(false,"Hata oluştu"),
    ;

    private final boolean ok;
    private final String message;

    ServiceMessage(boolean ok, String message) {
        this.ok = ok;
        this.message = message;
    }

    public boolean isOk() {
        return ok;
    }

    public String getMessage() {
        return message;
    }
}
