 import java.util.Scanner;
 import java.util.Arrays;
public class Arreglos {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

/*
        int[] k = new int[5];
        for(int i=0;i<5;i++){
            k[i]=lector.nextInt();
        }
        System.out.println(Arrays.toString(k));
*/      Scanner linea = new Scanner(System.in);
        String[] nombres;
        System.out.println("Introduce la cantidad de nombres del arreglo: ");
        int num= lector.nextInt();
        nombres= new String[num];

        for(int i = 0; i <num;i++){
            System.out.println("introduce el nombre #"+i);
            nombres[i]=linea.nextLine();
        }
        String mayor=nombres[0];
        for(int i = 0; i <num;i++){

            if(nombres[i].length()>mayor.length()){
                mayor=nombres[i];
            }
        }
        System.out.println("el nombre con mayor numero de caracteres es: "+mayor);


    }
}
