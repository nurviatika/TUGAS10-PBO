
/**
 *
 * @author USER
 */
public class CobaException3 {
    public static void main(String[] args) {
        int bil=10;
        try
        {
            System.out.println(bil/10);
        }
        catch (ArithmeticException e)
        {
            System.out.println("Terjadi Aritmatika error");
        }
        catch(Exception e)
        {
            System.out.println("Ini mengandle error yang terjadi");
        }
    }
    
}
