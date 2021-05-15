package com.company;
import java.util.Scanner;

public class Pairof2 {
    public int pair(int[] a) {
        int perechi=0;
        for(int i=0;i<a.length-1;i++){
            for(int j=1; j<a.length;j++){
                if(a[i]+a[j]==0 && a[i]!=0){
                    perechi++;
                    a[i]=0;
                    a[j]=0;
                    break;
                }
            }
        }
        return perechi;
    }
}
