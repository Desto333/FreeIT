package lesson_12.Task4_Automobile;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerialWriteAuto {
    public static void main(String[] args) {
        Automobile auto = new Automobile("MAZ", 120, 25000);

        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("auto.dat"));
            oos.writeObject(auto);
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
