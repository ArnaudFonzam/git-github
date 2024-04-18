package compte;

import java.time.LocalDate;

public class Personne {

	private String CNI;
	private String firstName;
	private String lastName;
	private String town;
	private LocalDate dob;
	public Personne(String cNI, String firstName, String lastName, String town, LocalDate dob) {
		super();
		CNI = cNI;
		this.firstName = firstName;
		this.lastName = lastName;
		this.town = town;
		this.dob = dob;
	}
	
	public String getCNI() {
		return CNI;
	}
	
	public void setCNI(String cNI) {
		CNI = cNI;
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
	
	public String getTown() {
		return town;
	}
	
	public void setTown(String town) {
		this.town = town;
	}
	
	public LocalDate getDob() {
		return dob;
	}
	
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public String getFullName() {
		return this.getFirstName() + " "+ this.getLastName();
	}
}
