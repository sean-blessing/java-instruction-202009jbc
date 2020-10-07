package business;

public class Actor {
	private int id;
	private String firstName;
	private String lastName;
	private String gender;
	private String birthDate;
	
	public Actor() {
		super();
	}
	
	public Actor(int id, String firstName, String lastName, String gender, String birthDate) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.birthDate = birthDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}
	
	public String displaySummary() {
		String str = "id: "+ id + ", "+firstName +" "+lastName+", "
				+gender+", born "+birthDate;
		return str;
	}

}
