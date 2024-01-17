import static java.awt.PageAttributes.MediaType.A1;
import static javax.swing.text.html.HTML.Tag.U;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static int calculateState(int left, int state, int right)
    {
        int i = 0;
        int[] cell = {1, 0, 0, 1, 0, 1, 0, 1, 1, 0};

        left = cell[i - 1];
        right = cell[i + 1];
        state = cell[i];
        int newState = calculateState(left+ right+ state);
    }
    public static void main(String[] args) {
        int[] cell = {1, 0, 0, 1, 0, 1, 0, 1, 1, 0};
        int w = 40;

        System.out.println("\n \n \n \n");

        for(int i = 0; i <=cell.length-1; i++)
        {
            if(cell[i] == 1)
            {
                System.out.print("■");
            } else if (cell[i] == 0)
            {
                System.out.print("□");
            }
        }
    int[] nextCell;
        for(int i = 0; i <= cell.length-1; i++)
        {
            int left = cell[i - 1];
            int right = cell[i + 1];
            int state = cell[i];
            int newState = calculateState(left + right + state);
        }
    }
}