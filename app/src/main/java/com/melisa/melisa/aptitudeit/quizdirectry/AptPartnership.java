package com.melisa.melisa.aptitudeit.quizdirectry;

public class AptPartnership {
    private String mQuestions [] = {
            "This is some test",
            "A began a business with Rs. 85,000. He was joined afterwards by B with Rs. 42,500. For how much period does B join, if the profits at the end of the year are divided in the ratio of 3 : 1?",
            "Aman started a business investing Rs. 70,000. Rakhi joined him after six months with an amount of Rs.. 1,05,000 and Sagar joined them with Rs. 1.4 lakhs after another six months. The amount of profit earned should be distributed in what ratio among Aman, Rakhi and Sagar respectively, 3 years after Aman started the business?",
            "Arun, Kamal and Vinay invested Rs. 8000, Rs. 4000 and Rs. 8000 respectively in a business. Arun left after six months. If after eight months, there was a gain of Rs. 4005, then what will be the share of Kamal?",
            "Simran started a software business by investing Rs. 50,000. After six months, Nanda joined her with a capital of Rs. 80,000. After 3 years, they earned a profit of Rs. 24,500. What was Simran's share in the profit?",
            "A and B started a partnership business investing some amount in the ratio of 3 : 5. C joined then after six months with an amount equal to that of B. In what proportion should the profit at the end of one year be distributed among A, B and C?",
            "A, B, C rent a pasture. A puts 10 oxen for 7 months, B puts 12 oxen for 5 months and C puts 15 oxen for 3 months for grazing. If the rent of the pasture is Rs. 175, how much must C pay as his share of rent?",
            "A and B started a business in partnership investing Rs. 20,000 and Rs. 15,000 respectively. After six months, C joined them with Rs. 20,000. What will be B's share in total profit of Rs. 25,000 earned at the end of 2 years from the starting of the business?"
    };



    private String mChoices [][] = {
            {"Fruit", "Leaves", "Seeds","Leaves"},
            {"4 months","5 months","6 months","8 months"},
            {"7 : 6 : 10","12 : 15 : 16","42 : 45 : 56","Cannot be determined"},
            {"Rs. 890","Rs. 1335","Rs. 1602","Rs. 1780"},
            {"Rs. 9,423","Rs. 10,250","Rs. 12,500","Rs. 10,500"},
            {"3 : 5 : 2","3 : 5 : 5","6 : 10 : 5","Data inadequate"},
            {"Rs. 45","Rs. 50","Rs. 55","Rs. 60"},
            {"Rs. 7500","Rs. 9000","Rs. 9500","Rs. 10,000"}
    };


    private String mHint [] = {
            "Leaves",
            "Suppose B joined for x months. Then,\n" +
                    "\n" +
                    "Then,(85000*12/42500*x)*(3/1)" +
                    " x=(85000*12/42500*3)" +
                    "So, B joined for 8 months.",
            "Aman : Rakhi : Sagar = (70,000 x 36) : (1,05,000 x 30) : (1,40,000 x 24) = 12 : 15 : 16.",
            "Arun : Kamal : Vinay = (8,000 x 6) : (4,000 x 8) : (8,000 x 8)\n" +
                    "\n" +
                    "= 48 : 32 : 64\n" +
                    "\n" +
                    "= 3 : 2 : 4.\n" +
                    "\n" +
                    " Kamal's share = Rs.(4005*(2/9)) Rs. 890.\n" +
                    "9\n",
            "Simran : Nanda = (50000 x 36) : (80000 x 30) = 3 : 4.\n" +
                    "\n" +
                    " Simran's share = Rs.(24500*(3/7))= Rs. 10,500.",
            "Let the initial investments of A and B be 3x and 5x.\n" +
                    "\n" +
                    "A : B : C = (3x x 12) : (5x x 12) : (5x x 6) = 36 : 60 : 30 = 6 : 10 : 5.",
            "A : B : C = (10 x 7) : (12 x 5) : (15 x 3) = 70 : 60 : 45 = 14 : 12 : 9.\n" +
                    "\n" +
                    " C's rent = Rs.(175*9/35)= Rs. 45.",
            "A : B : C = (20,000 x 24) : (15,000 x 24) : (20,000 x 18) = 4 : 3 : 3.\n" +
                    "\n" +
                    " B's share = Rs.(25000*3/10)= Rs. 7,500."

    };



    private String mCorrectAnswers[] = {"Leaves","8 months","12 : 15 : 16","Rs. 890","Rs. 10,500","6 : 10 : 5","Rs. 45","Rs. 7500"};


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
