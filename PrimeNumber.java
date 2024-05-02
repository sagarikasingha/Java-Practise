public class PrimeNumber {
    public static void main(String[] args) {
        int num = 23; // number to check for prime
        boolean isPrime = true;
        for (int i=num-1;i>1;i--){
            if(num%i==0){
                isPrime=false;
                break;
            }
        }
        if(isPrime == true){
            System.out.println("The given number is  a prime number");
        }else{
            System.out.println("The given number is not a prime number");
        }
    }
    
}
