package week3.day2;

public class JavaConnection extends MySqlConnection implements DatabaseConnection
{

	@Override
	public void connect() 
	{
		System.out.println("connect()-->implements from DatabaseConnection");
		
	}

	@Override
	public void disconnect() 
	{
		System.out.println("disconnect() -->implements from DatabaseConnection");
		
	}

	@Override
	public void executeUpdate() 
	{
		System.out.println("executeUpdate() -->implements from DatabaseConnection");
	}

	@Override
	public void executeQuery() 
	{
		System.out.println("executeQuery() --> extends from MySqlConnection");
		
	}
	public static void main(String[] args) 
	{
		JavaConnection connect = new JavaConnection();
		connect.connect();
		connect.disconnect();
		connect.executeQuery();
		connect.executeUpdate();
		
	}

}

