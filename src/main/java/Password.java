import java.util.*;

public class Password {
    private boolean isContainUppercase;
    private boolean isContainLowercase;
    private boolean isContainNumbers;
    private boolean isContainSymbols;
    private int length;

    int counter = 0;

    String upperCase;
    String lowerCase;
    String numbers;
    String symbols;


    String[] symbolsArr = {"~","`","!","@","#","$","%","^","&","*","(",")","_","-","+","=","|","?",",","."};
    String[] upperCaseLettersArr ={"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","R","S","T","U","V","Y","Z","Q","W","X"};
    String[] lowerCaseLettersArr ={"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","r","s","t","u","v","y","z","q","w","x"};
    int[] numbersArr = {1,2,3,4,5,6,7,8,9,0};

    int rndSymbols;
    int rndUpperCaseLetters;
    int rndLowerCaseLetters;
    int rndNumbers;

    String generatedPassword = "";

    public void checkPasswordStrength(){
        if (counter >= 4 && getLength() >= 8){
            if (counter >= 4 && getLength() >= 16) {
                System.out.println("great");
            }
            else {
                System.out.println("good");
            }
        } else if (counter >= 4) {
            System.out.println("medium");
        } else {
            System.out.println("weak");
        }
    }

    public void getPassword()
    {
        System.out.println("Would you like to have your password Uppercase letter in it?(y/n)");
        Scanner input = new Scanner(System.in);
        try {
            upperCase = input.next().toLowerCase();

            System.out.println("Would you like to have your password Lowercase letter in it?(y/n)");
            lowerCase = input.next().toLowerCase();

            System.out.println("Would you like to have your password numbers in it?(y/n)");
            numbers = input.next().toLowerCase();

            System.out.println("Would you like to have your password symbols in it?(y/n)");
            symbols = input.next().toLowerCase();

            System.out.println("How long is gonna be the length of your password?");
            setLength(input.nextInt());

        }catch (Exception e)
        {
            System.out.println(e);
        }
    }

    public void generatePassword(){
        if (getLength()>0){
            if (isContainUppercase()) {
                for (int i = 0; i < getLength()-counter; i++) {
                    rndUpperCaseLetters = new Random().nextInt(upperCaseLettersArr.length);
                    generatedPassword+= upperCaseLettersArr[rndUpperCaseLetters]+"";
                }
            } else if (isContainLowercase()) {
                    for (int i = 0; i < getLength()-counter; i++) {
                        rndLowerCaseLetters = new Random().nextInt(lowerCaseLettersArr.length);
                        generatedPassword+= lowerCaseLettersArr[rndLowerCaseLetters]+"";
                    }
            }
            else if(isContainSymbols()) {
                for (int i = 0; i < getLength() - counter; i++) {
                    rndSymbols = new Random().nextInt(symbolsArr.length);
                    generatedPassword += symbolsArr[rndSymbols] + "";
                }
            } else if (isContainNumbers()) {
                for (int i = 0; i < getLength() - counter; i++) {
                    rndNumbers = new Random().nextInt(numbersArr.length);
                    generatedPassword += numbersArr[rndNumbers] + "";
                }
            }
        }
        System.out.println(generatedPassword);
    }


    public void firstConditionsAfterSettingPassword(){
        if (isContainSymbols()) {
            rndSymbols = new Random().nextInt(symbolsArr.length);
            generatedPassword+= symbolsArr[rndSymbols]+"";
        }

        if (isContainUppercase()) {
            rndUpperCaseLetters = new Random().nextInt(upperCaseLettersArr.length);
            generatedPassword+= upperCaseLettersArr[rndUpperCaseLetters]+"";
        }

        if (isContainLowercase()) {
            rndLowerCaseLetters = new Random().nextInt(lowerCaseLettersArr.length);
            generatedPassword+= lowerCaseLettersArr[rndLowerCaseLetters]+"";
        }

        if (isContainNumbers()) {
            rndNumbers = new Random().nextInt(numbersArr.length);
            generatedPassword+= numbersArr[rndNumbers]+"";
        }
    }

    public void setUserPasswordConditions(){
       if (upperCase.equals("y"))
        {
            setContainUppercase(true);
            counter++;
        }
        if (lowerCase.equals("y"))
        {
            setContainLowercase(true);
            counter++;
        }
        if (numbers.equals("y"))
        {
            setContainNumbers(true);
            counter++;
        }
        if (symbols.equals("y"))
        {
            setContainSymbols(true);
            counter++;
        }
    }

    public boolean isContainUppercase() {
        return isContainUppercase;
    }

    public void setContainUppercase(boolean containUppercase) {
        isContainUppercase = containUppercase;
    }

    public boolean isContainLowercase() {
        return isContainLowercase;
    }

    public void setContainLowercase(boolean containLowercase) {
        isContainLowercase = containLowercase;
    }

    public boolean isContainNumbers() {
        return isContainNumbers;
    }

    public void setContainNumbers(boolean containNumbers) {
        isContainNumbers = containNumbers;
    }

    public boolean isContainSymbols() {
        return isContainSymbols;
    }

    public void setContainSymbols(boolean containSymbols) {
        isContainSymbols = containSymbols;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
