package entities;

public class Score {
	public String name;
	public double a;
	public double b;
	public double c;
	
	
	public double FinalGrade() {
		return a + b + c;
	}
	
	
	public String toString() {
		return name + ":" + String.format("%.2f", FinalGrade());
	}

}
