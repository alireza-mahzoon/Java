package se.almstudio.profilemanager.service;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import se.almstudio.profilemanager.entity.Profile;

public class FileProfileService extends ProfileStoreService {

  @Override
  public void store(Profile profile) {
    try {
      File file = File.createTempFile("profile_info", ".txt");
      FileOutputStream outputStream = new FileOutputStream(file);
      // "Alireza,Mahzoon,232343"
      String profileInfo = profile.getName() + "," + profile.getFamily() + "," + profile.getTelephone();
      outputStream.write(profileInfo.getBytes());
      outputStream.flush();
      outputStream.close();
      System.out.println("Persisted profile information to " + file.getAbsolutePath());
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
  
}
