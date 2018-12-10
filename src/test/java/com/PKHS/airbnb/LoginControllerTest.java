package com.PKHS.airbnb;


import com.PKHS.airbnb.controller.LoginController;
import com.PKHS.airbnb.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.bind.annotation.GetMapping;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LoginControllerTest {
    @Autowired
    private LoginController loginController;

    @Test
    public void contextLoads() throws Exception {
        assertThat(loginController).isNotNull();
    }

}
