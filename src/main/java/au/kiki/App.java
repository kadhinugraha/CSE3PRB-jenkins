package au.kiki;

/**
 * Hello world!
 *
 */
public class App 
{
    public static boolean isDivisibleByFive(int number)
    {
        return number % 5 ==0;
    }

    public static void main( String[] args )
    {
        System.out.println( isDivisibleByFive(50));
    }
}
