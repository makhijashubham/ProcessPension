package com.cognizant.processpension.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

class ProcessPensionResponseTest {

	@Autowired 
	ProcessPensionResponse response;

	@Test
	void testSetterAndGetter() {
		final Integer code = Integer.valueOf(10);
		response = new ProcessPensionResponse();
		response.setProcessPensionStatusCode(code);
		assertEquals(10,response.getProcessPensionStatusCode());
	}

	@Test
	void testProcessPensionResponse() {
		response = new ProcessPensionResponse();
		assertNotNull(response);
	}

}
