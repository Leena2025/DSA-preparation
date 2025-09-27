public class Arrmax {
    public static void main(String[] args) {
       int[] arr={12,20,40,10,500};
       int largest=arr[0];

       for(int i=0 ;i<5;i++){
        if(arr[i]>largest){
            largest=arr[i];
        }
        }
       System.out.println(largest+" is the largest number");

    }
    
}
