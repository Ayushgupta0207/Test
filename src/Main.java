import java.util.*;

public class Main
{  // sum of n natural numbers

	public static void main(String[] args) {
	   Scanner kb = new Scanner(System.in);
	   int n = kb.nextInt();
	   int sum=0;
	   for(int i=1;i<=n;i++){
	       sum = sum + i;
	   }
	   System.out.println(sum);
	   
	}
}
