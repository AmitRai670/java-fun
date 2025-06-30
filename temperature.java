package Com.Amit;
import java.util.Scanner;
public class temperature {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        float TempC = sc.nextFloat();
        float TempF = (TempC * 9/5) +32;
        System.out.println("The temperature is " +TempF);
    }
}
