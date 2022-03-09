public class Person {
		
	public Person() {
		
	}

	public boolean checkUser(String nomeUsuario) {
		return nomeUsuario.length() >=8 && nomeUsuario.matches("[a-zA-Z].*[a-zA-Z0-9]");
		}
	
	public boolean checkPassword(String senha) {
		return senha.length() >=8 && senha.matches("(?=.*[}{,.@$^?~=+\\-_\\/*\\-+.\\|])(?=.*[a-zA-Z])(?=.*[0-9]).{8,}");
		}

	
	
}
