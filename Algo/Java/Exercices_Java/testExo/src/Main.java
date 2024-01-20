import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[]tableau = new int[5];
        int[]tableau2 = {1, 2, 3, 4, 5};

        int variable;

        Scanner sc = new Scanner(System.in);

        System.out.println("combien de valeur vouslez vous :");
        variable = sc.nextInt();
        tableau = new int[variable];

        for (int i=0 ; i<= tableau.length-1;i++)
        {
            System.out.println("saisir vos valeurs :" + (i+1));
            tableau[i]=sc.nextInt();
        }

        for (int j = 0; j<=tableau.length-1 ; j++)
        {
            System.out.println(tableau[j]);
        }
        for(int k=0; k<=tableau2.length; k++)
        {
            System.out.print(tableau2[k] + " ");
        }
        sc.close();
    }
}
