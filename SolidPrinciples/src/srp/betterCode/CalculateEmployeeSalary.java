package srp.betterCode;

public class CalculateEmployeeSalary {
	public double calculate(double taxPercentage,Employee emp) {
		return emp.getTotalSalary() * (taxPercentage/100);
	}
}
