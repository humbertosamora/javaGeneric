package javaGeneric;

public class Client {
	
	private String name;
	private String email;
	private Long cpf;
	
	public Client() {
	
	}

	public Client(String name) {
		this.name = name;
	}
	
	public Client(String name, String email) {
		this.name = name;
		this.email = email;
	}
	
	public Client(String name, String email, Long cpf) {
		this.name = name;
		this.email = email;
		this.cpf = cpf;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getCpf() {
		return cpf;
	}

	public void setCpf(Long cpf) {
		this.cpf = cpf;
	}

	@Override
	public String toString() {
		
		String clientString = "";
		
		if (name!=null) clientString += name;
		if (email!=null) clientString += ", " + email;
		
		return clientString;
	}
}
