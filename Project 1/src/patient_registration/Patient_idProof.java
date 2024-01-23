package patient_registration;

public class Patient_idProof {
	private String adharCard;
	private String panCard;
	
	public String getAdharCard() {
		return adharCard;
		
	}
	public void setAdharCard(String adharCard) {
		this.adharCard = adharCard;
	}
	public String getPanCard() {
		return panCard;
	}
	public void setPanCard(String panCard) {
		this.panCard = panCard;
	}
	@Override
	public String toString() {
		return "Patient_idProof [adharCard=" + adharCard + ", panCard=" + panCard + "]";
	}
	
	
}
