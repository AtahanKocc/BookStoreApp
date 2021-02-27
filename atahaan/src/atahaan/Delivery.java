package atahaan;

	import java.time.LocalDateTime;

	public class Delivery extends Books{

		private long deliveryId;
		private LocalDateTime deliveryDateTime;
		
		Delivery(long dlvId, long id, String nm, double prc, int nmOfCps, LocalDateTime dlvDtTm){
	    	super(id, nm, prc, nmOfCps);
	    	this.setDeliveryId(dlvId);
	    	this.setDeliveryDateTime(dlvDtTm);
	    }
		
		Delivery(Books deliveredBook, long dlvId, LocalDateTime dlvDtTm){
			super(deliveredBook.getId(), deliveredBook.getName(), deliveredBook.getPrice(), deliveredBook.getNumOfCopies());
	    	this.setDeliveryId(dlvId);
	    	this.setDeliveryDateTime(dlvDtTm);
		}
		
		public long getDeliveryId() {
			return deliveryId;
		}

		public void setDeliveryId(long deliveryId) {
			this.deliveryId = deliveryId;
		}
		
		public LocalDateTime getDeliveryDateTime() {
			return deliveryDateTime;
		}

		public void setDeliveryDateTime(LocalDateTime deliveryDateTime) {
			this.deliveryDateTime = deliveryDateTime;
	  }
}
