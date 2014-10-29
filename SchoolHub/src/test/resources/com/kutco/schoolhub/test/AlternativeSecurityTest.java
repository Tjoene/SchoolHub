package com.kutco.schoolhub.test;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.redirectedUrl;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.web.FilterChainProxy;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.context.WebApplicationContext;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration({ "file:src/main/webapp/WEB-INF/spring/appServlet/security-context.xml",
        "file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml" })
public class AlternativeSecurityTest {
    @Autowired
    private WebApplicationContext wac; // Interface to provide configuration for a web application

    @Autowired
    private FilterChainProxy springSecurityFilter;

    private MockMvc mockMvc; // Main entry point for server-side Spring MVC test
    private final String securedPage = "/admin";
    private final String loginURL = "http://localhost/login";

    /**
     * This method will load the mock with out own framework application. On this will the mocked HTTP requests be
     * unleashed.
     * 
     * @throws Exception
     */
    @Before
    public void setUp() throws Exception {
        this.mockMvc = webAppContextSetup(wac)
        // Enable Spring Security
                .addFilters(springSecurityFilter).alwaysDo(print()).build(); // Print will dumb the HTTP request the
                                                                             // mockMVC gets from the test class
    }

    /**
     * When you go to a secured page and you are not logged in, you need be redirected to the login screen.
     * 
     * @TODO: shouldn't the link be http://localhost/schoolhub/login?? Or does the test framework omit the /schoolhub/
     *        part?
     * 
     * @throws Exception
     */
    @Test
    public void askLogin() throws Exception {
        this.mockMvc.perform(get(this.securedPage)).andExpect(redirectedUrl(this.loginURL));
    }
}