package lesson_07;

public class Lesson07_Task24_met{
    public static void main(String[] args) {
        TimeLapse time = new TimeLapse(58, 12, 10);
        TimeLapse time1 = new TimeLapse(5781);
        TimeLapse time2 = new TimeLapse(21, 36, 1);

        System.out.println(time.compareTo(time1));
        System.out.println(time2.compareTo(time));
        System.out.println(time1.compareTo(time2));

        time.printOut();
        time1.printOut();
        time2.printOut();
    }

    public static class TimeLapse {
        int secLength;                      //variables for our class
        int minLength;
        int hrsLength;

        public TimeLapse(int secLength, int minLength, int hrsLength) {     // constructor, which receives all 3 variables
            this.secLength = secLength;
            this.minLength = minLength;
            this.hrsLength = hrsLength;
        }

        public TimeLapse(int secLength) {                                   // constructor, which receives only number of seconds
            this.secLength = secLength;
        }

        public int getSeconds() {                                           // method, which returns a number of seconds of the object
            return secLength + minLength*60 + hrsLength*3600;
        }

        public int compareTo(TimeLapse obj) {                               // method, which compares durations of objects
            if(this.getSeconds() < obj.getSeconds()) return 1;
                else if(this.getSeconds() > obj.getSeconds()) return -1;
                    else return 0;
        }

        public void printOut() {                                           // method, which calculates and prints out duration of an object
            int sec = 0;
            int min = 0;
            int hrs = 0;

            if(secLength >= 60) {
                hrs = secLength / 3600;
                min = secLength / 60 % 60;
                sec = secLength % 60;
                } else if (minLength >= 60) {
                    hrs = secLength / 3600;
                    min = secLength / 60 % 60;
                    sec = secLength;
                    }   else {
                        hrs = hrsLength;
                        min = minLength;
                        sec = secLength;
                    }

            System.out.println( "Продолжительность объекта составляет " +
                   hrs + " часов, " + min + " минут, " +
                   sec + " секунд.");
        }
    }
}
