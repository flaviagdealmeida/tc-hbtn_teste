import java.time.LocalDate;

public class Person {

	private String nome;
	private String surnome;
	private int birthDate;
	private boolean anotherCompanyOwner;
	private boolean Pensioner;
	private boolean PublicServer;
	private float salary;
	
	public Person() {
		
	}
	
	public Person(String nome, String surnome, int birthDate, float salary) {
		super();
		this.nome = nome;
		this.surnome = surnome;
		this.birthDate = birthDate;
		this.salary = salary;
	}

	public String fullName() {
		return nome+" "+surnome;
	}
	
	public float calculateYearlySalary() {
		return salary * 12;
	}
	
	private int age() {
		return LocalDate.now().getYear() - birthDate;
	}
	
	public boolean  isMEI() {
		if (calculateYearlySalary() < 130000  &&  age()>= 18){
			return anotherCompanyOwner == false 
					&& Pensioner == false 
					&& PublicServer == false;
		}
		return false;
	}

		public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSurnome() {
		return surnome;
	}

	public void setSurnome(String surnome) {
		this.surnome = surnome;
	}

	public int getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(int birthDate) {
		this.birthDate = birthDate;
	}

	public boolean isAnotherCompanyOwner() {
		return anotherCompanyOwner;
	}

	public void setAnotherCompanyOwner(boolean anotherCompanyOwner) {
		this.anotherCompanyOwner = anotherCompanyOwner;
	}

	public boolean isPensioner() {
		return Pensioner;
	}

	public void setPensioner(boolean pensioner) {
		Pensioner = pensioner;
	}

	public boolean isPublicServer() {
		return PublicServer;
	}

	public void setPublicServer(boolean publicServer) {
		PublicServer = publicServer;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}
	

}
