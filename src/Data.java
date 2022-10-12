import java.util.Objects;

public class Data {
    private String login;
    private String password;
    private String confirmPassword;

    public Data(String login, String password, String confirmPassword) {
        setLogin(login);
        setPassword(password);
        setConfirmPassword(confirmPassword);
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        boolean login1 = login.matches("\\w{1,20}");
        if(login1){
            this.login = login;
        }
        else{
            throw new RuntimeException("WrongLoginException");
        }

    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        boolean password1 = password.matches("\\w{1,20}");
        if (password1) {
            this.password = password;
        } else {
            throw new RuntimeException("WrongPasswordException");
        }
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        if (Objects.equals(confirmPassword, password)) {
            this.confirmPassword = confirmPassword;
        } else {
            throw new RuntimeException("WrongPasswordException");
        }
    }
}
