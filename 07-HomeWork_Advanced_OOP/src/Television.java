public class Television implements Sellable {
	private double screensize;
	private boolean isIt3D;

	public Television() {

	}

	public Television(double screensize, boolean isIt3D) {
		this.isIt3D = isIt3D;
		this.screensize = screensize;
	}

	public double getScreensize() {
		return screensize;
	}

	public void setScreensize(double screensize) {
		this.screensize = screensize;
	}

	public boolean isIt3D() {
		return isIt3D;
	}

	public void setIt3D(boolean isIt3D) {
		this.isIt3D = isIt3D;
	}

	@Override
	public void sell() {
		// TODO Auto-generated method stub

	}

}
