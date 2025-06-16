public class Friend {

    // static

    static int numOfFriends; // undeclared defaults to 0
    // static means shared

    String name;

    Friend(String name) {
        this.name = name;
        numOfFriends++;
    }

    static void showFriends() {
        // "this.numOfFriends" is not used like that because since it was declared as
        // a static variable, it cannot be referenced as "the one owned by the class" again.
        System.out.println("You have " + numOfFriends + " FRIENDS");
    }

}
