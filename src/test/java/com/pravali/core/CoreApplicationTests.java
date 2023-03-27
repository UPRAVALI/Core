package com.pravali.core;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.pravali.core.service.PaymentService;
import com.pravali.core.service.PaymentServiceImpl;

import static org.junit.Assert.*;


@RunWith(SpringRunner.class)
@SpringBootTest
class CoreApplicationTests {
	
	@Autowired
   PaymentServiceImpl paymentService;

	@Test
	public void testDependencyInjection() {
		assertNotNull(paymentService.getPaymentDao());
	}

}
