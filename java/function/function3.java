import java.util.*;
public class function3 {
    public static int multiplecalculate(int a,int b){
        int mul=a*b;
        return mul;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
       int a=sc.nextInt();
       int  b=sc.nextInt();
       int mul=multiplecalculate(a, b);
       System.out.print("the mul oftwo number is"+mul);


    }
    
}
