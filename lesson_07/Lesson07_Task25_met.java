package lesson_07;

import java.util.Scanner;

public class Lesson07_Task25_met {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);            // create new Scanner object to be able to enter required amount of money

        ATM atm1 = new ATM(100, 200, 100);       // create new ATM and load it with some amount of banknotes of different values
        atm1.depositMoney(200, 50, 400);             // deposit some money to ATM
        atm1.printTotalAmount();                                    // print out the total amount of money, containing in ATM

        System.out.println("Введите необходимую Вам сумму: ");
        System.out.println(atm1.withdrawMoney(sc.nextInt()));       // enter required amount of money to withdraw

    }

    private static class ATM {           // create class ATM
        private int amnt20;                 // create variables - amounts of banknotes in ATM
        private int amnt50;
        private int amnt100;
        private int totalBalance;

        private ATM(int amnt20, int amnt50, int amnt100) {       //create constructor
            this.amnt20 = amnt20;
            this.amnt50 = amnt50;
            this.amnt100 = amnt100;
        }

        private void depositMoney(int am20, int am50, int am100) {       // method to deposit money
            amnt20 = amnt20 + am20;
            amnt50 = amnt50 + am50;
            amnt100 = amnt100 + am100;
        }

        private boolean withdrawMoney(int moneyAmount) {
            boolean result = false;
            int am20 = 0;
            int am50 = 0;
            int tempOneAm100 = 0;
            int tempTwoAm100 = 0;
            int am100 = 0;

            if(moneyAmount%10 != 0 || moneyAmount < 20 || moneyAmount == 30) {                  // check out if the required sum can be withdrawn using banknotes of the values in ATM
                System.out.println("В банкомате нет купюр подходящего номинала для выдачи требуемой суммы.");
                result = false;
            } else  if (moneyAmount > totalBalance){                                            // check out if the required sum is less than the total balance in ATM
                System.out.println("В банкомате недостаточно средств.");
            } else {
                for (int i = 1; i <= amnt20; i++) {                                 // looking for the way to present the required amount of money as a sum of 2 numbers
                    if ((moneyAmount - i * 20) % 50 == 0) {                         // first number must be able to be divided by 20, second number must be able to be divided by 50
                        am20 = i;
                        am50 = (moneyAmount - i * 20) / 50;

                            if(am50 >= amnt50*0.2) {                            // if the required sum is large enough to take more than 20% of ATM's 50-s, ATM should give out 100-s instead of 50-s
                                tempTwoAm100 =  am50 / 2;
                                am50 = am50 - tempTwoAm100*2;
                            }
                            am100 = tempOneAm100 + tempTwoAm100;

                            if(am100 > amnt100*0.2) {                               // if the required sum needs more than 20% of ATM's 100-s - the sum is too large to be withdrawn.
                                System.out.println("Вы запросили слишком большую сумму! ");
                                break;
                            }
                        result = true;

                        System.out.print("Ловите деньги: ");
                        System.out.print(String.format("%d по 20$, ", am20));
                        System.out.print(String.format("%d по 50$, ", am50));
                        System.out.println(String.format("%d по 100$.", am100));

                        break;
                    }
                }
            }
            return result;
        }
        private void printTotalAmount(){                // method to print out the total amount of money in ATM
            totalBalance = amnt20*20 + amnt50*50 + amnt100*100;
            System.out.println("Доступный баланс: " + totalBalance);
        }
    }
}
