public class Main {

    public static void main(String[] args) {

        /* static = makes a variable or method belong to the class
         *           rather than to any specific object.
         *           Commonly used for utility methods or shared resources.
         *
         *  Static means that the class owns the "static" function/variable.
         *      It allows anything inside the class to use it, and not create a new one.
         *      Meaning, when a static variable first declared, it is owned by the class.
         *      If a new object of the class is created, it does not create that variable
         *      again, but rather uses it throughout the program however it has changed
         *      besides by itself.
        */

        Friend friend1 = new Friend("Bobert");
        Friend friend2 = new Friend("Gumball");
        Friend friend3 = new Friend("Darwin");
        Friend friend4 = new Friend("Tobias");


        System.out.println(Friend.numOfFriends);
        Friend.showFriends(); 

    }

}
