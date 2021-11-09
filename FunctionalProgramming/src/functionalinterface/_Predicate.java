package functionalinterface;

import java.util.function.Predicate;

public class _Predicate {

	public static void main(String[] args) {
		
		String validNumber = "07000003000";
		String invalidNumber = "05003003309";
		
		// without Predicate
		System.out.println(isPhoneNumberValid(validNumber));
		System.out.println(isPhoneNumberValid(invalidNumber));
		
		
		// with Predicate
		System.out.println(isPhoneNumberValidPredicate.test(validNumber));
		System.out.println(isPhoneNumberValidPredicate.test(invalidNumber));
		
		System.out.println(isPhoneNumberValidPredicate.and(containsNumber3).test(validNumber));
		System.out.println(isPhoneNumberValidPredicate.or(containsNumber3).test(invalidNumber));
	}
		
	
	
	static boolean isPhoneNumberValid(String phoneNumber) {
		return phoneNumber.startsWith("07") && phoneNumber.length() == 11;
	}
	
	static Predicate<String> isPhoneNumberValidPredicate = phoneNumber -> phoneNumber.startsWith("07") && phoneNumber.length() == 11;
	
	static Predicate<String> containsNumber3 = phoneNumber -> phoneNumber.contains("3");
	
}
