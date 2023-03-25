package q1;

import java.util.Scanner;
class Main {

    public static void main(String[] args) {
        MyBook bk = new MyBook();
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        bk.setTitle(s);
        System.out.println("The title is: " + bk.getTitle());
    }
}