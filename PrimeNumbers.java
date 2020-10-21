public class PrimeNumbers {
    public static void main(String[] args) {
       int factor = 0;
        System.out.println("Prime numbers between 1 and 100");
        for (int i = 1; i <= 100; i++) {
            factor = 0;
            for (int j = 1; j <= i; j++) {
                if(i%j == 0){
                    factor++;
                }
            }
            if(factor == 2){
                System.out.println(i);
            }
        }
    }
}

