
package com.anushkrish.cms.services;

import com.anushkrish.cms.dao.CustomerDAO;
import com.anushkrish.cms.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

@Component
public class CustomerServices {

    @Autowired private CustomerDAO customerDAO;

    private List<Customer> CustomerList = new CopyOnWriteArrayList<>();

    public Customer addCustomer(Customer customer) {
        return customerDAO.save(customer);

    }

    public List<Customer> getCustomers() {
        return (List<Customer>) customerDAO.findAll();
    }


    public Customer getCustomer(int customerId) {
//
         return customerDAO.findById(customerId).get();
    }

    public Customer updateCustomer(int customerId, Customer customer) {
//
    customer.setCustomerId(customerId);
    return customerDAO.save(customer);

    }

    public void deleteCustomer(int customerId) {
//
        customerDAO.deleteById(customerId);
    }

}
