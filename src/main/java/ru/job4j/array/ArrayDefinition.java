package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];
        String[] names = new String[4];
        names[0] = "Ivan Ivanov";
        names[1] = "Petr Petrov";
        names[2] = "Maxim Maximov";
        names[3] = "Semen Sidorov";
        System.out.print(names[0] + "\n" + names[1] + "\n" + names[2] + "\n" + names[3]);
    }
}
