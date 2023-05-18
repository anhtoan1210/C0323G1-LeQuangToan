package ss8_clean_code;

public class TennisGame {

    public static String getScore(String playerName1, String playerName2, int scoreOffirstPlayer, int scoreOfsecondPlayer) {
        String score = "";
        int tempScore = 0;
        final int POINT_ONE = 1;
        final int POINT_TWO = 2;
        final int POINT_THREE = 3;
        final int POINT_FOR = 4;
        if (scoreOffirstPlayer == scoreOfsecondPlayer) {
            switch (scoreOffirstPlayer) {
                case POINT_ONE:
                    score = "Love-All";
                    break;
                case POINT_TWO:
                    score = "Fifteen-All";
                    break;
                case POINT_THREE:
                    score = "Thirty-All";
                    break;
                case POINT_FOR:
                    score = "Forty-All";
                    break;
                default:
                    score = "Deuce";
                    break;

            }
        } else if (scoreOffirstPlayer >= 4 || scoreOfsecondPlayer >= 4) {
            score = getAdvantage(scoreOffirstPlayer, scoreOfsecondPlayer);
        } else {
            for (int i = 1; i < 3; i++) {
                if (i == 1) tempScore = scoreOffirstPlayer;
                else {
                    score += "-";
                    tempScore = scoreOfsecondPlayer;
                }
                switch (tempScore) {
                    case POINT_ONE:
                        score += "Love";
                        break;
                    case POINT_TWO:
                        score += "Fifteen";
                        break;
                    case POINT_THREE:
                        score += "Thirty";
                        break;
                    case POINT_FOR:
                        score += "Forty";
                        break;
                }
            }
        }
        return score;
    }

    private static String getAdvantage(int scoreOffirstPlayer, int scoreOfsecondPlayer) {
        String score;
        int minusResult = scoreOffirstPlayer - scoreOfsecondPlayer;
        if (minusResult == 1) score = "Advantage player1";
        else if (minusResult == -1) score = "Advantage player2";
        else if (minusResult >= 2) score = "Win for player1";
        else score = "Win for player2";
        return score;
    }

    public static void main(String[] args) {
        System.out.println(getScore("lê văn A", "Hoàng Thị B", 4, 4));
    }
}