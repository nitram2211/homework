import java.math.BigDecimal;
import java.util.ArrayList;

public class Cart {

	private BigDecimal leva;
	private ArrayList<Sellable> list = new ArrayList<Sellable>();

	public Cart() {

	}

	public Cart(BigDecimal leva, ArrayList<Sellable> list) {
		super();
		this.leva = leva;
		this.list = list;
	}

	public BigDecimal getLeva() {
		return leva;
	}

	public void setLeva(BigDecimal leva) {
		this.leva = leva;
	}

	public ArrayList<Sellable> getList() {
		return list;
	}

	public void setList(ArrayList<Sellable> list) {
		this.list = list;
	}

	public void sell(BigDecimal dollars) throws CustomException {
		if (getLeva().compareTo(dollars) == -1) {
			throw new CustomException("Not in stock");
		}

	}
}
