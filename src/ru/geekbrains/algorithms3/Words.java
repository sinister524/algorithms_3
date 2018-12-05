package ru.geekbrains.algorithms3;

public class Words {
    public static void revers (String input) {
        int size = input.length();
        Stack st = new Stack(size);
        for (int i = 0; i <size ; i++) {
            char ch = input.charAt(i);
            st.push(ch);
        }
        for (int i = 0; i <size ; i++) {
            System.out.print((char) st.pop());
        }
        System.out.println(" ");
    }
}
