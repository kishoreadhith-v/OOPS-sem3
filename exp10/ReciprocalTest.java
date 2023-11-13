package exp10;

public class ReciprocalTest {
    void reciprocal(int num){
        try {
            System.out.println("Reciprocal of " + num + ": " + 1/num);
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }
    }

    public static void main(String[] args) {
        ReciprocalTest obj = new ReciprocalTest();
        obj.reciprocal(5);
        obj.reciprocal(0);
    }
}
