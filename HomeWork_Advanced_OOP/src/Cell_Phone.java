public class Cell_Phone implements Sellable {
	
	private String carrier;
	private String operatingSystem;

	public Cell_Phone() {

	}

	public Cell_Phone(String carrier, String operatingSystem) {
		this.carrier = carrier;
		this.operatingSystem = operatingSystem;
	}

	public String getCarrier() {
		return carrier;
	}

	public void setCarrier(String carrier) {
		this.carrier = carrier;
	}

	public String getOperatingSystem() {
		return operatingSystem;
	}

	public void setOperatingSystem(String operatingSystem) {
		this.operatingSystem = operatingSystem;
	}

	@Override
	public void sell() {
		
	}

}
