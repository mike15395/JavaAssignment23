class EmpWageBuilder {

	public final String company;
	public final int wage_per_hour,
			max_hours,
			maxhrs_month;

	EmpWageBuilder(String company,int wage_per_hour,int max_hours,int maxhrs_month)
	{
		this.company=company;
		this.wage_per_hour=wage_per_hour;
		this.max_hours=max_hours;
		this.maxhrs_month=maxhrs_month;
	} 

	public int wagecalculation(){

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

		EmpWageBuilder obj1 = new EmpWageBuilder("Flipkart",40,100,33);
		obj1.wagecalculation();
		
		EmpWageBuilder obj2 = new EmpWageBuilder("Amazon",34,121,44);
		obj2.wagecalculation();

	}


}

