package org.example.First;

public class Compare {
    int a,b;

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }
    public int compare(){
        if (a < b){
            return -1;
        } else if (a > b) {
            return  1;
        }
        else {
            return 0;
        }
    }
}
