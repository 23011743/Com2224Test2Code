import java.util.Scanner;

public class ProductBinarySearch {
    public static void main(String[] args) {
           
        Scanner input = new Scanner(System.in);

         int rotated_Database_Array[] = {104,105,106,107,101,102,103} ; 
              
              System.out.println("Enter the ProductID of any value you want to search for");
                int targetID = input.nextInt();
       
                    findProductIndex(rotated_Database_Array, targetID);
            }
        
        

    public static void findProductIndex(int productID[], int targetID){
        
       for(int i = 0; i < productID.length; ++i){
       
         if( productID[i] == targetID){

            System.out.println("The index of the productID " + targetID + " is stored at index " + i);
              break;
              
        }
        else{
            System.out.println("-1");
          
        }

       }

    }
}
