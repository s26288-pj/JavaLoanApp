package pl.pjatk;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        WordCheck wordCheck = new WordCheck();
        LoanApp loanApp = new LoanApp();

        System.out.println("Welcome! Please enter billing information : ");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Name: ");
        loanApp.setFirstName(scanner.next());
        while(wordCheck.StringIsValid(loanApp.getFirstName())==false) {
            System.out.print("Name: ");
            loanApp.setFirstName(scanner.next());
        }

        System.out.print("Surname: ");
        loanApp.setSurname(scanner.next());
        while(wordCheck.StringIsValid(loanApp.getSurname())==false) {
            System.out.print("Surname: ");
            loanApp.setSurname(scanner.next());
        }

        System.out.print("Date of birth (DD-MM-YYYY): ");
        loanApp.setDateOfBirth(scanner.next());
        while(wordCheck.DateIsValid(loanApp.getDateOfBirth()) == false) {
            System.out.print("Date of birth (DD-MM-YYYY): ");
            loanApp.setDateOfBirth(scanner.next());
        }

        System.out.print("Pesel: ");
        loanApp.setPesel(scanner.next());
        while(wordCheck.PeselIsValid(loanApp.getPesel(), loanApp.getDateOfBirth())==false) {
            System.out.print("Pesel: ");
            loanApp.setPesel(scanner.next());
        }

        System.out.print("NIP number: ");
        loanApp.setNIP(scanner.next());
        while(wordCheck.NipIsValid(loanApp.getNIP())==false) {
            System.out.print("NIP number: ");
            loanApp.setNIP(scanner.next());
        }

        System.out.print("Bank Account: ");
        loanApp.setBankAccountNumber(scanner.next());
        while(wordCheck.BankAccIsValid(loanApp.getBankAccountNumber())==false) {
            System.out.print("Bank Account: ");
            loanApp.setBankAccountNumber(scanner.next());
        }

        System.out.print("Gender: ");
        loanApp.setGender(scanner.next());
        while(wordCheck.GenderIsValid(loanApp.getGender(), loanApp.getPesel()) == false) {
            System.out.print("Gender: ");
            loanApp.setGender(scanner.next());
        }
    }
}