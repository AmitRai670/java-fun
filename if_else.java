package Com.Amit;
import java.util.Scanner;
public class if_else {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the no : ");
        int a = sc.nextInt();
        if(a>50){
            System.out.println("Your are in");
        }
        else{
            System.out.println("Your are out");
        }
    }
}
