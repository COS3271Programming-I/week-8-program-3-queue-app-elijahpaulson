package QueueAPP;
import java.util.LinkedList;
import java.util.Queue;
public class QueueAPP {

	public static void main(String[] args) {
		Queue<String> line = new LinkedList<>();
		Queue<String> line2 = new LinkedList<>();
    	char let = 'A';
    	int time = 0;
    	int rn;
    	int either;
    	String person = "" + let + let + let;
    	line.add(person);
    	
    	while (time < 40)
    	{	
    		rn = (int)(Math.random() * 6);
    		if ((rn == 1) || (rn == 2)) {
    			either=(int)(Math.random()*2);
    			if (either==0&&line.size()<3) {
    				person = "" + let + let + let; line.add(person);
    			}
    			else if ((either==1||either==2)&&line2.size()<3) {
    				person = "" + let + let + let; line2.add(person);
    			}
    			let++;
    		}
    		if ((rn == 3) || (rn == 4) || (rn == 5)) {line.poll();line2.poll();}
    		System.out.println("Time Line 1 " + time + " : "  + line);
    		System.out.println("Time Line 2 " + time + " : "  + line2);
    		time ++;
    	}

		
	}

}
