package exer_2;

public class _8_print_odd
{
    public static void main(String[] args)
    {
        int i;
        for(i=0;i<=100;i++)
        {
            if(i%2!=0)
            {
                System.out.printf("%d ",i);
            }
            else
            {
                continue;
            }
        }
    }
}

