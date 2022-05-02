package com.jjjangir54.rewards.utility;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;
import java.math.RoundingMode;

import org.junit.jupiter.api.Test;

public class RewardUtilityTest {
	
	 // For amount = 0
    @Test
    void testCalculateRewardsforAmountZero() {
    	Double testValue = 0D;
        Double expected = BigDecimal.valueOf(0).setScale(2, RoundingMode.HALF_UP).doubleValue();;
        Double result = RewardsUtility.calculateRewardAmountPerTrans(Double.valueOf(testValue));

        assertEquals(expected, result);
    }
    
	 // For amount = 1
    @Test
    void testCalculateRewardsforAmountOne() {
    	Double testValue = 1D;
        Double expected = BigDecimal.valueOf(0).setScale(2, RoundingMode.HALF_UP).doubleValue();;
        Double result = RewardsUtility.calculateRewardAmountPerTrans(Double.valueOf(testValue));

        assertEquals(expected, result);
    }
    
	// For amount =< 50
    @Test
    void testCalculateRewardsforAmountUpToFifty() {
        Double testValue = 30.30D;
        Double expected = BigDecimal.valueOf(0).setScale(2, RoundingMode.HALF_UP).doubleValue();;
        Double result = RewardsUtility.calculateRewardAmountPerTrans(Double.valueOf(testValue));

        assertEquals(expected, result);
    }    
	
	// For ( amount > 50 ) &  ( amount < 100 )
	@Test
	void testCalculateRewardsforAmountJustAboveFifty() {
		Double testValue = 50.03D;
		Double expectedInputValue = 0.03D;
        Double expected = BigDecimal.valueOf(expectedInputValue).setScale(2, RoundingMode.HALF_UP).doubleValue();;
        Double result = RewardsUtility.calculateRewardAmountPerTrans(Double.valueOf(testValue));

        assertEquals(expected, result);
	}
	
	// For ( amount > 50 ) &  ( amount < 100 )
	@Test
	void testCalculateRewardsforAmountAboveFiftyBelowHundred() {
		Double testValue = 68.40D;
		Double expectedInputValue = 18.40D;
        Double expected = BigDecimal.valueOf(expectedInputValue).setScale(2, RoundingMode.HALF_UP).doubleValue();;
        Double result = RewardsUtility.calculateRewardAmountPerTrans(Double.valueOf(testValue));

        assertEquals(expected, result);
	}
	
	// For amount = 100 
	@Test
	void testCalculateRewardsforHundred() {
		Double testValue = 100D;
		Double expectedInputValue = 50D;
        Double expected = BigDecimal.valueOf(expectedInputValue).setScale(2, RoundingMode.HALF_UP).doubleValue();;
        Double result = RewardsUtility.calculateRewardAmountPerTrans(Double.valueOf(testValue));

        assertEquals(expected, result);
	}
	
	// For amount > 100 
	@Test
	void testCalculateRewardsforAmountAboveHundred() {
		Double testValue = 116.60D;
		Double expectedInputValue = 83.20D;
        Double expected = BigDecimal.valueOf(expectedInputValue).setScale(2, RoundingMode.HALF_UP).doubleValue();;
        Double result = RewardsUtility.calculateRewardAmountPerTrans(Double.valueOf(testValue));

        assertEquals(expected, result);		
	}
	
	//For customer who have not done any transaction in last 3 months
	@Test
	void testCalculateRewardsforPastDate() {
		Double testValue = 0D;
        Double expected = BigDecimal.valueOf(0).setScale(2, RoundingMode.HALF_UP).doubleValue();;
        Double result = RewardsUtility.calculateRewardAmountPerTrans(Double.valueOf(testValue));

        assertEquals(expected, result);		
	}
	
	
	// For multiple Transactions
	@Test
	void testCalculateRewardsforMultipleTransactions() {
		Double testValue1 = 59.20D;
		Double testValue2 = 47.80D;
		Double testValue3 = 121.60D;
		Double expectedInputValue = 102.40D;
        Double expected = BigDecimal.valueOf(expectedInputValue).setScale(2, RoundingMode.HALF_UP).doubleValue();;
        Double result1 = RewardsUtility.calculateRewardAmountPerTrans(Double.valueOf(testValue1));
        Double result2 = RewardsUtility.calculateRewardAmountPerTrans(Double.valueOf(testValue2));
        Double result3 = RewardsUtility.calculateRewardAmountPerTrans(Double.valueOf(testValue3));
        Double finalResult = result1 + result2 + result3;
       
        assertEquals(expected, finalResult);			
	}
	
	// For amount value that have space either in beginning or at end or at both place
	@Test
	void testCalculateRewardsforAmountwithExtraSpace() {
		String testValue1 = "  65.20";
		String testValue2 = "43.20 ";
		String testValue3 = "  117.60   ";
		Double expectedInputValue = 100.40D;
        Double expected = BigDecimal.valueOf(expectedInputValue).setScale(2, RoundingMode.HALF_UP).doubleValue();;
        Double result1 = RewardsUtility.calculateRewardAmountPerTrans(Double.parseDouble(testValue1.trim()));
        Double result2 = RewardsUtility.calculateRewardAmountPerTrans(Double.parseDouble(testValue2.trim()));
        Double result3 = RewardsUtility.calculateRewardAmountPerTrans(Double.parseDouble(testValue3.trim()));
        Double finalResult = result1 + result2 + result3;
       
        assertEquals(expected, finalResult);		
	}

}
