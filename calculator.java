package Com.Amit;
import java.util.Scanner;
public class calculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int ans = 0;
        while (true){
            System.out.println("Enter the Operator");
            char op = sc.next().trim().charAt(0);
            if(op=='+' || op =='-' || op =='*' || op =='/' || op =='%'){
                System.out.println("Enter Two Numbers");
                int a = sc.nextInt();
                int b = sc.nextInt();

                if ( op == '+'){
                    ans =a+b;
                }
                if (op =='-'){
                    ans = a-b;
                }
                if (op=='*'){
                    ans = a*b;
                }
                if (op == '/'){
                    if(b!=0){
                        ans = a/b;
                    }
                }
                if (op =='%'){
                    ans = a%b;
                }
            } else if(op =='X' || op== 'x'){
                break;
            }
            else{
                System.out.println("Invalid Operation");
            }
            System.out.println(ans);
        }
    }

}
