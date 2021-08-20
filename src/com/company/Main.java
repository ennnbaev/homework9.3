package com.company;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        //в этом списке храню все строки что ввел пользователь
        List<String>inputString=new ArrayList<>();
        //в этом списке храню количество дубликатов
        List<Integer>duplicate=new ArrayList<>();
        //с помощью HashMap демонстрирую строки и их количество дубликатов
        HashMap<String,Integer > unique = new HashMap<>();
        System.out.println("Если хотите закончить ввод напишите \"exit\" ");
        while(true){
            String input=scanner.next();
            if(!input.equals("exit")) {
                inputString.add(input);
            }
            else break;
        }
        for(int i=0;i< inputString.size();i++){
            int iterator=0;
            for (String s : inputString) {
                if (inputString.get(i).equals(s)) {
                    iterator++; }}
            //записываю колличество дубликатов в список и HashMap
            duplicate.add(iterator);
            unique.put(inputString.get(i),iterator);
        }
        //ищу индекс максимального значение в списке с дубликатов
        int top1=0;
        int indexTop1=0;
        for (int g=0;g<duplicate.size();g++){
            if(top1<duplicate.get(g)){
                top1=duplicate.get(g);
                indexTop1=g;
            }
        }
        //ищу индекс второго максимального значение в списке с дубликатов
        int top2=0;
        int indexTop2=0;
        for (int g=0;g<duplicate.size();g++){
            if(top2<=duplicate.get(g)&&duplicate.get(g)!=top1){
                top2=duplicate.get(g);
                indexTop2=g;
            }
        }
        //обрабатываю ошибку если пользовательввел всего две разные строки
        if(duplicate.size()==2){
            indexTop2=duplicate.size()-1;
        }
        System.out.println("Список сколько раз какая строка была введена");
        System.out.println(unique);
        System.out.println("2 строки, которые вводились чаще остальных.");
        System.out.println(inputString.get(indexTop1));
        System.out.println(inputString.get(indexTop2));
    }
}
