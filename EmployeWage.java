package Day3Practice;

public class EmployeWage {
	static final int WAGE_PER_HOUR = 20;
    static final int FULL_DAY_HOUR = 8;
	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage");
        int employeeCheck = (int) (Math.random() * 10) % 10;
        System.out.println(employeeCheck);
        int dailyWage = 0;
        if (employeeCheck == 1) {
            System.out.println("Employee is Present");
            dailyWage = WAGE_PER_HOUR * FULL_DAY_HOUR;
        } else {
            System.out.println("Employee is Absent");
        }
        System.out.println("Daily wage => " + dailyWage);

	}

}
