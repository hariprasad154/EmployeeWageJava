package Day3Practice;

public class EmployeWage {
	
	static final int WAGE_PER_HOUR = 20;
    static final int FULL_DAY_HOUR = 8;
    static final int PART_DAY_HOUR = 4;
    static int WorkedHours=0;
public class Employee{
	
    	public static void EmployeeAttendence () {
    		System.out.println("Employee Attendence calculation method");
    		int employeeMOnthlySalary=0;		
    		int dailyWage = 0;
    		int Day=1;
    		System.out.println("----------------------------------------");
            while((Day<=20) && (WorkedHours<100)){//her we have condition for the days and hours
            	int employeeCheck = (int) (Math.random() * 10) % 3;
                System.out.println(employeeCheck + "in the day "+Day);
                switch (employeeCheck) {
                case 1:
                	System.out.println("Employee is Present and earned "+employeeMOnthlySalary);
                    dailyWage = WAGE_PER_HOUR * FULL_DAY_HOUR;
                    WorkedHours=WorkedHours+FULL_DAY_HOUR;
                    break;
                case 2:
                	System.out.println("Employee is Present as part time and earned "+employeeMOnthlySalary);
                    dailyWage = WAGE_PER_HOUR * PART_DAY_HOUR;
                    WorkedHours=WorkedHours+PART_DAY_HOUR;
                    break;
                default:
                	System.out.println("Employee is Absent and earned "+employeeMOnthlySalary);
                	dailyWage = 0;
                	
                }
                Day++;
                employeeMOnthlySalary=employeeMOnthlySalary+dailyWage;
            }
            System.out.println("------------------------");
            System.out.println("Working hours is -"+WorkedHours);
            System.out.println(employeeMOnthlySalary +"- IS the Amount Earned in the moth");
    	
    	}
    }
	public static void main(String[] args) {
		EmployeWage.Employee emp1=new EmployeWage().new Employee();
		System.out.println("emp1 attendence and"
				+ " earnings");
		
		emp1.EmployeeAttendence();
		System.out.println("###########################");
		EmployeWage.Employee emp2=new EmployeWage().new Employee();
		System.out.println("emp2 attendence and"
				+ " earnings");
		
		emp2.EmployeeAttendence();
		
		//System.out.println();
		
	}

}
