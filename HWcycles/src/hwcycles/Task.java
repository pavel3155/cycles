/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hwcycles;

import homework.TaskHW;


/**
 *
 * @author koval
 */
public class Task implements TaskHW {
    int taskN;
    String mess1,mess2,sp="********************************";

    @Override
    public void infTask(int taskN) {
        
        
        

        System.out.println(sp);
        switch(taskN){
            
//            case 12:
//                System.out.println("Задание №"+taskN);
//                System.out.println(sp);
//                System.out.println("Программа считает количество введенных смайликов в строке.");
//                System.out.println("Смайликом будем считать последовательность символов, удовлетворяющую условиям: ");
//                System.out.println("> первым символом может быть ;(точка с запятой) либо :(двоеточие) ровно один раз;");
//                System.out.println("> далее может идти символ – (минус) сколько угодно раз;");
//                System.out.println("> в конце обязательно идет некоторое количество (не меньше одной) одинаковых скобок из следующего набора: (, ), [, ];");
//                System.out.println("> Примеры смайликов: :---))), ;-]]]");
//                System.out.println("> Примеры не смайликов: :---))], ;;-]]]");
//                System.out.println(sp);
//                mess1="Введите последовательность символов или 'exit' для выхода:";    
//                mess2="";
//                break;
//                
//            case 11:
//                System.out.println("Задание №"+tNumber);
//                System.out.println(sp);              
//                System.out.println("Программа проверяет принадлежность слова языку Мумба-Юмба.");
//                System.out.println("Слово на языке Мумба-Юмба состоит только из букв a,b,c. \nНикогда не содержат двух букв b подряд.");
//                System.out.println("В слове никогда не встречается три одинаковых подслова подряд");
//                System.out.println(sp);
//                mess1="Введите строку или 'exit' для выхода:";    
//                mess2="";
//                break;
//            
//            case 10:
//                System.out.println("Задание №"+tNumber);
//                System.out.println(split);
//                System.out.println("Программа печатает ромбовидный рисунок на основе строки. Максимальная длина – 50 символов.");
//                System.out.println(split);
//                mess1="Введите строку или 'exit' для выхода:";    
//                mess2="";
//                break;
//            
//            case 9:
//                System.out.println("Задание №"+tNumber);
//                System.out.println(split);
//                System.out.println("Программа проверяет является ли одна строка анаграммой для другой строки.");
//                System.out.println("Пример: СЛЕПО ТОПЧУТ – ПОСЛЕ ПОЧТУТ");
//                System.out.println(split);
//                mess1="Введите первую строку или 'exit' для выхода:";    
//                mess2="Введите вторую строку:";
//                break;
//                
//            case 8:        
//                System.out.println("Задание №"+tNumber);
//                System.out.println(split);
//                System.out.println("Программа преобразует переменную языка C++, в формат языка Java");
//                System.out.println(split);
//                mess1="Введите переменную или 'exit' для выхода:"; 
//                mess2="";
//                break; 
//            case 7:        
//                System.out.println("Задание №"+tNumber);
//                System.out.println(split);
//                System.out.println("Программа меняет прописные буквы на заглавные и наоборот, цифры заменяет на символ подчеркивания");
//                System.out.println(split);
//                mess1="Введите строку или 'exit' для выхода:"; 
//                mess2="";
//                break; 
//            case 6:        
//                System.out.println("Задание №"+tNumber);
//                System.out.println(sp);
//                System.out.println("Введите два целых числа сочетание которых надо исключить из послдедовательности порядковых номеров от 00000 до 99999");
//                System.out.println("Программа выводит количество порядковых номеров, в которых встречается сочетание чисел, которые должны быть исключены \nиз последовательности.");
//                System.out.println(sp);
//                mess1="Введите Число 1 или 'exit' для выхода:"; 
//                mess2="Число 2:";
//                break; 
//            case 5:
//                System.out.println("Задание №"+tNumber);
//                System.out.println(sp);
//                System.out.println("Программа выводит количество слов в строке, у которых четное количество букв. \nСлова в строге могут быть разделены пробелом или двоеточием");
//                System.out.println(sp);
//                mess1="Введите строку или 'exit' для выхода:"; 
//                mess2="";
//                break;     
//            case 4:
//                System.out.println("Задание №"+tNumber);
//                System.out.println(sp);
//                System.out.println("Программа выводит слова из введенной строки, начинающиеся на гласные \nи заканчивающиеся на согласные");
//                System.out.println(sp);
//                mess1="Введите строку или 'exit' для выхода:"; 
//                mess2="";
//                break;     
            case 3:
              System.out.println("Задание №"+taskN);
                System.out.println(sp);
                System.out.println("Программа выводит на экран ///");
                System.out.println(sp);
                mess1="";
                mess2="";
                break;
            case 2:
                System.out.println("Задание №"+taskN);
                System.out.println(sp);
                System.out.println("Программа выводит на экран все простые числа в диапазоне от 2 до 1 000 000");
                System.out.println(sp);
                mess1="";
                mess2="";
                break;
//            
            case 1:        
                System.out.println("Задание №"+taskN);
                System.out.println(sp);
                System.out.println("Показать на экране все числа Фибоначчи в диапазоне от 0 до 10 000 000.");
                System.out.println(sp);
                mess1="";
                mess2="";
                break; 
        }
        
        //return param;
   }

    public String getMess1() {
        return mess1;
    }

    public String getMess2() {
        return mess2;
    }
        
        
        
        
    
    
}
