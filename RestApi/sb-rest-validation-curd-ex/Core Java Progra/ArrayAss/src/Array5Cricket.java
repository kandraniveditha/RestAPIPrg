import java.util.Scanner;
public class Array5Cricket {

	   public static int convertOversToBalls(float overs) {
	        overs = overs*10;
	        int o = (int)overs/10;        
	        int balls = (int)overs % 10;
	        balls += o*6;
	        //System.out.println("Overs to balls " + balls);
	        return balls;
	    }
	    public static String getDisplayDetails(int runs, float overs) {
	        String format1 = "%d runs in %.1f overs @ %.2f runs per over";
	        String format2 = "%d runs in %d balls @ %.2f runs per ball";
	        int balls = convertOversToBalls(overs);
	        float runRate = 0.0f;
	        if (balls < 100 || runs < 100) {
	            runRate = runs/(float)balls;
	            return String.format(format2, runs, balls, runRate);
	        } else {
	            runRate = runs/overs;
	            return String.format(format1, runs, overs, runRate);
	        }
	    }
	    
	    public static void main(String[] args) {
	        // TODO Auto-generated method stub
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter Runs");
	        int runs = sc.nextInt();
	        System.out.println("Enter overs");
	        float overs = sc.nextFloat();
	        System.out.println(getDisplayDetails(runs, overs));

	    }

	   }
