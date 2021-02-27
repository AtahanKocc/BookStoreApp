package atahaan;

public class Sale {
	
	private long book_Id;
	private String name;
	private double price;
    private int numOfCopies;
	
	 public long getBook_ID() {
	   return book_Id;
	 }
     
	 public void setBook_Id(long book_Id) {
	  this.book_Id = book_Id;
	 }
	 
     public String getName() {
	 return name;
	 }

	 public void setName(String name) {
	 this.name = name;
	 }
	   
	 public double price() {
	 return price;
	 }
	    
	 public void setPrice(double price) {
	 this.price = price;
	 }
	    
	 public int getNumofCopies() {
	 return numOfCopies;
	 }   
	 public void setNumofCopies(int numOfCopies) {
	 this.numOfCopies = numOfCopies;
	 }
}
