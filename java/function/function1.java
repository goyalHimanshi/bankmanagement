import java.util.*;
import java.sql.*;
public class function1{
    public static void printname(String name){
        System.out.println("here hiii ..."+name+ "this is my name");
        return;

    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String name;
        name =sc.nextLine();
            printname(name);
    }
}