package com.melisa.melisa.aptitudeit.quizdirectry;

public class LogSeatingArrangement {
    private String mQuestions [] = {
            "This is some test",
            "A, P, R, X, S and Z are sitting in a row. S and Z are in the centre. A and P are at the ends. R is sitting to the left of A. Who is to the right of P ?",
            "A, B, C, D and E are sitting on a bench. A is sitting next to B, C is sitting next to D, D is not sitting with E who is on the left end of the bench. C is on the second position from the right. A is to the right of B and E. A and C are sitting together. In which position A is sitting ?",
            "P, Q, R, S, T, U, V and W are sitting round the circle and are facing the centre:\n" +
                    "P is second to the right of T who is the neighbour of R and V.\n" +
                    "S is not the neighbour of P.\n" +
                    "V is the neighbour of U.\n" +
                    "Q is not between S and W. W is not between U and S.\n" +
                    "Which two of the following are not neighbours ?",
            "P, Q, R, S, T, U, V and W are sitting round the circle and are facing the centre:\n" +
                    "P is second to the right of T who is the neighbour of R and V.\n" +
                    "S is not the neighbour of P.\n" +
                    "V is the neighbour of U.\n" +
                    "Q is not between S and W. W is not between U and S.\n" +
                    "Which one is immediate right to the V ?",
            "Six friends are sitting in a circle and are facing the centre of the circle. Deepa is between Prakash and Pankaj. Priti is between Mukesh and Lalit. Prakash and Mukesh are opposite to each other.\n" +
                    "Who is sitting right to Prakash ?",
            "Six friends are sitting in a circle and are facing the centre of the circle. Deepa is between Prakash and Pankaj. Priti is between Mukesh and Lalit. Prakash and Mukesh are opposite to each other.\n" +
                    "Who is just right to Pankaj ?",
            "Six friends are sitting in a circle and are facing the centre of the circle. Deepa is between Prakash and Pankaj. Priti is between Mukesh and Lalit. Prakash and Mukesh are opposite to each other.\n" +
                    "Who are the neighbours of Mukesh ?"
    };



    private String mChoices [][] = {
            {"Fruit", "Leaves", "Seeds","Leaves"},
            {"A","X","S","Z"},
            {"Between B and D","Between B and C","Between E and D","Between C and E"},
            {"RV","UV","RP","QW"},
            {"P","U","R","T"},
            {"Mukesh","Deepa","Pankaj","Lalit"},
            {"Deepa","Lalit","Prakash","Priti"},
            {"Prakash and Deepa","Deepa and Priti","Priti and Pankaj","Lalit and Priti"}
    };


    private String mHint [] = {
            "Leaves",
            "right of P is X.",
            "A is sitting in between B and C.",
            "R and V are not neighbours",
            "T is immediate right to the V",
            "Lalit is sitting right to Prakash.",
            "Deepa is sitting just right to Pankaj.",
            "Priti and Pankaj are the neighbours of Mukesh."

    };



    private String mCorrectAnswers[] = {"Leaves","X","Between B and C","RV","T","Lalit","Deepa","Priti and Pankaj"};


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
