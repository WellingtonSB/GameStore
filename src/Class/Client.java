package Class;

public class Client {
	private String name;
	private char gender;

	public String pronouns(char gender) {
		String nick;

		if (gender == 'F') {
			nick = "Miss.";
		} else if (gender == 'M') {
			nick = "Sir.";
		} else if (gender == 'O') {
			nick = name;
		} else {
			nick = " ";
		}
		return nick;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getGender() {
		return gender;
	}

	public void setGender() {
		this.gender = gender;
	}

}
