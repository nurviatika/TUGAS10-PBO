
/**
 *
 * @author SITI NURVIATIKA
 */
public class CobaException4 {
    public static void main (String[] args){
        int bil=10;
        String b[]={"a","b","c"};
        try
        {
            System.out.println(bil/0);
            System.out.println(b[3]);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Terjadi Aitmatika error");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Melebihi jumlah array");
        }
        catch(Exception e)
        {
            System.out.println("Ini menghandle error yang terjadi");  
        }
    }
    
}
