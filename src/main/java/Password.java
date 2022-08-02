import java.util.Scanner;

public class Password {
    private boolean isContainUppercase;
    private boolean isContainLowercase;
    private boolean isContainNumbers;
    private boolean isContainSymbols;
    private int length;


    String upperCase;
    String lowerCase;
    String numbers;

    String symbols;
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

            setUserPasswordConditions();

            System.out.println(getLength() + " " + isContainUppercase() +" " +isContainLowercase() +" "+ isContainNumbers()+" "+isContainSymbols());









        }catch (Exception e)
        {
            System.out.println(e);
        }
    }


    public void setUserPasswordConditions(){
        setContainUppercase(upperCase.equals("y"));

        setContainLowercase(lowerCase.equals("y"));

        setContainNumbers(numbers.equals("y"));

        setContainSymbols(symbols.equals("y"));

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
