import java.util.Arrays;
public class array {
    public static void main(String[] args) {
        int a[] = {1,22,22,32,1,23,55,66,71,11,999};
        Arrays.sort(a);
        System.out.println("Small value " + a[0]);
        System.out.println("Small value " + a[10]);
    }
}