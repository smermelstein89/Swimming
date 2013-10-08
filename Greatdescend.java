public class Greatdescend 
{
	public static void main(String[] args) 
	{
			
		int start = 30;
		int interval = 50;
		int sendOffTime = start;
		int num = 1;
		System.out.println("For the Great Descend, 50's on the " + start + " starting on the " + start +",");
		System.out.println("Number " +num + " is on " + interval + " seconds and you should leave on the " + sendOffTime);
		for(num=2; (interval-1) >= 0; num++){
			
			sendOffTime += interval;
			sendOffTime %=	60; 
			System.out.println("Number " +num + " is on " + (interval-1) + " seconds and you should leave on the " + sendOffTime);
			interval--;
		}
		
	}
}
