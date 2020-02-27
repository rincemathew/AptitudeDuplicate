package com.melisa.melisa.aptitudeit.quizdirectry;

public class AptAverage {
    private String mQuestions [] = {
            "This is some test",
            "A grocer has a sale of Rs. 6435, Rs. 6927, Rs. 6855, Rs. 7230 and Rs. 6562 for 5 consecutive months. How much sale must he have in the sixth month so that he gets an average sale of Rs. 6500?",
            "The average of 20 numbers is zero. Of them, at the most, how many may be greater than zero?",
            "The average weight of 8 person's increases by 2.5 kg when a new person comes in place of one of them weighing 65 kg. What might be the weight of the new person?",
            "The average monthly income of P and Q is Rs. 5050. The average monthly income of Q and R is Rs. 6250 and the average monthly income of P and R is Rs. 5200. The monthly income of P is:The average monthly income of P and Q is Rs. 5050. The average monthly income of Q and R is Rs. 6250 and the average monthly income of P and R is Rs. 5200. The monthly income of P is:",
            "The average age of husband, wife and their child 3 years ago was 27 years and that of wife and the child 5 years ago was 20 years. The present age of the husband is:",
            "The average weight of A, B and C is 45 kg. If the average weight of A and B be 40 kg and that of B and C be 43 kg, then the weight of B is:",
            "A library has an average of 510 visitors on Sundays and 240 on other days. The average number of visitors per day in a month of 30 days beginning with a Sunday is:"
    };



    private String mChoices [][] = {
            {"Fruit", "Leaves", "Seeds","Leaves"},
            {"4991","5991","6001","6991"},
            {"0","1","10","19"},
            {"76 kg","76.5 kg","85 kg","None of these"},
            {"3500","4000","4050","5000"},
            {"35 years","40 years","50 years","None of these"},
            {"17 kg","20 kg","26 kg","31 kg"},
            {"250","276","280","285"}
    };


    private String mHint [] = {
            "Leaves",
            "Total sale for 5 months = Rs. (6435 + 6927 + 6855 + 7230 + 6562) = Rs. 34009.\n" +
                    "\n" +
                    " Required sale = Rs. [ (6500 x 6) - 34009 ]\n" +
                    "\n" +
                    "   = Rs. (39000 - 34009)\n" +
                    "\n" +
                    "   = Rs. 4991.",
            "Average of 20 numbers = 0.\n" +
                    "\n" +
                    " Sum of 20 numbers (0 x 20) = 0.\n" +
                    "\n" +
                    "It is quite possible that 19 of these numbers may be positive and if their sum is a then 20th number is (-a).",
            "Total weight increased = (8 x 2.5) kg = 20 kg.\n" +
                    "\n" +
                    "Weight of new person = (65 + 20) kg = 85 kg.",
            "Let P, Q and R represent their respective monthly incomes. Then, we have:\n" +
                    "\n" +
                    "P + Q = (5050 x 2) = 10100 .... (i)\n" +
                    "\n" +
                    "Q + R = (6250 x 2) = 12500 .... (ii)\n" +
                    "\n" +
                    "P + R = (5200 x 2) = 10400 .... (iii)\n" +
                    "\n" +
                    "Adding (i), (ii) and (iii), we get:  2(P + Q + R) = 33000  or   P + Q + R = 16500 .... (iv)\n" +
                    "\n" +
                    "Subtracting (ii) from (iv), we get P = 4000.\n" +
                    "\n" +
                    " P's monthly income = Rs. 4000.",
            "Sum of the present ages of husband, wife and child = (27 x 3 + 3 x 3) years = 90 years.\n" +
                    "\n" +
                    "Sum of the present ages of wife and child = (20 x 2 + 5 x 2) years = 50 years.\n" +
                    "\n" +
                    " Husband's present age = (90 - 50) years = 40 years",
            "Let A, B, C represent their respective weights. Then, we have:\n" +
                    "\n" +
                    "A + B + C = (45 x 3) = 135 .... (i)\n" +
                    "\n" +
                    "A + B = (40 x 2) = 80 .... (ii)\n" +
                    "\n" +
                    "B + C = (43 x 2) = 86 ....(iii)\n" +
                    "\n" +
                    "Adding (ii) and (iii), we get: A + 2B + C = 166 .... (iv)\n" +
                    "\n" +
                    "Subtracting (i) from (iv), we get : B = 31.\n" +
                    "\n" +
                    " B's weight = 31 kg.",
            "Since the month begins with a Sunday, to there will be five Sundays in the month.\n" +
                    "\n" +
                    "Required average\t\n" +
                    "=\t\t(510 x 5 + 240 x 25)/30\t\n" +
                    "=\t8550/30\n" +
                    "= 285"

    };



    private String mCorrectAnswers[] = {"Leaves","4991","19","85 kg","4000","40 years","31 kg","285"};


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
