package webservice.tests;

import org.junit.Before;
import org.junit.Test;
import webservice.WebServiceInt;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class WebService_Test {
    private WebServiceInt service;

    @Before
    public void setUp() {
        service = mock(WebServiceInt.class);
        when(service.getUserEmail(42)).thenReturn("answer@answer.com");
        when(service.getCurrentUrl()).thenReturn("my-site.com");
        when(service.isRegisteredUser("answer@answer.com")).thenReturn(true);
    }

    @Test
    public void user_email_test() {
        assertThat("answer@answer.com", equalTo(service.getUserEmail(42)));
    }
}
