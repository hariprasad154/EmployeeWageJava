package Day3Practice;

public class EmployeWage {
    public class CompanyName{
    	
    	public static void EmployeeAttendence (String EmployeeName,String companyName,int Wage_per_hour,int Full_day_hours,int Part_time_hour) {
    		System.out.println("Employee Attendence calculation method in the -"+companyName);
    		int WorkedHours=0;
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
                    dailyWage = Wage_per_hour * Full_day_hours;
                    WorkedHours=WorkedHours+Full_day_hours;
                    break;
                case 2:
                	System.out.println("Employee is Present as part time and earned "+employeeMOnthlySalary);
                    dailyWage = Wage_per_hour * Part_time_hour;
                    WorkedHours=WorkedHours+Part_time_hour;
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
            System.out.println(employeeMOnthlySalary +EmployeeName +" - Earned in the month");
    	
           
    	}
    	 
    }
	public static void main(String[] args) {
		EmployeWage.CompanyName tcs=new EmployeWage().new CompanyName();
		System.out.println("emp1 attendence and  earnings");
		tcs.EmployeeAttendence(" Hariprasad","TCS",20,8,4);
		//emp1.EmployeeAttendence(" Hari","TCS",20,8,4);
		System.out.println("###########################");
		EmployeWage.CompanyName hcl=new EmployeWage().new CompanyName();
		System.out.println("emp2 attendence and"
				+ " earnings");
		hcl.EmployeeAttendence(" Hariprasad","Hcl",20,8,4);
		
		tcs.EmployeeAttendence(" Hari","TCS",20,8,4);
		tcs.EmployeeAttendence(" prasad","TCS",20,8,4);
		//System.out.println();
	}

}