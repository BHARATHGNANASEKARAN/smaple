package com.rautomates.cc.bp;

import java.math.BigDecimal;

import com.rautomates.cc.model.ConverterModel;
import com.rautomates.cc.model.ResponseModel;
import com.rautomates.cc.util.Currency;

public interface ConverterBP {
	
	public ResponseModel getConvertedValue(Currency source, Currency target, BigDecimal amount);
	public ConverterModel getConverterModel();

}
