package com.managedbeans;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

import com.entities.Product;
import com.entities.User;

@ManagedBean
public class Delegated {

	public Delegated() {
		
	}
	
	public List<Product> listProducts(){
		List<Product> products = Product.getProducts();
		return products;
	}
	
	public List<User> listUsers(){
		List<User> users = User.getUsers();
		return users;
	}
}
