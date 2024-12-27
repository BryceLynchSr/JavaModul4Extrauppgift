/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modul4extrauppgift;

import java.util.Arrays;

public class Modul4Extrauppgift {

    
    public static void main(String[] args) {
        
     //deklarerar två arrays med plats för 20 värden  
     int [] Arraytest = new int[20];
     int [] uddaTal = new int[20];
     
     //tilldelar arrayen Arraytest 20 slumpmässiga tal mellan 0-999
     for(int i= 0; i<Arraytest.length; i++){
         Arraytest[i] = (int)(Math.random()*1000);
     }
     
     //skriver ut vartannat tal av värdena i Arraytest
     for(int j = 0; j<Arraytest.length; j++){
         System.out.print(Arraytest[j] + "\n");
         j++;
     }
     //beräknar antal udda tal och skapar en array där de udda talen samlas
     int antalUddaTal = 0;
     for(int k = 0; k<Arraytest.length; k++){
         if( Arraytest[k] % 2 != 0){
             antalUddaTal += 1;
             uddaTal[k] = Arraytest[k];
         }
     }
     //skriver ut de udda talen
     System.out.print("Udda tal: " +"\n");
     for(int l = 0; l<uddaTal.length; l++){
         if(uddaTal[l]>0){
         System.out.print(uddaTal[l] +"\n");
     }
     }
     //skriver ut antal udda tal
     System.out.print("Antal udda tal: " +antalUddaTal +"\n");
     
     //anropar metoden reverse med parameter arrayen Arraytest
     reverse(Arraytest);
     //skriver ut arrayen Arraytest i omvänd ordning
     System.out.print("Omvänd ordning: " +Arrays.toString(Arraytest) +"\n");
    }
    
     //huvudet för metoden reverse     
     static void reverse (int [] Arraytest){
         
       //for-loop för att omvända ordningen av värdena i Arraytest
       for (int i = 0; i < Arraytest.length / 2; i++) {
           int temp = Arraytest[i];
           Arraytest[i] = Arraytest[Arraytest.length - i - 1];
           Arraytest[Arraytest.length - i - 1] = temp;
       }
      
     }
     
     }
    
    
    

