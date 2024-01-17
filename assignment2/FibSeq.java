public class FibSeq {
    public static int n0 = 0, n1 = 1;
    static void fibPrintOut(int counter){

        // first 2 values are hardcoded, so find (counter - 2) more values
        // print static values, then generate the rest
        if(n0 == 0 && n1 ==1){
            System.out.print( 0 +" " + 1);
            counter = counter - 2;
        }
        if(counter>0){
            int n3 = n0 + n1;

            n0 = n1;
            n1 = n3;

            System.out.print(" "+ n3);
            fibPrintOut(counter-1);
        }
    }

    public static void main(String[] args){
        fibPrintOut(10);
    }
}
