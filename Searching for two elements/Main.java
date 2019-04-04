import java.util.Scanner;
class Main{
    public static void main(String args[]){
       Scanner in = new Scanner(System.in);
      	int n3 = in.nextInt();
      	int a[]= new int [n3];
      	int k,m=-1,n=-1,j=0;
      	for(k=0;k<n3;k++)
        {
          a[k] = in.nextInt();
        }
      int n1 = in.nextInt();
      int n2 = in.nextInt();
        for(int i = 0; i < n3; i++)
        {
            if(n1 == a[i])
            {
                m =i;
            }
          	
            if(n2 == a[i])
            {
                n =i;
            }
        }
        System.out.println(m);
      System.out.println(n);
    }
}