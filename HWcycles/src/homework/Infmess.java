/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework;

/**
 *
 * @author koval
 */
public class Infmess implements Runnable{
    String mess="";
    boolean run=true;
    Thread tInf;
    Infmess(){
         tInf= new Thread(this, "Инструкция");
         tInf.start();
    }
        
    @Override
    public void run(){        
        while(run) 
        {   
            getMess();
        }
    }
    public synchronized void setMess(String mess){
        if (!mess.isEmpty()){
                this.mess=mess;
                notify();
        }
        if ("exit".equals(mess)){
                run=false;
                notify();
        }
    }

    
    public synchronized String getMess(){
            try {
                if (!mess.isEmpty()){ 
                    System.out.println(mess);
                }    
                wait();
            } catch(InterruptedException е) {
                System.out.println("Иcключeниe типа InterruptedException перехвачено");
            }
        return mess;
                
    }
}
    

