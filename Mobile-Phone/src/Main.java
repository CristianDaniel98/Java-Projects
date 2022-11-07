
public class Main {
    public static void main(String[] args) {
        Contact contact1 = new Contact("Bob", "31415926");
        Contact contact2 = new Contact("Alice", "16180339");
        Contact contact3 = new Contact("Tom", "11235813");
        Contact contact4 = new Contact("Jane", "2357113");

        MobilePhone mobilePhone = new MobilePhone("072312323");
        mobilePhone.addNewContact(contact1);
        mobilePhone.addNewContact(contact2);
        mobilePhone.addNewContact(contact3);
        mobilePhone.addNewContact(contact4);
        mobilePhone.printContacts();
        System.out.println("****************************************************");

        mobilePhone.addNewContact(new Contact("Dani", "123456"));
        mobilePhone.addNewContact(new Contact("Jane", "2357113"));
        mobilePhone.printContacts();
        System.out.println("****************************************************");

        mobilePhone.updateContact(contact1, new Contact("Bobita", "2421323"));
        mobilePhone.updateContact(new Contact("Mihai", "2421342"), new Contact("Bobita", "2421323"));
        mobilePhone.printContacts();
        System.out.println("****************************************************");

        mobilePhone.removeContact(contact2);
        mobilePhone.removeContact(new Contact("Ciorap", "342132111"));
        mobilePhone.printContacts();
        System.out.println("****************************************************");

        System.out.println("Contact position " + mobilePhone.findContact(contact3));
        System.out.println("****************************************************");
        System.out.println("Contact position " + mobilePhone.findContact(contact2));
        System.out.println("****************************************************");
        System.out.println("Contact position " + mobilePhone.findContact("Dani"));
        System.out.println("****************************************************");
        System.out.println("Contact position " + mobilePhone.findContact("Robocop"));
        System.out.println("****************************************************");

        Contact findContact1 = mobilePhone.queryContact("Bobita");
        System.out.println("Name: " + findContact1.getName());
        System.out.println("Phone number: " + findContact1.getPhoneNumber());
        System.out.println("****************************************************");
        Contact findContact2 = mobilePhone.queryContact("Georgiana");
        try {
            System.out.println("Name: " + findContact2.getName());
            System.out.println("Phone number: " + findContact2.getPhoneNumber());

        }catch (Exception e){
            System.out.println("Contact not found");
        }
    }
}