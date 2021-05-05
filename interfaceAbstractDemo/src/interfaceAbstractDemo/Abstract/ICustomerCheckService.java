package interfaceAbstractDemo.Abstract;

import java.net.MalformedURLException;

import interfaceAbstractDemo.Concrete.Entities.Customer;

public interface ICustomerCheckService {
	boolean CheckIfRealPerson(Customer customer);

	boolean Verify(Customer customer) throws MalformedURLException;
}


