
class CompanyEmpWage{

	public final String company;
	public final int wage_per_hour,
			max_hours,
			maxhrs_month;
	public int total_emp_wage;

	CompanyEmpWage(String company,int wage_per_hour,int max_hours,int maxhrs_month)
	{
		this.company=company;
		this.wage_per_hour=wage_per_hour;
		this.max_hours=max_hours;
		this.maxhrs_month=maxhrs_month;
		total_emp_wage=0;
	}

	public String toString(){

		return "Total Empolyee wage for company"+company+"is"+total_emp_wage;
	}

	public void  setTotalWage(int total_emp_wage){

			this.total_emp_wage=total_emp_wage;
	}

}



class EmpWageBuilder {


	public CompanyEmpWage[] companyEmpWageArray;
	int count=0;

	EmpWageBuilder()
	{
		companyEmpWageArray = new CompanyEmpWage[5];
	}



	public void addCompany(String company,int wage_per_hour,int max_hours, int maxhrs_month)
	{
		companyEmpWageArray[count]=new CompanyEmpWage(company,wage_per_hour,max_hours,
								maxhrs_month);
		count++;
	}

	public void wagecalculation()
	{
			for(int i=0;i<count;i++)
			{
			companyEmpWageArray[i].setTotalWage(this.wagecalculation( companyEmpWageArray[i]) );
			System.out.println(companyEmpWageArray[i]);
			}
	}

	public int wagecalculation(CompanyEmpWage Cobj){

		int totalwage=0,total_emphrs=0,total_working_days=0, 
			wage=0 , emphrs=0;

		while (total_emphrs < Cobj.max_hours && total_working_days < Cobj.maxhrs_month)
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
				wage = Cobj.wage_per_hour*emphrs;
				totalwage += wage;
				System.out.println("Day " +total_working_days+ " Employee hrs "+emphrs+
							" TotalWage=  "+totalwage);

		}

			return  total_emphrs * Cobj.wage_per_hour;
	}

}




class EmpWageComputation{
	public static void main(String[] args){

		System.out.println("Welcome to Employee Wage Computation Program");

		EmpWageBuilder obj1 = new EmpWageBuilder();
		obj1.addCompany("Flipkart",44,111,3);
		obj1.addCompany("Amazon",34,121,4);
		//obj1.toString();
		obj1.wagecalculation();

	}


}

