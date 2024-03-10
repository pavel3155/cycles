/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hwcycles;


/**
 *
 * @author koval
 */

public class SolTask1 {
   public static int c,b;

    public SolTask1() {
        int x=0;
        int y=1;
        System.out.print (x+","+y+",");
        fobich(x,y);
        System.out.println();

        
        
    }
   public  void fobich(int x, int y){
        c=x+y;
        System.out.print (c);
        x=y;
        y=c;
        b=x+y;
        
        while (b<=10000000) {
            System.out.print (",");
            fobich(x,y);
        } 
   
   }
   
   
}
