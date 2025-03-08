package com.ocp.correction.test;

import com.ocp.correction.model.DiwaliInterest;
import com.ocp.correction.model.FixedDeposit;
import com.ocp.correction.model.HoliInterest;
import com.ocp.correction.model.NewYearInterest;

public class FixedDepositMainCorrection {

	public static void main(String[] args) {
		FixedDeposit fd = new FixedDeposit(1234, "Bala", 1000, 9, new NewYearInterest());
		fd.calculateSimpleInterest();
		FixedDeposit fd2 = new FixedDeposit(1234, "Parth", 500, 7, new DiwaliInterest());
		fd2.calculateSimpleInterest();
		FixedDeposit fd3 = new FixedDeposit(1234, "Akshat", 4000, 3, new HoliInterest());
		fd3.calculateSimpleInterest();
	}

}
