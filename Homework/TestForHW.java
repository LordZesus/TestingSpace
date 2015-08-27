public class TestForHW {
    public static void main(String[] args){
        boolean A, B, C;
        A = (1 != 1);
        B = (1 != 1);
        C = (1==1);
        if ((A || B) && C){
            System.out.println("T");
        }
        else{
            System.out.println("F");
        }
    }
}