package car_dealerShip;

public class Employee {

	public void handleCustomer(Customer cust, boolean finance , Vehicle veh ) {
		if( finance == true) {
			double loanAmount = veh.getPrice()-cust.getCashOnHand();
			runCreditHistory(cust,loanAmount);
		}
		else if(veh.getPrice()<=cust.getCashOnHand()){
			processTransaction(cust,veh);
		}
		else {
			System.out.println("customer can not purchase the vehicle" + veh.toString());
		}
	}
	
	public void runCreditHistory(Customer cust, double loanAmount) {
		System.out.println("credit card ran...\n Customer approved to purchase the vehicle");
	}

	public void processTransaction(Customer cust, Vehicle veh ) {
		System.out.println("customer has purchased the vehicle: "+ veh.toString() + " for the price "+ veh.getPrice());

	}
}
