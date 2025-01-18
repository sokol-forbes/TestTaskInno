import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int m;
        Scanner scanner = new Scanner(System.in);
        m = scanner.nextInt();
        System.out.println(myFoo(m));
    }
    public static double log(int base, int x) {
        return Math.log(x) / Math.log(base);
    }
    public static int myFoo(int m)throws ArithmeticException{
        if(m<=1)
            throw new ArithmeticException("Для "+m+" число k не существует");
        else if (m<4&&m>1)
            return 0;
        int k;
        k=(int)log(4,m);
        if(Math.pow(4,k)==m)
            return k-1;
        else return k;
    }
}