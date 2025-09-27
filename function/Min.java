
public class Min {
    public static void main(String args[]){
       Min obj=new Min();
       int[] arr={1,2,0,4,5};
       System.out.println(obj.minelement(arr));

    }
    int minelement(int[] arr){
            int minn=arr[0];

        for(int i=1;i<arr.length;i++){
            if(arr[i]<minn){
                minn=arr[i];
            }
        }
        return minn;
    }
    
    
}
