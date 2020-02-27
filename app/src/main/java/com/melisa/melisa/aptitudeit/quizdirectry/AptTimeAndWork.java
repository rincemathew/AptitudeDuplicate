package com.melisa.melisa.aptitudeit.quizdirectry;

public class AptTimeAndWork {
    private String mQuestions [] = {
            "This is some test",
            "A takes twice as much time as B or thrice as much time as C to finish a piece of work. Working together, they can finish the work in 2 days. B can do the work alone in:",
            "A and B can complete a work in 15 days and 10 days respectively. They started doing the work together but after 2 days B had to leave and A alone completed the remaining work. The whole work was completed in :",
            "A and B can do a piece of work in 30 days, while B and C can do the same work in 24 days and C and A in 20 days. They all work together for 10 days when B and C leave. How many days more will A take to finish the work?",
            "A works twice as fast as B. If B can complete a work in 12 days independently, the number of days in which A and B can together finish the work in :",
            "Twenty women can do a work in sixteen days. Sixteen men can complete the same work in fifteen days. What is the ratio between the capacity of a man and a woman?",
            "A and B can do a work in 8 days, B and C can do the same work in 12 days. A, B and C together can finish it in 6 days. A and C together will do it in :",
            "A can finish a work in 24 days, B in 9 days and C in 12 days. B and C start the work but are forced to leave after 3 days. The remaining work was done by A in:"
    };



    private String mChoices [][] = {
            {"Fruit", "Leaves", "Seeds","Leaves"},
            {"4 days","6 days","8 days","12 days"},
            {"8 days","10 days","12 days","15 days"},
            {"18 days","24 days","30 days","36 days"},
            {"4 days","6 days","8 days","18 days"},
            {"3 : 4","4 : 3","5 : 3","Data inadequate"},
            {"4 days","6 days","8 days","11 days"},
            {"5 days","6 days","10 days","10(1/2) days"}
    };


    private String mHint [] = {
            "Leaves",
            "Suppose A, B and C take x,\tx/2\tand\tx/3\tdays respectively to finish the work.\n" +
                    "Then,(\t\t1/x\t+\t2/x\t+\t3/x\t\t)=\t1/2\n" +
                    "\t6/x\t=\t1/2\n" +
                    " x = 12.\n" +
                    "So, B takes (12/2) = 6 days to finish the work.",
            "(A + B)'s 1 day's work =\t(\t1/15\t+\t1/10\t)\t=\t1/6\t.\n" +
                    "Work done by A and B in 2 days =\t(\t1/6\tx 2\t)\t=\t1/3\t.\n" +
                    "Remaining work =\t(\t1 -\t1/3\t)\t=\t2/3\t.\n" +
                    "Now,\t1/15\twork is done by A in 1 day.\n" +
                    "Therefore\t2/3\twork will be done by a in\t(\t15 x\t2/3\t)\t= 10 days.\n" +
                    "Hence, the total time taken = (10 + 2) = 12 days.",
            "2(A + B + C)'s 1 day's work =\t(\t1/30\t+\t1/24\t+\t1/20\t)\t=\t15/120\t=\t1/8\t.\n" +
                    "Therefore, (A + B + C)'s 1 day's work =\t1(2 x 8)\t=\t1/16\t.\n" +
                    "Work done by A, B, C in 10 days =\t10/16\t=\t5/8\t.\n" +
                    "Remaining work =\t(\t1 -\t5/8\t)\t=\t3/8\t.\n" +
                    "A's 1 day's work =\t(\t1/16\t-\t1/24\t)\t=\t1/48\t.\n" +
                    "Now,\t1/48\twork is done by A in 1 day.\n" +
                    "So,\t3/8\twork will be done by A in\t(\t48 x\t3/8\t)\t= 18 days.",
            "Ratio of rates of working of A and B = 2 : 1.\n" +
                    "So, ratio of times taken = 1 : 2.\n" +
                    "B's 1 day's work =\t1/12\t.\n" +
                    "Therefore A's 1 day's work =\t1/6\t; (2 times of B's work)\n" +
                    "(A + B)'s 1 day's work =\t(\t1/6\t+\t1/12\t)\t=\t3/12\t=\t1/4\t.\n" +
                    "So, A and B together can finish the work in 4 days.",
            "(20 x 16) women can complete the work in 1 day.\n" +
                    " 1 woman's 1 day's work =\t1/320\t.\n" +
                    "(16 x 15) men can complete the work in 1 day.\n" +
                    " 1 man's 1 day's work =\t1/240\n" +
                    "So, required ratio\t\n" +
                    "=\t1/240\t:\t1/320\n" +
                    "=\t1/3\t:\t1/4\n" +
                    "= 4 : 3 (cross multiplied)\n",
            "(A + B + C)'s 1 day's work =\t1/6\t;\n" +
                    "(A + B)'s 1 day's work =\t1/8\t;\n" +
                    "(B + C)'s 1 day's work =\t1/12\t.\n" +
                    "Therefore (A + C)'s 1 day's work\t\n" +
                    "=\t(\t2 x\t1/6\t)\t-\t(\t1/8\t+\t1/12\t)\n" +
                    "=\t(\t1/3\t-\t5/24\t(\n" +
                    "=\t3/24\n" +
                    "=\t1/8\t.\n",
            "(B + C)'s 1 day's work =\t\t1/9\t+\t1/12\t\t=\t7/36\t.\n" +
                    "Work done by B and C in 3 days =\t\t7/36\tx 3\t\t=\t7/12\t.\n" +
                    "Remaining work =\t\t1 -\t7/12\t\t=\t5/12\t.\n" +
                    "Now,\t1/24\twork is done by A in 1 day.\n" +
                    "So,\t5\twork is done by A in\t\t24 x\t5/12\t\t= 10 days."

    };



    private String mCorrectAnswers[] = {"Leaves","6 days","12 days","18 days","4 days","4 : 3","8 days","10 days"};


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
