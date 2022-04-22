package pl.pjatk;

import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    String firstName, surname, pesel, NIP, bankAccountNumber, gender;
        Date dateOfBirth;
        Scanner scanner = new Scanner(System.in);
        WordCheck wordCheck = new WordCheck();

        System.out.println("Welcome! Please enter billing information : ");
        System.out.print("Name: ");
        firstName = scanner.next();
        while(wordCheck.StringIsValid(firstName)==false) {
            System.out.print("Name: ");
            firstName = scanner.next();
        }
        System.out.print("Surname: ");
        surname = scanner.next();
        while(wordCheck.StringIsValid(surname)==false) {
            System.out.print("Surname: ");
            surname = scanner.next();
        }
        System.out.print("Pesel: ");
        pesel = scanner.next();
        while(wordCheck.PeselIsValid(pesel)==false) {
            System.out.print("Pesel: ");
            pesel = scanner.next();
        }
        System.out.print("NIP number: ");
        NIP = scanner.next();
        while(wordCheck.NipIsValid(NIP)==false) {
            System.out.print("NIP number: ");
            NIP = scanner.next();
        }
        System.out.print("Bank Account: ");
        bankAccountNumber = scanner.next();
        while(wordCheck.BankAccIsValid(bankAccountNumber)==false) {
            System.out.print("Bank Account: ");
            bankAccountNumber = scanner.next();
        }
        System.out.print("Gender: ");
        gender = scanner.next();
        while(wordCheck.MaleIsValid(gender) == false) {
            System.out.println("Gender: ");
            gender = scanner.next();
        }

    }
}