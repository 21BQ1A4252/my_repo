package working;
import java.util.Scanner;
public class EB {
	Scanner sc=new Scanner(System.in);
	Scanner scs=new Scanner(System.in);
	String con_na;
	String con_no;
	String type;
	double p_m_r;
	double c_m_r;
	double amount;
	EB(){
		String con_na="";
		String con_no="";
		String type="";
		double p_m_r=0.0;
		double c_m_r=0.0;
		
	}
	void getdetails() {
		System.out.println("enter name:");
		con_na=sc.next();
		System.out.println("enter number:");
		con_no=sc.next();
		System.out.println("enter type:");;
		type=sc.next();
		System.out.print("enter previous month reading:");
		p_m_r=scs.nextDouble();
		System.out.println("enter current month reading:");
		c_m_r=scs.nextDouble();
		
	}
	void calculate() {
		double units;
		units=c_m_r-p_m_r;
		if(type.equals("d")) {
			if(units<=100)
				amount=units*100;
			else if(units<=200)
				amount=units*2.5;
			else if(units<=500)
				amount=units*4;
			else
				amount=units*6;
		}
		else {
			if(units<=100)
				amount=units*2;
			else if(units<=200)
				amount=units*4.50;
			else if(units<=500)
				amount=units*6;
			else
				amount=units*7;
		}
	}
	void show() {
		System.out.print("name: "+con_na);
		System.out.println("number:"+con_no);
		if(type.equals("d"))
			System.out.println("type=domestic");
		else
			System.out.println("type=commercial");
		System.out.println("total bill:"+amount);
	}

}
