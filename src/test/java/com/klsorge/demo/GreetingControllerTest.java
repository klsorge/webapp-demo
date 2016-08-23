package com.klsorge.demo;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import javax.servlet.http.HttpServletRequest;

import org.junit.Test;
import org.springframework.web.servlet.ModelAndView;

public class GreetingControllerTest {
	
	GreetingController controller = new GreetingController();
	HttpServletRequest mockRequest = mock(HttpServletRequest.class);
	
	@Test
	public void testHandleRequest() throws Exception {
		String name = "Kurt";
		when(mockRequest.getParameter("user")).thenReturn(name);
		ModelAndView view = controller.handleRequest(mockRequest, null);
		assertEquals("Hello, " + name + "!", view.getModel().get("greeting"));
	}
}
