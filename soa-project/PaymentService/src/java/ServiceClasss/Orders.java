package ServiceClasss;

import java.util.Date;



public class Orders {
	/**
	 * Instance fields are declared as specified.
	 * These fields are hidden from other classes as all the fields are declared private.
	 * These fields can be accessed through Getters and Setters. 	
	 */
		private String orderID;
		Date orderDate = new Date ();
		private String customerID;
		private String employeeID;
		private String truckID;
		private String isSpecial;
		private long purchaseOrderNumber;
		private float orderTotalAmount;
		public String getOrderID() {
			return orderID;
		}
		public void setOrderID(String orderID) {
			this.orderID = orderID;
		}
		public Date getOrderDate() {
			return orderDate;
		}
		public void setOrderDate(Date orderDate) {
			this.orderDate = orderDate;
		}
		public String getCustomerID() {
			return customerID;
		}
		public void setCustomerID(String customerID) {
			this.customerID = customerID;
		}
		public String getEmployeeID() {
			return employeeID;
		}
		public void setEmployeeID(String employeeID) {
			this.employeeID = employeeID;
		}
		public String getTruckID() {
			return truckID;
		}
		public void setTruckID(String truckID) {
			this.truckID = truckID;
		}
		public String getIsSpecial() {
			return isSpecial;
		}
		public void setIsSpecial(String isSpecial) {
			this.isSpecial = isSpecial;
		}
		public long getPurchaseOrderNumber() {
			return purchaseOrderNumber;
		}
		public void setPurchaseOrderNumber(long purchaseOrderNumber) {
			this.purchaseOrderNumber = purchaseOrderNumber;
		}
		public float getOrderTotalAmount() {
			return orderTotalAmount;
		}
		public void setOrderTotalAmount(float orderTotalAmount) {
			this.orderTotalAmount = orderTotalAmount;
		}
	
		

}
