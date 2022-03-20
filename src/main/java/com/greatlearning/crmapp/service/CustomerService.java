package com.greatlearning.crmapp.service;
import java.util.List;

import org.springframework.stereotype.Service;

import com.greatlearning.crmapp.entity.Customer;

@Service
public interface CustomerService {
	public List<Customer> findAll();

	public Customer findById(int theId);

	public void save(Customer thecustomer);

	public void deleteById(int theId);

}
