package package1;

public class PrintMe {


    public String p(){
        System.out.println("printed");
        return "printed";
    }

    public static void main(String[] args) {

        System.out.println("Hello World !!");
        PrintMe printMe = new PrintMe();
        printMe.p();
    }
}
