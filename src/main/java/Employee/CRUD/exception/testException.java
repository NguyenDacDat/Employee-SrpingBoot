package Employee.CRUD.exception;

import org.springframework.http.HttpStatus;

public class testException extends BaseErrorException{
    private static final String message= "test BAD_REQUEST";
    private static final HttpStatus code =HttpStatus.BAD_REQUEST;
    public testException() {
        super(message,code);
    }
}
