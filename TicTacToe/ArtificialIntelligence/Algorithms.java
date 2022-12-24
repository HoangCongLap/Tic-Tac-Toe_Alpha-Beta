package ArtificialIntelligence;

import TicTacToe.Board;

/**
 * Sử dụng các thuật toán khác nhau để chơi Tic Tac Toe.
 */
public class Algorithms {

    /**
     * Algorithms cannot be instantiated.
     */
    private Algorithms() {}

    /**
     * Play a random move.
     * @param board     the Tic Tac Toe board to play on
     */



    /**
     * Chơi bằng thuật toán Cắt tỉa Alpha-Beta.
     * @param board     the Tic Tac Toe board to play on
     */
    public static void alphaBetaPruning (Board board) {
        AlphaBetaPruning.run(board.getTurn(), board, Double.POSITIVE_INFINITY);
    }

    /**
     * Play using the Alpha-Beta Pruning algorithm. Include a depth limit.
     * chơi bằng thuật toán Cắt tỉa Alpha-Beta. Bao gồm một giới hạn độ sâu.
     * @param board     the Tic Tac Toe board to play on
     * @param ply       độ sâu tối đa
     */
    public static void alphaBetaPruning (Board board, int ply) {
        AlphaBetaPruning.run(board.getTurn(), board, ply);
    }

    /**
     * Play using the Alpha-Beta Pruning algorithm. Include depth in the
     * evaluation function.
     * @param board     the Tic Tac Toe board to play on
     */
    public static void alphaBetaAdvanced (Board board) {
        AlphaBetaAdvanced.run(board.getTurn(), board, Double.POSITIVE_INFINITY);
    }

    /**
     * Play using the Alpha-Beta Pruning algorithm. Include depth in the
     * evaluation function and a depth limit.(đánh giá độ sâu)
     * @param board     the Tic Tac Toe board to play on
     * @param ply       the maximum depth
     */
    public static void alphaBetaAdvanced (Board board, int ply) {
        AlphaBetaAdvanced.run(board.getTurn(), board, ply);
    }

}
