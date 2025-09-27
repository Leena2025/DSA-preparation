public class Arravg {
    public static void main(String[] args) {
        int[] arr={10,5,7,9,8};
        int sum=0;
        int avg=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
            avg=sum/arr.length;

        }
        System.out.println(avg);
    }
    
}
