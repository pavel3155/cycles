/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hwcycles;
import homework.Infmess;
import java.util.Scanner;



/**
 *
 * @author koval
 */
public class Solution {
    public static String sp="******************************************************************************************";
    private int taskN;
    private String tDesc;
    private String mess1, mess2, mess3="Для продолжения нажмите \"Ввод\"  или введите \"exit\" для выхода";
    Scanner sc;
    Infmess infMess;
    String param;
    

    
   
    public Solution(Scanner sc, Infmess infMess,  int taskN){
      
        this.sc=sc;
        this.infMess=infMess;
        this.taskN=taskN;
        String var3="";

        boolean run=false;
        
        switch(taskN){
            case 1:
                new SolTask1();
                break;
            case 2:
                new SolTask2();
                break;
            case 3:
                new SolTask3();
                break;

        
        
        
//        sc.nextLine();
//        
//        if (!mess1.isEmpty()) {
//        while (run){  
//            
//
//            infMess.setMess(mess1);
//            
//            if (sc.hasNextLine()){
//
//                String var1=sc.nextLine();
//                String var2;
//                if (!("exit".equals(var1))&&!("exit".equals(var3))) {
//                    infMess.setMess(mess2);
////                    switch(tNumber){
////                        case 12:
////                             new Task12(var1);
////                             break;
////                        case 11:
////                             new Task11(var1);
////                             break;
////                        case 10:
////                             new Task10(var1);
////                             break;
////                        case 9:
////                            var2=sc.nextLine();
////                            new Task9(var1,var2);
////                            break;
////                        case 8:
////                            new Task8(var1);
////                            break;
////                        case 7:
////                            new Task7(var1);
////                            break;
////                        case 6:
////                            var2=sc.nextLine();
////                            new Task6(var1,var2);
////                            break;    
////                        case 5:
////                            new Task5(var1);
////                            break;
////                        case 4:
////                            new Task4(var1);
////                            break;
////                        case 3:
////                            new Task3(var1);
////                            break;
////                        case 2:
////                            new Task2(var1,param);
////                            break;
////                        case 1:
////                            var2=sc.nextLine();
////                            new Task1(var1,var2);
////                            break;    
////                    }
////                    
//                    infMess.setMess(mess3);
//                    var3 =sc.nextLine();
//                    if ("exit".equals(var3)) {
//                        System.out.println (sp);
//                        run=false;
//                        
//                    } 
//                     
//                }
//
//                if ("exit".equals(var1)) {
//                    System.out.println (sp);
//                    run=false;
//                } 
//            }
//        }    
           
    }
    }
}

    
    
   
   
   
    
    
    
    

