
/**
 * Write a description of class ciclos here.
 * This program is to know the sequences, as the example gives us. 
 * @author (Aylen) 
 * @version (1.0)
 */

public class ciclos
{
    public void sucesion1(int cantidad)
    {
        //num=10:
        // 1,  2,  4,  7,  9,  10,  12,  15,  17,  18
        //   +1  +2  +3  +2  +1  +2    +3   +2   +1

        //                ---><--->>--->
        if(cantidad > 0){
            int num, suma, cont;
            num= 1;
            System.out.print(1+" ");
            suma = 1;
            cont = 1;
            boolean sube = false;
            while(cont  < cantidad){
                num = num + suma ;
                System.out.print(num+" ");
                if(suma == 1){
                    suma = 2;
                    sube = true;
                }else if(suma == 3){
                    suma = 2;
                    sube=false;
                }else{
                    if(sube ==true ){
                        suma = 3;
                    }else{
                        suma = 1;
                    }
                }
                cont++;
            }
            double iniciar = 0.0;
        }else{
            System.out.println("Ingrese un número mayor a 0");
        }
    }

    public int sucesionPadovan(int cantidad){
        //num=12:
        //1, 1, 1, 2, 2, 3, 4, 5, 7, 9, 12, 16

        int num=1; 
        System.out.print (num +" ");
        int num1=1;
        System.out.print (num1+ " ");
        int num2=1;
        System.out.print (num2+ " ");
        int principal=0;
        for (int i=4;i<=cantidad;i ++){
            principal=num+num1;
            System.out.print (principal+ " ");
            num=num1;
            num1=num2;
            num2=principal;

        }
        return principal;

    }
}

