package dev.eder.padilla.mockitomvp;

public class LoginPresenter implements Login.Presenter {

    private Login.View view;
    private Login.Model model;

    public LoginPresenter(Login.View view) {
        this.view = view;
        model = new LoginModel(this);
    }

    @Override
    public void validateUser(String user, String password) {
        if (view!=null){
            model.validateuser(user,password);
        }
    }

    @Override
    public void validUser() {
        if (view!=null){
            view.validUser();
        }
    }

    @Override
    public void error() {
        if (view!=null){
            view.error();
        }
    }

}
