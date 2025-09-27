public class targetvalue {

    public static void main(String[] args) {
        int[] values={1,3,7,9,5};
        int target=9;
        for(int i=0;i<values.length;i++){
            System.out.print("values: ");
            System.out.println(  values[i]);

        }
        for(int i=0;i<values.length;i++){
            if(values[i]==target){
                 System.out.print("target value: "+target);
            }
        }
    }
}