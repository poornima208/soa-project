package ServiceClasss;

public class Expenses {
	/**
	 * Instance fields are declared as specified.
	 * These fields are hidden from other classes as all the fields are declared private.
	 * These fields can be accessed through Getters and Setters. 	
	 */
		private String ExpenseID;
		private String EmployeeID;
		private String ExpenseType;
		private String PurposeofExpense;
		private float AmountSpent;
		private String Description;
		private String DatePurchased;
		private String DateSubmitted;
		private float AdvanceAmount;
		private String PaymentMethod;
		public String getExpenseID() {
			return ExpenseID;
		}
		public void setExpenseID(String expenseID) {
			ExpenseID = expenseID;
		}
		public String getEmployeeID() {
			return EmployeeID;
		}
		public void setEmployeeID(String employeeID) {
			EmployeeID = employeeID;
		}
		public String getExpenseType() {
			return ExpenseType;
		}
		public void setExpenseType(String expenseType) {
			ExpenseType = expenseType;
		}
		public String getPurposeofExpense() {
			return PurposeofExpense;
		}
		public void setPurposeofExpense(String purposeofExpense) {
			PurposeofExpense = purposeofExpense;
		}
		public float getAmountSpent() {
			return AmountSpent;
		}
		public void setAmountSpent(float amountSpent) {
			AmountSpent = amountSpent;
		}
		public String getDescription() {
			return Description;
		}
		public void setDescription(String description) {
			Description = description;
		}
		public String getDatePurchased() {
			return DatePurchased;
		}
		public void setDatePurchased(String datePurchased) {
			DatePurchased = datePurchased;
		}
		public String getDateSubmitted() {
			return DateSubmitted;
		}
		public void setDateSubmitted(String dateSubmitted) {
			DateSubmitted = dateSubmitted;
		}
		public float getAdvanceAmount() {
			return AdvanceAmount;
		}
		public void setAdvanceAmount(float advanceAmount) {
			AdvanceAmount = advanceAmount;
		}
		public String getPaymentMethod() {
			return PaymentMethod;
		}
		public void setPaymentMethod(String paymentMethod) {
			PaymentMethod = paymentMethod;
		}
		

}
