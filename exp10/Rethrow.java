package exp10;

public class Rethrow {
    static void s() throws ArrayIndexOutOfBoundsException{
        int arr[] = new int[6];
        try {
            System.out.println(arr[10]);
        } catch (Exception e) {
            System.out.println("Exception: " + e);
            throw e;
        } finally {
            System.out.println("Finally block of s()");
        }
    }   
    
    static void r() throws ArrayIndexOutOfBoundsException{
        try {
            s();
        } catch (Exception e) {
            System.out.println("Exception: " + e);
            throw e;
        } finally {
            System.out.println("Finally block of r()");
        }
    }

    static void q() throws ArrayIndexOutOfBoundsException{
        try {
            r();
        } catch (Exception e) {
            System.out.println("Exception: " + e);
            throw e;
        } finally {
            System.out.println("Finally block of q()");
        }
    }

    static void p() throws ArrayIndexOutOfBoundsException{
        try {
            q();
        } catch (Exception e) {
            System.out.println("Exception: " + e);
            throw e;
        } finally {
            System.out.println("Finally block of p()");
        }
    }

    public static void main(String[] args) {
        try {
            p();
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        } finally {
            System.out.println("Finally block of main()");
        }
    }
}
