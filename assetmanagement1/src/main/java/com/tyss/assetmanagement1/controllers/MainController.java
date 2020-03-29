package com.tyss.assetmanagement1.controllers;

import java.util.Scanner;
import com.tyss.assetmanagement1.beans.UserDetails;
import com.tyss.assetmanagement1.service.Service;
import com.tyss.assetmanagement1.util.exceptions.InvalidPasswordException;
import com.tyss.assetmanagement1.util.factory.Factory;

import lombok.extern.java.Log;
@Log
public class MainController {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Service service = Factory.getService();
		
		do {
			try {
				
				// To get user name and password for login
				log.info("Enter your login details");
				log.info("Enter your User Name: ");
				String userName = scanner.nextLine();
				boolean isValidName = service.validName(userName);
				log.info("Enter your password: ");
				String password = scanner.nextLine();
				boolean isValidPass = service.validPassword(password);
				
				if(isValidName&&isValidPass) {
				// searching for the user
				UserDetails user = service.getUser(userName, password);
				
				// logging in with respective controller...
				if (user != null) {
					switch (user.getUserType()) {
					case "Admin":
						AdminController.controller(user, service, scanner);
						break;
					case "Manager":
						ManagerController.controller(user, service, scanner);
						break;
					case "Employee":
						log.info("Employee cannot login");
						break;
					default:
						log.info("This will be avoided always...");
					}
				} else {
					log.info("Enter correct username and password");
				}
				} else {
					throw new InvalidPasswordException("Invalid format");
				}
			} catch (NumberFormatException e) {
				e.printStackTrace();
			} catch (InvalidPasswordException e) {
				e.printStackTrace();
			}
			log.info("\n\nEnter 'y' to login again: ");
		} while (scanner.nextLine().trim().equalsIgnoreCase("y"));
		scanner.close();
	}
}