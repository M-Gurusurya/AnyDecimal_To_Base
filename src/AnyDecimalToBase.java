import java.util.Scanner;

public class AnyDecimalToBase {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter Decimal");
        int decimal=scanner.nextInt();
        System.out.println("enter base");
        int base=scanner.nextInt();
        findDecimalToBase(decimal,base);
    }
    public static void findDecimalToBase(int decimal,int base)
    {
        StringBuilder sb=new StringBuilder();
        while (decimal>0)
        {
            sb.append(decimal%base);
            decimal=decimal/base;
        }
        System.out.println(sb.reverse());
    }
}
