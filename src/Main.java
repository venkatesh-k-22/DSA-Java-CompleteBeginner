//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
// public is a access modifier, we can access this class anywhere and Main class name should always be public.
//class is a group of Methods and variables
public class Main {
    //public is explained above like this method can be accessed anywhere
    //static means we dont have to create Object for this class to access the main method.
    //void is a return type here we are not returning anything
    //String[] args is a cmd line arguments you can pass it on cmd line
    public static void main(String[] args) {
        //The System class contains several useful class fields and methods. It cannot be instantiated. Among the facilities provided by the System class are standard input, standard output, and error output streams.
        //PrintStream is a final static class out is a variable for PrintStream class
        //println is a method which is available is PrintStream class
        System.out.println("Hello world");
    }
}