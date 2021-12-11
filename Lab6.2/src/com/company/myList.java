package com.company;

public class myList<T> {
    private final int defoultSize =16;
    private Object[] array;
    private int pointer=0;


    public myList(int maxLength) {
        array = new Object[maxLength];
    }

    public myList() {
        array= new Object[defoultSize];
    }

    public void add(T data){
        if(pointer== array.length-1){
            resize(array.length*2);
        }
        array[pointer++] = data;
    }

    public void add(T data, int index){
        if(index>=pointer){
            if(pointer== array.length-1){
                resize(array.length*2);
            }
            array[pointer++] = data;
        }else{
            if(pointer== array.length-1){
                resize(array.length*2);
            }
            System.arraycopy(array,index+1,array,index,pointer);
            array[index]=data;
        }

    }

    public T get(int index){
        return (T) array[index];
    }

    private void resize(int size){
        Object[] newArray = new Object[size];
        System.arraycopy(array,0,newArray,0,pointer);
        array=newArray;
        return;
    }

    public void clear(){
        pointer=0;
        array = new Object[array.length];
    }

    public Boolean isEmpty(){
        return pointer==0;
    }

    public int size(){
        return pointer;
    }

    public String toString(){
        String ans="";
        for(int i = 0 ; i < pointer; ++i){
            ans=ans.concat(array[i].toString()).concat(" ");

        }
        return ans;
    }
}
