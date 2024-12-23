import java.util.*;
public class p {
    public static boolean armst(int num){
        int sum=0;
         int original=num;
         while (num>0) {
           int rem=num%10;
           num=num/10;
           sum=sum+rem*rem*rem;
        }
        return sum==original;



    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num;
        num=sc.nextInt();
        boolean ans=armst(num);
        System.out.println(ans+"this is armstrong");


    }
    
}
