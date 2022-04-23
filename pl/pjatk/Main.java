package pl.pjatk;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        WordCheck wordCheck = new WordCheck();
        LoanApp loanApp = new LoanApp();

        System.out.println("Welcome! Please enter billing information : ");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Name: ");
        loanApp.firstName = scanner.next();
        while(wordCheck.StringIsValid(loanApp.firstName)==false) {
            System.out.print("Name: ");
            loanApp.firstName = scanner.next();
        }

        System.out.print("Surname: ");
        loanApp.surname = scanner.next();
        while(wordCheck.StringIsValid(loanApp.surname)==false) {
            System.out.print("Surname: ");
            loanApp.surname = scanner.next();
        }

        System.out.print("Date of birth (DD-MM-YYYY): ");
        loanApp.dateOfBirth = scanner.next();
        while(wordCheck.DateIsValid(loanApp.dateOfBirth) == false) {
            System.out.print("Date of birth (DD-MM-YYYY): ");
            loanApp.dateOfBirth = scanner.next();
        }

        System.out.print("Pesel: ");
        loanApp.pesel = scanner.next();
        while(wordCheck.PeselIsValid(loanApp.pesel, loanApp.dateOfBirth)==false) {
            System.out.print("Pesel: ");
            loanApp.pesel = scanner.next();
        }

        System.out.print("NIP number: ");
        loanApp.NIP = scanner.next();
        while(wordCheck.NipIsValid(loanApp.NIP)==false) {
            System.out.print("NIP number: ");
            loanApp.NIP = scanner.next();
        }

        System.out.print("Bank Account: ");
        loanApp.bankAccountNumber = scanner.next();
        while(wordCheck.BankAccIsValid(loanApp.bankAccountNumber)==false) {
            System.out.print("Bank Account: ");
            loanApp.bankAccountNumber = scanner.next();
        }

        System.out.print("Gender: ");
        loanApp.gender = scanner.next();
        while(wordCheck.GenderIsValid(loanApp.gender, loanApp.pesel) == false) {
            System.out.print("Gender: ");
            loanApp.gender = scanner.next();
        }
    }
}