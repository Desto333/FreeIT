package lesson_07.Human;

import lesson_07.Human.jacket.HellyHansen_jacket;
import lesson_07.Human.jacket.Valentino_jacket;
import lesson_07.Human.shoes.Bugatti_shoes;
import lesson_07.Human.shoes.Rieker_shoes;
import lesson_07.Human.trousers.Levis_trousers;
import lesson_07.Human.trousers.Versace_trousers;

public class Main {
    public static void main(String[] args) {
        Human man1 = new Human("John", new Versace_trousers(), new Bugatti_shoes(), new Valentino_jacket());
        Human man2 = new Human("David", new Levis_trousers(), new Rieker_shoes(), new HellyHansen_jacket());

        man1.dress();
        System.out.println();
        man2.dress();
        System.out.println();

        man2.undress();
        System.out.println();
        man1.undress();
    }
}
