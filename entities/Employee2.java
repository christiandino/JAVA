package entities;

public class Employee2 {
	
	private Integer id;
	private String name;
	private Double salary;
	
	public Employee2() {
		
	}
	
	public Employee2(Integer id, String name, Double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return name;
	}

	public void setNome(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalario(Double salary) {
		this.salary = salary;
	}

	public void increaseSalary(double percentage) {
		salary += salary * percentage / 100.0;
	}	
	
	@Override
	public String toString() {
		return id + ", " + name + ", " + String.format("%.2f", salary);
	}
	
	
	
	
}
