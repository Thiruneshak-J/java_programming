import java.util.Scanner;
public class ex_3_per_area
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int len,bre,per,area;
        System.out.print("enter the length of rectangle:");
        len=sc.nextInt();
        System.out.print("enter the breath of rectangle:");
        bre=sc.nextInt();
        per=2*(len+bre);
        area=len*bre;
        System.out.printf("perimeter of rectangle is %d%n",per);
        System.out.printf("area of rectangle is %d%n",area);
    }
}
