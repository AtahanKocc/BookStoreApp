package atahaan;

public class Books {

	private long bookId;
	private String name;
    private double price;
    private int numOfCopies;
   
    Books(long id, String nm, double prc, int nmOfCps){
    	this.bookId = id;
    	this.name = nm;
    	this.price = prc;
    	this.numOfCopies = nmOfCps;
    }

    public long getId() {
    	return this.bookId;
    }
    
    public void setId(long id) {
    	this.bookId = id;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getNumOfCopies() {
        return numOfCopies;
    }

    public void setNumOfCopies(int numOfCopies) {
        this.numOfCopies = numOfCopies;
    }
  }

