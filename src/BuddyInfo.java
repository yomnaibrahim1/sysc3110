public class BuddyInfo {

    private String name;
    private String address;
    private String number;

    public BuddyInfo() {
        this("Bob","123 Main St.", "613 123 4567");
    }
    public BuddyInfo(String name, String address, String number) {
        this.name = name;
        this.address = address;
        this.number = number;
    }
    public String getName() {
        return name;
    }

    public String getAddress(){return address;}

    public static void main(String[] args) {
        BuddyInfo myBuddy = new BuddyInfo("Todd", "124 Main St.", "123456789");

        System.out.print("Hello " + myBuddy.getName());
    }
}
