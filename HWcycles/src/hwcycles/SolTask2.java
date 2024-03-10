package hwcycles;

import java.util.ArrayList;
import java.util.List;

public class SolTask2 {
    public SolTask2() {

        List<Integer> primeNumbers=new ArrayList<>();
        primeNumbers.add(2);

        for (int i = 3; i <=1000000 ; i+=2) {
            if (isPrimes(i,primeNumbers)) {
                primeNumbers.add(i);
            }
        }
        int n=0;
        for(Integer pNum:primeNumbers){
            n++;
            if (n<=10) {
                if (pNum < 10) {
                    System.out.print(pNum + "      ");
                } else if (pNum < 100) {
                    System.out.print(pNum + "     ");
                } else if (pNum < 1000) {
                    System.out.print(pNum + "    ");
                } else if (pNum < 10000) {
                    System.out.print(pNum + "   ");
                } else if (pNum < 100000) {
                    System.out.print(pNum + "  ");
                } else {
                    System.out.print(pNum+" ");
                }
            }else{

                System.out.println();
                n = 0;
            }
        }
    }
    private boolean isPrimes (int i,List<Integer> primeNumbers){
        double sqrt = Math.sqrt(i);
        for (int j = 0; j < primeNumbers.size(); j++) {
            int pNum=primeNumbers.get(j);
            if (pNum >sqrt) {
                return true;
            }
            if(i%primeNumbers.get(j)==0){
                return false;
            }
        }
        return true;
    }


}
