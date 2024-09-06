import java.util .*;
public class merge_sotring {
    public static void merge(int a[],int l,int mid,int h){
        ArrayList<Integer> temp=new ArrayList<>();
        int left=l;
        int right=mid+1;
        while(left<=mid&&right<=h){
            if(a[left]<=a[right]){
                temp.add(a[left]);
                left++;
            }
            else{
                temp.add(a[right]);
                right++;
            }
        }
        while(left<=mid){
        temp.add(a[left]);
        left++;
        }
        while(right<=h){
            temp.add(a[right]);
            right++;
            } 
            for (int i = l; i <=h; i++) {
                a[i]=temp.get(i-l);
                
            }
    }
    public static void merge_sort(int a[],int l,int h){
        if(l<h){
            int mid=(l+h)/2;
            merge_sort(a, l, mid);
            merge_sort(a, mid+1, h);
            merge(a, l, mid, h);
        }
    }
    public static void main(String[] args) {
      int a[]={6,6,1,1,2,7,4,2,5};
      int n=a.length;
      System.out.println("before the sorting");
      for (int i = 0; i <a.length; i++) {
        System.out.println(a[i]);
      }
System.out.println();
        
        merge_sort(a, 0, n-1);
        System.out.println("now sorted array ");
        for (int i = 0; i <n; i++) {
            System.out.println(a[i]);
          }
    }  
}
//end