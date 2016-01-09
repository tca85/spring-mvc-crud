package tca85.com.github.spring.mvc.crud;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.web.WebAppConfiguration;

import tca85.com.github.spring.mvc.crud.SpringMvcCrudApplication;

import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = SpringMvcCrudApplication.class)
@WebAppConfiguration
public class SpringMvcCrudApplicationTests {

	@Test
	public void contextLoads() {
	}

}
