package com.sapient.shapes;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Triangle {
	private BigDecimal result;

	public BigDecimal calculateArea(int side) {
		result = new BigDecimal(0.433).multiply((new BigDecimal(side)).multiply(new BigDecimal(side)));
		result = result.setScale(3, RoundingMode.CEILING);
		return result;

	}
}