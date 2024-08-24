package Employee.CRUD.exception;

import org.springframework.http.HttpStatus;

public class EmployeeNotFoundException extends BaseErrorException {
    private static final String message = "employee not found";
    private static final HttpStatus code = HttpStatus.NOT_FOUND;
    public EmployeeNotFoundException() {
        super(message, code);
    }
}
