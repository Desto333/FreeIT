package lesson_12.Task4_Automobile;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class SerialReadAuto {
    public static void main(String[] args) {
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("auto.dat"));
            Automobile auto1 = (Automobile) ois.readObject();
            ois.close();
            System.out.println(auto1.toString());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }


    }
}
