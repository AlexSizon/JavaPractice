
package main;

public class Contacts {
   private  int contactId;
   private String contactFirstName;
   private String contactLastName;
   private  String contactAddress;
   
   public Contacts( ){};

    public int getContactId() {
        return contactId;
    }

    public void setContactId(int contactId) {
        this.contactId = contactId;
    }

    public String getContactFirstName() {
        return contactFirstName;
    }

    public void setContactFirstName(String contactFirstName) {
        this.contactFirstName = contactFirstName;
    }

    public String getContactLastName() {
        return contactLastName;
    }

    public void setContactLastName(String contactLastName) {
        this.contactLastName = contactLastName;
    }

    public String getContactAddress() {
        return contactAddress;
    }

    public void setContactAddress(String contactAddress) {
        this.contactAddress = contactAddress;
    }
   

   
   public Contacts(String firstName, String lastName, String address){
   
       contactFirstName = firstName;
       contactLastName =  lastName;
       contactAddress = address;
   }
    @Override
    public String toString() {
        return "Contacts{" + "contactId=" + contactId + ", contactFirstName=" + contactFirstName + ", contactLastName=" + contactLastName + ", contactAddress=" + contactAddress + '}';
    }
}
