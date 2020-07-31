
public class SumNumbers {
public static void main(String[] args){
  int[] numArray = new int[]{1,4,2,7,5,3};
 System.out.println(add(numArray, numArray.length));

}

static int add(int[] numArray, int index){
  if(index <= 0){
    return 0;
  }

return  numArray[index-1] + add(numArray, index-1);
}
}