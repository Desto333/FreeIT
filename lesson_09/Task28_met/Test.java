package lesson_09.Task28_met;


public class Test {
    public static void main(String[] args) {

        Arr array = new Arr();          // you can test adding and getting elements to/from Arr class here

        array.addElement("Один");
        array.addElement("Двадцать четыре");
        array.addElement(3);
        array.addElement('t');

        System.out.println(array.getElement(0));
        System.out.println(array.getElement(1));
        System.out.println(array.getElement(2));
        System.out.println(array.getElement(3));
    }

}
