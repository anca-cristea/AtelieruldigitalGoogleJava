package com.company;

public class Pairof3 {
    public int pair(int[] a) {
        int perechi=0;
        for(int i=0;i<a.length-2;i++){
            for(int j=1; j<a.length-1;j++){
                for(int k=2;k<a.length;k++) {
                    if (a[i] + a[j] + a[k] == 0 && a[i] != 0 && a[j]!=0) {
                        perechi++;
                        a[i] = 0;
                        a[j] = 0;
                        a[k] = 0;
                        break;
                    }
                }
            }
        }
        return perechi;
    }
}
