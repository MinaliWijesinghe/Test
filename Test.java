import java.util.Scanner;

public class HelloWorld{
    
    
    
     public static void main(String []args){
         Scanner scan = new Scanner(System.in);
        
         System.out.println("Enter number of kilos:");
        
        double kilos = scan.nextDouble();
        if(kilos%.5 !=0){
            System.out.println("Please order in kilos or .50 kilos");
            return;
            
        }
         
            int Fpacks =(int) kilos/4;
            int remF =(int) kilos%4;
            int Tpacks =(int) remF/2;
            int Opacks =(int) remF%2;
            
            if(remF%.5==0){
                ++Opacks;
            }
            
        System.out.println("No of 4kg packs:" + Fpacks);
        System.out.println("No of 2kg packs:" + Tpacks);
        System.out.println("No of 1kg packs:" + Opacks);
     
       
     }
}