package com.melisa.melisa.aptitudeit.quizdirectry;

public class AptNumbers {
        private String mQuestions [] = {
                "This is some test",
                "Which of the following is a perfect square?",
                "Which of following is a prime number?",
                "What should be the least value of x so that the five digit number 143x5 is divisible by 9?",
                "Which of the following numbers is exactly divisible by 11?",
                "In a group, there are 53 persons. The members of the group contributed equally for a charity programme. They contributed a total of Rs.207813. Find the amount contributed by each person.",
                "What is the remainder when 263251 is divided by 9?",
                "When 29\u00B3 is subtracted from the square of a natural number, the result is 1532. Find the number."
        };



        private String mChoices [][] = {
                {"Fruit", "Leaves", "Seeds","Leaves"},
                {"15129","1944","10800","2592"},
                {"373","377","407","623"},
                {"12","7","4","5"},
                {"817634","99136381","1361781","768031429"},
                {"3129","3219","3921","3291"},
                {"3","6","7","1"},
                {"159","157","161","163"}
        };


        private String mHint [] = {
                "Leaves",
                "Perfect Square is A number made by squaring a whole number.\n" +
                        "16 is a perfect square because 4\u00B2 = 16\n" +
                        "25 is also a perfect square because 5\u00B2 = 25\n" +
                        "etc...\n" +
                        "Here, Answer is 15129 Because 123\u00B2 = 15129",
                "A prime number can be divided, without a remainder, only by itself and by 1\n" +
                "So 373 is the prime number",
                "The least value of x is 5",
                "It is easy to tell that the following are multiples of 11: 22, 33, 44, 55, etc\n"+
                "Lets take 768031429\n"+
                "7-6+8-0+3-1+4-2+9=22, Since 22 is divisible by 11\n"+
                "So answer is 768031429",
                "Total contribution = 207813\n"+
                "Total contributors = 53\n"+
                "So,207813 \u00F7 53 = 3921",
                "263251 \u00F7 9 = 29250.111\n"+
                "Remainder = Dividend - Divisor * Quotient\n"+
                "Remainder = 263251 - 9 * 29250\n"+
                "Remainder = 1\n",
                "29\u00B3 - (Natural number)\u00B2 = 1532\n"+
                        "(Natural number)\u00B2 = 1532 + 29\u00B3\n"+
                        "(Natural number)\u00B2 = 1532 + 24389\n"+
                        "(Natural number) = \u221a25921\n"+
                        "(Natural number) = 161\n"

        };



        private String mCorrectAnswers[] = {"Leaves","15129","373","5","768031429","3921","1","161"};


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
