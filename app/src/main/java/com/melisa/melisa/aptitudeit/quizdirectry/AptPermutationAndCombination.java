package com.melisa.melisa.aptitudeit.quizdirectry;

public class AptPermutationAndCombination {
    private String mQuestions [] = {
            "This is some test",
            "In how many different ways can the letters of the word 'LEADING' be arranged in such a way that the vowels always come together?",
            "In how many different ways can the letters of the word 'CORPORATION' be arranged so that the vowels always come together?",
            "Out of 7 consonants and 4 vowels, how many words of 3 consonants and 2 vowels can be formed?",
            "In how many ways can the letters of the word 'LEADER' be arranged?",
            "How many 3-digit numbers can be formed from the digits 2, 3, 5, 6, 7 and 9, which are divisible by 5 and none of the digits is repeated?",
            "In how many different ways can the letters of the word 'DETAIL' be arranged in such a way that the vowels occupy only the odd positions?",
            "How many 4-letter words with or without meaning, can be formed out of the letters of the word, 'LOGARITHMS', if repetition of letters is not allowed?"
    };



    private String mChoices [][] = {
            {"Fruit", "Leaves", "Seeds","Leaves"},
            {"360","480","720","5040"},
            {"810","1440","2880","50400"},
            {"210","1050","25200","21400"},
            {"72","144","360","720"},
            {"5","10","15","20"},
            {"32","48","36","60"},
            {"40","400","5040","2520"}
    };


    private String mHint [] = {
            "Leaves",
            "The word 'LEADING' has 7 different letters.\n" +
                    "\n" +
                    "When the vowels EAI are always together, they can be supposed to form one letter.\n" +
                    "\n" +
                    "Then, we have to arrange the letters LNDG (EAI).\n" +
                    "\n" +
                    "Now, 5 (4 + 1 = 5) letters can be arranged in 5! = 120 ways.\n" +
                    "\n" +
                    "The vowels (EAI) can be arranged among themselves in 3! = 6 ways.\n" +
                    "\n" +
                    " Required number of ways = (120 x 6) = 720.",
            "In the word 'CORPORATION', we treat the vowels OOAIO as one letter.\n" +
                    "\n" +
                    "Thus, we have CRPRTN (OOAIO).\n" +
                    "\n" +
                    "This has 7 (6 + 1) letters of which R occurs 2 times and the rest are different.\n" +
                    "\n" +
                    "Number of ways arranging these letters =\t7!/2!= 2520.\n" +
                    "Now, 5 vowels in which O occurs 3 times and the rest are different, can be arranged\n" +
                    "\n" +
                    "in\t5!/3!= 20 ways.\n" +
                    " Required number of ways = (2520 x 20) = 50400.",
                    "Number of ways of selecting (3 consonants out of 7) and (2 vowels out of 4)\n" +
                    "\n" +
                    "     \t= (7C3 x 4C2)\n" +
                    "((7*6*5)/(3*2*1)/(4*3)/(2*1)" +
                    "= 210.\n" +
                    "Number of groups, each having 3 consonants and 2 vowels = 210.\n" +
                    "\n" +
                    "Each group contains 5 letters.\n" +
                    "\n" +
                    "Number of ways of arranging \n" +
                    "5 letters among themselves\t= 5!\n" +
                    "= 5 x 4 x 3 x 2 x 1\n" +
                    "= 120.\n" +
                    " Required number of ways = (210 x 120) = 25200.",
            "The word 'LEADER' contains 6 letters, namely 1L, 2E, 1A, 1D and 1R.\n" +
                    "\n" +
                    " Required number of ways =\t6!/(1!)(2!)(1!)(1!)(1!)\t= 360.\n" ,
            "Since each desired number is divisible by 5, so we must have 5 at the unit place. So, there is 1 way of doing it.\n" +
                    "\n" +
                    "The tens place can now be filled by any of the remaining 5 digits (2, 3, 6, 7, 9). So, there are 5 ways of filling the tens place.\n" +
                    "\n" +
                    "The hundreds place can now be filled by any of the remaining 4 digits. So, there are 4 ways of filling it.\n" +
                    "\n" +
                    " Required number of numbers = (1 x 5 x 4) = 20.",
            "There are 6 letters in the given word, out of which there are 3 vowels and 3 consonants.\n" +
                    "\n" +
                    "Let us mark these positions as under:\n" +
                    "\n" +
                    "(1) (2) (3) (4) (5) (6)\n" +
                    "\n" +
                    "Now, 3 vowels can be placed at any of the three places out 4, marked 1, 3, 5.\n" +
                    "\n" +
                    "Number of ways of arranging the vowels = 3P3 = 3! = 6.\n" +
                    "\n" +
                    "Also, the 3 consonants can be arranged at the remaining 3 positions.\n" +
                    "\n" +
                    "Number of ways of these arrangements = 3P3 = 3! = 6.\n" +
                    "\n" +
                    "Total number of ways = (6 x 6) = 36.",
            "'LOGARITHMS' contains 10 different letters.\n" +
                    "\n" +
                    "Required number of words\t= Number of arrangements of 10 letters, taking 4 at a time.\n" +
                    "= 10P4\n" +
                    "= (10 x 9 x 8 x 7)\n" +
                    "= 5040."

    };



    private String mCorrectAnswers[] = {"Leaves","720","50400","25200","360","20","36","5040"};


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
