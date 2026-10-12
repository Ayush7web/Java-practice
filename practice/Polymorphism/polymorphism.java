package Polymorphism;

class LoginSystem {

  // Version 1: Login using Username and Password
  public void login(String username, String password) {
    System.out.println("Logging in " + username + " by verifying password database.");
  }

  // Version 2: Login using Phone Number (Triggers an SMS OTP)
  public void login(long phoneNumber) {
    System.out.println("Sending a 6-digit secure SMS OTP to " + phoneNumber);
  }

  // Version 3: Login using a Google OAuth Token
  public void login(String googleToken, boolean isGoogleAuth) {
    System.out.println("Authenticating instantly via Google secure token API.");
  }

  public static void main(String[] args) {
    LoginSystem portal = new LoginSystem();

    // The system chooses the correct logic entirely based on the input arguments
    portal.login("alex_99", "p@ssword123"); // Runs Version 1
    portal.login(9876543210L); // Runs Version 2
    portal.login("xyz123token", true); // Runs Version 3
  }
}
