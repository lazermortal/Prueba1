import org.w3c.dom.ls.LSOutput;

import java.lang.reflect.Array;
import java.util.ArrayList;


public class punto_1 {

public static void main(String[] args) {
    int[] A = new int [] {1,3,15,11,2};
    int[] B = new int [] {23,127,235,19,8};
//encontrar la mayor y menor diferencia entre un elemento de A y uno de B
    int diferencia_M =0;
    int diferencia_m=B[0]-A[0];

    for(int m = 0; m < 5; m++){
        for(int j = 0; j < 5; j++){
            if(Math.abs(B[m]-A[j])<diferencia_m){
                diferencia_m=Math.abs(B[m]-A[j]);
            }
            if(B[m]-A[j]>diferencia_M){
                diferencia_M=B[m]-A[j];
            }
        }

    }
    System.out.println(diferencia_m+" "+diferencia_M);
}
}
