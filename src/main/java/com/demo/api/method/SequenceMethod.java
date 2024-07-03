package com.demo.api.method;

import org.springframework.stereotype.Component;

@Component
public class SequenceMethod {
    public String sequenceCollatz(int number) {
        StringBuilder sequence = new StringBuilder();

        if (number <= 0) {
            return "DATO INGRESADO NO VALIDO";
        }

        while (number != 1) {
            sequence.append(number).append(", ");

            if (number % 2 == 0) {
                number = number / 2;
            } else {
                number = (number * 3) + 1;
            }
        }

        sequence.append(number);
        return sequence.toString();
    }

    public String sequenceFizzBuzz(int number){
        StringBuilder sequence = new StringBuilder();

        if (number <= 0) {
            return "DATO INGRESADO NO VALIDO";
        }
        for (int i=1;i<=number;i++){
            if(i %3 == 0 && i%5==0){
                sequence.append(i).append(" FizzBuzz, ");
            } else if (i %3 ==0){
                sequence.append(i).append(" Fizz, ");
            } else if(i %5 == 0){
                sequence.append(i).append(" Buzz, ");
            }else{
                sequence.append(i).append(", ");
            }
        }
        return sequence.toString();
    }
}
