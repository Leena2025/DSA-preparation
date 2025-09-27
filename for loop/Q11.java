public class Q11 {
  public static void main(String[] args) {
    int evencount=0;
    int oddcount=0;
    for(int i=1;i<=10;i++){
        if(i%2==0){
            evencount=evencount+1;
        }
        else{
            oddcount=oddcount+1;
        }
    }
    System.out.println("evencount:"+evencount);
    System.out.println("oddcount:"+oddcount);
}  
}
