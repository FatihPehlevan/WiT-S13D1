package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println(area(-1.0));
    }

    public static boolean shouldWakeUp(boolean isBarking, int clock) {
        if (clock < 0 || clock > 23) return false;
        if(isBarking) {
            return clock < 8 || clock > 20;
        } else {
            return false;
        }
    }

    public static boolean hasTeen(int firstAge, int secondAge, int thirdAge) {
       int[] ages = {firstAge, secondAge, thirdAge};
       for (int age: ages) {
           if (age>=13 && age<=19){
               return true;
           }
       }
       return false;
    }

    public static boolean isCatPlaying(boolean isSummer, int temp) {
        if (isSummer) {
            return (temp>= 25 && temp<=45);
        } else {
            return (temp>= 25 && temp<=35);
        }
    }

    public static double area(double width, double height) {
        if(width<0 || height <0) return -1;
        return width * height;
    }

    public static double area(double radius) {
        if (radius<0) return -1;
        return radius*radius*Math.PI;
    }
}
