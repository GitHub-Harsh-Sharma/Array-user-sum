import java.util.*;
class Arrayusersum
{
 int[][] arr;
 int m,n,sum=0;
 public void input()
 {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter M Element:");
    m=sc.nextInt();
    System.out.println("Enter N Elements:");
    n=sc.nextInt();
    arr=new int[m][n];
    System.out.println("Enter elements");
    for(int r=0;r<m;r++)
    {
        for (int i=0;i<n;i++)
        {
            arr[r][i]=sc.nextInt();
        }
    }
 }
 public void print()
 {
    System.out.println("Sum of Elements are:");
    for(int r=0;r<m;r++)
 {
    for(int i=0;i<n;i++)
    {
    sum+=arr[r][i];
    }    
    System.out.println(sum);
 }
}
 public static void main(String args[])
 {
    Arrayusersum arr2=new Arrayusersum();
    arr2.input();
    arr2.print();
 }
} 