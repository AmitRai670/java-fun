package Com.Amit;
import java.util.Scanner;
public class div {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no : ");
        float num = sc.nextFloat();
        System.out.print("Enter second no : ");
        float num2 = sc.nextFloat();
        float Div = num / num2;
        System.out.println("Ans is : "+Div);
    }
}
