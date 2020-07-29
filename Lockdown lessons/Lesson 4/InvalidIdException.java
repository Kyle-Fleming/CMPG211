class InvalidIdException extends RuntimeException

{
	public InvalidIdException()
	{
		super("The ID is invalid");
		
	}
	
	public InvalidIdException(String msg)
	{
		super(msg);
	}
}