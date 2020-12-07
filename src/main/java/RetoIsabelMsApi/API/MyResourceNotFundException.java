package RetoIsabelMsApi.API;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class MyResourceNotFundException extends RuntimeException {
    public MyResourceNotFundException() {
        super();
    }
    public MyResourceNotFundException(String message, Throwable cause) {
        super(message, cause);
    }
    public MyResourceNotFundException(String message) {
        super(message);
    }
    public MyResourceNotFundException(Throwable cause) {
        super(cause);
    }
}
