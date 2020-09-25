package controller;

import java.sql.SQLException;

import dao.CrudDAO;
import dao.CrudDaoInterface;
import model.User;

public class Main {

	public static void main(String args[]) throws SQLException, ClassNotFoundException {

		User user = new User();
		user.setName("Trideep");
		user.setEmail("Trideep@gmail.com");
         user.setDesignation("anything");
        user.setPassword("trideep1234");
		
		CrudDaoInterface crudOperations = new CrudDAO();
		crudOperations.insert(user);
		crudOperations.getData();
		
		
	}
}