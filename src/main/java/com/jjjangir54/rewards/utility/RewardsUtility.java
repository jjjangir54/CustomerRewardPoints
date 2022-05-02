package com.jjjangir54.rewards.utility;

import java.math.BigDecimal;
import java.math.RoundingMode;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class RewardsUtility {
	  static Logger logger = LoggerFactory.getLogger(RewardsUtility.class);

	    public static Double calculateRewardAmountPerTrans(Double transactionAmount) {
	    	
	        Double rewardPoints = 0.0;
	        if (transactionAmount > 100) {
	        	rewardPoints = (2 * (transactionAmount - 100) + 50);
	        } else if(transactionAmount > 50){
	        	rewardPoints = transactionAmount - 50;
	        }
	        logger.debug("Customer Reward Amount:::" + rewardPoints);
	        
	        return BigDecimal.valueOf(rewardPoints).setScale(2, RoundingMode.HALF_UP).doubleValue();
	    }
}