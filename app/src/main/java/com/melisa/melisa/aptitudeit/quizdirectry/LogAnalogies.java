package com.melisa.melisa.aptitudeit.quizdirectry;

public class LogAnalogies {
    private String mQuestions [] = {
            "This is some test",
            "Artist is to painting as senator is to",
            "Exercise is to gym as eating is to",
            "Candid is to indirect as honest is to",
            "Guide is to direct as reduce is to",
            "Oar is to rowboat as foot is to",
            "Careful is to cautious as boastful is to",
            "Pen is to poet as needle is to"
    };



    private String mChoices [][] = {
            {"Fruit", "Leaves", "Seeds","Leaves"},
            {"attorney","law","politician","constituents"},
            {"food","dieting","fitness","restaurant"},
            {"frank","wicked","truthful","untruthful"},
            {"decrease","maintain","increase","preserve"},
            {"running","sneaker","skateboard","jumping"},
            {"arrogant","humble","joyful","suspicious"},
            {"thread","button","sewing","tailor"}
    };


    private String mHint [] = {
            "Leaves",
            "An artist makes paintings; a senator makes laws. The answer is not choice a because an attorney does not make laws and a senator is not an attorney. Choice c is incorrect because a senator is not a politician. Constituents (choice d) is also incorrect because a senator serves his or her constituents.",
            "A gym is a place where people exercise. A restaurant is a place where people eat. Food (choice a) is not the answer because it is something people eat, not a place or location where they eat. The answer is not choice b or c because neither represents a place where people eat.",
            "Candid and indirect refer to opposing traits. Honest and untruthful refer to opposing traits. The answer is not choice a because frank means the same thing as candid.Wicked (choice b) is incorrect because even though it refers to a negative trait, it does not mean the opposite of honest. (Choice c) is incorrect because truthful and honest mean the same thing.",
            "Guide and direct are synonyms, and reduce and decrease are synonyms. The answer is not choice b or d because neither means the same as reduce. (Choice c) is incorrect because increase is the opposite of reduce.",
            "An oar puts a rowboat into motion. A foot puts a skateboard into motion. The answer is not choice a because running is not an object that is put into motion by a foot. Sneaker (choice b) is incorrect because it is something worn on a foot. Jumping (choice d) is incorrect because although you do need feet to jump, jumping is not an object that is put into motion by means of a foot.",
            "Careful and cautious are synonyms (they mean the same thing). Boastful and arrogant are also synonyms. The answer is not (choice b) because humble means the opposite of boastful. The answer is not choice c or d because neither means the same as boastful.",
            "A pen is a tool used by a poet. A needle is a tool used by a tailor. The answer is not choice a, b, or c because none is a person and therefore cannot complete the analogy."

    };



    private String mCorrectAnswers[] = {"Leaves","law","restaurant","untruthful","decrease","skateboard","arrogant","tailor"};


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
