
public class Laptop implements Sellable{
	private double RAM;
	private double memory;
	
	public Laptop(){
		
	}
	public Laptop(double RAM, double memory){
		this.RAM=RAM;
		this.memory=memory;
	}

	public double getRAM() {
		return RAM;
	}
	public void setRAM(double rAM) {
		RAM = rAM;
	}
	public double getMemory() {
		return memory;
	}
	public void setMemory(double memory) {
		this.memory = memory;
	}
	@Override
	public void sell() {
		// TODO Auto-generated method stub
		
	}

	
		
	}


