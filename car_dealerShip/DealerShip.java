package car_dealerShip;

public class DealerShip {
	
	public static void main(String[] args) {
	Customer cust1 = new Customer("Elaheh","700 cuyahoga ct",5000);
	Vehicle veh= new Vehicle("hunda", 3000, "blue");
	Employee Emp= new Employee();
    System.out.println(cust1.toString());
    System.out.println(veh.toString());

	cust1.purchase(veh, Emp, false);
	
	Vehicle car = new Vehicle("hunda", 3000, "blue");
	boolean Value = car.equals(veh);
	System.out.println(Value);
	}
}