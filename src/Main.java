
public class Main {
    public static void main(String[] args) {

        Data data = new Data("Alexandr", "123456789", "123456789");
        System.out.println("Логин: "+data.getLogin() + "\nПароль: " + data.getPassword() +
                "\nПодтвердить пароль: " + data.getConfirmPassword());
    }
}