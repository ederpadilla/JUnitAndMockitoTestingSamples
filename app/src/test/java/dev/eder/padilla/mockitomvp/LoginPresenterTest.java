package dev.eder.padilla.mockitomvp;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class LoginPresenterTest {



    //mock of classes and interfaces
    @Mock
    private Login.View view;

    @Mock
    private Login.Model model;

    private LoginPresenter presenter;

    @Before
    public void setup()throws Exception{
        presenter = new LoginPresenter(view);
    }

    @Test
    public void showldShowErrorMessageWhenUserorPassInvalidTest()throws Exception{
        //program
        when(view.getUserName()).thenReturn("eder1");
        when(view.getPassword()).thenReturn("12345");
        //executes method
        presenter.validateUser(view.getUserName(),view.getPassword());
        //verify view executes method error
        verify(view).error();
    }

    @Test
    public void showldCallValiduserWhenUserorPassValidTest()throws Exception{
        //program
        when(view.getUserName()).thenReturn("eder");
        when(view.getPassword()).thenReturn("1234");
        Assert.assertEquals("eder",view.getUserName());
        Assert.assertEquals("1234",view.getPassword());
        //executes method
        presenter.validateUser(view.getUserName(),view.getPassword());
        //verify view executes method error
        verify(view).validUser();
    }

    @Test
    public void showldThrowException() throws Exception{
        when(view.getUserName()).thenThrow(RuntimeException.class);
        try{
            view.getUserName();
        }catch (Exception e){
        }
    }

    @Test
    public void showldCallValiduserWhenUserorPassValidDoReturnTest() throws Exception{
        doReturn("eder").when(view).getUserName();
        Assert.assertEquals("eder", view.getUserName());
    }

    @Test
    public void showldCallValiduserWhenUserorPassValidTest2()throws Exception{
        //program behavior
        when(view.getUserName()).thenReturn("eder");
        when(view.getPassword()).thenReturn("1234");
        Assert.assertEquals("eder",view.getUserName());
        Assert.assertEquals("1234",view.getPassword());
        //executes method
        presenter.validateUser(view.getUserName(),view.getPassword());
        //verify view executes method error
        verify(view).validUser();
        verify(view,times(1)).validUser();
        //verify(view,never()).validUser();
        verify(view,atLeast(1)).validUser();
        //verify(view,atMost(7)).validUser();
        //verify(view,only()).validUser();   //
    }

    @Mock
    List<String> mockList = new ArrayList<>();

    @Spy
    List<String> spyList = new ArrayList<>();

    @Test
    public void spyTest() throws Exception{
        spyList.add("one");
        spyList.add("two");
        verify(spyList).add("one");
        verify(spyList).add("two");
        Assert.assertEquals(2,spyList.size());
    }

    @Test
    public void mockTest() throws Exception{
        mockList.add("one");
        mockList.add("two");
        verify(mockList).add("one");
        verify(mockList).add("two");
        Assert.assertEquals(2,mockList.size());
    }

}