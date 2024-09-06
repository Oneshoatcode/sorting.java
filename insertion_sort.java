public class insertion_sort {
public static void main(String[] args) {
    int a[]={3,1,3,5,1,2,};
    System.out.println("withot sorted arrayy");
    for (int i = 0; i < a.length; i++) {
        System.out.println(a[i]);
        
    }
    for (int i = 1; i <= a.length-1; i++) {
        int j=i;
        while (j>0 && a[j-1]>a[j]) {
            int temp=a[j];
            a[j] =a[j-1];
            a[j-1]=temp;
            j--;
        }
            
        }
        System.out.println();
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
            
        }   


}
    
}
