package com.abhishek;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.ui.Model;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class StartApplicationTest {

    @Test
    void testIndexMethod() {
        StartApplication app = new StartApplication();
        Model model = mock(Model.class);

        String viewName = app.index(model);

        assertEquals("index", viewName);
        verify(model).addAttribute("title", "I have successfuly built a spring boot application using Maven");
        verify(model).addAttribute("msg", "Welcome to the demo of ci and cd");
    }
}
