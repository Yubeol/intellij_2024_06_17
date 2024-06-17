package com.ki;

import java.awt.*;
import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {//메인 함수

        String msg = greet("Jin"); // 문자열만 담을 수 있는변수 msg에 greet함수 실행 결과를 넣는다.
        System.out.println(msg); // msg 문장을 출력

        Point point = creatPoint(5, 10); //point라는 매개변수에 x와y값을 넣어준다
        System.out.println("Point creat at( " + point.x + ", " + point.y + ")");// 매개병수를 불러와 출력한다

        int[] evens = firstNEvenNumbers(5); //배열의 변수안에 값을 넣어준다
        System.out.println("first 5 even numbers : " + Arrays.toString(evens));//길이가 5인 배열을(를) 출력해 준다
        //                                             class ,  static,  인자
    }

    public static String greet(String name) {// 문자열 매개변수 1개를 받는 greet 메서드.  static == 인스턴스화 옶이 사용(new x) 객체사용핮 않고 사용
        return "Hello, " + name + "!"; // 문자열을 출력
    }

    public static Point creatPoint(int x, int y) {
        return new Point(x, y); //Point객채의 x,y 값을 출력
    }

    public static int[] firstNEvenNumbers(int n) {
        int[] evenNumbers = new int[n];// 길이가 N인 배열의 변수를 생성한다
        for (int i = 0, num = 2; i < n; i++, num += 2) { // 반복문을 사용하여 앞의 변수에 2라는 값을 더해준다 i가 0이면 num = 2씩 n번 더한다
            evenNumbers[i] = num;
        }
        return evenNumbers; // 길이가 n인 정수를 출력
    }

}
