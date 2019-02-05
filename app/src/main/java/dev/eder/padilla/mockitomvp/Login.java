package dev.eder.padilla.mockitomvp;

public interface Login {

    interface View {
        void validUser();
        void error();
        String getUserName();
        String getPassword();
    }

    interface Presenter {
        void validateUser(String user, String password);
        void validUser();
        void error();
    }

    interface Model {
        void validateuser(String user, String password);
    }
}
