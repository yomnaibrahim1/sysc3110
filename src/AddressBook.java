import java.util.ArrayList;

public class AddressBook {
    private ArrayList<BuddyInfo> myBuddies;
    public AddressBook() {
        myBuddies = new ArrayList<BuddyInfo>();
    }
    public static void main(String[] args) {
        BuddyInfo buddy = new BuddyInfo("Tom", "Carleton","613");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(buddy);
    }
    public boolean addBuddy(BuddyInfo buddytoAdd){
        return myBuddies.add(buddytoAdd);
    }

    public boolean removeBuddy(BuddyInfo buddyToRemove){
        return myBuddies.remove(buddyToRemove); //already checks if buddy is in myBuddies

    }


}
