package atahaan;

import java.util.ArrayList;
import java.util.Queue;
import java.util.Stack;
import java.util.List;
import java.util.LinkedList;

public class BookStore {

	//region Protected fields
	public List<Books> allBooks;
    protected Queue<Customers> customers;
    protected Stack<Delivery> newDeliveries;

    public BookStore() {
        allBooks = new ArrayList<Books> ();  // Keeps all our books.
        customers = new LinkedList<Customers> ();
        newDeliveries = new Stack<Delivery>();
    }
    

    public void addBookToStore(Books booksObject) {
    	if(this.searchBook(booksObject.getId()) == null){
    		allBooks.add(booksObject);
    	}else {
    		System.out.println("Book ID " + booksObject.getId() + " already exists");
    	}
    }

    public void removeBookFromStore(Books booksObject) {
    	if(this.searchBook(booksObject.getId()) == null){
    		System.out.println("Book doesn't exist");
    	}else {
    		allBooks.remove(booksObject);
    	}
    }
    
    public void modifyBook(Books booksObject) {
    	if(this.searchBook(booksObject.getId()) == null){
    		System.out.println("Book doesn't exist");
    	}else {
    		Books existingBook = this.searchBook(booksObject.getId());
    		existingBook.setName(booksObject.getName());
    		existingBook.setNumOfCopies(existingBook.getNumOfCopies() + booksObject.getNumOfCopies());
    		existingBook.setPrice(booksObject.getPrice());
    		existingBook = null;
    	}
    }
    
    public void addCustomer(Customers customerObj) {
        customers.add(customerObj);
    }

    public void removeCustomer(Customers customerObj) {
        customers.remove(customerObj);
    }
    
    public long lastDeliveryId() {
    	return newDeliveries.lastElement().getDeliveryId() + 1;
    }
    
    public void addNewDelivery(Delivery delivery) {
    	newDeliveries.add(delivery);
    	if(this.searchBook(delivery.getId()) == null){
    		allBooks.add(delivery);
    	}else {
    		Books existingBook = this.searchBook(delivery.getId());
    		existingBook.setNumOfCopies(existingBook.getNumOfCopies() + delivery.getNumOfCopies());
    		existingBook = null;
    	}
    }

    public void removeDelivery(Delivery delivery) {
        newDeliveries.remove(delivery);
    }
    
    public void modifyDelivery(Delivery delivery) {
    	if(this.searchBook(delivery.getId()) == null){
    		System.out.println("Delivery doesn't exist");
    	}else {
    		Delivery existingDelivery = this.searchDelivery(delivery.getDeliveryId());
    		existingDelivery.setNumOfCopies(existingDelivery.getNumOfCopies() + delivery.getNumOfCopies());
    		existingDelivery = null;
    	}
    }
    
    public void listAllBooks() {
    	System.out.println("Number of all books: " + allBooks.size());
    	System.out.println("*************************************************************************");
    	for (int i = 0; i < allBooks.size(); i++){
    		System.out.println("Book ID: " + allBooks.get(i).getId());
    		System.out.println("Book name: " + allBooks.get(i).getName());
    		System.out.println("Number of copies: " + allBooks.get(i).getNumOfCopies());
    		System.out.println("Price: " + allBooks.get(i).getPrice());
    		System.out.println("*************************************************************************");
    	}
    }
    
    public void listDeliveries() {
    	System.out.println("Number of total deliveries: " + newDeliveries.size());
    	System.out.println("*************************************************************************");
    	for (int i = 0; i < newDeliveries.size(); i++){
    		System.out.println("Delivery ID: " + newDeliveries.get(i).getDeliveryId());
            System.out.println("Book ID: " + newDeliveries.get(i).getId());
            System.out.println("Book name: " + newDeliveries.get(i).getName());
            System.out.println("Number of copies: " + newDeliveries.get(i).getNumOfCopies());
            System.out.println("Price: " + newDeliveries.get(i).getPrice());
            System.out.println("Delivery date/time: " + newDeliveries.get(i).getDeliveryDateTime());
            System.out.println("*************************************************************************");
        }
    }
    
    public void listCustomers() {
    	System.out.println("Number of visitors: " + customers.size());
    	System.out.println("*************************************************************************");
    	for(Customers Cstmr: customers) {
    		Books requestedBook = this.searchBook(Cstmr.getRequestedBook());
    		System.out.println("Customer ID: " + Cstmr.getCustomerId());
    		System.out.println("Name surname: " + Cstmr.getNameSurname());
            System.out.println("	Book ID: " + requestedBook.getId());
            System.out.println("	Book name: " + requestedBook.getName());
            System.out.println("	Number of copies: " + requestedBook.getNumOfCopies());
            System.out.println("*************************************************************************");
            requestedBook = null;
        }
    }
    
    public Books searchBook(long id) {
    	for (int i = 0; i < allBooks.size(); i++){
    		if(allBooks.get(i).getId() == id) {
    			return allBooks.get(i);
    		}
    	}
    	return null;
    }
    
    public Delivery searchDelivery(long id) {
    	for (int i = 0; i < newDeliveries.size(); i++){
    		if(newDeliveries.get(i).getDeliveryId() == id) {
    			return newDeliveries.get(i);
    		}
    	}
    	return null;
       
    }  
}
    
 
