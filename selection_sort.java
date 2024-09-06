public class selection_sort{
public static void main(String[] args) {
    int a[]={4,6,2,8,33,7,8,11};
System.out.println("after the unsorted arrat");
     for (int i = 0; i <a.length; i++) {
    System.out.println(a[i]);}
    System.out.println("now sorted1 array");

  for (int i = 0; i <=a.length-2; i++) {
   int min=i;
    for(int j=i;j<=a.length-1;j++){
        if(a[j]<a[min]){
            min=j;//this line indicate exact min position index
        } 
      } 
      //this lines swap min position to array first inexuyt
        int temp=a[min];
        a[min]=a[i];
        a[i]=temp;
    
      
  }
  for (int i = 0; i <a.length; i++) {
    System.out.println(a[i]);
  }
        
    }
}
