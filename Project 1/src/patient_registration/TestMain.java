package patient_registration;

public class TestMain {

	public static void main(String[] args) {
		Address address = new Address();
		
		address.setCity("Pune");
		address.setCountry("India");
		address.setPincode(411046);
		address.setState("Maharashtra");
		
		Patient_1 patient = new Patient_1();
		
		patient.setFirstName("Rahul");
		patient.setLastName("Dinkar");
		patient.setMobileNo(955125548);
		patient.setAge(25);
		patient.setAddress(address);
		
		System.out.println(patient);
		
		Patient_idProof idproof = new Patient_idProof();
		
		idproof.setAdharCard("5454");
		idproof.setPanCard("hj545");
	}

}
