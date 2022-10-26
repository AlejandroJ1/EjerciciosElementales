package com.tiernoparla.ejercicioselementales;

import java.util.Scanner;
import java.lang.Math;
import java.util.Arrays;
import java.util.regex.*;
import javax.swing.JOptionPane;
import java.lang.*;

public class EjerciciosElementales {
  

    public static boolean isPrimo(int p) {
        //boolean is_prime = true
        for (int i = 2; i < p; i++) {
            if (p % i == 0) {
            }
        }
        return true;
    }
    //metodo para saner si es par o impar
    public static boolean isPar(int numero){
    if(numero % 2 == 0){
    return true;
    }else{
        return false;
    }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        int max = 0;
        int min = 0;
        
        do{
            System.out.println("Introduce los números");
            if(num > max){
                max = num;
                
            }else{
                if(num<min){
                    min=num;
                }
            }
        }while(num!=0);
        System.out.println("El numero max es:" + max);
        System.out.println("El numero min es:" + min);
        /*//Tabla de multiplicar de x numero
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Introduce un numero");
        n = sc.nextInt();
        System.out.println("Tabala de multiplicar de:" + n);
        for(int i = 0;i<=10;i++){
            System.out.println(n + " * " + i + " = " + n*i );
        }
*/
        
        /*//Pedir numeros hasta que se teclee 0, despues suma todos los numeros anteriores
        Scanner sc = new Scanner(System.in);
        int num;
        int suma = 0;
        do{
            System.out.println("Dime numeros");
            num = sc.nextInt();
            
            suma += num;
        }while(num!=0);
        System.out.println("La suma de todos los números es:" + suma);
        */    
        
        /*Pedir N, mostrar todos los números de 1 a N //revisar
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Introduce un número entero: ");
        n = sc.nextInt();
        System.out.println("\nNumeros del 1 al " + n + " : ");                                           
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
        */
        /*//Poner 5 edades y alturas decir edad media,altura media, mayores de 18 y mayores de 1,75
        Scanner sc = new Scanner(System.in);
        int edad = 0;
        int suma_edad = 0;
        int media_edad = 0;
        double altura = 0;
        double suma_altura = 0;
        double media_altura = 0;
        for(int i = 0;i<=5;i++){
            System.out.println("Introduce la edad del alumno:");
            edad = sc.nextInt();
            System.out.println("Introduce la altura del alumno:");
            altura = sc.nextDouble();
            suma_edad += edad;
            suma_altura += altura;
        }
        media_edad = suma_edad/5;
        media_altura = suma_altura/5;
        System.out.println("La edad media de los alumnos es:" + media_edad + " y sdu altura media es:" + media_altura);
        
        */
        
        
        /*//pedir 10 sueldos, la suma de ellos y los superiores a 1000
        Scanner sc = new Scanner(System.in);
        int sueldos;
        int contador_sueldos = 0;
        int suma = 0;
        

        for(int i = 0;i<=10;i++){
            System.out.println("Introduce 10 sueldos'");
            sueldos = sc.nextInt();
            suma=suma+sueldos;
            if(sueldos>=1000){
                contador_sueldos++;
            }   
        }   
        
        System.out.println("Suma de los sueldos:" + suma);
        System.out.println("Son superiores a 100:" + contador_sueldos);
        */
        
         /*//Pedir 10 numeros mostrar la media de los num negativos,postivos y los de 0
        Scanner sc = new Scanner(System.in);
        int cnegativos = 0;
        int cpositivos = 0;
        int c0 = 0;
        int positivos = 0;
        int negativos = 0;
        double mediapositivos;
        double medianegativos;
        for(int n = 0; n<= 10;n++){
        System.out.println("Dime numeros:");
        int num = sc.nextInt();
        if(num>0){
            positivos+=num;
            cpositivos++;    
    }else{
            if(num<0){
                cnegativos++;
            negativos += num;
                    
        }else if (num == 0);{
                
                c0++;
                }
             }
        }
            
        mediapositivos = (double)positivos/cpositivos;
        medianegativos = (double)negativos/cnegativos;
            System.out.println("La media de los numeros negativos es:" + medianegativos);
            System.out.println("La media de los numeros positivos es:" + mediapositivos);
                    System.out.println(c0);
       */
            
       /* //La factorial de un numero
        double factorial = 1;
        double numero = 20;
        while(numero != 0){
            factorial = factorial*numero;
            numero--;
        }
        System.out.println(factorial);
        */
       
       
        /*Introduces un numero y dice si es mayor o menos al que tienes predeterminado
        int N = 30;
        int num;
        boolean acierta = false;
        Scanner sc = new Scanner(System.in);
        while(!acierta){
            num = sc.nextInt();
            if(num == N){
                System.out.println("Es igual");
                boolean falla = true;
            }
            if(num < N){
                System.out.println("Es menor");
            }
            else if(num>N){
                System.out.println("Es mayor");
            }
        }
        */
        /*minimo maximo de diversos numeros que introduzcas
        Scanner sc = new Scanner(System.in);
        int numero = 0;
        int max = 0;

        int min = 0;
        do{
            System.out.println("Introduce los nums");
            numero = sc.nextInt();
            if(numero>max){
                max = numero;
            }while(numero!=0);
            System.out.println("El número máximo es:");
            
            
            if(numero>min){
                min=numero;
            }while(numero != 0);
            System.out.println("El número minimo es:");
        }
        */
       
        /*//Contar del 0 al 100 de 7 en 7 con while
        int i = 100;
        while(i > 0){
            System.out.println("" + i);
            i-=7;
        }
        */
        /*//Contar del 0 al 100 de 7 en 7 con for
        for(int i = 100; i > 0; i-=7){
            System.out.println("" + i);
        }
        */
        
        
        /*//revisar
        int num = 0;
        Scanner sc = new Scanner(System.in);
        do
        {
            System.out.println("Introduce un numero:");
            num = sc.nextInt();//2
            
        }while(num != 0);
        System.out.println("Los numeros son:" + (isPar(4));
    */
    
        
        
      
        
        /* //Decir si un numero es par o impar con un metodo
        if (isPar(346)){
            System.out.println("Es par");
        }else{
            System.out.println("Es impar");
        }
        */
       
        
        /* //Numero par o impar con Scanner
        Scanner parScanner = new Scanner (System.in);
                
        int numero;
        
        numero = parScanner.nextInt();
        
        if(numero % 2 == 0){
            System.out.println("El número es par");
        }else{
            System.out.println("El número es impar");
           
            
        }
        */
        
      /*  //factorizar un numero

        Scanner miScanner = new Scanner(System.in);
       int numero;
       int divisor = 2;
       
        numero = miScanner.nextInt();
       
        System.out.println("Los factores del número " + numero + " son ");
        while(numero != 1){
        if(numero % divisor == 0){
            System.out.println(divisor + " ");
            numero = numero / divisor;
        }else{
            divisor++;
        }
        }
    */    
       
        /*//Dime el número del medio del número que te doy
        String str = "123";
        System.out.println("Nº digitos " + str.length());
        int l= str.length();
        int i = l/2;
        System.out.println("El número del medio es: " + str.charAt(i));
        String str = "123";

        */

        
        
        /* //Decir si los numeros son consecutivos mediante un JOptionPane
        String a = JOptionPane.showInputDialog(null, "Primer Número");
        String b = JOptionPane.showInputDialog(null, "Segundo Número");
        int n1 = Integer.parseInt(a);
        int n2 = Integer.parseInt(b);

        int consecutivos = n1 - n2;
        if (consecutivos == 1 || consecutivos == -1) {
            JOptionPane.showConfirmDialog(null, "Los números son consecutivos");
        } else {
            JOptionPane.showConfirmDialog(null, "Los números no son consecutivos");
        }
        */
        
        /*

        final int p = 23;
        System.out.println(isPrimo(p));

        final int N = 100;

        for (int i = 2; i < N; i++) {
            boolean isPrimo = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrimo = false;
                    break;
                }
            }

            boolean isPrimo2 = true;
            for (int j = 2; j < (i + 2); j++) {
                if ((i + 2) % j == 0) {
                    isPrimo2 = false;
                    break;
                }
            }

            if (isPrimo(i) && isPrimo2) {
                System.out.println(i + " " + (i + 2));
            }

        }
*/
        /*
        //Número primo
        final int P = 22;
        boolean is_prime = true;
        
        for(int i = 2; i < P; i++){
            if( P % i == 0){is_prime = false;}
        }
        String res = (is_prime) ?"Si es primo" : "No es primo";
        System.out.println(res);
         */
 /*
    public static boolean sonGemelos(long a, long b){
    {
        return esPrimo(a) && esPrimo(b) && Math.abs(a - b) == 2;
    }
    
    {
        if ( numero <= 1 ) return false;
 
        long max = (long) Math.sqrt(numero);
        for ( long i = 2; i < max / 2; ++i )
            if ( numero % i == 0 )
                return false;
 
        return true;
    }
         */
    
    /*
        //Números primos gemelos
        int n;
        boolean prime[] = new boolean[n + 1];
        for(int i = 0; i <= n ; i++)
            prime[i] = true ;
            for(int p = 2; p * p <= n; p++){
                if(prime[p] == true){
                    for(int i = p * 2; i <= n; i+= p)
                        prime[i] = false;
                }
        }
              if (prime[i] == true &&
                prime[i + 2] == true)
             
                // Display the result
                System.out.print(" (" + i + ", " +
                                   (i + 2) + ")");
        }
    }
     */

 /*
        //Dar la vuelta a una String con reverse
        String str = "Delfstuck";
        System.out.println(str);
        StringBuilder strb = new StringBuilder(str);
        str = strb.reverse().toString();
		System.out.println(str);
     */

 /*
        //String[] str_arr = ("a","b","c","aasd");
        //System.out.println(str_arr[2]);
        String[][] str_matrix =  {"23524", "wwf"}, {"erge35t3","fwg2g2g","sdgsgwg"},{"   c"}, new String[4]};
        String[][] asfasd = new String [5][6];
        System.out.println(str_matrix[2][2]);
    
    
    int N = 5;
    int[][] matrix = new int [N] [N];
    for(int i = 0; i < matrix.length; i++){
    for(int j = 0 ; j < matrix[i].length;j++){
        
                System.out.print(matrix[i][j]);
    }//for j
            System.out.println("");
}//for i
    for(int[] arr : matrix) {
            System.out.println(Arrays.toString(arr));
}
     */
 /*
           Random rnd = new Random();
           for(int i = 0; i < 10;i++){
               System.out.println(rnd.nextBoolean());
               System.out.println(1);
           } else{
                       System.out.println(0);
                       }    
           
       
          
           final int N = 5;
           int [][] matrix = new int [N][N];
           
           Random rnd = new Random();
           for(int i = 0; i < matrix.length;i++){
           for(int j = 0; j < matrix[i].length; j++){
               matrix[i][j] = (rnd.nextBoolean()) ? 1 : 0;
           }//for j
           }//for i
           for(int[] arr:matrix){
               System.out.println(Arrays.toString(arr));
           }
           
           for(int [] arr : matrix){
               System.out.println(Arrays.toString(arr));
           }
     */
 /*
        //Revisar
        String password = "asdasdasdasdasd";
        boolean pass_ok = true;
        

        //long 10
        if(password.length()<10){
            pass_ok = false;
        }
        int counter = 0;
        for(char c: password.toCharArray()){
            if (Character.isDigit(c)) {
                counter++;
            }
        }
        if(counter < 2 || password.matches("^[a-zA-Z0-9]*$") || (password.length()<10 )) {
            pass_ok = false;
        }

        

        System.out.println(password.matches("^[a-zA-Z0-9]*$"));
        if(!password.matches("^[a-zA-Z0-9]*$")) {
            pass_ok = false;
        }
        if(pass_ok) {
            System.out.println("El password está ok");
            else {
                    System.out.println("El passwotd está mal");
                    }
        }
     */
 /* 
        //Calcular digitos de un numero mediante un while
        int Numeros = 12345678;
        int Cantidad = 0;
        int div = Numeros;
        while (div>0){
            Cantidad++;
            div = div/10;
            
        }
        System.out.println(Numeros + " tiene " + Cantidad + " digitos");
     */
 /*   //Calcular digitos de un número mediante una String
        int Numeros = 12345678;
        String x = Integer.toString(Numeros);
        
        System.out.println(Numeros + " tiene " + x.length() + " digitos");
     */
    //calcular el area de un triangulo
    /*
        double area_triangulo = 0;
        double base = 20;
        System.out.println("La base del trinagulo es:" + base);
        double h = 16;
        System.out.println("La altura del triangulo es:" + h);
        double area_triangulo1 = ((base*h)/2);
        System.out.println("El area del trinagulo es:" + area_triangulo1);
    }
}  
     */
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
}//public static
}//public class

