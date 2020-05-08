package week5;

public class thread1 extends Thread {

	public void run() {
		while(runner.cnt<10)
		{
			if(runner.lock==false)
			{   if(runner.cnt<10)
				System.out.print(" tic");
			
			runner.lock=true;
			
			}
		}
		
		
	}
}
