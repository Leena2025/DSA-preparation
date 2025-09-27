public class SumArray {
    public static void main(String[] args) {
        int myarr[]={1,2,3};
        SumArray obj=new SumArray();
        System.out.println(obj.sum(myarr) );
        
    }
    int sum(int arr[]){
        int sum=0;
        for(int i=0;i<arr.length;i++){
             sum=arr[i]+sum;
        }
        return sum;

        
    }
    
}
