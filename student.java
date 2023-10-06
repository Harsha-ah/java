import java.util.*;
import java.io*;
class student
{
	String name;
	Double mark[]=new Double[10];
	Double sum=0.0,avg;
	int regno,age;
	public void readData()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter REG-NO,AGE,NAME of student:");
		regno=sc.nextInt();
		age=sc.nextLine();
		System.out.println("enter marks of 5 subjects.");
		for(int i=0;i<5;i++)
		{
			mark[i]=sc.nextDouble();
			sum=sum+mark[i];
		}
	}
	void display()
	System.out.println("Regno:"+regno);
	System.out.println("Name:"+name);
	System.out.println("Age:"+age);
}
}
class Result extends Student
{
	void resultdisp()
	{
		avg=sum/5;
		System.out.println("sum="+sum);
		System.out.println("Average="+avg);
		if(avg>90)
		{
			System.out.println("Grade A");
		}
		else if(avg>75)
		{
			System.out.println("Grade B");
		}
		else if(avg>55)
		{
			System.out.println("Grade C");
		}
		else if(avg>35)
		{
			System.out.println("Grade D");
		}
		else{
			System.out.println("Failed!");
		}
	}
}

public class studentresult
{
	public static void main(String args[])
	{
		Result rs=new Result();
		rs.readData();
		rs.display();
		rs.resultdisp();
	}
}
