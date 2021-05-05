package interfaceAbstractDemo.Abstract;

import interfaceAbstractDemo.Concrete.Entities.Customer;

public abstract class BaseCustomerManager implements ICustomerService {
	
	public void save(Customer customer) {
		System.out.println("Saved Db " + customer.getFirstName());
		
	}

}
