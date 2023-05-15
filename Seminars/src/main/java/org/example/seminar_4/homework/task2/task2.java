package org.example.seminar_4.homework.task2;

//Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
//
//An input string is valid if:
//
//Open brackets must be closed by the same type of brackets.
//Open brackets must be closed in the correct order.
//Every close bracket has a corresponding open bracket of the same type.

//Input: s = "()"
//Output: true
//
//Input: s = "()[]{}"
//Output: true
//
//Input: s = "(]"
//Output: false

import java.util.Scanner;
import java.util.Stack;

public class task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input characters: ");
        String s = sc.nextLine();
        Boolean checkInput = true;

        System.out.println("Input: " + s);

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != '(' && s.charAt(i) != ')' && s.charAt(i) != '{' && s.charAt(i) != '}' && s.charAt(i) != '[' && s.charAt(i) != ']') {
                checkInput = false;
            }
        }

        if (checkInput == true) {
            System.out.println("Output: " + isValid(s));
        }
        else {
            System.out.println("Output: Invalid input");
        }
    }

    public static Boolean isValid(String s) {
        Stack<Character> openBr = new Stack<>();

        for (char item : s.toCharArray()) {
            if (item == '(' || item == '{' || item == '[') {
                openBr.push(item);
            }
            else if (item == ')' && !openBr.isEmpty() && openBr.peek() == '(') {
                openBr.pop();
            }
            else if (item == '}' && !openBr.isEmpty() && openBr.peek() == '{') {
                openBr.pop();
            }
            else if (item == ']' && !openBr.isEmpty() && openBr.peek() == '[') {
                openBr.pop();
            }
            else {
                return false;
            }
        }

        return openBr.isEmpty();

    }
}
