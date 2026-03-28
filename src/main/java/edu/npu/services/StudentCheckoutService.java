package edu.npu.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import edu.npu.dao.NationalTuitionCalculatorService;
import edu.npu.dao.OhioStateTuitionCalculatorService;
import edu.npu.dao.PapalPaymentService;
import edu.npu.dao.WellsfargoPaymentService;
import edu.npu.domain.Student;

@Service("studentCheckoutService")
public class StudentCheckoutService {
	@Autowired
	@Qualifier("national")
	private NationalTuitionCalculatorService nationalTuitionCalculator;
	private OhioStateTuitionCalculatorService ohioStateTuitionCalculator;
	@Autowired
	@Qualifier("papal")
	private PapalPaymentService  papalPayment;
	private WellsfargoPaymentService wellsfargoPayment;
	        

public StudentCheckoutService() {
	System.out.println("Let's rock!");

}


public NationalTuitionCalculatorService getNationalTuitionCalculator() {
	return nationalTuitionCalculator;
}


public void setNationalTuitionCalculator(NationalTuitionCalculatorService nationalTuitionCalculator) {
	this.nationalTuitionCalculator = nationalTuitionCalculator;
}


public OhioStateTuitionCalculatorService getOhioStateTuitionCalculator() {
	return ohioStateTuitionCalculator;
}


public void setOhioStateTuitionCalculator(OhioStateTuitionCalculatorService ohioStateTuitionCalculator) {
	this.ohioStateTuitionCalculator = ohioStateTuitionCalculator;
}


public PapalPaymentService getPapalPayment() {
	return papalPayment;
}


public void setPapalPayment(PapalPaymentService papalPayment) {
	this.papalPayment = papalPayment;
}


public WellsfargoPaymentService getWellsfargoPayment() {
	return wellsfargoPayment;
}


public void setWellsfargoPayment(WellsfargoPaymentService wellsfargoPayment) {
	this.wellsfargoPayment = wellsfargoPayment;
}


public void checkoutStudentOfNational(Student stu, List courseList, long creditNum) {
	System.out.println("Calculating result: ");
	System.out.println(nationalTuitionCalculator.nationalTuitionCalculatorImpl(stu, courseList));
	
	
    if(String.valueOf(creditNum).length() == 9) {    	
	
	    papalPayment.papalPaymentService();
    }else {

    	wellsfargoPayment.wellsFargoPaymentService();
    	//System.out.println("come on");
	                     
    }
}

public void checkoutStudentOfOhio(Student stu, List courseList, long creditNumber) {
	System.out.println("Calculating result: ");
	System.out.println(ohioStateTuitionCalculator.ohioStateTuitionCalculatorImpl(stu, courseList));	
    if(String.valueOf(creditNumber).length() == 9) {
	
	    papalPayment.papalPaymentService();
    }else {
	    //wellsfargoPayment.wellsFargoPaymentService();
    	System.out.println("come on");
    }
}

//Do you see any change here?

}
