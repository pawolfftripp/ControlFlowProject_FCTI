package com.FCTI;

import java.util.Arrays;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

            String[] questions = new String[0];
            int petAge;
            int luckyNum;
            int jerseyNum;
            int carModel;
            int ranNum;

            Scanner userInput = new Scanner(System.in);
            AsciiCharacters.printNumbers();
            AsciiCharacters.printLowerCase();
            AsciiCharacters.printUpperCase();
            System.out.println();

            System.out.print("Please enter your name: ");
            String userName = userInput.nextLine();
            System.out.printf("Hello, %s. Would you like to continue to the interactive portion? (Y)es or (N)o :", userName);
            String continueUser = userInput.nextLine();

            if (continueUser.equals("Y") || continueUser.equals("y") || continueUser.equals("yes")) {
                questions = QuestionLooper.questions();
                //System.out.println(Arrays.toString(questions));

            } else {
                System.out.println("Exiting Application");
                System.exit(0);
            }
            //convert questions array (elements 3 - 7) to an integer
            String petName = questions[1];
            String favActor = questions[2];
            petAge = Integer.parseInt(questions[3]);
            luckyNum = Integer.parseInt(questions[4]);
            jerseyNum = Integer.parseInt(questions[5]);
            carModel = Integer.parseInt(questions[6]);
            ranNum = Integer.parseInt(questions[7]);

            int magicNumber = NumberGenerator.magicBall(jerseyNum);
            int lotteryNum1 = NumberGenerator.lotteryAdd2(carModel, luckyNum);
            int lotteryNum2 = NumberGenerator.lotteryAdd2(petAge, carModel);
            int lotteryNum3 = NumberGenerator.lotteryLetter(petName, 3);
            int lotteryNum4 = NumberGenerator.lotteryLetter(favActor, 1);
            int lotteryNum5 = NumberGenerator.lotteryAdd3(jerseyNum, petAge, luckyNum);

            System.out.printf("Lottery Numbers: %s, %s, %s, %s, %s, Magic Ball: %s", lotteryNum1, lotteryNum2, lotteryNum3,
                    lotteryNum4, lotteryNum5, magicNumber);
            System.out.println();
            System.out.println("Would you like to play again? (Y)es or (N)o ");
            //String userReset = userInput.nextLine();
                System.out.println("Thanks for playing. Goodbye.");
                userInput.close();
                System.exit(0);
//            }
        }
    }


