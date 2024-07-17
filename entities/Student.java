package entities;

public class Student {
	public String name;
	public double nota_1;
	public double nota_2;
	public double nota_3;
	public double result;
	
	public double media() {
		result = nota_1 + nota_2 + nota_3;
		return result; 
	}
	
	public String verificacao() {
		if (result >= 60) {
			return "PASS";
		}
		else {
			double missing = 0;
			missing = 60 - result;
			return "FAILED\n" + "MISSING " + missing + " POINTS";
		}
	}
	
	public String toString() {
		return "FINAL GRADE: " + media() + "\n " + verificacao();
	}
}
