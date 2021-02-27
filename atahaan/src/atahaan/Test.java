package atahaan;

import java.time.LocalDateTime;

public class Test {
	public static void main(String[] args) {

		BookStore bStore = new BookStore();
		//Adding first book
		bStore.addBookToStore(new Books(0, "Acýmak", 3, 20));
		//Adding second book
	    bStore.addBookToStore(new Books(1, "Liseden Arkadaþlar", 15, 15));
	    //Adding third Book
	    bStore.addBookToStore(new Books(2, "Mahalleden Arkadaþlar", 25, 20));
	    //Adding fourth Book
	    bStore.addBookToStore(new Books(3, "Leyla Ýle Mecnun", 35, 10));
	    //Adding fifth Book
	    bStore.addBookToStore(new Books(4, "Bir Ömür Nasýl Yaþanýr?", 55, 35));
	    
	    //Adding morning deliveries
	    bStore.addNewDelivery(new Delivery(bStore.searchBook(0), 0, LocalDateTime.of(2020, 5, 1, 10, 30)));
	    bStore.addNewDelivery(new Delivery(bStore.lastDeliveryId(), 5, "Saatleri Ayarlama Enstitüsü", 15, 5, LocalDateTime.of(2020, 5, 1, 10, 30)));
	    bStore.addNewDelivery(new Delivery(bStore.lastDeliveryId(), 6, "Tutunamayanlar", 24, 15, LocalDateTime.of(2020, 5, 1, 10, 30)));
	    
	    //Adding afternoon deliveries
	    bStore.addNewDelivery(new Delivery(bStore.searchBook(3), bStore.lastDeliveryId(), LocalDateTime.of(2020, 5, 1, 16, 15)));
	    bStore.addNewDelivery(new Delivery(bStore.lastDeliveryId(), 7, "Büyük Saat", 15, 5, LocalDateTime.of(2020, 5, 1, 16, 15)));
	    bStore.addNewDelivery(new Delivery(bStore.lastDeliveryId(), 8, "Toprak", 20, 20, LocalDateTime.of(2020, 5, 1, 16, 15)));
	    
	    //Adding morning customers
	    bStore.addCustomer(new Customers(0, "Mehmet Balkan", 0, LocalDateTime.of(2020, 5, 1, 10, 10)));
	    bStore.addCustomer(new Customers(1, "Ahmet Sarý", 3, LocalDateTime.of(2020, 5, 1, 11, 13)));
	    bStore.addCustomer(new Customers(2, "Samet Yeþil", 6, LocalDateTime.of(2020, 5, 1, 11, 20)));
	    bStore.addCustomer(new Customers(3, "Ali Yýlmaz", 2, LocalDateTime.of(2020, 5, 1, 11, 30)));
	    bStore.addCustomer(new Customers(4, "Atahan Koç", 1, LocalDateTime.of(2020, 5, 1, 12, 00)));
	    
	    //Adding afternoon customers
	    bStore.addCustomer(new Customers(5, "Sakýp Gürsu", 8, LocalDateTime.of(2020, 5, 1, 12, 30)));
	    bStore.addCustomer(new Customers(6, "Okan Koç", 3, LocalDateTime.of(2020, 5, 1, 13, 25)));
	    bStore.addCustomer(new Customers(7, "Semra Atýlgan", 5, LocalDateTime.of(2020, 5, 1, 14, 00)));
	    bStore.addCustomer(new Customers(8, "Ayþe Yýlmaz", 7, LocalDateTime.of(2020, 5, 1, 15, 30)));
	    bStore.addCustomer(new Customers(9, "Temel Karadeniz", 4, LocalDateTime.of(2020, 5, 1, 17, 10)));
	    bStore.listAllBooks();
	    bStore.listDeliveries();
	    bStore.listCustomers();

		
		
		
	} 
}  
