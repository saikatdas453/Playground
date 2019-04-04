import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
      	int n = in.nextInt();
      	int a[]= new int [n];
      	int k,max,j=0;
      	for(k=0;k<n;k++)
        {
          a[k] = in.nextInt();
        }
      	max = a[0];
        for(int i = 0; i < n; i++)
        {
            if(max < a[i])
            {
                max = a[i];
            }
        }
        System.out.println(max);
    }
}