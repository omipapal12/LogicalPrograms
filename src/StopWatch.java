import java.util.*;
import java.util.Scanner;

public class Utility {
public class StopWatch {
	public static void main(String[] args) {
		System.out.println("Press any character and press Enter to SATRT the Stopwatch");
		char startCh =  Utility.getUserChar();
		long start = System.currentTimeMillis();
		System.out.println("Enter any character and press Enter to STOP the Stopwatch");
		char stopCh = Utility.getUserChar();
		long stop = System.currentTimeMillis();
		float timeElapsed =(float) (stop - start) / 1000;
		System.out.println("Time = " + timeElapsed + " Seconds");
		}
	}
}
