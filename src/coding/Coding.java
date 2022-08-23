/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coding;

import java.util.Scanner;

/**
 *
 * @author eva
 */
public class Coding {

    /**
     * @param args the command line arguments
     */
 
    public static void main(String[] args) {
     
        
          ;
        
      int []arr = {-1, -20, 5, -1, -2, 2};
         int large =arr[0];
       int len = arr.length;
       for(int i =0; i<=len-1; i++){
       if((Math.abs(arr[i])>Math.abs(large))){
       large=arr[i];
       
       }
       
       }
        System.out.println(large);
        
       int m = 1;
       int n = 1;
   
        for(int i =0; i<=len-1; i++){
   
    if(Math.abs(arr[i])<Math.abs(large)){
    m= m*arr[i];
  
        }
    else if(Math.abs(arr[i])==Math.abs(large)){
    n= arr[i]*m;
    
    
    }


      
        // TODO code application logic here
    }
        System.out.println(m);
        
      
        
           if(m==large){
System.out.println("true");
       
       }
           else if(n==large){
               
           System.out.println("true");
           }
          
           
         
       else{
           
           System.out.println("false");
       }    
    }
    
}
