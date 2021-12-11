package com.company;

public class MyString {
    private final char[] string;



    public MyString() {
        string = null;
    }



    public MyString(char value[]) {
        string = value;
    }




    public MyString(MyString original) {
        string = original.string;
    }




    public MyString(String original) {
        string = original.toCharArray();
    }




    public boolean isEmpty() {
        for (char a : string) {
            if (a != ' ') {
                return false;
            }

        }

        return true;
    }


    public int length() {
        return string.length;
    }


    public int compareTo(MyString anotherString) {
        if (string.length == anotherString.length()) {
            for (int i = 0; i < string.length - 1; ++i) {
                if (string[i] != anotherString.string[i]) return 1;
            }

            return 0;


        } else {
            if (string.length > anotherString.length()) return 1;
            return -1;
        }


    }


    public MyString trim() {
        int start = 0,
                end = string.length - 1;

        for (int i = 0; i <= string.length - 1; ++i) {
            if (string[i] != ' ') {
                start = i;
                break;
            }
        }
        for (int i = string.length - 1; i >= 0; --i) {
            if (string[i] != ' ') {
                end = i;
                break;
            }
        }

        char[] tmp = new char[end - start + 1];
        for (int i = start, j = 0; i <= end; ++i, ++j) {
            tmp[j] = string[i];
        }
        return new MyString(tmp);
    }

    public MyString concat(MyString str) {
        char[] concatTmp = new char[string.length + str.length()];

        for (int i = 0, j = 0; i <= string.length + str.length() - 1; ++i, ++j) {
            if (j == string.length) j = 0;
            if (i <= string.length - 1) concatTmp[i] = string[i];
            else concatTmp[i] = str.string[j];
        }
        return new MyString(concatTmp);
    }



    public MyString substring(int beginIndex, int endIndex) {
        char[] substrTmp = new char[endIndex - beginIndex + 1];
        for (int i = beginIndex, j = 0; i <= endIndex; ++i, ++j) {
            substrTmp[j] = string[i];
        }
        return new MyString(substrTmp);
    }


    public char charAt(int index) {
        return string[index];
    }



    @Override
    public String toString() {
        String tmp = "";
        for (char a : string) {
            tmp += a;
        }
        return tmp;
    }
}