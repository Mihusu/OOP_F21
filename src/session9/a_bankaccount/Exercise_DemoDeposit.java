package session9.a_bankaccount;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Introduce changes in the deposit method of the BankAccount to avoid that
 * a negative quantity can be deposited.
 */
public class Exercise_DemoDeposit {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        BankAccount account = new BankAccount(100);

        while (true) {
            System.out.println("\nCurrent Account Balance: "+account.getBalance());

            System.out.println("Enter an amount to deposit:");

            try {
                int amount = scanner.nextInt();
                account.deposit(amount);
            } catch (IllegalArgumentException e) {
                System.out.println("\nSomething went wrong: " + e.getMessage());
            } catch (InputMismatchException e) {
                System.out.println("\nInput a number. Your input is: " + scanner.nextLine());
            }
        }
    }
}
