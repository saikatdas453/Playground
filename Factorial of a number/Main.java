import java.util.Scanner;
class Main{
	public static void main (String[] args){
   		Scanner in = new Scanner(System.in);
      	int n = in.nextInt();
      	int i,fact=1;
      for(i=2;i<=n;i++)
      {
        fact=fact*i;
      } 
      System.out.println(fact);
	    
	}
}