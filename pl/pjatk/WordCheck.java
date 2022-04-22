package pl.pjatk;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordCheck {
    public boolean StringIsValid(String txt){

        Pattern special= Pattern.compile("[^a-z0-9 ]", Pattern.CASE_INSENSITIVE);
        Pattern number = Pattern.compile("[0-9]", Pattern.CASE_INSENSITIVE);
        Matcher matcherSpecial = special.matcher(txt);
        Matcher matcherNumber = number.matcher(txt);

        boolean constainsSymbols = matcherSpecial.find();
        boolean containsNumber = matcherNumber.find();

        if(constainsSymbols == true){
            System.out.println("Information incorrect, please use only letters!");
            return false;
        }
        else if(containsNumber == true){
            System.out.println("Information incorrect, please use only letters!");
            return false;
        }
        else{
            return true;
        }
    }

    public boolean PeselIsValid(String txt){

        if(txt.matches("[0-9]+")) {
            if(txt.length() == 11) return true;
            else {
                System.out.println("Please enter 11 digits.");
                return false;
            }
        }
        else {
            System.out.println("Please use only digits!");
            return false;
        }
    }

    public boolean NipIsValid(String txt){
        int waga[] = {6,5,7,2,3,4,5,6,7};
        if(txt.matches("[0-9]+")) {
            if(txt.length() == 10)
            {
                int sum = 0;
                for(int i=0; i<9; i++) {
                    int cont_num = Integer.parseInt(String.valueOf(txt.charAt(i)));
                    System.out.println(String.valueOf(txt.charAt(i)));
                    sum += cont_num*waga[i];
                }
                int check_nr = sum%11;
                if(check_nr == 10) check_nr = 0;
                if(check_nr == Integer.parseInt(String.valueOf(txt.charAt(9)))) return true;
                else {
                    System.out.println("Incorrect NIP number.");
                    return false;
                }
            }
            else {
                System.out.println("Please enter 10 digits.");
                return false;
            }
        }
        else {
            System.out.println("Please use only digits!");
            return false;
        }
    }

    public boolean BankAccIsValid(String txt){

        if(txt.matches("[0-9]+")) {
            if(txt.length() == 26) return true;
            else {
                System.out.println("Please enter 26 digits.");
                return false;
            }
        }
        else {
            System.out.println("Please use only digits!");
            return false;
        }
    }

    public boolean MaleIsValid(String txt){

        if(txt == "Male" || txt == "Female") return true;
        else {
            System.out.println("Please enter 'Male' or 'Female.");
            return false;
        }
    }
}
