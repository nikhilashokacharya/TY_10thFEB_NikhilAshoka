package com.tyss.assetmanagement1.controllers;

import java.util.Scanner;

import com.tyss.assetmanagement1.beans.Assets;
import com.tyss.assetmanagement1.beans.RequestForm;
import com.tyss.assetmanagement1.beans.UserDetails;
import com.tyss.assetmanagement1.service.Service;
import com.tyss.assetmanagement1.util.exceptions.AssetNotFoundException;

import lombok.extern.java.Log;
@Log
public class ManagerController {

	public static void controller(UserDetails user, Service service, Scanner scanner) {
		log.info(""+user);
		boolean loggedIn = true;
		do {
			
			try {
				log.info("Enter\n1 to see employee details\n2 to display available assets"
					+ "\n3 to raise a new request\n4 to view requests status\n5 to add a new user"
					+ "\n6 to report destroyed assets\n7 to change password\nL to logout");

			switch (scanner.nextLine().trim()) {
			case "1":
				for (UserDetails userDetails : service.getUsers()) {
					if (userDetails.getUserType().equalsIgnoreCase("Employee"))
						log.info("ID=" + userDetails.getUserID() + " | Name=" 
								+ userDetails.getUserName());
				}
				break;
			case "2":
				for (Assets assets2 : service.getAssets()) {
					log.info("\nAssetID: " + assets2.getAssetID() + "Asset Name: " + assets2.getAssetName()
							+ "\nCost per Unit:" + assets2.getAssetCost());
				}
				break;
			case "3":
				for (Assets assets2 : service.getAssets()) {
					log.info("\nAssetID: " + assets2.getAssetID() + " | Asset Name: " + assets2.getAssetName()
							+ " | Cost per Unit:" + assets2.getAssetCost());
				}
				log.info("\nEnter the Employee's ID: ");
				Integer empID = Integer.parseInt(scanner.nextLine());
				log.info("Enter the asset ID: ");
				Integer assetID = Integer.parseInt(scanner.nextLine());
				log.info("Enter the quantity: ");
				Integer quantity = Integer.parseInt(scanner.nextLine());
				log.info("Enter additional notes --> \n");
				String addNotes = scanner.nextLine();

				Integer check = 0;
				try {
					check = service.addRequest(empID, user.getUserID(), assetID, quantity, addNotes);
				} catch (AssetNotFoundException e) {
					e.printStackTrace();
				}
				log.info("manager --> " + check);
				if (check.equals(0))
					log.info("Request Made!");
				else if (check.equals(1)) {
					log.info("Employee not available in the database");
					log.info("Enter 'y' to insert into database: ");
					if (scanner.nextLine().equalsIgnoreCase("y")) {
						log.info("Enter the Employee's Name: ");
						String empName = scanner.nextLine();
						log.info("Enter the Employee's ID: ");
						String employeeID = scanner.nextLine();
						service.addUser(new UserDetails(empName, "qwerty", "Employee", employeeID));
					}
				} else {
					log.info("Requests cannot be made for managers/admin");
				}
				break;
			case "4":
				for (RequestForm requestForm : service.getRequests()) {
					if (requestForm.getManagerID().equals(user.getUserID()))
						log.info(""+requestForm);
				}
				break;
			case "5":
				log.info("Enter the Username:");
				String userName = scanner.nextLine();
				log.info("Enter the Employee ID");
				String employeeID = scanner.nextLine();
				service.addUser(new UserDetails(userName, "qwerty", "Employee", employeeID));
				break;
			case "6":
				log.info("\nEnter the Employee's ID of Owner of the asset: ");
				Integer empID1 = Integer.parseInt(scanner.nextLine());
				log.info("Enter the asset ID: ");
				Integer assetID1 = Integer.parseInt(scanner.nextLine());
				log.info("Enter the quantity: ");
				Integer quantity1 = Integer.parseInt(scanner.nextLine());
				Integer check1 = 0;
				try {
					check1 = service.addRequest(empID1, user.getUserID(), assetID1, quantity1*-1, 
							"DESTROYED ASSETS - Please allot to remove");
				} catch (AssetNotFoundException e) {
					e.printStackTrace();
				}
				if (check1.equals(0))
					log.info("Request Made!");
				else if (check1.equals(1)) {
					log.info("Invalid Employee ID!!");
				} else {
					log.info("Requests cannot be made for managers/admin");
				}
				break;
			case "L":
			case "l":
				log.info("\nLogging Out..");
				loggedIn = false;
				break;
			default:
				log.info("Please enter a valid option");
			}
			} catch (NumberFormatException e) {
				e.printStackTrace();
			}
			
		} while (loggedIn);

	}

}