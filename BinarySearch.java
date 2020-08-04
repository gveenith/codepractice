public class BinarySearch{
  public static void main(String[] args){
    int[] inpurArray = new int[] {1,2,3,4,5,6,7,8,9};
    int searchNumber = 1;
    int  inpurArrayLength = inpurArray.length -1;

   int result = search(inpurArray, 0, inpurArrayLength , searchNumber);
   if(result == -1){
     System.out.print("Not Found");
   }
   System.out.println("Element found at position" + result);
  }

  static int search(int[] inpurArray,int low, int high, int searchNumber){
    

    
 if(high >= low){
   
   int pivot = (low +  high) /2;
   System.out.println(pivot);
    //base case
     if(searchNumber == inpurArray[pivot]){
       System.out.println("final");
      return pivot;
    }

    //recursive cases
        if(inpurArray[pivot] < searchNumber){
          return search(inpurArray,pivot + 1, high , searchNumber);

    }

 if(inpurArray[pivot] > searchNumber){
       return search(inpurArray, low, pivot - 1 , searchNumber);
 }
 }

return -1;


  }
} 