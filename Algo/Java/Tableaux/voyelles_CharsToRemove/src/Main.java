import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str;
        String voyelles = "aeiouy";
        CharMatcher charToRemove = CharMatcher.JAVA_ISO_CONTROL.and(voyelles);
        System.out.print("Inscrivez quelque chose : ");

        System.out.println(str);

    }

    private static class CharMatcher {
    }
}
}