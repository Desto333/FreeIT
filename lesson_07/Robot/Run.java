package lesson_07.Robot;

import lesson_07.Robot.hands.SamsungHand;
import lesson_07.Robot.hands.SonyHand;
import lesson_07.Robot.hands.ToshibaHand;
import lesson_07.Robot.heads.SamsungHead;
import lesson_07.Robot.heads.SonyHead;
import lesson_07.Robot.heads.ToshibaHead;
import lesson_07.Robot.legs.SamsungLeg;
import lesson_07.Robot.legs.SonyLeg;
import lesson_07.Robot.legs.ToshibaLeg;

public class Run{
    public static void main(String[] args) {
        /*
        Создать по 3 реализации(Sony, Toshiba, Samsung) каждой запчасти(IHead, IHand, ILeg)
        Класс SonyHead является примером реализацией головы от Sony.
        Создайте 3 робота с разными комплектующими.
        Например у робота голова и нога от Sony а, рука от Samsung.
        У всех роботов вызовите метод action.
        Среди 3-х роботов найдите самого дорогого.
        */

        Robot robot1 = new Robot(new SonyHead(), new ToshibaHand(), new SamsungLeg());
        Robot robot2 = new Robot(new SamsungHead(), new SonyHand(), new ToshibaLeg());
        Robot robot3 = new Robot(new ToshibaHead(), new SamsungHand(), new SonyLeg());

        robot1.action();
        System.out.println();
        robot2.action();
        System.out.println();
        robot3.action();
        System.out.println();

        if(robot1.getPrice() >= robot2.getPrice() && robot1.getPrice() >= robot3.getPrice()) {
            System.out.println("Robot1 - самый дорогой");
        }   else if (robot2.getPrice() >= robot1.getPrice() && robot2.getPrice() >= robot3.getPrice()) {
            System.out.println("Robot2 - самый дорогой");
        }   else {
            System.out.println("Robot3 - самый дорогой");
        }
    }
}
