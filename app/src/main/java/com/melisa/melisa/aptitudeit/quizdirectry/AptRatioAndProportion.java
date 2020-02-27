package com.melisa.melisa.aptitudeit.quizdirectry;

public class AptRatioAndProportion {
    private String mQuestions [] = {
            "This is some test",
            "The salaries A, B, C are in the ratio 2 : 3 : 5. If the increments of 15%, 10% and 20% are allowed respectively in their salaries, then what will be new ratio of their salaries?",
            "If 40% of a number is equal to two-third of another number, what is the ratio of first number to the second number?",
            "The fourth proportional to 5, 8, 15 is:",
            "Two number are in the ratio 3 : 5. If 9 is subtracted from each, the new numbers are in the ratio 12 : 23. The smaller number is:",
            "In a bag, there are coins of 25 p, 10 p and 5 p in the ratio of 1 : 2 : 3. If there is Rs. 30 in all, how many 5 p coins are there?",
            "The ratio of the number of boys and girls in a college is 7 : 8. If the percentage increase in the number of boys and girls be 20% and 10% respectively, what will be the new ratio?",
            "Salaries of Ravi and Sumit are in the ratio 2 : 3. If the salary of each is increased by Rs. 4000, the new ratio becomes 40 : 57. What is Sumit's salary?"
    };



    private String mChoices [][] = {
            {"Fruit", "Leaves", "Seeds","Leaves"},
            {"3 : 3 : 10","10 : 11 : 20","23 : 33 : 60","Cannot be determined"},
            {"2 : 5","3 : 7","5 : 3","7 : 3"},
            {"18","24","19","20"},
            {"27","33","49","55"},
            {"50","100","150","200"},
            {"8 : 9","17 : 18","21 : 22","Cannot be determined"},
            {"Rs. 17,000","Rs. 20,000","Rs. 25,500","Rs. 38,000"}
    };


    private String mHint [] = {
            "Leaves",
            "Let A = 2k, B = 3k and C = 5k.\n" +
                    "A's new salary =\t115/100\tof 2k =\t\t(115/100\tx 2k)\t\t=\t23k/10\n" +
                    "B's new salary =\t110/100\tof 3k =\t\t(110/100\tx 3k)\t\t=\t33k/10\n" +
                    "C's new salary =\t120/100\tof 5k =\t\t(120/100\tx 5k)\t\t= 6k\n" +
                    " New ratio\t\t23k/10\t:\t33k/10\t: 6k\t\t= 23 : 33 : 60",
            "Let 40% of A =\t2/3\tB\n" +
                    "Then,\t40A/100\t=\t2B/3\n" +
                    "\t2A/5\t=\t2B/3\n" +
                    "\tA/B\t=\t\t((2/3)\tx\t(5/2))\t\t=\t5/3\n" +
                    " A : B = 5 : 3.",
            "Let the fourth proportional to 5, 8, 15 be x.\n" +
                    "Then, 5 : 8 : 15 : x\n" +
                    " 5x = (8 x 15)\n" +
                    "x =\t(8 x 15)/5\t= 24.",
            "Let the numbers be 3x and 5x.\n" +
                    "Then,\t(3x - 9)/(5x - 9)\t=\t12/23\n" +
                    " 23(3x - 9) = 12(5x - 9)\n" +
                    " 9x = 99\n" +
                    " x = 11.\n" +
                    " The smaller number = (3 x 11) = 33.",
            "Let the number of 25 p, 10 p and 5 p coins be x, 2x, 3x respectively.\n" +
                    "Then, sum of their values = Rs.\t\t(25x/100)\t+\t(10 x 2x/100)\t+\t(5 x 3x/100)\t\t= Rs.\t(60x/100)\n" +
                    "\t60x/100\t= 30\t    x =\t(30 x 100)/60\t= 50.\n" +
                    "Hence, the number of 5 p coins = (3 x 50) = 150.",
            "\t((120/100)\tx 7x)\t\tand\t\t((110/100)\tx 8x)\t\n" +
                    "\t42x/5\tand\t44x/5\n" +
                    " The required ratio =\t\t(42x/5\t:\t44x/5)\t\t= 21 : 22.\n",
            "Let the original salaries of Ravi and Sumit be Rs. 2x and Rs. 3x respectively.\n" +
                    "Then,\t2x + 4000/3x + 4000\t=\t40/57\n" +
                    " 57(2x + 4000) = 40(3x + 4000)\n" +
                    " 6x = 68,000\n" +
                    " 3x = 34,000\n" +
                    "Sumit's present salary = (3x + 4000) = Rs.(34000 + 4000) = Rs. 38,000."

    };



    private String mCorrectAnswers[] = {"Leaves","23 : 33 : 60","5 : 3","24","33","150","21 : 22","Rs. 38,000"};


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
