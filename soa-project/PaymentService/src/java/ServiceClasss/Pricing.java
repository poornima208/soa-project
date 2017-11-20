package ServiceClasss;

public class Pricing {

	/**
	 * Instance fields are declared as specified.
	 * These fields are hidden from other classes as all the fields are declared private.
	 * These fields can be accessed through Getters and Setters. 	
	 */
		private int priceID;
		private int locationIDFrom;
		private int locationIDTO;
		private String locationCodeFrom;
		private String locationCodeTo;
		private String locationNameFrom;
		private String locationNameTo;
		private String customerID;
		public int getPriceID() {
			return priceID;
		}
		public void setPriceID(int priceID) {
			this.priceID = priceID;
		}
		public int getLocationIDFrom() {
			return locationIDFrom;
		}
		public void setLocationIDFrom(int locationIDFrom) {
			this.locationIDFrom = locationIDFrom;
		}
		public int getLocationIDTO() {
			return locationIDTO;
		}
		public void setLocationIDTO(int locationIDTO) {
			this.locationIDTO = locationIDTO;
		}
		public String getLocationCodeFrom() {
			return locationCodeFrom;
		}
		public void setLocationCodeFrom(String locationCodeFrom) {
			this.locationCodeFrom = locationCodeFrom;
		}
		public String getLocationCodeTo() {
			return locationCodeTo;
		}
		public void setLocationCodeTo(String locationCodeTo) {
			this.locationCodeTo = locationCodeTo;
		}
		public String getLocationNameFrom() {
			return locationNameFrom;
		}
		public void setLocationNameFrom(String locationNameFrom) {
			this.locationNameFrom = locationNameFrom;
		}
		public String getLocationNameTo() {
			return locationNameTo;
		}
		public void setLocationNameTo(String locationNameTo) {
			this.locationNameTo = locationNameTo;
		}
		public String getCustomerID() {
			return customerID;
		}
		public void setCustomerID(String customerID) {
			this.customerID = customerID;
		}
		
	}