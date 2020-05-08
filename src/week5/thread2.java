package week5;

public class thread2 implements Runnable {
   

@Override
public void run() {
	// TODO Auto-generated method stub
	while(runner.cnt<10)
	   {
		   if(runner.lock==true)
		   {System.out.print("-toc");
		   
		   runner.lock=false;
		   runner.cnt++;}
		   
	   }
	
}}
