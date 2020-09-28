package lesson_09.Task28_met;


import java.util.ArrayList;
import java.util.NoSuchElementException;

public class Arr<T> {

    private ArrayList<T> arr = new ArrayList<>();

    public T getElement(int index) {
        if(arr.get(index) != null) return arr.get(index);
        else throw new NoSuchElementException("Элемент с таким индексом не существует!");
    }

    public void addElement(T element) {
        arr.add(element);
    }
}

