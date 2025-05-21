public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        SayHello();
    }
    public void SayHello(String FirstName, String LastName)
    {
        System.out.println("Hello There");
        System.out.println(FirstName);
        System.out.println(LastName);
    }

    public void SayGoodbye(String FirstName, String LastName)
    {
	// This prints to the standard output     
        System.out.println("Say Goodbye);
        System.out.println(FirstName);
        System.out.println(LastName);
    }
}
