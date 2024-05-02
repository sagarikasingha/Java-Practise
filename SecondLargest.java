public class SecondLargest {
    public static void main(String[] args) {
        int arr[] = {12, 345, 6789, 10, 45};
        
        int max=-1,secondmax=-1;
        for(int i=0;i<arr.length;i++) {
            if(arr[i] > max ){
                secondmax=max;
                max=arr[i];
            }
        }
        System.out.println("The second largest element is : "+secondmax);
    }
}
