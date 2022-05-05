package com.company;

public class Main {

    public static void main(String[] args) {

        Balyk balyk = new Balyk();
        balyk.setName("Боря");
        balyk.setAge(5);
        balyk.setColor("Залатой");
        System.out.println("Балык");
        System.out.println("Аты :"+balyk.getName());
        System.out.println("Жашы: "+balyk.getAge());
        System.out.println("Ону: "+balyk.getColor());
        balyk.svoystva();
        System.out.println();

        Popugai popugai = new Popugai();
        popugai.setName("Сюша");
        popugai.setAge(6);
        popugai.setColor("Сары жана ак");
        System.out.println("Папугай");
        System.out.println("Аты :"+popugai.getName());
        System.out.println("Жашы: "+popugai.getAge());
        System.out.println("Ону: "+popugai.getColor());
        popugai.svoystva();
        System.out.println();

        Myshyk myshyk = new Myshyk();
        myshyk.setName("Мурка");
        myshyk.setAge(9);
        myshyk.setColor("Ак");
        System.out.println("Мышык");
        System.out.println("Аты :"+myshyk.getName());
        System.out.println("Жашы: "+myshyk.getAge());
        System.out.println("Ону: "+myshyk.getColor());
        myshyk.svoystva();
        System.out.println();

        It it = new It();
        it.setName("Акжол");
        it.setAge(7);
        it.setColor("Кара");
        System.out.println("Ит");
        System.out.println("Аты :"+it.getName());
        System.out.println("Жашы: "+it.getAge());
        System.out.println("Ону: "+it.getColor());
        it.svoystva();
    }
}
