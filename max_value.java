/**
 * max_value
 */
public class max_value {

    public static void main(String[] args) {
        int arr[]={12,34,56,78,90};
        int n=arr.length;
        check sc=new check();
    System.out.println(sc.largest(arr,n));
     
    }
}
 class check{
     static int  largest(int arr[],int n){
        int max=0;
        for(int i=0;i<n;i++){
            if(arr[i]>max){
            max=arr[i];
            }
        }
        return max;
    }

    @Override
    public String toString() {
        return "check []";
    }
}