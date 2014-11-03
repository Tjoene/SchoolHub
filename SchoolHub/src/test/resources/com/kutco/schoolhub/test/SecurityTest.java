package com.kutco.schoolhub.test;

import static org.junit.Assert.assertTrue;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpSession;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.context.HttpSessionSecurityContextRepository;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.util.NestedServletException;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration({ "file:src/main/webapp/WEB-INF/spring/appServlet/security-context.xml",
        "file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml" })
public class SecurityTest {

    @Autowired
    WebApplicationContext wac;

    @Autowired
    MockHttpSession session;

    @Autowired
    MockHttpServletRequest request;

    private MockMvc mockMvc;
    private Authentication authentication;

    @Before
    public void setup() {
        this.mockMvc = MockMvcBuilders.webAppContextSetup(this.wac).build();
        this.authentication = new UsernamePasswordAuthenticationToken("tjoene", "password");

        SecurityContext securityContext = SecurityContextHolder.getContext();
        securityContext.setAuthentication(this.authentication);

        MockHttpSession session = new MockHttpSession();
        session.setAttribute(HttpSessionSecurityContextRepository.SPRING_SECURITY_CONTEXT_KEY, securityContext);
    }

    @Test
    public void allowedPage() throws Exception {
        mockMvc.perform(get("/auth").session(session)).andExpect(status().isOk());
    }

    @Test
    public void forbiddenPage() throws Exception {
        try {
            mockMvc.perform(get("/admin").session(session));
            assertTrue("This user should not be allowed on this page", false);

        } catch (NestedServletException e) {
            assertTrue("Everything is ok", true);
            // @TODO: check if the inner exception is AccessDenied! NestedServlet is a wrapper exception.
        } catch (Exception e) {
            assertTrue("An other error occured then what we expected: " + e.toString(), false);
        }
    }
}