package com.tyss.assetmanagement1.controllers;

import java.util.Scanner;

import com.tyss.assetmanagement1.beans.Assets;
import com.tyss.assetmanagement1.beans.RequestForm;
import com.tyss.assetmanagement1.beans.UserDetails;
import com.tyss.assetmanagement1.service.Service;
import com.tyss.assetmanagement1.util.exceptions.AssetNotFoundException;
import com.tyss.assetmanagement1.util.exceptions.InvalidPasswordException;
import com.tyss.assetmanagement1.util.exceptions.QuantityNotAvailableException;
import com.tyss.assetmanagement1.util.exceptions.RequestNotFoundException;

import lombok.extern.java.Log;

@Log
public class AdminController {

	public static void controller(UserDetails user, Service service, Scanner scanner) {

		log.info(""+user);
		Boolean loggedIn = true;
		do {
			try {
				log.info(
						"Enter\n1 to display all assets\n2 to view pending requests\n3 to view an asset's details completely"
								+ "\n4 to create a new user\n5 to add/update an asset\n6 to view approved requests"
								+ "\n7 to change password\nL to LOGOUT");

				switch (scanner.nextLine()) {
				case "1":
					for (Assets assets2 : service.getAssets()) {
						log.info(
								"\n" + assets2.getAssetID() + " - " + assets2.getAssetName() + ", Cost per Unit:"
										+ assets2.getAssetCost() + ", Alloted Units:" + assets2.getAllotedM());
					}
					break;
				case "2":
					for (RequestForm requestForm : service.getRequests()) {
						if (!requestForm.isAlloted())
							log.info(""+requestForm);
					}
					log.info("Enter the Form ID to allocate : ");
					try {
						if (service.allot(Integer.parseInt(scanner.nextLine())))
							log.info("Asset alloted successfully!");
						else
							log.info("Already alloted");
					} catch (NumberFormatException | QuantityNotAvailableException e) {
						log.info(e.getMessage());
					} catch (RequestNotFoundException e) {
						log.info(e.getMessage());
					} catch (AssetNotFoundException e) {
						// TODO Auto-generated catch block
						log.info(e.getMessage());
					}
					break;
				case "3":
					log.info("Enter the asset ID: ");
					Assets asset = service.getAsset(Integer.parseInt(scanner.nextLine()));
					log.info("\n" + asset.getAssetID() + " - " + asset.getAssetName() + ", Cost per Unit:"
							+ asset.getAssetCost() + ", TotalUnits: " + asset.getAssetQuantity() + ", Alloted Units: "
							+ asset.getAllotedM());
					log.info("Manager ID : Alloted Quantity");
					log.info(""+asset.getManagers());
					log.info(""+asset.getEmployees());
					break;
				case "4":
					log.info("Enter the Username:");
					String userName = scanner.nextLine();
					log.info("Enter the Employee ID");
					String employeeID = scanner.nextLine();
					service.addUser(new UserDetails(userName, "qwerty", "Manager", employeeID));
					break;
				case "5":
					log.info("Enter asset ID to update(0 to add new asset): ");
					Integer assetID = Integer.parseInt(scanner.nextLine());
					if (assetID == 0) {
						log.info("Enter Asset's Name: ");
						String assetName = scanner.nextLine();
						log.info("Enter Cost per Unit: ");
						Double price = Double.parseDouble(scanner.nextLine());
						log.info("Enter Number of available units: ");
						Integer quantity = Integer.parseInt(scanner.nextLine());
						service.addAsset(new Assets(assetName, quantity, price));
						log.info("Asset Added!");
					} else {
						log.info("Enter the quantity to be added: ");
						try {
							service.updateAsset(assetID, Integer.parseInt(scanner.nextLine()));
						} catch (NumberFormatException e) {
							e.printStackTrace();
						} catch (AssetNotFoundException e) {
							e.printStackTrace();
						}
					}
					break;
				case "6":
					for (RequestForm requestForm : service.getRequests()) {
						if (requestForm.isAlloted())
							log.info(""+requestForm);
					}
					break;
				case "7":
//				log.info("Enter your password again: ");
//				String password = scanner.nextLine();
//				try {
//					service.changePassword(user, password);
//				} catch (InvalidPasswordException e) {
//					e.printStackTrace();
//				}
					log.info("Feature coming soon");
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