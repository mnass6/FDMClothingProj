package testData;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DataFile
{
	//Home Page Not Logged In
    	public static String websiteURL = "http://automationpractice.com/index.php";

	//Headings
	public static String forgotPasswordHeading = "FORGOT YOUR PASSWORD?";
	public static String authenticationHeading = "AUTHENTICATION";
	public static String tShirtHeading = "T-SHIRTS ";
	public static String tShirtPopUpHeading = "Product successfully added to your shopping cart";
	public static String dressesHeading = "DRESSES ";
	public static String shoppingCartSummaryHeading = "SHOPPING-CART SUMMARY";
	public static String addressesHeading = "ADDRESSES";
	public static String shippingHeading = "SHIPPING";
	public static String paymentHeading = "PLEASE CHOOSE YOUR PAYMENT METHOD";
	public static String orderSummaryHeading = "ORDER SUMMARY";
	public static String orderConfirmationHeading = "ORDER CONFIRMATION";
	public static String orderHistoryHeading = "ORDER HISTORY";
	public static String closePopUp = "Close";
		
	static LocalDate localDate = LocalDate.now().minusDays(1);
    	static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    	public static String formattedDate = localDate.format(formatter); 

	//Authentication Page
    	public static String authenticationURL = "http://automationpractice.com/index.php?controller=authentication";
   	public static String authenticationPageHeading = "AUTHENTICATION";

   	public static String registeredEmail = "aroguetrader"+giveRandomNumberPrefix()+"@nowhere.com";
    	public static String registeredPassword = "Scam99";
  
    	//Registration Page
    	public static String registrationPageHeading = "CREATE AN ACCOUNT";   
   	public static String title = "Mr";  
    	public static String email = "aroguetrader"+giveRandomNumberPrefix()+"@nowhere.com";
    	public static String password = "Scam99"; 
	public static String firstName = "Rogue";
	public static String lastName = "Trader";
	public static String address = "The Drive";
	public static String city = "Godalming";
	public static String country = "United States";
	public static String state = "Vermont";
	public static String postalCode = "12345";
	public static String mobileNumber = "456";

	//Logged In Home Page
	public static String loggedInHomePageHeading = "MY ACCOUNT";
	public static String customerAccount = firstName + " " + lastName;

	//Forgot Password Page
	public static String forgotPasswordPageHeading = "FORGOT YOUR PASSWORD?";
	public static String confirmationMessage = "A confirmation email has been sent to your address: " + registeredEmail; 

	//Items and Checkout
	public static String tShirtPageHeading = "T-SHIRTS ";	
	public static String dressesPageHeading = "DRESSES ";
	public static String itemConfirmation = "Product successfully added to your shopping cart";
	public static String addressHeading = "ADDRESSES";
	public static String summaryHeading = "ORDER SUMMARY";
	public static String orderConfirmation = "ORDER CONFIRMATION";
	public static String orderHistory = "ORDER HISTORY";
	public static String totalPrice = "$44.51";
	
	private static String giveRandomNumberPrefix(){
	    int random_int = (int)Math.floor(Math.random()*(1000000-1+1)+1);
	    return Integer.toString(random_int);
	}
	
	//Order History
	public static String paymentMethod1 = "Bank wire";
	public static String paymentMethod2 = "Payment by check";
}

