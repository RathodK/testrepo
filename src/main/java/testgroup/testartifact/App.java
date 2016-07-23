package testgroup.testartifact;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        System.out.println("test comment");
        MyTestClass mytest  = new MyTestClass();
        mytest.testMethod();
    }
}
