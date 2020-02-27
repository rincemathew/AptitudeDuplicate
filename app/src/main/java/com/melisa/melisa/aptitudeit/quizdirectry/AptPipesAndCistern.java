package com.melisa.melisa.aptitudeit.quizdirectry;

public class AptPipesAndCistern {
    private String mQuestions [] = {
            "This is some test",
            "One pipe can fill a tank three times as fast as another pipe. If together the two pipes can fill the tank in 36 minutes, then the slower pipe alone will be able to fill the tank in:",
            "A large tanker can be filled by two pipes A and B in 60 minutes and 40 minutes respectively. How many minutes will it take to fill the tanker from empty state if B is used for half the time and A and B fill it together for the other half?",
            "A tank is filled in 5 hours by three pipes A, B and C. The pipe C is twice as fast as B and B is twice as fast as A. How much time will pipe A alone take to fill the tank?",
            "Two pipes A and B can fill a tank in 20 and 30 minutes respectively. If both the pipes are used together, then how long will it take to fill the tank?",
            "Two pipes A and B can fill a tank in 15 minutes and 20 minutes respectively. Both the pipes are opened together but after 4 minutes, pipe A is turned off. What is the total time required to fill the tank?",
            "A pump can fill a tank with water in 2 hours. Because of a leak, it took 2(1/3) hours to fill the tank. The leak can drain all the water of the tank in:",
            "A tank is filled by three pipes with uniform flow. The first two pipes operating simultaneously fill the tank in the same time during which the tank is filled by the third pipe alone. The second pipe fills the tank 5 hours faster than the first pipe and 4 hours slower than the third pipe. The time required by the first pipe is:"
    };



    private String mChoices [][] = {
            {"Fruit", "Leaves", "Seeds","Leaves"},
            {"81 min","108 min","144 min","192 min"},
            {"15 min","20 min","27.5 min","30 min"},
            {"20 hours","25 hours","35 hours","Cannot be determined"},
            {"12 min","15 min","25 min","50 min"},
            {"10 min. 20 sec","11 min. 45 sec","12 min. 30 sec","14 min. 40 sec."},
            {"5 hours","7 hours","8 hours","14 hours"},
            {"6 hours","10 hours","15 hours","30 hours"}
    };


    private String mHint [] = {
            "Leaves",
            "Let the slower pipe alone fill the tank in x minutes.\n" +
                    "Then, faster pipe will fill it in\tx/3\tminutes.\n" +
                    "\t1/x\t+\t3/x\t=\t1/36\n" +
                    "\t4/x\t=\t1/36\n" +
                    " x = 144 min.",
            "Part filled by (A + B) in 1 minute =\t\t1/60\t+\t1/40\t\t=\t1/24\t.\n" +
                    "Suppose the tank is filled in x minutes.\n" +
                    "Then,\tx/2\t\t(1/24\t+\t1/40)\t\t= 1\n" +
                    "\tx/2\tx\t1/15\t= 1\n" +
                    " x = 30 min.",
            "Suppose pipe A alone takes x hours to fill the tank.\n" +
                    "Then, pipes B and C will take\tx/2\tand\tx/4\thours respectively to fill the tank.\n" +
                    "\t1/x\t+\t2/x\t+\t4/x\t=\t1/4\n" +
                    "\t7/x\t=\t1/5\n" +
                    " x = 35 hrs.",
            "Part filled by A in 1 min =\t1/20\t.\n" +
                    "Part filled by B in 1 min =\t1/30\t.\n" +
                    "Part filled by (A + B) in 1 min =\t\t1/20\t+\t1/30\t\t=\t1/12\t.\n" +
                    " Both pipes can fill the tank in 12 minutes.",
            "Part filled in 4 minutes = 4\t\t(1/15\t+\t1/20)\t\t=\t7/15\t.\n" +
                    "Remaining part =\t\t(1 -\t7/15)\t\t=\t8/15\t.\n" +
                    "Part filled by B in 1 minute =\t1\n" +
                    "20\n" +
                    "\t1/20\t:\t8/15\t:: 1 : x\n" +
                    "x =\t\t(8/15\tx 1 x 20)\t\t= 10\t2/3\tmin = 10 min. 40 sec.\n" +
                    " The tank will be full in (4 min. + 10 min. + 40 sec.) = 14 min. 40 sec.",
            "Work done by the leak in 1 hour =\t\t(1/2\t-\t3/7)\t\t=\t1/14\t.\n" +
                    " Leak will empty the tank in 14 hrs.",
            "Suppose, first pipe alone takes x hours to fill the tank .\n" +
                    "\n" +
                    "Then, second and third pipes will take (x -5) and (x - 9) hours respectively to fill the tank.\n" +
                    "\n" +
                    "\t1/x\t+\t1(x-5)\t=\t1(x-9)\n"

    };



    private String mCorrectAnswers[] = {"Leaves","144 min","30 min","35 hours","12 min","14 min. 40 sec.","14 hours","30 hours"};


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
