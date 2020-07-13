import java.util.Scanner;
  
public class solution {
    public static void main(String [] arg){
     Scanner scanner = new Scanner(System.in);
     int arrCount = scanner.nextInt();
     int [] arr = new int [arrCount];
     long total=0;

     //input 
     for(int i=0;i<arrCount;i++){
     arr[i]=scanner.nextInt();     
     }


     // output
     for(int i=0;i<arrCount;i++){

       total=total+arr[i];

     }
     System.out.println(+total);
     



    }
}
