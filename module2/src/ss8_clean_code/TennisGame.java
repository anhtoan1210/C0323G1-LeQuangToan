package ss8_clean_code;

public class TennisGame {

    public static String getScore(String playerName1, String playerName2, int scoreOffirstPlayer, int scoreOfsecondPlayer) {
        String score = "";
        int tempScore = 0;
        final int point_One = 1;
        final int point_two = 2;
        final int point_three = 3;
        final int point_four = 4;
        if (scoreOffirstPlayer == scoreOfsecondPlayer) {
            switch (scoreOffirstPlayer) {
                case point_One:
                    score = "Love-All";
                    break;
                case point_two:
                    score = "Fifteen-All";
                    break;
                case point_three:
                    score = "Thirty-All";
                    break;
                case point_four:
                    score = "Forty-All";
                    break;
                default:
                    score = "Deuce";
                    break;

            }
        } else if (scoreOffirstPlayer >= 4 || scoreOfsecondPlayer >= 4) {
            int minusResult = scoreOffirstPlayer - scoreOfsecondPlayer;
            if (minusResult == 1) score = "Advantage player1";
            else if (minusResult == -1) score = "Advantage player2";
            else if (minusResult >= 2) score = "Win for player1";
            else score = "Win for player2";
        } else {
            for (int i = 1; i < 3; i++) {
                if (i == 1) tempScore = scoreOffirstPlayer;
                else {
                    score += "-";
                    tempScore = scoreOfsecondPlayer;
                }
                switch (tempScore) {
                    case point_One:
                        score += "Love";
                        break;
                    case point_two:
                        score += "Fifteen";
                        break;
                    case point_three:
                        score += "Thirty";
                        break;
                    case point_four:
                        score += "Forty";
                        break;
                }
            }
        }
        return score;
    }

    public static void main(String[] args) {
        System.out.println(getScore("lê văn A", "Hoàng Thị B", 4, 4));
    }
}