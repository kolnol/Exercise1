public class HelloUser {
    String userName;

    public HelloUser(String userName) {
        this.userName = userName;
    }

    public void greetUser() {
        System.out.println("Hello " + this.userName + " - How are you? :)");
    }
}
