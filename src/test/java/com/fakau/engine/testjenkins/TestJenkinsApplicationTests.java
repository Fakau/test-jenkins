package com.fakau.engine.testjenkins;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class TestJenkinsApplicationTests {

	@Test
	void contextLoads() {

	}

	@Test
	public void testYeahGreaterThan_1999(){
		Integer year = 2002;
		assertThat(year).isNotNull();
		assertThat(year).isGreaterThan(1999);
	}

	@Test
	public void testYeahIsOdd(){
		Integer year = 1997;
		assertThat(year).isNotNull();
		assertThat(year).isOdd();
	}

	@Test
	public void testYeahIsEven(){
		Integer year = 1998;
		assertThat(year).isNotNull();
		assertThat(year).isEven();
	}

}
