public class Fibonacci {
    public static void main(String[] args) {
        int n1 = 0, n2=1,temp=0;
        System.out.println("Fibonacci Series:");
        for (int i=1 ;i<=10;++i){   
            System.out.print(n1+ " ");
            temp=n1;
            n1=n2;
            n2=n1+temp;            
        }
    }
}
