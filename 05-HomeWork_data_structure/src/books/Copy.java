package books;

public class Copy {
	Book Java ;
	int copy;
	
	public Copy(Book book1, int copy){
		super();
		this.Java = book1;
		this.copy = copy;
	}

	public Book getBook1() {
		return Java;
	}

	public void setBook1(Book book1) {
		this.Java = book1;
	}

	public int getCopy() {
		return copy;
	}

	public void setCopy(int copy) {
		this.copy = copy;
	}
	
}

