package package1;

import java.util.ArrayList;

public class PrintMe {

    ArrayList arrayList = new ArrayList();

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
