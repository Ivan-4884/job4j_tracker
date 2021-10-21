package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book one = new Book("Сказки", (short) 135);
        Book two = new Book("Head First Java", (short) 709);
        Book three = new Book("Букварь", (short) 33);
        Book four = new Book("Clean code", (short) 101);
        Book[] mBook = new Book[4];
        mBook[0] = one;
        mBook[1] = two;
        mBook[2] = three;
        mBook[3] = four;
        for (int index = 0; index < mBook.length; index++) {
            Book bk = mBook[index];
            System.out.println(bk.getName() + " " + bk.getPage());
        }
        Book transfer = mBook[0];
        mBook[0] = mBook[3];
        mBook[3] = transfer;
        for (int index = 0; index < mBook.length; index++) {
            Book bk = mBook[index];
            System.out.println(bk.getName() + " " + bk.getPage());
        }
        for (int index = 0; index < mBook.length; index++) {
            Book bk = mBook[index];
            if (bk.getName().equals("Clean code")) {
                System.out.println(bk.getName() + " " + bk.getPage());
            }
        }
    }
}
