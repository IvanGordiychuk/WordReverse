package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.ArrayList;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws IOException {
       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
       String s = reader.readLine();
        StringBuilder sb1 = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<s.length();i++){
            char ch = s.charAt(i);
            if(!((ch >='a' && ch<='z') ||
                    (ch >='A' && ch <='Z'))){
                while(!stack.isEmpty()){
                    sb1.append(stack.pop());
                }
                sb1.append(ch);
            }else{
                stack.push(ch);
            }
        }
        System.out.println(sb1.toString());
       // System.out.println(sb1.toString().equals(Output));
    }
	// write your code here

}
