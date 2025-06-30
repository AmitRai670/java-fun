package Com.Amit;
import java.util.Scanner;
public class reverse {
    public static void main(String[] args) {
       Scanner sc = new Scanner (System.in);
       int n =sc.nextInt();
       int count= 0;

       while(n>0){
           int rem = n%10;
           n=n/10;
           count =count*10+ rem;
       }
       System.out.println(count);
    }
}
