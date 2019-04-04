import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    Scanner in = new Scanner(System.in);
      	int n= in.nextInt();
      	int temp=n;
      	int n1,n2;
      	int n3=1;
      	int count = 0;
      	int sum=0;
        while(n>0)
        {
          n=n % 10;
          sum = sum +n;
          count= count+1;
          temp = temp/10;
          n=temp;
        }
      	System.out.println(sum);
	}
}