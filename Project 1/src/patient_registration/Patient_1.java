package patient_registration;

public class Patient_1 {
	
	private String firstName;
	private String lastName;
	private int mobileNo;
	private int age;
	private Address address;
	private Patient_idProof idproof;
	
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
	public int getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(int mobileNo) {
		this.mobileNo = mobileNo;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public Patient_idProof getIdproof() {
		return idproof;
	}
	public void setIdproof(Patient_idProof idproof) {
		this.idproof = idproof;
	}
	@Override
	public String toString() {
		return "Patient_1 [firstName=" + firstName + ", lastName=" + lastName + ", mobileNo=" + mobileNo + ", age="
				+ age + ", address=" + address + ", idproof=" + idproof + "]";
	}
	
	
		
}

