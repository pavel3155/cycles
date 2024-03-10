package hwcycles;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SolTask3 {
    List<Integer> listArmstrong = new ArrayList<>();//список для чисел Армстронг
    List<Integer> listNumbers=new ArrayList<>();//список чисел, которые проверяем
    int numArmstrong;
    public SolTask3() {
        //заполняем список числами
        for(int i =10; i<=100000;i++) {
            if (i%100!=0) listNumbers.add(i);
            else continue;
        }
        boolean remov=true;

        while((listNumbers.size()!=0)&&(remov=true)){
        
//            int s= listNumbers.size();
//            System.out.println("s=: "+s);
            numArmstrong=0;
            int Digit=listNumbers.get(0);
            //System.out.println("Digit:= "+Digit);
            
            List<Integer> listDigit = SplitNumberForDigits(Digit);//список: хранит цифры из которого состоит число

            
                
            for(int num : listDigit){
                numArmstrong+= (int) Math.pow(num,listDigit.size());
            }

            //System.out.println("Числом Армстронга должно быть: "+numArmstrong);
            
            List<Integer> listNUMtoDelete=NUMtheClass(listDigit);// список чисел одного класса

//            if (numArmstrong ==1634) {
//                System.out.println("Digit:= "+Digit);
//                System.out.println("Числом Армстронга должно быть: "+numArmstrong);
//                System.out.print("класс числа 1346:");
//                System.out.print("размер listDigit:= "+listDigit.size());
//                System.out.println(" listDigit:= "+listDigit);
//                System.out.println("числа класса: "+listNUMtoDelete);
//
//            }

            //проверяем есть ли в списке число Армстронг
            if (listNUMtoDelete.contains(numArmstrong)){
                //listNUMtoDelete.remove((Integer) numArmstrong);
                listArmstrong.add(numArmstrong);
            }
//            System.out.println("список listNUMtoDelete:");
//            for(int numDel:listNUMtoDelete){
//                System.out.println(numDel);
//            }
//            System.out.println("******************************");

//            for(int num : listNUMtoDelete){
//                System.out.println("num: "+num);
//            }3


//            for (Integer numDel:listNUMtoDelete){
//                listNumbers.remove(numDel);
//            }

            remov =listNumbers.removeAll(listNUMtoDelete);
            
//            int s1= listNumbers.size();
//            System.out.println("s1=: "+s1);
        }
        System.out.println("список listArmstrong:");
        for(int num : listArmstrong){
            System.out.println(num);
            //int[] arrNum=INarrayDigits(num);
        }
    }


    public List<Integer> NUMtheClass ( List<Integer> listDigit) {
        int Dig, j;
        List<Integer>numList=new ArrayList<>();
        for (int q = 1; q <= listDigit.size() ; q++) {
            for (int i = 0; i <= listDigit.size() - 2; i++) {
                Dig = listDigit.remove(i);
                j = i + 1;
                listDigit.add(j, Dig);


                //склеиваем числа
                int n, num;
                num=listDigit.get(0);
                for (int k = 1; k <= listDigit.size() - 1; k++) {
                    num=getDigit(num,listDigit.get(k));
                }
                numList.add(num);
//                System.out.println("num:"+num);

            }
        }
        return numList;
    }
        public int getDigit(int Dig, int lDig){

            return 10*Dig+lDig;
        }




    public List<Integer> SplitNumberForDigits(int Number){
        List<Integer> listDigit = new ArrayList<>();
        int n=Number;
        int m;
        
        while (n!=0){
            m=n%10;
            listDigit.add(0,m);
            n=n/10;
            
        }
        
//        int m=Number%10;
//        int n=Number;
//        if (m==0){
//            listDigit.add(0,m);
//            n=n/10;
//            m=n%10;
//        }
//
//        while (m>0){
//            listDigit.add(0,m);
//            n=n/10;
//            m=n%10;
//        }

        return listDigit;
    }

    public int[] INarrayDigits(int Digit){

        int n=Digit;
        int i=0;

        while (n>=1){
            i++;
            n=n/10;
        }

        int[] Digits =new int[i];
        int m=Digit%10;
        n=Digit;
        i--;
        while (m>0){
            Digits[i]=m;
            i--;
            n=n/10;
            m=n%10;
        }
    return Digits;
    }

}
