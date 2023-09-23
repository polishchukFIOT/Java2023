public class Main {

    public static void main(String[] args) {
        /*
        C2 = 0 -> "+"
        C3 = 0 -> "0"
        C5 = 0 -> "*"
        C7 = 6-> "double"
         */

        int c = 0;
        int a = 4;
        int b = 2;
        int n = 10;
        int m = 10;

        double finalSum = 0;

        if(n < a || m < b){
            System.out.println("Відповідь: "+ finalSum);
        }else if((a > -c || n < -c) && (b > 0 || m < 0)){
            // C7 = 6, тоді за умовою тип індексів i та j: double
            for(double i = a; i <= n; i++){
                // C2 = 0, тоді за умовою операція O1: +
                double znam = i + c;
                for(double j = b; j <= m; j++){
                    // C5 = 0, тоді за умовою операція O2: /
                    finalSum += (i / j) * znam;
                }
            }
            System.out.println("Відповідь: " + finalSum);
        }else{
            System.out.println("Ділення на нуль не можливе.");
        }
    }
}