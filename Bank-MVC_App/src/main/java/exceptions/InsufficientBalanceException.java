package exceptions;

public class InsufficientBalanceException extends Exception{

	private static final long serialVersionUID = 1L;

	@Override
    public String getMessage() {
        return "Insufficient balance for this transaction.";
    }
}
