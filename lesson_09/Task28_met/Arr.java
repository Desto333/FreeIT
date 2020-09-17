package lesson_09.Task28_met;


import java.util.ArrayList;

public class Arr<T> {

    private ArrayList<T> arr = new ArrayList<>();

    public T getElement(int index) {
        return arr.get(index);
    }

    public void addElement(T element) {
        arr.add(element);
    }
}

