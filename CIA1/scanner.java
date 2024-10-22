import java.util.*;
public class scanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your age");
        int a = sc.nextInt();
        System.out.println("Your age is " + a);
        if (a >= 18) {
            System.out.println("You can drive car");
        }
        else{
            System.out.println("Dont drive");
        }
    }
}



