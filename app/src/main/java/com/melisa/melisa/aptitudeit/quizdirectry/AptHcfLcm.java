package com.melisa.melisa.aptitudeit.quizdirectry;

public class AptHcfLcm {
    private String mQuestions [] = {
            "This is some test",
            "Find the greatest number that will divide 43, 91 and 183 so as to leave the same remainder in each case.",
            "The greatest number which on dividing 1657 and 2037 leaves remainders 6 and 5 respectively, is:",
            "The greatest possible length which can be used to measure exactly the lengths 7 m, 3 m 85 cm, 12 m 95 cm is:",
            "The least number, which when divided by 12, 15, 20 and 54 leaves in each case a remainder of 8 is:",
            "The ratio of two numbers is 3 : 4 and their H.C.F. is 4. Their L.C.M. is:",
            "The smallest number which when diminished by 7, is divisible 12, 16, 18, 21 and 28 is:",
            "The least number which should be added to 2497 so that the sum is exactly divisible by 5, 6, 4 and 3 is:"
    };



    private String mChoices [][] = {
            {"Fruit", "Leaves", "Seeds","Leaves"},
            {"4","7","9","13"},
            {"123","127","235","305"},
            {"15 cm","25 cm","35 cm","42 cm"},
            {"504","536","544","548"},
            {"12","16","24","48"},
            {"1008","1015","1022","1032"},
            {"3","13","23","33"}
    };


    private String mHint [] = {
            "Leaves",
            "Required number = H.C.F. of (91 - 43), (183 - 91) and (183 - 43)\n" +
                    "\n" +
                    "     = H.C.F. of 48, 92 and 140 = 4.",
            "Required number = H.C.F. of (1657 - 6) and (2037 - 5)\n" +
                    "\n" +
                    "  = H.C.F. of 1651 and 2032 = 127.",
            "Required length = H.C.F. of 700 cm, 385 cm and 1295 cm = 35 cm.",
            "Required number = (L.C.M. of 12, 15, 20, 54) + 8\n" +
                    "\n" +
                    "   = 540 + 8\n" +
                    "\n" +
                    "   = 548.",
            "Let the numbers be 3x and 4x. Then, their H.C.F. = x. So, x = 4.\n" +
                    "\n" +
                    "So, the numbers 12 and 16.\n" +
                    "\n" +
                    "L.C.M. of 12 and 16 = 48",
            "Required number = (L.C.M. of 12,16, 18, 21, 28) + 7\n" +
                    "\n" +
                    "   = 1008 + 7\n" +
                    "\n" +
                    "   = 1015",
            "L.C.M. of 5, 6, 4 and 3 = 60.\n" +
                    "\n" +
                    "On dividing 2497 by 60, the remainder is 37.\n" +
                    "\n" +
                    " Number to be added = (60 - 37) = 23."

    };



    private String mCorrectAnswers[] = {"Leaves","4","127","35 cm","548","48","1015","23"};


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
