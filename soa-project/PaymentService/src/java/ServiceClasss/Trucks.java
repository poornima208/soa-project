package ServiceClasss;

public class Trucks { //CLient is an abstract class 

/**
 * Instance fields are declared as specified.
 * These fields are hidden from other classes as all the fields are declared private.
 * These fields can be accessed through Getters and Setters. 	
 */
	private String truckNo;
	private String make;
	private int year;
	private String model;
	private String licenseplateNo;
	private String employeeID;
	private String color;
	private String VIN;
	private float truckcost;
	public String getTruckNo() {
		return truckNo;
	}
	public void setTruckNo(String truckNo) {
		this.truckNo = truckNo;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getLicenseplateNo() {
		return licenseplateNo;
	}
	public void setLicenseplateNo(String licenseplateNo) {
		this.licenseplateNo = licenseplateNo;
	}
	public String getEmployeeID() {
		return employeeID;
	}
	public void setEmployeeID(String employeeID) {
		this.employeeID = employeeID;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getVIN() {
		return VIN;
	}
	public void setVIN(String vIN) {
		VIN = vIN;
	}
	public float getTruckcost() {
		return truckcost;
	}
	public void setTruckcost(float truckcost) {
		this.truckcost = truckcost;
	}

	
}
