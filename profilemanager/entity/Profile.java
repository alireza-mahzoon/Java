package se.almstudio.profilemanager.entity;

public class Profile {
  private String name;
  private String family;
  private String telephone;    
  
  public String getName() {
    return name;
  }
  
  public void setName(String name) {
    this.name = name;
  } 
  
  public String getFamily() {
    return family;
  }
  
  public void setFamily(String family) {
    this.family = family;
  }
  
  public String getTelephone() {
    return telephone;
  }
  
  public void setTelephone(String telephone) {
    this.telephone = telephone;
  }

  @Override
  public String toString() {
    return "Profile [name=" + name + ", family=" + family + ", telephone=" + telephone + "]";
  } 
  
  
  
}