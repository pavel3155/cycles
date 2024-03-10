/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework;

import hwcycles.Solution;
import java.util.Scanner;



/**
 *
 * @author koval
 */
public class HW<T extends TaskHW> {
   
     String hwN;//номер домашнего задания
     String topicHW;//тема домашнего задания
     String taskN;
     Boolean run=true;
     String sp ="*******************************************************";
     private T task;

    public HW(String hwN, String topicHW, T task) {
        this.hwN = hwN;
        this.topicHW = topicHW;
        this.task = task;
        
        System.out.println(sp);
        System.out.println("Домашнее задание №"+hwN);
        System.out.println("Тема: "+topicHW);
        System.out.println(sp);
     
        Scanner sc=new Scanner(System.in);
        Infmess infMess= new Infmess();
     
         while (run){

                System.out.println("Введите номер задания от 1 до 12 или \"exit\" для выхода: ");

                if (sc.hasNextLine()) {
                    taskN=sc.next();
                    if (!("exit".equals(taskN))){
                        int N=Integer.valueOf(taskN);
                        if (N>=1&&N<=12){
                            task.infTask(N);
                            new Solution(sc,infMess,N);
                        } else { 
                            System.out.println("Это нам не задавали!!! Введите номер задания:");; 
                        }
                    }else {
                        System.out.println("Конец");
                        run=false;
                    }
                }
            }

    sc.close();
    infMess.setMess("exit");
    try {
        infMess.tInf.join();
    } catch (InterruptedException е) {
        System.out.println("Глaвный поток прерван");
    }



     
     
    }
     
     
     
     

        

        



    
    
    
    
        
}
