/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sentencewordreversal;

import java.util.Scanner;
import java.util.Stack;
/**
 *
 * @author Students Account
 */
public class SentenceWordReversal {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the sentence");
        for(int i = 0; i< 1; i++){
            String sentence = scan.nextLine();
            String[] words_array = sentence.split(" ");    
            Stack<String> stacking = new Stack<String>();
            
            for(String word: words_array){
            stacking.push(word);
            }
            while (!stacking.isEmpty ()) {
                System.out.print(stacking.pop() + " ");
            }
        
        
        
        
        
        }
    }
    }


