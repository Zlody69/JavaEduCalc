package com.company;

import com.company.jbd.Calculator;
import com.company.jbd.Handler;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
	    Scanner vvod = new Scanner(System.in);
	    String chisla = vvod.nextLine();//Вводим пример
        Handler myHandler = new Handler(chisla);//конструктор который разбивает введенную строку на составляющие
        System.out.println(myHandler.reshenie());//собственно вывод ответа



        }
    }



