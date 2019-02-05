package dev.eder.padilla.mockitomvp;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class LoginModelTest {

    @Mock
    private Login.Presenter presenter;

    private LoginModel model;

    @Before
    public void setUp() throws Exception{
        model = new LoginModel(presenter);
    }

    @Test
    public void shouldShowSuccessWithValidUserAndPassword() throws Exception{
        model.validateuser("eder","1234");
        verify(presenter).validUser();
    }

    @Test
    public void shouldShowErrorWithValidUserAndPassword() throws Exception{
        model.validateuser("ede12r","123123124");
        verify(presenter).error();
    }

}