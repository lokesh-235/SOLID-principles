package srp.betterCode;

public class Employee {
	private int id;
	private String name;
	private double totalSalary;
	
	public Employee() {}
	
	public Employee(int id, String name, double totalSalary) {
		super();
		this.id = id;
		this.name = name;
		this.totalSalary = totalSalary;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getTotalSalary() {
		return totalSalary;
	}
	public void setTotalSalary(double totalSalary) {
		this.totalSalary = totalSalary;
	}
	
}
