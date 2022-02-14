package ru.job4j.ex;

public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int rsl = -1;
        for (int i = 0; i < value.length; i++) {
            if (value[i].equals(key)) {
                rsl = i;
                break;
            }
        }
        if (rsl == -1) {
            throw new ElementNotFoundException("ElementNotFoundException");
        }
        return rsl;
    }

    public static void main(String[] args) {
        String[] i = {"1", "2", "3", "4", "2"};
        try {
            System.out.println(indexOf(i, "2"));
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }
}
