import java.util.*;
public class function4 {
    public static void printfactorial(int n){
        int fact=1;
        if(n<0){
            System.out.println("invalid fact num");
        }
        for(int i=n;i>=1;i--){
            fact=fact*i;

        }
        System.out.print(fact);

    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
      printfactorial(n);


    }
    
}
