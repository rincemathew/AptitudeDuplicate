package com.melisa.melisa.aptitudeit.quizdirectry;

public class AptSimpleIntrest {
    private String mQuestions [] = {
            "This is some test",
            "A sum of money amounts to Rs. 9800 after 5 years and Rs. 12005 after 8 years at the same rate of simple interest. The rate of interest per annum is:",
            "What will be the ratio of simple interest earned by certain amount at the same rate of interest for 6 years and that for 9 years?",
            "A certain amount earns simple interest of Rs. 1750 after 7 years. Had the interest been 2% more, how much more interest would it have earned?",
            "A sum of Rs. 12,500 amounts to Rs. 15,500 in 4 years at the rate of simple interest. What is the rate of interest?",
            "An automobile financier claims to be lending money at simple interest, but he includes the interest every six months for calculating the principal. If he is charging an interest of 10%, the effective rate of interest becomes:",
            "A lent Rs. 5000 to B for 2 years and Rs. 3000 to C for 4 years on simple interest at the same rate of interest and received Rs. 2200 in all from both of them as interest. The rate of interest per annum is:",
            "A sum of Rs. 725 is lent in the beginning of a year at a certain rate of interest. After 8 months, a sum of Rs. 362.50 more is lent but at the rate twice the former. At the end of the year, Rs. 33.50 is earned as interest from both the loans. What was the original rate of interest?"
    };



    private String mChoices [][] = {
            {"Fruit", "Leaves", "Seeds","Leaves"},
            {"5%","8%","12%","15%"},
            {"1 : 3","1 : 4","2 : 3","Data inadequate"},
            {"Rs. 35","Rs. 245","Rs. 350","Cannot be determined"},
            {"3%","4%","5%","6%"},
            {"10%","10.25%","10.5%","None of these"},
            {"5%","6%","9%","10%"},
            {"4.5%","5%","6%","None of these"}
    };


    private String mHint [] = {
            "Leaves",
            "S.I. for 3 years = Rs. (12005 - 9800) = Rs. 2205.\n" +
                    "S.I. for 5 years = Rs.\t\t(2205/3\tx 5)\t\t= Rs. 3675\n" +
                    " Principal = Rs. (9800 - 3675) = Rs. 6125.\n" +
                    "Hence, rate =\t\t((100 x 3675)/(6125 x 5))\t%\t= 12%\n",
            "Let the principal be P and rate of interest be R%.\n" +
                    " Required ratio =\t\n" +
                    "(((P*R*6)/100)/((P*R*9)/100))= 6PR/9PR = 6/9 = 2 : 3",
            "We need to know the S.I., principal and time to find the rate.\n" +
                    "Since the principal is not given, so data is inadequate.",
            "S.I. = Rs. (15500 - 12500) = Rs. 3000.\n" +
                    "Rate =\t\t((100 x 3000)/(12500/4))\t%\t= 6%",
            "Let the sum be Rs. 100. Then,\n" +
                    "S.I. for first 6 months = Rs.\t\t(100 x 10 x 1)/(100 x 2)\t\t= Rs. 5\n" +
                    "100 x 2\n" +
                    "S.I. for last 6 months = Rs.\t\t((105 x 10 x 1)/(100 x 2)\t\t= Rs. 5.25\n" +
                    "100 x 2\n" +
                    "So, amount at the end of 1 year = Rs. (100 + 5 + 5.25) = Rs. 110.25\n" +
                    " Effective rate = (110.25 - 100) = 10.25%",
            "Let the rate be R% p.a.\n" +
                    "Then,\t\t(5000 x R x 2)/100\t\t+\t\t(3000 x R x 4)/100\t\t= 2200.\n" +
                    " 100R + 120R = 2200\n" +
                    " R =\t\t(2200/220)\t\t= 10.\n" +
                    " Rate = 10%.",
            "Let the original rate be R%. Then, new rate = (2R)%.\n" +
                    "Note:\n" +
                    "Here, original rate is for 1 year(s); the new rate is for only 4 months i.e. 1/3 year(s).\n" +
                    "\t\t(725 x R x 1)/100\t\t+\t\t(362.50 x 2R x 1)/(100 x 3)\t\t= 33.50\n" +
                    "100\t100 x 3\n" +
                    " (2175 + 725) R = 33.50 x 100 x 3\n" +
                    " (2175 + 725) R = 10050\n" +
                    " (2900)R = 10050\n" +
                    " R =\t10050/2900\t= 3.46\n" +
                    " Original rate = 3.46%"

    };



    private String mCorrectAnswers[] = {"Leaves","12%","2 : 3","Cannot be determined","6%","10.25%","10%","None of these"};


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
