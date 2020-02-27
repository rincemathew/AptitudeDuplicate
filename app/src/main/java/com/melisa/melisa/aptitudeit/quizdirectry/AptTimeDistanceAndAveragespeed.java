package com.melisa.melisa.aptitudeit.quizdirectry;

public class AptTimeDistanceAndAveragespeed {
    private String mQuestions [] = {
            "This is some test",
            "In covering a distance of 30 km, Abhay takes 2 hours more than Sameer. If Abhay doubles his speed, then he would take 1 hour less than Sameer. Abhay's speed is:",
            "Robert is travelling on his cycle and has calculated to reach point A at 2 P.M. if he travels at 10 kmph, he will reach there at 12 noon if he travels at 15 kmph. At what speed must he travel to reach A at 1 P.M.?",
            "It takes eight hours for a 600 km journey, if 120 km is done by train and the rest by car. It takes 20 minutes more, if 200 km is done by train and the rest by car. The ratio of the speed of the train to that of the cars is:",
            "A farmer travelled a distance of 61 km in 9 hours. He travelled partly on foot @ 4 km/hr and partly on bicycle @ 9 km/hr. The distance travelled on foot is:",
            "In a flight of 600 km, an aircraft was slowed down due to bad weather. Its average speed for the trip was reduced by 200 km/hr and the time of flight increased by 30 minutes. The duration of the flight is:",
            "A man complete a journey in 10 hours. He travels first half of the journey at the rate of 21 km/hr and second half at the rate of 24 km/hr. Find the total journey in km.",
            "The ratio between the speeds of two trains is 7 : 8. If the second train runs 400 km in 4 hours, then the speed of the first train is:"
    };



    private String mChoices [][] = {
            {"Fruit", "Leaves", "Seeds","Leaves"},
            {"5 kmph","6 kmph","6.25 kmph","7.5 kmph"},
            {"8 kmph","11 kmph","12 kmph","14 kmph"},
            {"2 : 3","3 : 2","3 : 4","4 : 3"},
            {"14 km","15 km","16 km","17 km"},
            {"1 hour","2 hours","3 hours","4 hours"},
            {"220 km","224 km","230 km","234 km"},
            {"70 km/hr","75 km/hr","84 km/hr","87.5 km/hr"}
    };


    private String mHint [] = {
            "Leaves",
            "Let Abhay's speed be x km/hr.\n" +
                    "Then,\t30/x\t-\t302x\t= 3\n" +
                    " 6x = 30\n" +
                    " x = 5 km/hr.",
            "Let the distance travelled by x km.\n" +
                    "Then,\tx/10\t-\tx/15\t= 2\n" +
                    " 3x - 2x = 60\n" +
                    " x = 60 km.\n" +
                    "Time taken to travel 60 km at 10 km/hr =\t\t60/10\thrs\t= 6 hrs.\n" +
                    "So, Robert started 6 hours before 2 P.M. i.e., at 8 A.M.\n" +
                    " Required speed =\t\t60/5\tkmph.\t= 12 kmph.",
            "Let the speed of the train be x km/hr and that of the car be y km/hr.\n" +
                    "Then,\t120/x\t+\t480/y\t= 8       \t1/x\t+\t4/y\t=\t1/15\t....(i)\n" +
                    "And,\t200/x\t+\t400/y\t=\t25/3\t    \t1/x\t+\t2/y\t=\t1/24\t....(ii)\n" +
                    "Solving (i) and (ii), we get: x = 60 and y = 80.\n" +
                    " Ratio of speeds = 60 : 80 = 3 : 4.",
            "Let the distance travelled on foot be x km.\n" +
                    "Then, distance travelled on bicycle = (61 -x) km.\n" +
                    "So,\tx/4\t+\t(61 -x)/9\t= 9\n" +
                    " 9x + 4(61 -x) = 9 x 36\n" +
                    " 5x = 80\n" +
                    " x = 16 km.",
            "Let the duration of the flight be x hours.\n" +
                    "Then,\t600/x\t-\t600/(x + (1/2))\t= 200\n" +
                    "\t600/x\t-\t1200/(2x + 1)\t= 200\n" +
                    " x(2x + 1) = 3\n" +
                    " 2x2 + x - 3 = 0\n" +
                    " (2x + 3)(x - 1) = 0\n" +
                    " x = 1 hr.      [neglecting the -ve value of x]",
            "(1/2)x/21\t+\t(1/2)x/24\t= 10\n" +
                    "\tx/21\t+\tx/24\t= 20\n" +
                    " 15x = 168 x 20\n" +
                    " x =\t\t((168 x 20)/15)\t\t= 224 km.",
            "Let the speed of two trains be 7x and 8x km/hr.\n" +
                    "Then, 8x =\t\t400/4\t\t= 100\n" +
                    " x =\t\t100/8\t\t= 12.5\n" +
                    " Speed of first train = (7 x 12.5) km/hr = 87.5 km/hr."

    };



    private String mCorrectAnswers[] = {"Leaves","5 kmph","12 kmph","3 : 4","16 km","1 hour","224 km","87.5 km/hr"};


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
