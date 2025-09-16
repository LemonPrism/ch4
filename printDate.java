

public class printDate
{
    
    public static void printAmerican(String day, int date, String month, int year){
        
        System.out.printf("%s,%s, %d,%d%n" , day, month ,date ,year);
        
    }
    
    public static void printEuropean(String day, int date, String month, int year){
        

        System.out.printf("%s,%d,%s,%d%n" , day, date ,month ,year);
        
        
    }
    
    public static void main (){
        
        printAmerican("Monday", 22, "July", 2019); 
        
        printEuropean("Monday", 22, "July", 2019); 
        
        
    }
}