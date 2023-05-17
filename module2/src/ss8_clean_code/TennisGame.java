package ss8_clean_code;

public class TennisGame {

    public static String getScore(String playerName1, String playerName2, int scoreOffirstPlayer, int scoreOfsecondPlayer) {
        String score = "";
        int tempScore = 0;
        final int point_One = 0;
        final int point_two = 1;
        final int point_three = 2;
        final int point_four = 3;
        if (scoreOffirstPlayer == scoreOfsecondPlayer) {
            switch (scoreOffirstPlayer) {
                case 0:
                    score = "Love-All";
                    break;
                case 1:
                    score = "Fifteen-All";
                    break;
                case 2:
                    score = "Thirty-All";
                    break;
                case 3:
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
                    case 0:
                        score += "Love";
                        break;
                    case 1:
                        score += "Fifteen";
                        break;
                    case 2:
                        score += "Thirty";
                        break;
                    case 3:
                        score += "Forty";
                        break;
                }
            }
        }
        return score;
    }

    public static void main(String[] args) {
        System.out.println(getScore("AAA", "BBB", 4, 4));
    }
}