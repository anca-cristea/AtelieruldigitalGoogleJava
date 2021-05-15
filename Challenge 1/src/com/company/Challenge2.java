package com.company;

public class Challenge2 {
    public String compute(int n){
        String a="";
        if (n%3==0)
            a += "Foo";
        if (n%5==0)
            a += "Bar";
        if (n%7==0)
            a += "Qix";
        String aux = String.valueOf(n);
        for(int i=0;i<aux.length();i++) {
            if (aux.charAt(i) == '3')
                a += "Foo";
            if (aux.charAt(i) == '5')
                a += "Bar";
            if (aux.charAt(i) == '7')
                a += "Qix";
        }
        if (a.length()==0)
            a += String.valueOf(n);
        return a;
    }
    public String compute2(int n){
        int ok=0;
        String a="";
        if (n%3==0) {
            ok = 1;
            a += "Foo";
        }
        if (n%5==0) {
            ok = 1;
            a += "Bar";
        }
        if (n%7==0) {
            ok = 1;
            a += "Qix";
        }
        String aux = String.valueOf(n);
        for(int i=0;i<aux.length();i++) {
            if (aux.charAt(i) == '0')
                a += "*";
            if (aux.charAt(i) == '3') {
                ok = 1;
                a += "Foo";
            }
            if (aux.charAt(i) == '5') {
                ok = 1;
                a += "Bar";
            }
            if (aux.charAt(i) == '7') {
                ok = 1;
                a += "Qix";
            }
        }
        if (ok == 0)
            a = aux.replace('0','*');
        return a;
    }
}
