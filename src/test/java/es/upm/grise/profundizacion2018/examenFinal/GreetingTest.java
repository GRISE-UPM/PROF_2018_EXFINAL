package es.upm.grise.profundizacion2018.examenFinal;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;

public class GreetingTest {
	MyCalendar calendar;// dependency
	Greeting greeting; //class to be tested
	String message = null;
	
	@Before 
	public void setup() { 
		calendar = mock(MyCalendar.class);
		greeting = new Greeting();
	}
	
	//chequea mensaje con idioma default
	@Test
	public void smokeTest1() {
		/*MyCalendar calendar = mock(MyCalendar.class);*/
		//Greeting greeting = new Greeting();
		when(calendar.getHourOfTheDay()).thenReturn(10);
		message = greeting.getGreeting(null,calendar);
		assertEquals("Good morning", message);
	}
	
	//chequea mensaje con idioma ingles
	@Test
	public void smokeTest2() {
		//Greeting greeting = new Greeting();
		when(calendar.getHourOfTheDay()).thenReturn(10);
		message = greeting.getGreeting(Language.ENGLISH,calendar);
		assertEquals("Good morning", message );
	}
	
	//chequea mensaje con idioma español
	@Test
	public void smokeTest3() {
		//Greeting greeting = new Greeting();
		when(calendar.getHourOfTheDay()).thenReturn(10);
		message = greeting.getGreeting(Language.SPANISH,calendar);		
		assertEquals("Buenos días", message);
	}

}
