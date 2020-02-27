package com.melisa.melisa.aptitudeit.quizdirectry;

public class AptBoatAndStream {
    private String mQuestions [] = {
            "This is some test",
            "A boatman takes 3 hours 45 minutes to travel 15 km downstream and takes 2 hours 30 minutes to travel 5 km upstream of a river. What is the speed of the stream of the river in km/h?",
            "A speedboat runs 6 km upstream in a river and comes back to the starting point in 33 minutes. The stream of the river is running at 2 km/hr. What is the speed of speedboat in still water?",
            "A motorboat crosses a certain distance in 1 hour and comes back in 1½ hours. If the stream is running at 3 km/h, find out the speed of motorboat in still water.",
            "A boat covers a certain distance downstream in 1 hour, while it comes back in 1½ hours. If the speed of the stream be 3 kmph, what is the speed of the boat in still water?",
            "A boat running downstream covers a distance of 16 km in 2 hours while for covering the same distance upstream, it takes 4 hours. What is the speed of the boat in still water?",
            "In one hour, a boat goes 11 km/hr along the stream and 5 km/hr against the stream. The speed of the boat in still water (in km/hr) is:",
            "A boat can travel with a speed of 13 km/hr in still water. If the speed of the stream is 4 km/hr, find the time taken by the boat to go 68 km downstream."
    };



    private String mChoices [][] = {
            {"Fruit", "Leaves", "Seeds","Leaves"},
            {"1 km/h","3 km/h","4 km/h","5 km/h"},
            {"21 km/h","22 km/h","23 km/h","24 km/h"},
            {"10 km/h","12 km/h","15 km/h","17 km/h"},
            {"12 kmph","13 kmph","14 kmph","15 kmph"},
            {"4 km/hr","6 km/hr","8 km/hr","Data inadequate"},
            {"3 km/hr","5 km/hr","8 km/hr","9 km/hr"},
            {"2 hours","3 hours","4 hours","5 hours"}
    };


    private String mHint [] = {
            "Leaves",
            "Downstream:\n" +
                    "Time taken = 3 + 45/60 = 3 + 3/4 = 15/4 h.\n" +
                    "Distance covered = 15 km.\n" +
                    "Downstream Speed = 15 / (15/4) = 4 km/h.\n" +
                    "Upstream:\n" +
                    "Time taken = 2 + 30/60 = 2 + 1/2 = 5/2 h.\n" +
                    "Distance covered = 5 km.\n" +
                    "Upstream Speed = 5 / (5/2) = 2 km/h.\n" +
                    "We know, speed of stream = 1/2 (Downstream Speed – Upstream Speed) = 1/2 (4-2) = 1 km/h.\n",
            "Let the speed of speedboat in still water be x km/h.\n" +
                    "Then, speed downstream = (x + 2) km/h, speed upstream = (x – 2) km/h.\n" +
                    "Since it goes 6 km upstream and comes back in 33 minutes, we have\n" +
                    "6/(x+2) + 6/(x-2) = 33/60\n" +
                    "⇒ 11x² – 240x – 44 = 0\n" +
                    "⇒ 11x² – 242x + 2x – 44 = 0\n" +
                    "⇒ (x – 22)(11x + 2) = 0\n" +
                    "⇒ x = 22.\n" +
                    "Therefore, the required speed = 22 km/h.",
            "Let the speed of motorboat in still water be x km/h. Then,\n" +
                    "Downstream speed = (x + 3) km/h.\n" +
                    "Upstream speed = (x – 3) km/h.\n" +
                    "Then, (x + 3) × 1 = (x – 3) × 3/2\n" +
                    "⇒ 2x + 6 = 3x – 9\n" +
                    "⇒ x = 15.\n" +
                    "So, the speed of motorboat in still water is 15 km/h.",
            "Let the speed of the boat in still water be x kmph. Then,\n" +
                    "\n" +
                    "Speed downstream = (x + 3) kmph,\n" +
                    "\n" +
                    "Speed upstream = (x - 3) kmph.\n" +
                    "\n" +
                    " (x + 3) x 1 = (x - 3) x\t3\n" +
                    "2\n" +
                    " 2x + 6 = 3x - 9\n" +
                    "\n" +
                    " x = 15 kmph.",
            "Rate downstream =(16/2)kmph = 8 kmph.\n" +
                    "Rate upstream =\t16/4kmph = 4 kmph.\n" +
                    "Speed in still water =\t1/2(8 + 4) kmph = 6 kmph.",
            "Speed in still water =1/2(11 + 5) kmph = 8 kmph.\n",
            "Speed downstream = (13 + 4) km/hr = 17 km/hr.\n" +
                    "Time taken to travel 68 km downstream = 68/17 hrs = 4 hrs.\n"


    };



    private String mCorrectAnswers[] = {"Leaves","1 km/h","22 km/h","15 km/h","15 kmph","6 km/hr","8 km/hr","4 hours"};


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
