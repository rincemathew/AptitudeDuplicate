package com.melisa.melisa.aptitudeit.quizdirectry;

public class AptTrain {
    private String mQuestions [] = {
            "This is some test",
            "How many seconds will a 500 metre long train take to cross a man walking with a speed of 3 km/hr in the direction of the moving train if the speed of the train is 63 km/hr?",
            "Two goods train each 500 m long, are running in opposite directions on parallel tracks. Their speeds are 45 km/hr and 30 km/hr respectively. Find the time taken by the slower train to pass the driver of the faster one",
            "Two trains are running in opposite directions with the same speed. If the length of each train is 120 metres and they cross each other in 12 seconds, then the speed of each train (in km/hr) is:",
            "Two trains of equal lengths take 10 seconds and 15 seconds respectively to cross a telegraph post. If the length of each train be 120 metres, in what time (in seconds) will they cross each other travelling in opposite direction?",
            "A train 108 m long moving at a speed of 50 km/hr crosses a train 112 m long coming from opposite direction in 6 seconds. The speed of the second train is:",
            "A train overtakes two persons who are walking in the same direction in which the train is going, at the rate of 2 kmph and 4 kmph and passes them completely in 9 and 10 seconds respectively. The length of the train is:",
            "A train overtakes two persons walking along a railway track. The first one walks at 4.5 km/hr. The other one walks at 5.4 km/hr. The train needs 8.4 and 8.5 seconds respectively to overtake them. What is the speed of the train if both the persons are walking in the same direction as the train?"
    };



    private String mChoices [][] = {
            {"Fruit", "Leaves", "Seeds","Leaves"},
            {"25","30","40","45"},
            {"12 sec","24 sec","48 sec","60 sec"},
            {"10","18","36","72"},
            {"10","12","15","20"},
            {"48 km/hr","54 km/hr","66 km/hr","82 km/hr"},
            {"45 m","50 m","54 m","72 m"},
            {"66 km/hr","72 km/hr","78 km/hr","81 km/hr"}
    };


    private String mHint [] = {
            "Leaves",
            "Speed of the train relative to man\t= (63 - 3) km/hr\n" +
                    "= 60 km/hr\n" +
                    "=\t(\t60 x\t(5/18)\t)\tm/sec\n" +
                    "=\t(\t50/3\t(\tm/sec.\n" +
                    "Therefore Time taken to pass the man\t\n" +
                    "=\t(\t500 x\t3/50\t)\tsec\n" +
                    "= 30 sec.",
            "Relative speed =\t= (45 + 30) km/hr\n" +
                    "=\t(\t75 x\t5/18\t)\tm/sec\n" +
                    "=\t(\t125/6\t)\tm/sec.\n" +
                    "We have to find the time taken by the slower train to pass the DRIVER of the faster train and not the complete train.\n" +
                    "So, distance covered = Length of the slower train.\n" +
                    "Therefore, Distance covered = 500 m.\n" +
                    "Therefore Required time =\t(\t500 x\t6/125\t)\t= 24 sec.",
            "Let the speed of each train be x m/sec.\n" +
                    "Then, relative speed of the two trains = 2x m/sec.\n" +
                    "So, 2x =\t(120 + 120)/12\n" +
                    "=> 2x = 20\n" +
                    "=> x = 10.\n" +
                    "Therefore Speed of each train = 10 m/sec =\t(\t10 x\t18/5\t)\tkm/hr = 36 km/hr.",
            "Speed of the first train =\t(\t120/10\t)\tm/sec = 12 m/sec.\n" +
                    "Speed of the second train =\t(\t120/15\t)\tm/sec = 8 m/sec.\n" +
                    "Relative speed = (12 + 8) = 20 m/sec.\n" +
                    "Therefore Required time =\t[\t(120 + 120)/20\t]\tsec = 12 sec.\n",
            "Let the speed of the second train be x km/hr.\n" +
                    "Relative speed\t= (x + 50) km/hr\n" +
                    "=\t[\t(x + 50) x\t5/18\t]\tm/sec\n" +
                    "=\t[\t(250 + 5x)/18\t]\tm/sec.\n" +
                    "Distance covered = (108 + 112) = 220 m.\n" +
                    "Therefore\t(220/(\t(250 + 5x)/18\t)\t= 6\n" +
                    "=> 250 + 5x = 660\n" +
                    "=> x = 82 km/hr.",
            "2 kmph =\t(\t2 x\t5/18\t)\tm/sec =\t5/9\tm/sec.\n" +
                    "4 kmph =\t(\t4 x\t5/18\t)\tm/sec =\t10/9\tm/sec.\n" +
                    "Let the length of the train be x metres and its speed by y m/sec.\n" +
                    "Then,\t(\tx\t/(y-(5/9)))\t= 9 and\t(\tx\t/(y-(10/9)))\t= 10.\n" +
                    "Therefore 9y - 5 = x and 10(9y - 10) = 9x\n" +
                    "=> 9y - x = 5 and 90y - 9x = 100.\n" +
                    "On solving, we get: x = 50.\n" +
                    "Therefore Length of the train is 50 m.",
            "4.5 km/hr =\t(\t4.5 x\t5/18\t)\tm/sec =\t5/4\tm/sec = 1.25 m/sec, and\n" +
                    "5.4 km/hr =\t(\t5.4 x\t5/18\t)\tm/sec =\t3/2\tm/sec = 1.5 m/sec.\n" +
                    "Let the speed of the train be x m/sec.\n" +
                    "Then, (x - 1.25) x 8.4 = (x - 1.5) x 8.5\n" +
                    "=> 8.4x - 10.5 = 8.5x - 12.75\n" +
                    "=> 0.1x = 2.25\n" +
                    "=> x = 22.5\n" +
                    "Therefore Speed of the train =\t(\t22.5 x\t18/5\t)\tkm/hr = 81 km/hr.\n"

    };



    private String mCorrectAnswers[] = {"Leaves","30","24 sec","36","12","82 km/hr","50 m","81 km/hr"};


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
