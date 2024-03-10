package hwcycles;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ThreadSolTask3 implements Runnable{
int numStart;
int numFinish;
String name;
Thread thread;
List<Integer> lstArm;

    public ThreadSolTask3(int numStart, int numFinish, String name) {
        this.numStart = numStart;
        this.numFinish = numFinish;
        this.name = name;
        thread=new Thread(this,name);
        thread.start();

    }

    @Override
    public void run() {
        lstArm=ListAmrstrong(numStart,numFinish);
    }

    List<Integer> ListAmrstrong (int numStart, int numFinish){
        List<Integer> lstArmstrong = new ArrayList<>();//список для чисел Армстронг
        List<Integer> lstNumbers=new ArrayList<>();//список чисел, которые проверяем
        int numArm_theory;

        for(int i =numStart; i<=numFinish;i++) {
            if (i%100!=0) lstNumbers.add(i);
            else continue;
        }
        boolean remov=true;
        while((lstNumbers.size()!=0)&&(remov=true)){

            numArm_theory=0;
            int Digit=lstNumbers.get(0);

            List<Integer> lstDigit = SplitNumberForDigits(Digit);//список: хранит цифры из которого состоит число

            for(int num : lstDigit){
                numArm_theory+= (int) Math.pow(num,lstDigit.size());
            }

            List<Integer> lstNUMtoDelete=DigitCombination(lstDigit);// числа класса
            //проверяем есть ли в списке число Армстронг
            if (lstNUMtoDelete.contains(numArm_theory)){
                List<Integer> lstArm_theory=SplitNumberForDigits(numArm_theory);
                if(lstDigit.size()==lstArm_theory.size()) lstArmstrong.add(numArm_theory);
            }

            remov =lstNumbers.removeAll(lstNUMtoDelete);

        }

        return lstArmstrong;

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
    List<Integer> DigitCombination(List<Integer> listDigit) {

        List<String> tail = listDigit.subList(listDigit.size()-1,listDigit.size()).stream().map(i -> i.toString()).collect(Collectors.toList());
        List<String> head = listDigit.subList(0,listDigit.size()-1).stream().map(i -> i.toString()).collect(Collectors.toList());

        List<Integer>numList=new ArrayList<>();

        numList=perm(head,tail,numList);

        return numList;
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







}
