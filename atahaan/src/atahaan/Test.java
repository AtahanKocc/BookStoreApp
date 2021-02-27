package atahaan;

import java.time.LocalDateTime;

public class Test {
	public static void main(String[] args) {

		BookStore bStore = new BookStore();
		//Adding first book
		bStore.addBookToStore(new Books(0, "Ac�mak", 3, 20));
		//Adding second book
	    bStore.addBookToStore(new Books(1, "Liseden Arkada�lar", 15, 15));
	    //Adding third Book
	    bStore.addBookToStore(new Books(2, "Mahalleden Arkada�lar", 25, 20));
	    //Adding fourth Book
	    bStore.addBookToStore(new Books(3, "Leyla �le Mecnun", 35, 10));
	    //Adding fifth Book
	    bStore.addBookToStore(new Books(4, "Bir �m�r Nas�l Ya�an�r?", 55, 35));
	    
	    //Adding morning deliveries
	    bStore.addNewDelivery(new Delivery(bStore.searchBook(0), 0, LocalDateTime.of(2020, 5, 1, 10, 30)));
	    bStore.addNewDelivery(new Delivery(bStore.lastDeliveryId(), 5, "Saatleri Ayarlama Enstit�s�", 15, 5, LocalDateTime.of(2020, 5, 1, 10, 30)));
	    bStore.addNewDelivery(new Delivery(bStore.lastDeliveryId(), 6, "Tutunamayanlar", 24, 15, LocalDateTime.of(2020, 5, 1, 10, 30)));
	    
	    //Adding afternoon deliveries
	    bStore.addNewDelivery(new Delivery(bStore.searchBook(3), bStore.lastDeliveryId(), LocalDateTime.of(2020, 5, 1, 16, 15)));
	    bStore.addNewDelivery(new Delivery(bStore.lastDeliveryId(), 7, "B�y�k Saat", 15, 5, LocalDateTime.of(2020, 5, 1, 16, 15)));
	    bStore.addNewDelivery(new Delivery(bStore.lastDeliveryId(), 8, "Toprak", 20, 20, LocalDateTime.of(2020, 5, 1, 16, 15)));
	    
	    //Adding morning customers
	    bStore.addCustomer(new Customers(0, "Mehmet Balkan", 0, LocalDateTime.of(2020, 5, 1, 10, 10)));
	    bStore.addCustomer(new Customers(1, "Ahmet Sar�", 3, LocalDateTime.of(2020, 5, 1, 11, 13)));
	    bStore.addCustomer(new Customers(2, "Samet Ye�il", 6, LocalDateTime.of(2020, 5, 1, 11, 20)));
	    bStore.addCustomer(new Customers(3, "Ali Y�lmaz", 2, LocalDateTime.of(2020, 5, 1, 11, 30)));
	    bStore.addCustomer(new Customers(4, "Atahan Ko�", 1, LocalDateTime.of(2020, 5, 1, 12, 00)));
	    
	    //Adding afternoon customers
	    bStore.addCustomer(new Customers(5, "Sak�p G�rsu", 8, LocalDateTime.of(2020, 5, 1, 12, 30)));
	    bStore.addCustomer(new Customers(6, "Okan Ko�", 3, LocalDateTime.of(2020, 5, 1, 13, 25)));
	    bStore.addCustomer(new Customers(7, "Semra At�lgan", 5, LocalDateTime.of(2020, 5, 1, 14, 00)));
	    bStore.addCustomer(new Customers(8, "Ay�e Y�lmaz", 7, LocalDateTime.of(2020, 5, 1, 15, 30)));
	    bStore.addCustomer(new Customers(9, "Temel Karadeniz", 4, LocalDateTime.of(2020, 5, 1, 17, 10)));
	    bStore.listAllBooks();
	    bStore.listDeliveries();
	    bStore.listCustomers();

		
		
		
	} 
}  
