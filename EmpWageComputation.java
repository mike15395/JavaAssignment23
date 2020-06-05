class EmpWageCalc {

	public static final int wage_per_hour_g = 20;
	public static final int maxhrs_month_g=20, max_hours_g=100; 

	public int wagecalculation(String company ,int wage_per_hour,int max_hours, int maxhrs_month){

		int totalwage=0,total_emphrs=0,total_working_days=0, 
			wage=0 , emphrs=0;

		while (total_emphrs<max_hours && total_working_days < maxhrs_month)
	 {
			total_working_days++;
			int empcheck = (int)(Math.random()*10)%3;

			switch (empcheck)
			{
				case 1 :  // FullTime
					emphrs = 8;
					break;
				case 2 :  // PartTime
   				emphrs = 4;
					break;
				default :					// Absent
					emphrs = 0;

			}
				total_emphrs +=emphrs;
				wage = wage_per_hour*emphrs;
				System.out.println("Employee wage="+wage);
				totalwage += wage;
		}
			System.out.println("Company "+company+"Monthly wage is="+totalwage);
			return totalwage;
		}

}




class EmpWageComputation{
	public static void main(String[] args){

		System.out.println("Welcome to Employee Wage Computation Program");

		EmpWageCalc obj = new EmpWageCalc();
		obj.wagecalculation("Flipkart",30,100,40);
		obj.wagecalculation("Amazon",40,120,45);
		obj.wagecalculation("Ebay",34,123,54);
		obj.wagecalculation("Jobong",36,121,42);

	}


}

