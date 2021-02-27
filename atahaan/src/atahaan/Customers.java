package atahaan;
import java.time.LocalDateTime;

public class Customers {

	private String nameSurname;
    private long requestedBookId;
    private long  customerId; 
    private LocalDateTime requestDateTime;
    
    public Customers(long customerId, String nameSurname) {
        this.setNameSurname(nameSurname);
        this.setCustomerId(customerId);
    }
    
    public Customers(long customerId, String nameSurname, long requestedBookId, LocalDateTime requestDateTime) {
        this.setNameSurname(nameSurname);
        this.setCustomerId(customerId);
        this.setRequestedBook(requestedBookId);
        this.setRequestDateTime(requestDateTime);
    }

    public String getNameSurname() {
        return nameSurname;
    }

    public void setNameSurname(String nameSurname) {
        this.nameSurname = nameSurname;
    }
    
    public long getRequestedBook() {
        return requestedBookId;
    }
    
    public void setRequestedBook(long requestedBookId) {
        this.requestedBookId = requestedBookId;
    }
    
    public float getCustomerId() {
    	return customerId;
    }
    
    public void setCustomerId(long customerId) {
    	this.customerId=customerId;
    }
    
    public LocalDateTime getRequestDateTime() {
    	return this.requestDateTime;
    }
    
    public void setRequestDateTime(LocalDateTime requestDtTm) {
    	this.requestDateTime = requestDtTm;
    }

}
