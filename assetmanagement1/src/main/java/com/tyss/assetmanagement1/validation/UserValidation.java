package com.tyss.assetmanagement1.validation;

import com.tyss.assetmanagement1.beans.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserValidation {
	Pattern pattern;
	Matcher matcher;

	public boolean validUserName(String userName) {

		pattern = Pattern.compile("[a-zA-Z]");
		matcher = pattern.matcher(userName);

		if (matcher.find()) {
			return true;
		} else {
			return false;
		}
	}

	public boolean validPassword(String password) {
		pattern = Pattern.compile("^[a-zA-Z0-9]{5,20}");
		matcher = pattern.matcher(password);

		if (matcher.find()) {
			return true;
		} else {
			return false;

		}
	}
}
