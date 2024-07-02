package com.demo.api.metodos;

import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class MetodosSecuencias {
    public void ejecutarSecuencias() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese un numero para las secuencias");
        int numero = scan.nextInt();
        if(numero <= 0){
            System.out.println("DATO INGRESADO NO VALIDO");
        }else {
            secuenciaCollatz(numero);
            secuenciaFizzBuzz(numero);
        }
    }
    public void secuenciaCollatz(int numero){

        System.out.println("SECUENCIA COLLATZ");
        while(numero != 1){
            if ((numero %2 )== 0){
                System.out.print(numero+", ");
                numero = numero/2;
            } else {
                System.out.print(numero+", ");
                numero = (numero * 3) + 1;
            }

            if(numero == 1) {
                System.out.println(numero);
            }
        }
    }

    public void secuenciaFizzBuzz(int numero){
        System.out.println("SECUENCIA FIZZBUZZ");
        for (int i=1;i<=numero;i++){
            if(i %3 == 0 && i%5==0){
                System.out.println(i+" FizzBuzz");
            } else if (i %3 ==0){
                System.out.println(i+" Fizz");
            } else if(i %5 == 0){
                System.out.println(i+" Buzz");
            }else{
                System.out.println(i);
            }
        }
    }
}
