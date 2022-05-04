package code._4_student_effort._1_Basics_Challenge;

import java.util.ArrayList;
import java.util.List;

public class BasicsChallenge {

    //Challenge 1 - FizzBuzz
    public static void Challenge1(){
        for (int i =1; i<= 100; i++){
            if (i % 3 == 0) {
                if (i % 5 == 0) {
                    System.out.println("FizzBuzz");
                } else {
                    System.out.println("Fizz");
                }
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            }
            else System.out.println(i);
        }
    }


    //Challenge 2 - FooBarQix
    public static String compute(int n){
        String result = "";

        if(n % 3 == 0) result += "Foo";
        if(n % 5 == 0) result += "Bar";
        if(n % 7 == 0) result += "Qix";

        String number = Integer.toString(n);
        for(int i= 0; i<number.length(); i++){
            char a = number.charAt(i);
            switch(a){
                case '3': result+= "Foo";
                    break;
                case '5': result+= "Bar";
                    break;
                case '7': result+= "Qix";
                    break;
            }
        }
        if(result.isEmpty()){
            result = number;
        }
        return result;
    }

    public static String compute2(int n){
        String result = "";

        if(n % 3 == 0) result += "Foo";
        if(n % 5 == 0) result += "Bar";
        if(n % 7 == 0) result += "Qix";

        String number = Integer.toString(n);
        for(int i= 0; i<number.length(); i++){
            char a = number.charAt(i);
            switch(a){
                case '0': result+= "*";
                        break;
                case '3': result+= "Foo";
                    break;
                case '5': result+= "Bar";
                    break;
                case '7': result+= "Qix";
                    break;
            }
        }
        if(result.isEmpty()){
            result = number;
        }
        return result;
    }


    public static int Challenge3(int[] n){
        int result = 0;
        List<Integer> list = new ArrayList<>();


        for(int i = 0; i< n.length -1 ; i++){
            for(int j = i +1; j< n.length; j++){
                if(n[i] + n[j] == 0){
                    //Punem in lista indexii si verificam daca am trecut odata prin ei
                    if(!list.contains(i) && !list.contains(j)) {
                        result++;
                        list.add(i);
                        list.add(j);
                        break;
                    }
                }
            }
        }
        return result;
    }

    public static int Challenge4(int[] n){
        int result = 0;
        List<Integer> list = new ArrayList<>();
        for(int i =0; i<n.length -2; i++){
            for(int j =i+1; j<n.length-1; j++){
                for(int k =j+1; k< n.length; k++){
                    if(n[i] + n[j] + n[k] == 0){
                        if(!list.contains(i) && !list.contains(j) && !list.contains(k)) {
                            result++;
                            list.add(i);
                            list.add(j);
                            list.add(k);
                            break;
                        }
                    }
                }
            }
        }
        return result;
    }
}

