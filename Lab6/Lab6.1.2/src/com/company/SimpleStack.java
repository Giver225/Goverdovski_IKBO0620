package com.company;

import java.util.ArrayDeque;
public class SimpleStack {
    public static String work(int word[]){
        String res = "";
        ArrayDeque<Integer> wordArray = new ArrayDeque<Integer>();
        for(int i = 0; i<word.length;i++){
            if(word[i]>0){
                wordArray.add(word[i]);
                res+=",0";
            }
            else if(word[i] == 0){
                if(wordArray.isEmpty()){
                    res+= ",-1";
                }
                else{
                    res+="," + (int) wordArray.pop();
                }
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int word[] =new int[]{0,1,8,4,0,3,0,8,8,3,7} ;
        System.out.println(work(word));
    }
}