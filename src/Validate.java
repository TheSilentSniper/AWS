import java.util.HashMap;

public class Validate {
	
	private static HashMap<String, String> credentials = new HashMap<String, String>();
	
	public Validate()
	{
		credentials.put("abc@xyz.com", "123");
		credentials.put("123@456.com", "abc");
	}
	
	public boolean checkUser(String email,String pass) 
    {
		boolean result = false;
		if(credentials.containsKey(email))
		{
			if(pass.equals(credentials.get(email)))
			{
				result = true;
			}
		}
		return result;
    }   

}
