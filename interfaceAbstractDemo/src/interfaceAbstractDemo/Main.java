package interfaceAbstractDemo;

import java.time.LocalDate;

import interfaceAbstractDemo.Abstract.BaseCustomerManager;
import interfaceAbstractDemo.Concrete.NeroCustomerManager;
import interfaceAbstractDemo.Concrete.Entities.Customer;

public class Main {

	public static void main(String[] args) {
		BaseCustomerManager customerManager = new NeroCustomerManager();
		customerManager.save(new Customer());
		
		Customer customer = new Customer(1,"ilknur","srck",LocalDate.of(1998, 9, 1),"12345678");
		
		
		

	}
}
