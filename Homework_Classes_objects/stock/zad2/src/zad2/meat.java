package zad2;

public class meat extends stock {
	
	private String type;
	private int bestuntil; 
	
	public meat(){}
	
	public meat(String type,int bestuntil,int price,boolean available){
		
		super.price = price;
		super.available = available;
		setType(type);
		setBestUntil(bestuntil);
	}

	
	
	public String getType(){
		return type;
	}
	public void setType(String type){
		this.type = type;
	}
	
	public int getBestUntil(){
		return bestuntil;
	}
	
	public void setBestUntil(int bestuntil){
		this.bestuntil = bestuntil;
	}
	
	@Override
	public void StockOut()
	{
		System.out.printf("\nType : %s \nBest Until month: %d \nPrice: %d \nAvailable: %b ",this.type,this.bestuntil,super.price,super.available);
		
	}
	
	
}
