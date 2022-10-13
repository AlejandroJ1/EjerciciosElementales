
package com.tiernoparla.ejercicioselementales;
import java.util.Scanner;
import java.lang.Math;
public class EjerciciosElementales {
    public static void main(String[] args) {
    String password = "contraseña123"
    }
        
        
        
        
            /*
            int año=2024;
            if(año%4 !=0){
            System.out.println("El año"+ año + "no es bisiesto");
            }else if (año%100 !=0){
            System.out.println("el año" + año + "si es bisiesto");
            }else if(año%400 !=0) {
            System.out.println("El año" + año + "no es bisiesto");
            }else{
            System.out.println("el año" + año + "si es bisiesto");
            }
            if((año%4==0) && (año%100 !=0)) || ((año%4==0) && (año%100==0) && (año%400==0)){
            System.out.println("El año" + año + "es bisiesto"); 
            }else{
            System.out.println("El año" + año + "no es bisiesto");
                    
            }
}
}            
           */ 

        
    
        
        
        
        
        
        
        /* //valor dinero con intereses en x años
        int años = 4;
        double interes = 100;
        double dinero = 100;
        int i;
        for(i=1;i<=años;i++){
            dinero=dinero*interes/100;
            System.out.println(dinero);           
            
            
        }
        }
    }
        */
        
        
        
        
        
        /*
        
         int n = 144234;
    int suma= 0;
    while(n > 0){
    suma += n % 10;

            n = n / 10;
    }
        System.out.println("La suma es:" + suma);
} 
    }
      */
        
        /*
        String palabra="arbol"; 
       int contador = 0;
       for(int x=0; x<palabra.length();x++){
       if((palabra.charAt(x)=='a')|| (palabra.charAt(x)=='e') || (palabra.charAt(x)=='i') || (palabra.charAt(x)=='o') || (palabra.charAt(x)=='u')){
        contador++;
        
       }
       }
          System.out.println("La palabra "+ palabra + " contiene " + contador + " vocales");   
    }
}
        */
    
        
        
        
        
        
        
        
        
        /*
        
        String str="abcd";
        String output;
        String substr= str substring(1,2)
        System.out.println("Las letras del medio son:");
        if((str.length() %2) == 0){
            output = str.substring(str.length()/2) -1, (str.length() / 2)+ 1);
        }
            
        else{
        output = str.charAt(str.length()/2);
                    }
        String substr = str.substring(1, 2);
            System.out.println("substr");
        }
   
        
    }
    */
    
    
    
    
    
    
    
    
    /*
    
    public static void main(String[] args) {
        String str = "aBCd";
        System.out.println("Nº letras" + str.length());
        int l= str.length()/2;
        int i = l+1;
        int x = l-1;
        System.out.println("Las letras del medio son:"+ str.substring(x,i));
        
    }
    }
      */
        
        
        
        
        
        
        
        
        
        /*
        String letras ="abcdefg";
        System.out.println("El número de letras es:"+ letras.length());
        int i = letras.length();
        int x = i/2;
        System.out.println("La letra está en la posición:" + x);
        System.out.println("La letra del medio es:" + letras.charAt(x));
        
           
    }
}
      */  
        
        
        
        
        
        
        
        
        
        
        
        
        
        /*
         //calcular media aritmetica
        double [] nums = {5, 10, 12, 18, 8, 3};
        double mean;
        double suma = 0;
        double suma2 =0;//mirar---
        for(int i = 0; i< nums.length; i++){
        
        suma =+ nums[0];
     
        mean = suma/nums.length;
        System.out.println(mean);
    }
}
}
    */   
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    
        
        
        
        
        
        /*
        //ordenar de mayor a menor
    double [] nums = {3.2, 4.5, -7.4, -3.1, 5, 0};
    double min = nums[0];

    for(int i = 1; i < nums.length; i++){
    if(min > nums[i]){
        min = nums[1];
        
    }
    else{
        //nada
        min = min;
    } //if-else
           
    System.out.println(min);
            
        
    }
}
        */
        
        
        
        
        
        
        
        
        
        
        /*
        double a = 7;
        double b = -21;
        double min;
        
        if(a > b){
            min = b;
        }
            else{
            min = a;
        } //if else
        System.out.println("el minimo es:" + min);
    }
    }
*/

        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    
        
        
        
        
        
