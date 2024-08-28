package tr.gov.gib.gibcore.object.request;

import tr.gov.gib.gibcore.object.BaseObject;

public class GibRequest<T> extends BaseObject {

    private T data;

    public GibRequest() {}

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
