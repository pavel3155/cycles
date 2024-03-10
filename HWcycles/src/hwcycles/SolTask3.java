package hwcycles;

import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;

public class SolTask3  {
    ThreadSolTask3  objThread1;

    long start = System.currentTimeMillis();


    List<Integer> listArmstrong = new ArrayList<>();//список для чисел Армстронг
    List<Integer> lstNumbers=new ArrayList<>();//список чисел, которые проверяем
    int numArm_theory;
    public SolTask3() {

        for(int i =100; i<=1000000;i++) {
            if (i%100!=0) lstNumbers.add(i);
            else continue;
        }
        boolean remov=true;
        while((lstNumbers.size()!=0)&&(remov=true)){


            //ThreadSolTask3  objThread1 =  new ThreadSolTask3(lstNumbers.get(0), "Thread1");
            ThreadSolTask3  objThread2 =  new ThreadSolTask3(250001,500000, "Thread2");
            ThreadSolTask3  objThread3 =  new ThreadSolTask3(500001,750000, "Thread3");
            ThreadSolTask3  objThread4 =  new ThreadSolTask3(750001,1000000, "Thread4");

            if (lstNUMtoDelete.contains(numArm_theory)){
                List<Integer> lstArm_theory=SplitNumberForDigits(numArm_theory);
                if(lstDigit.size()==lstArm_theory.size()) lstArmstrong.add(numArm_theory);
            }

        }


        // ожидать завершения потоков исполнения
        try {
            System.out.println("Oжидaниe завершения потоков.");
            objThread1.thread.join();

            objThread2.thread.join();

            objThread3.thread.join();

            objThread4.thread.join();


        } catch (InterruptedException е) {
            System.out.println("Глaвный поток прерван");
        }

        listArmstrong.addAll(objThread1.lstArm);
        listArmstrong.addAll(objThread2.lstArm);
        listArmstrong.addAll(objThread3.lstArm);
        listArmstrong.addAll(objThread4.lstArm);



        System.out.println("список listArmstrong:");
        listArmstrong.sort(Comparator.naturalOrder());
        for(int num : listArmstrong){
            System.out.println(num);

        }

        long end = System.currentTimeMillis() - start;
        long memore = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        SimpleDateFormat sdf = new SimpleDateFormat("ss.SSS");
        System.out.println("Time = " + sdf.format(new Date(end)));
        System.out.println("Memory = " + memore / 1048576);


    }


    List<Integer> PermutationDigit (List<Integer> subList1,List<Integer> subList2,List<Integer> listNum) {

        List<Integer> list1=new ArrayList<>();
        list1.addAll(subList1);

        List<Integer> list2=new ArrayList<>();
        list2.addAll(subList2);

        for (int q = 1; q <= list2.size() ; q++) {
            for (int i = 0; i <= list2.size() - 2; i++) {
                int digit = list2.remove(i);
                int  j = i + 1;
                list2.add(j, digit);

                if (!(list1.isEmpty())) {
                    int digPrev = list1.remove(list1.size() - 1);
                    list2.add(0, digPrev);
                    PermutationDigit(list1, list2, listNum);
                }

                String strNum = "";

                for (int num : list2) {
                    strNum += String.valueOf(num);
                }

                listNum.add(Integer.valueOf(strNum));
            }

        }
        return listNum;
    }

    String sumItem (String item1, String item2){
        item2=item1+item2;
        return item2;
    }

    List<Integer> perm(List<String> head,  List<String> tail, List<Integer> numList){
        List<String> headNew = new ArrayList<>();
        List<String> tailNew = new ArrayList<>();
        headNew.addAll(head);
        tailNew.addAll(tail);
        boolean addList =true;
        int n=tailNew.size();
            String item = headNew.remove(headNew.size() - 1);
            for (int i = 0; i<=n; i++) {
                tailNew.add(i, item);
                boolean run =!(headNew.isEmpty());
                while (run) {
                    perm(headNew, tailNew, numList);
                    run=false;
                    addList=false;

                }

                String num = "";
                for (String lstItem : tailNew) {
                    num += lstItem;
                }

                if (addList) numList.add(Integer.valueOf(num));

                //System.out.println("numList: " +numList);
                tailNew.remove(i);

            }
        return  numList;
    }


 List<Integer> DigitCombination(List<Integer> listDigit) {

     List<String> tail = listDigit.subList(listDigit.size()-1,listDigit.size()).stream().map(i -> i.toString()).collect(Collectors.toList());


     List<String> head = listDigit.subList(0,listDigit.size()-1).stream().map(i -> i.toString()).collect(Collectors.toList());

     List<Integer>numList=new ArrayList<>();

     numList=perm(head,tail,numList);

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
