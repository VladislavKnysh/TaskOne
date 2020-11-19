package com.company;

import java.util.Scanner;

public class Converter {
    public static void main(String[] args) {
        float fahrenheit = (getCelsius()*9/5)+32;
        System.out.println("Температура равна "+ fahrenheit+ " градусов по Фаренгейт.");
    }
    public static float getCelsius(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите температуру в градусах Цельсия(**,*): ");
        return scanner.nextFloat();
    }
}
