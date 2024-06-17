package com.ki;

import java.awt.*;
import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String msg = greet("Jin"); // 매개변수 안에 문장을 넣는다
        System.out.println(msg); // msg 문장을 출력

        Point point = creatPoint(5, 10); //point라는 변수에 x와y값을 넣어준다
        System.out.println("Point creat at( " + point.x + ", " + point.y + ")");

        int[] evens = firstNEvenNumbers(5); //변수안에 값을 넣어준다
        System.out.println("first 5 even numbers : " + Arrays.toString(evens));
    }

    public static String greet(String name) {
        return "Hello, " + name + "!"; // 문장을 출력
    }

    public static Point creatPoint(int x, int y) {
        return new Point(x, y); //Point의 x,y 값을 출력
    }

    public static int[] firstNEvenNumbers(int n) {
        int[] evenNumbers = new int[n];
        for (int i = 0, num = 2; i < n; num += 2) { // 반복문을 사용하여 i는 0부터 숫자 2보다 크거나 같을때까지 반복한다
            evenNumbers[i] = num;
        }
        return evenNumbers; // 짝수를 출력
    }

}