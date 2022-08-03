public class Main {
    public void start(){
        System.out.println("Welcome to the Password Generator application\n" +
                "Please follow the program`s leading");
        Password password = new Password();
        password.getPassword();
        password.setUserPasswordConditions();
        password.firstConditionsAfterSettingPassword();
        password.generatePassword();
        password.checkPasswordStrength();
    }
}
