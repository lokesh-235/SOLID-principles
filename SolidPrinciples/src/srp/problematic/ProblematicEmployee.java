package srp.problematic;

public class ProblematicEmployee {
	private int id;
	private String name;
	private double totalSalary;
	
	public ProblematicEmployee() {}
	
	public ProblematicEmployee(int id, String name, double totalSalary) {
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
	public double calculateSalary(double taxPercentage) {
		return totalSalary * (taxPercentage/100) ;
	}
	
	public boolean updateEmployeeDetails(int id) {
		System.out.println("updating employee details");
		return true;
	}
	
	
}
