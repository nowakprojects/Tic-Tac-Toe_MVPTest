package pl.nowakprojects.tic_tac_toe.ui.game;

import pl.nowakprojects.tic_tac_toe.models.GameBoard;
import pl.nowakprojects.tic_tac_toe.mvp.MvpView;

/**
 * Created by Mateusz on 25.12.2016.
 */

interface GameBoardView extends MvpView {
        int getMarkResourceId(GameBoard.MARK activePlayerMark);
        void clearGameBoardViewLayout();
        void showPlayAgainMessage();
        void hidePlayAgainMessage();
}
