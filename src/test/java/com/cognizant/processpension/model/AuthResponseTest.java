package com.cognizant.processpension.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;


//@RunWith(SpringRunner.class)
@ExtendWith(MockitoExtension.class)
@SpringBootTest
class AuthResponseTest 
{
	AuthResponse authResponse=new AuthResponse();
	
	@Test
	void testAuthResponseConstructor()
	{
		AuthResponse response=new AuthResponse("abc", true);
		assertEquals("abc",response.getUid() );
	}
	
	@Test
	void testUid()
	{
		authResponse.setUid("abc");
		authResponse.setValid(true);
		assertEquals( "abc",authResponse.getUid());
	}  

	@Test
	void testIsValid()
	{
		authResponse.setValid(true);
		assertEquals(true, authResponse.isValid() );
	}
	
	@Test
	void testtoString() 
	{
        String s = authResponse.toString();
        assertEquals(authResponse.toString(), s);
    }
	
}
