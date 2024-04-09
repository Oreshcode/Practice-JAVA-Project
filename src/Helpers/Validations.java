package Helpers;

public class Validations {
    public static boolean isValidUsername(String username) {
        if (username.length() >= 8) {
            return true;
        }
        Popup.showErrorPopup("Username must be at least 8 characters");
        return false;
    }

    public static boolean isValidPassword(String password, String repeatPassword) {
        boolean isValid = true;
        String upperCaseChars = "(.*[A-Z].*)";
        String lowerCaseChars = "(.*[a-z].*)";
        String numbers = "(.*[0-9].*)";
        String specialChars = "(.*[@,#,$,%,!,^,&].*$)";

        if (password.length() < 8) {
            Popup.showErrorPopup("Password must be more than 8 characters in length.");
            isValid = false;
        } else if (!password.matches(upperCaseChars)) {
            Popup.showErrorPopup("Password must contain at least one uppercase character.");
            isValid = false;
        } else if (!password.matches(lowerCaseChars)) {
            Popup.showErrorPopup("Password must contain at least one lowercase character.");
            isValid = false;
        } else if (!password.matches(numbers)) {
            Popup.showErrorPopup("Password must contain at least one number.");
            isValid = false;
        } else if (!password.matches(specialChars)) {
            Popup.showErrorPopup("Password must contain at least one special character among @#$%^&");
            isValid = false;
        } else if (!password.equals(repeatPassword)) {
            Popup.showErrorPopup("Passwords must match.");
            isValid = false;
        }
        return isValid;
    }
}
