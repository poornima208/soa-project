package ServiceClasss;

public class Transaction {
	/**
	 * Instance fields are declared as specified.
	 * These fields are hidden from other classes as all the fields are declared private.
	 * These fields can be accessed through Getters and Setters. 	
	 */
		private String transactionID;
		private String OrderID;
		private String priceID;
		private String transactionDate;
		private String transactionDescription;
		private float transactionAmount;
		private String make;
		private String model;
		private String year;
		private String employeeID;
		private String truckNo;
		private String discount;
		private int quantity;
		private float unitPrice;
		private float driverPric;
		private String runNumber;
		private String special;
		private float rate;
		private float surcharge;
                private String vin;

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getVin() {
        return vin;
    }
		public String getTransactionID() {
			return transactionID;
		}
		public void setTransactionID(String transactionID) {
			this.transactionID = transactionID;
		}
		public String getOrderID() {
			return OrderID;
		}
		public void setOrderID(String orderID) {
			OrderID = orderID;
		}
		public String getPriceID() {
			return priceID;
		}
		public void setPriceID(String priceID) {
			this.priceID = priceID;
		}
		public String getTransactionDate() {
			return transactionDate;
		}
		public void setTransactionDate(String transactionDate) {
			this.transactionDate = transactionDate;
		}
		public String getTransactionDescription() {
			return transactionDescription;
		}
		public void setTransactionDescription(String transactionDescription) {
			this.transactionDescription = transactionDescription;
		}
		public float getTransactionAmount() {
			return transactionAmount;
		}
		public void setTransactionAmount(float transactionAmount) {
			this.transactionAmount = transactionAmount;
		}
		public String getMake() {
			return make;
		}
		public void setMake(String make) {
			this.make = make;
		}
		public String getModel() {
			return model;
		}
		public void setModel(String model) {
			this.model = model;
		}
		public String getYear() {
			return year;
		}
		public void setYear(String year) {
			this.year = year;
		}
		public String getEmployeeID() {
			return employeeID;
		}
		public void setEmployeeID(String employeeID) {
			this.employeeID = employeeID;
		}
		public String getTruckNo() {
			return truckNo;
		}
		public void setTruckNo(String truckNo) {
			this.truckNo = truckNo;
		}
		public String getDiscount() {
			return discount;
		}
		public void setDiscount(String discount) {
			this.discount = discount;
		}
		public int getQuantity() {
			return quantity;
		}
		public void setQuantity(int quantity) {
			this.quantity = quantity;
		}
		public float getUnitPrice() {
			return unitPrice;
		}
		public void setUnitPrice(float unitPrice) {
			this.unitPrice = unitPrice;
		}
		public float getDriverPric() {
			return driverPric;
		}
		public void setDriverPric(float driverPric) {
			this.driverPric = driverPric;
		}
		public String getRunNumber() {
			return runNumber;
		}
		public void setRunNumber(String runNumber) {
			this.runNumber = runNumber;
		}
		public String getSpecial() {
			return special;
		}
		public void setSpecial(String special) {
			this.special = special;
		}
		public float getRate() {
			return rate;
		}
		public void setRate(float rate) {
			this.rate = rate;
		}
		public float getSurcharge() {
			return surcharge;
		}
		public void setSurcharge(float surcharge) {
			this.surcharge = surcharge;
		}

		
}