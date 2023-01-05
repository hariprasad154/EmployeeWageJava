package Day3Practice;

public class UC66 {

	static final int WAGE_PER_HOUR = 20;
    static final int FULL_DAY_HOUR = 8;
    static final int PART_DAY_HOUR = 4;
    
    
    static int WorkedHours=0;
	public static void main(String[] args) {
		
		int employeeMOnthlySalary=0;		
		int dailyWage = 0;
		int Day=1;
		System.out.println("Welcome to Employee Wage");
     
        while((Day<=20) && (WorkedHours<100)){
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
        System.out.println(WorkedHours);
        System.out.println(employeeMOnthlySalary +"-- IS the Amount Earned in the moth");
	}

}
