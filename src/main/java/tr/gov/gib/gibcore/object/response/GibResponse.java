package tr.gov.gib.gibcore.object.response;

import tr.gov.gib.gibcore.object.BaseObject;
import tr.gov.gib.gibcore.util.ServiceMessage;

import java.util.ArrayList;
import java.util.List;

public class GibResponse<T> extends BaseObject {

    private Boolean status;
    private String message;
    private T data;
    private List<Object> error;

    public GibResponse() {}

    public GibResponse(Boolean status, String message, T data, List<Object> error) {
        this.status = status;
        this.message = message;
        this.data = data;
        this.error = error;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public List<Object> getError() {
        return error;
    }

    public void setError(List<Object> error) {
        this.error = error;
    }

    public static <T>Builder<T> builder(){
        return new Builder<>();
    }

    public static class Builder<T> {

        private GibResponse<T> instance;

        private Builder(){
            instance = new GibResponse<T>();
            instance.error = new ArrayList<Object>();
        }

        public Builder<T> status(Boolean status) {
            instance.status = status;
            return this;
        }

        public Builder<T> message(String message) {
            instance.message = message;
            return this;
        }

        public Builder<T> service(ServiceMessage serviceMessage){
            instance.status = serviceMessage.isOk();
            instance.message = serviceMessage.getMessage();
            return this;
        }

        public Builder<T> data(T data) {
            instance.data = data;
            return this;
        }

        public Builder<T> error(List<Object> error) {
            instance.error = error;
            return this;
        }

        public GibResponse<T> build() {
            return instance;
        }
    }
}
