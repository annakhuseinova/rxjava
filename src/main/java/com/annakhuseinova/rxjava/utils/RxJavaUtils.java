package com.annakhuseinova.rxjava.utils;

import com.annakhuseinova.rxjava.model.Shape;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RxJavaUtils {

    public static List<Integer> positiveNumbers(Integer n){
        List<Integer> positiveNumbers = new ArrayList<Integer>();
        for (int i = 1; i <= n; i++){
            positiveNumbers.add(i);
        }
        return positiveNumbers;
    }

    public static List<Shape> shapes(Integer n){
        List<Shape> shapes = new ArrayList<Shape>();
        for (int i = 1; i <= n; i++){
            shapes.add(new Shape(randomShape(), randomColor()));
        }
        return shapes;
    }

    private static String randomColor(){
        Random random = new Random();
        String[] colors = {"blue", "green", "red", "yellow", "pink"};
        return colors[random.nextInt(getRandomNumberInRange(1,4))];
    }

    private static String randomShape(){
        Random random = new Random();
        String[] shape = {"square", "triangle", "circle", "pentagon", "hexagon", "stars"};
        return shape[random.nextInt(getRandomNumberInRange(1,6))];
    }

    private static int getRandomNumberInRange(int min, int max){
        if (min >= max){
            throw new IllegalArgumentException("max must be greater than min");
        }
        Random random = new Random();
        return random.nextInt((max - min) + 1) + 1;
    }


    public static List<Integer> primeNumbers (Integer n) {
        //List to hold primeNumbers of size n
        List<Integer> primeNumbers= new ArrayList<>(n);
        //
        boolean totalPrimeCollected=false;
        int i=1;
        int totalNumbers=0;
        //Interate over n elements and add to list
        while(!totalPrimeCollected){
            if(isPrime(i)){
                primeNumbers.add(i);
                totalNumbers++;
            }
            i++;
            if(totalNumbers==n){
                totalPrimeCollected=true;
            }
        }
        return primeNumbers;
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
