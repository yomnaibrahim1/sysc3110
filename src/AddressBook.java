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
        addressBook.removeBuddy(0);
        addressBook.addBuddy(buddy);
        System.out.print("This statement is written in Git");
    }
    public void addBuddy(BuddyInfo buddytoAdd){
        if (buddytoAdd!= null){
           myBuddies.add(buddytoAdd);
        }

    }

    public BuddyInfo removeBuddy(int index) {
        if (index >= 0 && index < myBuddies.size()) {
            return myBuddies.remove(index);
        }
        return null;

    }

}
