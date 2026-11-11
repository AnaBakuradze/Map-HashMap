package org.example;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        /*
        int sum = 0;

        for (int number : numbers){
            sum = sum + number;
        }
        System.out.println(sum);


        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("A" +
                "pple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Mango");
        fruits.remove(2);
        fruits.add("kiwi");

        for (String fruit : fruits){
            System.out.println(fruit);
        }

        System.out.println(fruits.get(2));
        System.out.println(fruits);
        System.out.println(fruits.size());


        Map<String, Integer> students = new HashMap<>();

        students.put("Ana", 95);
        students.put("Nika", 80);
        students.put("Luka", 70);
        students.put("Mariam" , 100);

        for (Map.Entry<String , Integer>student : students.entrySet()){
            System.out.println(student.getKey()+ "-" + student.getValue());
        }

        System.out.println(students.get("Ana"));

        Map<String, Integer> studentsInfo = new HashMap<>();


        studentsInfo.put("Ana", 100);
        studentsInfo.put("Lela", 78);
        studentsInfo.put("Giorgi", 85);
        studentsInfo.put("Elene", 95);
        int count = 0;


        for (Map.Entry<String, Integer> student : studentsInfo.entrySet()) {

            System.out.println(student.getKey() + "--" + student.getValue());

            if (student.getValue() >= 90) {
                count++;
            }

        }

                System.out.println("90 ან მეტი ქულა აქვს "+ count +" სტუდენტს ");*/

        Map<String, Integer> თანამშრომლისხელფასი = new HashMap<>();

        თანამშრომლისხელფასი.put("Ana", 5000);
        თანამშრომლისხელფასი.put("Giorgi", 7000);
        თანამშრომლისხელფასი.put("Elene", 3000);
        თანამშრომლისხელფასი.put("Sandro", 4500);
        თანამშრომლისხელფასი.put("Tatuli", 1500);

        int count = 0;


        for (Map.Entry<String, Integer> ხელფასი : თანამშრომლისხელფასი.entrySet()) {
            System.out.println(ხელფასი.getKey() + "--" + ხელფასი.getValue());


            if (ხელფასი.getValue() > 2000)
                count++;


        }
        System.out.println("2000 ლარზე მეტი ხელფასი აქვს " + count + " თანამშრომელს");

        for (Map.Entry<String, Integer> ხელფასი : თანამშრომლისხელფასი.entrySet()) {

            if (ხელფასი.getValue() > 2000) {
                System.out.println(ხელფასი.getKey() + " -- " + ხელფასი.getValue());

            }
        }


    }

}












