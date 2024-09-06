public class bubble_sort {
    public static void main(String[] args) {
        int a[]={4,22,5,11,33,11,1,0};
      //  int n=a.length;
        System.out.println("before sorting");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);   
        }
        System.out.println();
    // for(int i=n-1;i>=1;i--){
    //     for(int j=0;j<=i-1;j++){
    //     if(a[j]>a[j+1]){
    //         int temp=a[j];
    //         a[j]=a[j+1];
    //         a[j+1]=temp;
            
    //     }
    //     }
    // }
    for (int i = 0; i < a.length-1; i++) {
        for (int j = 0; j <= a.length-2; j++) {
            if(a[j]>a[j+1]){
        int temp=a[j];
        a[j]=a[j+1];
        a[j+1]=temp;    
        }
    }
            }
    System.out.println();
    for (int i = 0; i < a.length; i++) {
        System.out.println(a[i]);   
    }
    }
}
