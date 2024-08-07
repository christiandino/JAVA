package entities;

public class OutsourcedEmployee extends Employee{
	
	private Double taxa = 1.10;
	private Double additionalCharge;
	
	
	public OutsourcedEmployee() {
		
	}
	
	public OutsourcedEmployee(String name, Integer hours, Double valuePerHour, Double additionalCharge) {
		super(name, hours, valuePerHour);
		this.additionalCharge = additionalCharge;
	}

	
	@Override
	public Double payment() {
		Double pay = (taxa * additionalCharge) + (valuePerHour * hours);
		return pay;
	}

	@Override
	public String toString() {
		return getName() + " - $ " +  payment();
	}
	
	
}
