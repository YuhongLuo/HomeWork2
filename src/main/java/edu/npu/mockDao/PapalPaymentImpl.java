package edu.npu.mockDao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import edu.npu.dao.PapalPaymentService;

@Component("papal")
public class PapalPaymentImpl implements PapalPaymentService {

	public void papalPaymentService() {
		System.out.println("Using the PayPal credit card");
		return;
	}
}
