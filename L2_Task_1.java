import java.util.Scanner;
public class L2_Task_1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        char[][] board ={{'1','2','3'},{'4','5','6'},{'7','8','9'}};
        char currentPlayer = 'X';
        boolean winner = false;

        System.out.println("===== Tic Tac Toe =====");
        for(int move = 1; move <= 9; move++)
        {
            // Display board
            System.out.println();

            for(int i = 0; i < 3; i++)
            {
                System.out.println(board[i][0] + " | " + board[i][1] + " | " + board[i][2]);
                if(i < 2)
                {
                    System.out.println("---------");
                }
            }
            System.out.print("\nPlayer " + currentPlayer + ", enter position (1-9): ");
            if(!sc.hasNextInt())
            {
                System.out.println("Please enter a number between 1 and 9.");
                sc.next();
                move--;
                continue;
            }
            int position = sc.nextInt();
            if(position < 1 || position > 9)
            {
                System.out.println("Invalid Position!");
                move--;
                continue;
            }
            if(board[(position-1)/3][(position-1)%3] == 'X' ||
            board[(position-1)/3][(position-1)%3] == 'O')
            {
                System.out.println("Position already occupied!");
                move--;
                continue;
            }
            switch(position)
            {
                case 1: board[0][0] = currentPlayer; break;
                case 2: board[0][1] = currentPlayer; break;
                case 3: board[0][2] = currentPlayer; break;
                case 4: board[1][0] = currentPlayer; break;
                case 5: board[1][1] = currentPlayer; break;
                case 6: board[1][2] = currentPlayer; break;
                case 7: board[2][0] = currentPlayer; break;
                case 8: board[2][1] = currentPlayer; break;
                case 9: board[2][2] = currentPlayer; break;
                default:
                System.out.println("Invalid Position!");
                move--;
                continue;
            }
            System.out.println("\nBoard:");
            for(int i = 0; i < 3; i++)
            {
                System.out.println(board[i][0] + " | " + board[i][1] + " | " + board[i][2]);
                if(i < 2)
                {
                    System.out.println("---------");
                }
            }   
            // Check rows
            if(
            board[0][0] == currentPlayer &&
            board[0][1] == currentPlayer &&
            board[0][2] == currentPlayer ||
            board[1][0] == currentPlayer &&
            board[1][1] == currentPlayer &&
            board[1][2] == currentPlayer ||
            board[2][0] == currentPlayer &&
            board[2][1] == currentPlayer &&
            board[2][2] == currentPlayer ||

            // Check Columns
            board[0][0] == currentPlayer &&
            board[1][0] == currentPlayer &&
            board[2][0] == currentPlayer ||
            board[0][1] == currentPlayer &&
            board[1][1] == currentPlayer &&
            board[2][1] == currentPlayer ||
            board[0][2] == currentPlayer &&
            board[1][2] == currentPlayer &&
            board[2][2] == currentPlayer ||

            // Check Diagonals
            board[0][0] == currentPlayer &&
            board[1][1] == currentPlayer &&
            board[2][2] == currentPlayer ||
            board[0][2] == currentPlayer &&
            board[1][1] == currentPlayer &&
            board[2][0] == currentPlayer
            )
            {
                winner = true;
                System.out.println("\nWinner is Player " + currentPlayer + "!");
                break;
            }
            // Change Player
            if(currentPlayer == 'X')
            {
                currentPlayer = 'O';
            }
            else
            {
                currentPlayer = 'X';
            }
        }
        if(!winner)
        {
            System.out.println("\nGame Draw!");
        }
        sc.close();
    }
}