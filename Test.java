import java.util.*;
public class Test{
public static void main(String [] args){
    int data;
    int sum=0;
    Scanner sc=new Scanner(System.in);
    do{
        System.out.println("Enter an integer:");
        data=sc.nextInt();
        sum=sum+data;

    }while (data!=0);
    System.out.println("the sum is"+sum);
}
}
    

