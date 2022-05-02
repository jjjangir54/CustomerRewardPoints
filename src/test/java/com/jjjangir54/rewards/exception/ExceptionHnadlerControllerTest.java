package com.jjjangir54.rewards.exception;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.jjjangir54.rewards.service.CustomerRewardsService;

public class ExceptionHnadlerControllerTest {
	
	@Autowired
	CustomerRewardsService customerRewardsService;
	
	@Test
    public void throwsNumberFormatExceptionForBadInput() {
		assertThrows(NumberFormatException.class, ()
				->customerRewardsService.calculateRewardsById(Integer.parseInt("aa")));
	}
	
	@Test
	public void throwsNullPointerExceptionForOutOfRangeInputID() {
		assertThrows(NullPointerException.class, ()
				->customerRewardsService.calculateRewardsById(23));
	}
}
