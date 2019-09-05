package tws.entity;


public class Storage {
	private String id;
	private String orderNumber;
	private String name;
	private String phone;
	private String weight;
	private String timeOfAppointment;
	private String state;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getOrderNumber() {
		return orderNumber;
	}
	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	public String getTimeOfAppointment() {
		return timeOfAppointment;
	}
	public void setTimeOfAppointment(String timeOfAppointment) {
		this.timeOfAppointment = timeOfAppointment;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Storage(String id, String orderNumber, String name, String phone, String weight, String timeOfAppointment,
			String state) {
		super();
		this.id = id;
		this.orderNumber = orderNumber;
		this.name = name;
		this.phone = phone;
		this.weight = weight;
		this.timeOfAppointment = timeOfAppointment;
		this.state = state;
	}
	public Storage() {
	}
	
	
}
