import java.awt.image.Kernel;

public class BinarySearch {
        static int[] list = {1, 2, 3, 4, 5, 6};

        static int SearchBinary(int key, int[] list, int high, int low) {


            if (high >= low) {
                int mid =low + (high - low)/2;
                if (key == list[mid]) {
                    return mid;
                } else if (key > list[mid]) {
                    return SearchBinary(key,list,high,mid + 1);
                }
                return SearchBinary(key,list,mid - 1,low);
            }
            return -1;
        }

     public static void main(String[] args) {
         System.out.println("show index");
         System.out.println(SearchBinary(5,list,list.length -1,0));

     }
}