package Increase_Chain;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter chain : ");
        String string = scanner.nextLine();

        LinkedList<Character> max = new LinkedList<>();

        for(int i = 0; i<string.length(); i++){
            LinkedList<Character> tempList = new LinkedList<>();
            tempList.add(string.charAt(i));
            for(int j = i+1; j < string.length()-1; j++){
                if(tempList.getLast()<string.charAt(j)){
                    tempList.add(string.charAt(j));
                }
            }
            if(tempList.size()>max.size()){
                max.clear();
                max.addAll(tempList);
            }
            tempList.clear();
        }
        for(Character character: max){
            System.out.print(character);
        }
    }
}
