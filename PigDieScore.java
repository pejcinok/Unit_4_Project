public class PigDieScore{

    private int face;
    private int score;



    public class PigDieScore(){
        PigDie die1 = new PigDie();
        PigDie die2 = new PigDie();

    }
        public int turnScore(){
            return die1.getFace() + die2.getFace();

        }

        public String totalScore(die1.getFace(), die2.getFace()){
                if (die1.isOne() && die2.isOne ){
                    score = 0;
                }
                if (die1.isOne())

        }
        public String toString(){
            String result = "Your points for this turn";
            result += (String) getFace();
            return result;
        }
    }
}