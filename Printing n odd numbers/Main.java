import java.util.Scanner;
class Main {
	public static void main (String[] args){
	  Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int i;
      for(i=1;i<=n*2;i++)
      {
        if(i%2!=0)
        {
          System.out.println(i);
        }
      }
	}
}