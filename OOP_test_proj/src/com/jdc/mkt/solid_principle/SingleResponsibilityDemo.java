package com.jdc.mkt.solid_principle;

public class SingleResponsibilityDemo {

	public static void main(String[] args) {

		SalePromoter sp = new SalePromoter();
		sp.getDataFromCustomer(null);
		//sp.saveCustomerDataToDb();
		sp.checkCustomerDeailAndIviteCustomer();
	}

}

class SalePromoterDb {
	
	void saveCustomerDataToDb() {

	}
}

class SalePromoter {

	void getDataFromCustomer(String str) {

	}

	void checkCustomerDeailAndIviteCustomer() {

	}

}
