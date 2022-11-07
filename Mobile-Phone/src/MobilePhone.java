import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<>();
    }

    public boolean addNewContact(Contact contact){
        for (Contact myContact : this.myContacts) {
            if (myContact.getName().equals(contact.getName()) && myContact.getPhoneNumber().equals(contact.getPhoneNumber())) {
                System.out.println("Contact already exists!");
                return false;
            }
        }

        this.myContacts.add(contact);
        System.out.println("Contact with name " + contact.getName() + " and number " + contact.getPhoneNumber() + " was added!");
        return true;
    }

    public boolean updateContact(Contact contact1, Contact contact2) {
        for (Contact myContact : this.myContacts) {
            if (myContact.getName().equals(contact1.getName()) && myContact.getPhoneNumber().equals(contact1.getPhoneNumber())) {
                this.myContacts.remove(contact1);
                this.myContacts.add(contact2);
                System.out.println("Contact with name " + contact1.getName() + " and number " + contact1.getPhoneNumber() + " was update!");
                System.out.println("New contact is " + contact2.getName() + " -> " + contact2.getPhoneNumber());
                return true;
            }
        }
        System.out.println("Contact not found!");
        return false;
    }

    public boolean removeContact(Contact contact){
        for (Contact myContact : this.myContacts){
            if(myContact.getName().equals(contact.getName()) && myContact.getPhoneNumber().equals(contact.getPhoneNumber())){
                this.myContacts.remove(contact);
                System.out.println("Contact with name " + contact.getName() + " and number " + contact.getPhoneNumber() + " was removed!");
                return true;
            }
        }
        System.out.println("Contact not found!");
        return false;
    }

    public int findContact(Contact contact){
        for(int i=0; i<this.myContacts.size(); i++){
            if(this.myContacts.get(i).equals(contact)){
                return i;
            }
        }
        System.out.println("Contact not found!");
        return -1;
    }

    public int findContact(String name){
        for(int i=0; i<this.myContacts.size(); i++){
            if(this.myContacts.get(i).getName().equals(name)){
                return i;
            }
        }
        System.out.println("Contact not found!");
        return -1;
    }

    public Contact queryContact(String name){
        for (Contact myContact : this.myContacts) {
            if (myContact.getName().equals(name)) {
                return myContact;
            }
        }
        return null;
    }

    public void printContacts(){
        System.out.println("Contact List:");
        int pos = 1;
        for(int i=0; i< this.myContacts.size(); i++){
            System.out.println(pos +". " + myContacts.get(i).getName() + " -> " + myContacts.get(i).getPhoneNumber());
            pos++;
        }
    }
}
