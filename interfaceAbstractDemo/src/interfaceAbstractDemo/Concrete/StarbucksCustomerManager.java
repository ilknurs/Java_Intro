package interfaceAbstractDemo.Concrete;

import interfaceAbstractDemo.Abstract.BaseCustomerManager;
import interfaceAbstractDemo.Abstract.ICustomerCheckService;
import interfaceAbstractDemo.Concrete.Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {
	
	private ICustomerCheckService customerCheckService;
	
	public StarbucksCustomerManager(ICustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService; 
		
	}

	@Override
	public void save(Customer customer) {
		
		if (customerCheckService.CheckIfRealPerson(customer)) {
			super.save(customer);					
			
		}else {
			System.out.println("Not Valid Person");
		}
		
		
	}

	

}
