public class TestForHW {
    public static void main(String[] args){
        boolean A, B, C, f;
        int n, x, l;
        for(x=0; x<2 ; x++){
            for (n=0; n<2; n++){
                for(l=0; l<2; l++){
                    A = x == 0;
                    B = n == 0;
                    C = l == 0;
                    f = !(!A&&!B&&!C);
                    System.out.println(f);
                }
                
            };
        }
    }
}