        /*
        int N = 1551;
    
        int tmp = N;
        int cifra;
        int reverso = 0;
        
        while(tmp > 0){
            
        cifra = tmp % 10;
        reverso =  reverso*10 + cifra;
        tmp = tmp/10;
        
        System.out.println(reverso);
        }
        
    }
}
    */
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        /*
        //esta mal
    int N = 31752;
    int tmp = 5;
    int arr;
    for (int i = 0; i < tmp; i++)    
    arr[i] = tmp %10
        System.out.println(tmp%10);
        System.out.println((tmp)%10);
        System.out.println(((tmp)%10));
       
    }
}
        */
    
        /*
        //sacar las 4 cifras de un num de 4 cifras
        //Y si el numero de cifras no lo se?

        int N = 1435;
        int tam = 4;
        int tmp = N;
        //int cifra;
        int[] cifras = new int[tam];
        
        for(int i = 0; i< tam; i++){
        cifras[i] = tmp % 10;
            System.out.println(cifras[i]);
        tmp = tmp/10;
        
        
        System.out.println(N%10);//Primera cifra
        System.out.println((N/10)%10);//sefunda cifra
        System.out.println(((N/10)/10)%10);//tercera cifra
        System.out.println((((N/10)/10)/10)%10);
    
        //recuperar el número
    
    double x = 0;
    for(int i = 0; i < tam; i++);{
    x = x + dcifras[i]*Math.pow(10,tam-(i+1));
    
    //double x =cifras[0]*Math.pow(10,tam-1) + cifras[1]*Math.pow(10,tam-2)+ cifras[2]*Math.pow(10,tam-3) + cifras[3]*Math.pow(10,tam-4));
            System.out.println((int)x);
     
        }
    }
}

}  
        */
        
        
        
        
        
       

        
        
        
        
        
        
        
        
    
        /*
        //calcular termino N de fibonacci con arrays en vez de x1,x2 y Fib
        int[]Fib = {1,1,0};
        int N = 5;
        for(int i = 3; i<=N; i++){
        Fib[2] = Fib[1] + Fib[0];   
        Fib[0] = Fib[1];
        Fib[1] = Fib[2];      
                
                
                
                }
    }
}
        */
        
        
        
        /*
      //1ºDeclaro array ARR de tamaño 3 de int (x1,x2,Fib)
      //2ºinicializo el array con (x1 = 1,x2 = 1, Fib = 0)
      //3ºhago hago el for-->pero por donde estaba Fib ahora esta ARR[2],donde estaba x1, está ARR[0], etc

      //calcular y guardar todos los terminos de fibonacci hasta el N
      //Tengo N
      int N = 5;
      //Defino un array de tamaño N
      int[] Fib = new int [N];
      //guardo los dos primeros terminos
      Fib[0] = 1;
      Fib[1] = 1;
      //loop para calcular y guardar los siguientes hasta la N <--
      for(int i = 2; i <N;i++){
          Fib[i] = Fib [i-1] + Fib [i-2];
                  } //for
      for(int i = 0; i < Fib.length; i++){
          System.out.println(Fib[i]);
      }
    }
}
    */
         
         
          
            
   
        
        
      
        /*
        
        String[] palabras =("hola","adios"); 
        String[] palabras2 = new String^[23]
        System.out.println(palabras2[0]);
        
        
        
        System.out.println(palabras[0]);
        System.out.println(palabras[1]);
        palabras[0]="algo aqui";
        System.out.println(palabras[0]);
        for(int i = 0; i < palabras.lenght;i++){
            System.out.println(palabras(i));
        }
    }
}
        
       */ 
        
        
        
        
        
        
        
        
        /*
        Termina sucesion de fibonacci
        int N =15;
        int x1= 1;
        int x2= 1;
        int Fib;
        for(int i = 3;i<= N;i++){
            Fib = x2 + x1
            x1 = x2
            x2 = Fib
            System.out.println(i);
}
*/
        
  

       /*
    
        int x3= x2 + x1;
        int x4 = x4 + x3;
        int x5 = x5 + x4;
        System.out.println(x5);
        
        
       
        int N = 5;
        int x1= 1;
        int x2= 1;
       
        int x3= x2 + x1;
        int x4 = x4 + x3;
        int x5 = x5 + x4;
        System.out.println(x5);
    }
    
        }
*/
       