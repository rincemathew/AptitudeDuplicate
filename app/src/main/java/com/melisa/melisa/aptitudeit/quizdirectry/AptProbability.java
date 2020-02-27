package com.melisa.melisa.aptitudeit.quizdirectry;

public class AptProbability {
    private String mQuestions [] = {
            "This is some test",
            "A card is drawn from a pack of 52 cards. The probability of getting a queen of club or a king of heart is:",
            "A bag contains 4 white, 5 red and 6 blue balls. Three balls are drawn at random from the bag. The probability that all of them are red, is:",
            "Two cards are drawn together from a pack of 52 cards. The probability that one is a spade and one is a heart, is:",
            "One card is drawn at random from a pack of 52 cards. What is the probability that the card drawn is a face card (Jack, Queen and King only)?",
            "A bag contains 6 black and 8 white balls. One ball is drawn at random. What is the probability that the ball drawn is white?",
            "In a lottery, there are 10 prizes and 25 blanks. A lottery is drawn at random. What is the probability of getting a prize?",
            "Two dice are tossed. The probability that the total score is a prime number is:"
    };



    private String mChoices [][] = {
            {"Fruit", "Leaves", "Seeds","Leaves"},
            {"1/13","2/13","1/26","1/52"},
            {"1/22","3/22","2/91","2/77"},
            {"3/20","29/34","47/100","13/102"},
            {"1/13","3/13","1/4","9/52"},
            {"3/4","4/7","1/8","3/7"},
            {"1/10","2/5","2/7","5/7"},
            {"1/6","5/12","1/2","7/9"}
    };


    private String mHint [] = {
            "Leaves",
            "Here, n(S) = 52.\n" +
                    "Let E = event of getting a queen of club or a king of heart.\n" +
                    "Then, n(E) = 2.\n" +
                    " P(E) =\tn(E)/n(S)\t=\t2/52\t=\t1/26\t.\n" ,
            "Let S be the sample space.\n" +
                    "Then, n(S)\t= number of ways of drawing 3 balls out of 15\n" +
                    "= 15C3\n" +
                    "=\t(15 x 14 x 13)/(3 x 2 x 1)\n" +
                    "= 455.\n" +
                    "Let E = event of getting all the 3 red balls.\n" +
                    " n(E) =\t(5 x 4)/(2 x 1)\t= 10.\n" +
                    " P(E) =\tn(E)/n(S)\t=\t10/455\t=\t2/91\t.\n",
            "Let S be the sample space.\n" +
                    "Then, n(S) = 52C2 =\t(52 x 51)/(2 x 1)\t= 1326.\n" +
                    "Let E = event of getting 1 spade and 1 heart.\n" +
                    " n(E)\t= number of ways of choosing 1 spade out of 13 and 1 heart out of 13\n" +
                    "= (13C1 x 13C1)\n" +
                    "= (13 x 13)\n" +
                    "= 169.\n" +
                    " P(E) =\tn(E)/n(S)\t=\t169/1326\t=\t13/102\t.",
            "Clearly, there are 52 cards, out of which there are 12 face cards.\n" +
                    "\n" +
                    " P (getting a face card) =\t12/52\t=\t3/13\t.\n",
            "Let number of balls = (6 + 8) = 14.\n" +
                    "Number of white balls = 8.\n" +
                    "P (drawing a white ball) =\t8/14\t=\t4/7\t",
            "P (getting a prize) =\t10/(10 + 25)\t=\t10/35\t=\t2/7\t.\n",
            "Clearly, n(S) = (6 x 6) = 36.\n" +
                    "Let E = Event that the sum is a prime number.\n" +
                    "Then E\t= { (1, 1), (1, 2), (1, 4), (1, 6), (2, 1), (2, 3), (2, 5), (3, 2), (3, 4), (4, 1), (4, 3),\n" +
                    "      (5, 2), (5, 6), (6, 1), (6, 5) }\n" +
                    " n(E) = 15.\n" +
                    " P(E) =\tn(E)/n(S)\t=\t15/36\t=\t5/12\t.\n"

    };



    private String mCorrectAnswers[] = {"Leaves","1/26","2/91","13/102","3/13","4/7","2/7","5/12"};


    public int getLength()  {return mQuestions.length;}




    public String getQuestion(int a) {
        String question = mQuestions[a];
        return question;
    }


    public String getChoice1(int a) {
        String choice0 = mChoices[a][0];
        return choice0;
    }


    public String getChoice2(int a) {
        String choice1 = mChoices[a][1];
        return choice1;
    }

    public String getChoice3(int a) {
        String choice2 = mChoices[a][2];
        return choice2;
    }
    public String getChoice4(int a){
        String choice3 =mChoices[a][3];
        return choice3;
    }

    public String getHint(int a){
        String hint =mHint[a];
        return hint;
    }

    public String getCorrectAnswer(int a) {
        String answer = mCorrectAnswers[a];
        return answer;
    }

}
