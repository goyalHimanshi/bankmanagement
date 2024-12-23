import java.util.*;
public class program1 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("enter the number you want to sum that");
        n=sc.nextInt();
        int sum=0;
        for(int i=0;i<=n;i++){
            sum=sum+i;
          //  System.out.println("the sum is "+sum);

        }
        System.out.println("the sum is "+sum);

    }
    
}
