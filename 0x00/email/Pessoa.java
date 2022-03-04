package email;

public class Pessoa {
	
	private String email;
	
	
	public static boolean emailValid(String email) {
			return (email.length() <= 50 ||  email.contains("@"))? true: false;

	}

}
