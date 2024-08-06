package entities;

public class OutsourcedEmployee extends Employee{
	
	private Double additionalCharge = 1.10;	
	
	public OutsourcedEmployee() {
		
	}
	
	public OutsourcedEmployee(String name, Integer hours, Double valuePerHour, Double additionalCharge) {
		super(name, hours, valuePerHour);
		this.additionalCharge = additionalCharge;
	}

	
	@Override
	public Double payment() {
		return additionalCharge * valuePerHour * hours;
	}
}
