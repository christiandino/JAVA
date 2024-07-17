package entities;

public class Retangulo {
	
	public double width;
	public double height;
	
	public double totalAreaRetangulo() {
		return width * height;
	}
	
	public double totalPerimetroRetangulo() {
		return (width + height) * 2;
	}
	
	public double totalDiagonalRetangulo() {
		return Math.sqrt((Math.pow(width, 2)) + (Math.pow(height, 2)));
	}
	
	
}
