package ru.job4j.array;
public class Matrixcheck {
    public static boolean isWin(char[][] board) {
        boolean result = false;
        for (int row = 0; row < board.length; row++) {
            for (int cell = 0; cell < board.length; cell++) {
                char sign = board[row][cell];
                System.out.print(sign);
                for (int i = 0; i < (board.length - 1); i++) {
                    if (board[i][i] != 'X') {
                        int rowCount = 0;
                        int colCount = 0;
                        for (int k = 0; k < (board.length - 1); k++) {
                            if (board[i][k] == 'X') {
                                rowCount = rowCount + 1;
                            }
                            if (board[k][i] == 'X') {
                                colCount = colCount + 1;
                            }
                        }
                        if ((rowCount == board.length) && (colCount == board.length)) {
                            result = true;
                            break;
                        } else {
                            result = true;
                            break;
                        }
                    } else {
                        result = true;
                        break;
                    }
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        char[][] hasWinVertical = {
                {'_', '_', 'X', '_', '_'},
                {'_', '_', 'X', '_', '_'},
                {'_', '_', 'X', '_', '_'},
                {'_', '_', 'X', '_', '_'},
                {'_', '_', 'X', '_', '_'},
        };
        System.out.println();
        boolean win = isWin(hasWinVertical);
        char[][] hasWinHor = {
                {'_', '_', '_', '_', '_'},
                {'X', 'X', 'X', 'X', 'X'},
                {'_', '_', '_', '_', '_'},
                {'_', '_', '_', '_', '_'},
                {'_', '_', '_', '_', '_'},
        };
        boolean winHor = isWin(hasWinHor);

        System.out.println();
        char[][] notWin = {
                {'_', '_', 'X', '_', '_'},
                {'_', '_', 'X', '_', '_'},
                {'_', 'X', '_', '_', '_'},
                {'_', '_', 'X', '_', '_'},
                {'_', '_', 'X', '_', '_'},
        };
        boolean lose = isWin(notWin);
    }
}
