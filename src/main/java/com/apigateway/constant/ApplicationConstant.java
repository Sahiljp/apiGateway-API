package com.apigateway.constant;

public class ApplicationConstant {
	

	// Common
	public static final String SOMETING_WENT_WRONG = "Someting went wrong !";
	public static final String URL = "http://localhost:8080";

	// login
	public static final String LOGIN_SUCCESS = "Login Success !";
	public static final String LOGIN_INVALID_CREDENTIALS = "Invalid Credentials !";
	public static final String LOGIN_NOT_VERIFIED = "Email is not verified !";

	// Registration
	public static final String REGISTRATION_SUCCESS = "Registration Success !";
	public static final String REGISTRATION_EMAIL_EXISTS = "Email already exists !";

	// Forgot Password
	public static final String FORGOT_PASSWORD_SUCCESS = "Reset password link sent successfully !";
	public static final String FORGOT_PASSWORD_EMAIL_NOT_EXISTS = "Email not registered !";

	// Reset Password
	public static final String RESET_PASSWORD_SUCCESS = "Reset Password Success !";
	public static final String OLD_PASSWORD_NOT_MATCHED = "Old password does not matched !";

	// Response Status Code
	public static final String STATUS_200 = "200";
	public static final String STATUS_400 = "400";
	public static final String ACCESS_TOKEN_EXPIERED = "ATE400";

	// Response Format
	public static final String RESPONSE_STATUS = "Status";
	public static final String RESPONSE_MESSAGE = "message";
	public static final String RESPONSE_DATA = "data";

	// User
	public static final String USER_SUCCESS = "User found !";
	public static final String USER_NOT_FOUND = "User not found !";
	public static final String USER_VERIFICATION_SUCCESS = "User verifed successfully !";
	public static final String USER_VERIFICATION_FAILURE = "User verification failed !";
	public static final String USER_EDIT_SUCCESS = "User edited successfully !";
	public static final String PASSWORD_EDIT_SUCCESS = "Password updated succssfully !";
	public static final String OLD_PASSWORD_DOES_NOT_MATCHED = "Old password does not matched";
	public static final String PROFILE_UPLOADED_SUCESSFULLY = "Profile picture uploaded successfully !";
	public static final String PROFILE_IMAGE_SUCESSFULLY = "Profile Image Found Sucessfully !";

	public static final String EMAILPRODUCTID = "-//Microsoft Corporation//Outlook 11.0 MIMEDIR//EN";
	
	//cloudinary 
	public static final String CLOUD_NAME = "dutedk9ms";
	public static final String API_KEY = "718519854136943";
	public static final String API_SECRET = "J_FIaPiFr9TmIQC4mdNXEnyM1IY";
	
	
}
