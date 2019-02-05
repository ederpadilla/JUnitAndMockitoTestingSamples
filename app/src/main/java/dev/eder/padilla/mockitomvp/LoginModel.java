package dev.eder.padilla.mockitomvp;

public class LoginModel implements Login.Model {

    private Login.Presenter presenter;

    public LoginModel(Login.Presenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public void validateuser(String user, String password) {
        if (user.equals("eder") && password.equals("1234")){
            presenter.validUser();
        }else{
            presenter.error();
        }
    }

}
