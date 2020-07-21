
import java.util.*;

public class TimeConversion{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String time12 = scanner.nextLine();
        String valueOf8Place = String.valueOf(time12.charAt(8));
        
        String first = String.valueOf(time12.charAt(0));
        String second = String.valueOf(time12.charAt(1));
        

        String sum = first+second ;
        int value1 = Integer.parseInt(sum);
        
        if(valueOf8Place.equals("P") && value1 != 12 ) {
            
            
        
            int value2 = 12+value1;
            String sum1= Integer.toString(value2);
            
            String value0FZeroPlace = String.valueOf(sum1.charAt(0));
            String valueOFOnePlace = String.valueOf(sum1.charAt(1));
            
            String newtime1 = time12.substring(0,0)+value0FZeroPlace+time12.substring(1);
            String newtime2 = newtime1.substring(0,1)+valueOFOnePlace+newtime1.substring(2);
            String newtime3 = newtime2.substring(0,9)+""+newtime2.substring(10);
            String newtime4 = newtime3.substring(0,8)+""+newtime3.substring(9);
            System.out.println(newtime4);
            
            
        }
        else if(value1 == 12 && valueOf8Place.equals("A") ){
            
            
            
            String newtime5 = time12.substring(0,9)+""+time12.substring(10);
            String newtime6 = newtime5.substring(0,8)+""+newtime5.substring(9);
            String newtime7 = newtime6.substring(0,0)+"0"+newtime6.substring(1);
            String newtime8 = newtime7.substring(0,1)+"0"+newtime7.substring(2);
            System.out.println(newtime8);
            
            
            
            
            
        }
        else if(valueOf8Place.equals("P") && value1 == 12 ) {
            String newtime9 = time12.substring(0,9)+""+time12.substring(10);
            String newtime10 = newtime9.substring(0,8)+""+newtime9.substring(9);
            
            System.out.println(newtime10);
        }
        else if(value1 != 12 && valueOf8Place.equals("A") ) {
            String newtime11 = time12.substring(0,9)+""+time12.substring(10);
            String newtime12 = newtime11.substring(0,8)+""+newtime11.substring(9);
            System.out.println(newtime12);

        }
        
        }
        }
     


