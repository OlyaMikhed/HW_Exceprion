package com.company;

import java.util.Scanner;

public class Person {

    public static void checkIn(){

        try{
            dataInput();
        }
        catch(NumbersOfPassengers e){
            System.out.println(e.getMessage());
        }
    }

    public static void dataInput() throws NumbersOfPassengers{
        Scanner sc=new Scanner(System.in);
        System.out.println("Введите Ваше имя:");
        String name=sc.nextLine();
        System.out.println("Введите Ваш возраст:");
        byte age=sc.nextByte();
        try{
            if(age<18){
                throw new AgeException("Вам запрещена покупка билетов на данном сайте");
            }
            System.out.println("Поздравляем, регистрация успешно пройдена!");
            System.out.println("Введите количество пассажиров:");
            byte num= sc.nextByte();
            if(num<1){
                throw new NumbersOfPassengers("Вы ввели неверное количество пассажиров");
            }
        }
        catch (AgeException e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Спасибо!");
        }
    }

}
