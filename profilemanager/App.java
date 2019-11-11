
package se.almstudio.profilemanager;

import java.util.Scanner;

import se.almstudio.profilemanager.entity.Profile;
import se.almstudio.profilemanager.service.FileProfileService;
import se.almstudio.profilemanager.service.ProfileStoreService;
public class App {
  
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter username");
    // Read user input
    String userName = scanner.nextLine(); 
    System.out.println("Enter family");
    // Read user input
    String family = scanner.nextLine(); 
    System.out.println("Enter Telephone");
    // Read user input
    String telephone = scanner.nextLine();
    // Output user input 
    Profile profile = new Profile();
    profile.setName(userName);
    profile.setFamily(family);
    profile.setTelephone(telephone);
    ProfileStoreService profileStoreService = new FileProfileService();
    profileStoreService.store(profile);
  }
}
