import java.util.*;
public class function2{
    public static void caluclatesum(int a,int b){
        int sum=a+b;
        System.out.println(sum);
        return;

    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b;
        a=sc.nextInt();
        b=sc.nextInt();
        caluclatesum( a, b);
    }

    
}