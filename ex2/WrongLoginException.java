package tp6Exceptions;

public class WrongLoginException extends Exception {
	WrongLoginException(String msg)
	{
		super("le login est incorrect ");
	}
	

}
