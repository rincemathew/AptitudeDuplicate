package com.melisa.melisa.aptitudeit.quizdirectry;

public class LogDirections {
    private String mQuestions [] = {
            "This is some test",
            "One morning after sunrise, Suresh was standing facing a pole. The shadow of the pole fell exactly to his right. To which direction was he facing?",
            "A child went 90 m in the East to look for his father, then he turned right and went 20 m. After this he turned right and after going 30 m he reached to his uncle's house. His father was not there. From there he went 100 m to his north and met his father. How far did he meet his father from the starting point?",
            "Four friends A, B, C and D live in a same locality. The house of B is in the east of A's house but in the north of C's house. The house of C is in the west of D's house. D's house is in which direction of A's house?",
            "Umesh directly went from P, to Q which is 9 feet distant. Then he turns to the right and walked 4 feet. After this he turned to the right and walked a distance which is equal from P to Q. Finally he turned to the right and walked 3 feet. How far is he now from P?",
            "Shyam walks 5 km towards East and then turns left and walks 6 km. Again he turns right and walks 9 km. Finally he turns to his right and walks 6 km. How far is he from the starting point?",
            "Amit started walking positioning his back towards the sun. After some time, he turned left, then turned right and towards the left again. In which direction is he going now?",
            "Rohit walked 25 m towards south. Then he turned to his left and walked 20 m. He then turned to his left and walked 25 m. He again turned to his right and walked 15 m. At what distance is he from the starting point and in which direction?"
    };



    private String mChoices [][] = {
            {"Fruit", "Leaves", "Seeds","Leaves"},
            {"East","South","West","Data is inadequate"},
            {"80 m","100 m","140 m","260 m"},
            {"South-East","North-East","East","Data is inadequate"},
            {"6 feet","5 feet","1 feet","0 feet"},
            {"26 km","21 km","14 km","9 km"},
            {"North or South","East or West","North or West","South or West"},
            {"35 m East","35 m North","30 m West","45 m East"}
    };


    private String mHint [] = {
            "Leaves",
            "Sun rises in the east in the morning. Since the shadow of Suresh falls to his right. So he is facing South.",
            "Required distance = 100m",
            "D's house is in the South-East direction of A.",
            "Required distance 4-3 = 1ft",
            "Required distance 5+9 = 14km",
            "If he starts walking the morning then finally he will face towards South and if he starts in the evening then finally he will face towards North.",
            "Required distance 20+15 = 25m towards east"

    };



    private String mCorrectAnswers[] = {"Leaves","South","100 m","South-East","1 feet","14 km","North or South","35 m East"};


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
