package com.ki;

import java.awt.*;
import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String msg = greet("Jin"); // 매개변수 안에 문장을 넣는다
        System.out.println(msg); // msg 문장을 출력

        Point point = creatPoint(5, 10); //point라는 매개변수에 x와y값을 넣어준다
        System.out.println("Point creat at( " + point.x + ", " + point.y + ")");// 매개병수를 불러와 출력한다

        int[] evens = firstNEvenNumbers(5); //변수안에 값을 넣어준다
        System.out.println("first 5 even numbers : " + Arrays.toString(evens));//길이가 5인 배열을(를) 출력해 준다
    }

    public static String greet(String name) {// 메서드를 생성
        return "Hello, " + name + "!"; // 문장을 출력
    }

    public static Point creatPoint(int x, int y) {
        return new Point(x, y); //Point의 x,y 값을 출력
    }

    public static int[] firstNEvenNumbers(int n) {
        int[] evenNumbers = new int[n];// 길이가 N인 배열의 변수를 생성한다
        for (int i = 0, num = 2; i < n; i++, num += 2) { // 반복문을 사용하여 앞의 변수에 2라는 값을 더해준다 i가 0이면 num = 2씩 n번 더한다
            evenNumbers[i] = num;
        }
        return evenNumbers; // 길이가 n인 정수를 출력
    }

}
