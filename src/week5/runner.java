package week5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class runner  {

	public static boolean lock=false;
	public static int  cnt=0;
	public static void main(String []args) throws IOException
	{
		student ob[]=new student[4];
		for(int i=0;i<4;i++)
			ob[i]=new student();
		System.out.println("Enter data of 4 people:");
		ob[0].read();
		ob[1].read();
		ob[2].read();
		ob[3].read();
		
		
		System.out.println("enter city:");
		String city=read.br.nextLine();
		
		for(int i=0;i<4;i++) {
			if(ob[i].getCity().hashCode()==city.hashCode())
				System.out.println(ob[i]);
		}
		List<student>li=new ArrayList<student>();
		for(int i=0;i<4;i++)
			li.add(ob[i]);
		System.out.println("name wise sorted");
		Collections.sort(li,new namesort());
		for(student st:li)
		{
			st.disp();
		}
		System.out.println("city wise sorted");
		Collections.sort(li,new citysort());
		for(student st:li)
		{
			st.disp();
		}
	  System.out.println("enter required id");
		int idc=read.br.nextInt();
		try
		{
			student f=new student() ;f=fun(idc,ob);
			f.disp();
		}
		catch(Exception e)
		{
			System.out.println("id not found");
		}
		System.out.println();
		
		thread1 t1=new thread1();
		t1.start();
		
		
		thread2 t2=new thread2();
		Thread thread =new Thread(t2);
		thread.start();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	static student fun(int idc,student[] ob)
	{
		for(student st:ob)
		{
			if(st.getId()==idc)
				return st;
			
		}
		return null;
	}
	{
		
	}
}
