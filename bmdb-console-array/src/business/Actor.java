
public class Actor {
	private String firstName;
	private String lastName;
	private String gender;
	private String birthDay;
	
	public Actor() {
		super();
	}
	
	public Actor(String firstName, String lastName, String gender, String birthDate) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.birthDay = birthDate;
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
		return birthDay;
	}

	public void setBirthDate(String birthDate) {
		this.birthDay = birthDate;
	}
	
	public String displaySummary() {
		String str = firstName +" "+lastName+", "
				+gender+", born "+birthDay;
		return str;
	}

}
