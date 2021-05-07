package camp3Homework2;

public class User {

	private int id;
	private String name;
	private String eposta;

	public User() {
		
	}
	
	public User(int id, String name, String eposta) {
		super();
		this.id = id;
		this.name = name;
		this.eposta = eposta;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEposta() {
		return eposta;
	}

	public void setEposta(String eposta) {
		this.eposta = eposta;
	}

}
