package com.FCTI;

import java.util.Scanner;

public class QuestionLooper {

    public static String[] questions() {
        Scanner userInput = new Scanner(System.in);
        int reset_flag = 0;
        String[] answerArray = new String[8];

        while (reset_flag == 0) {
            System.out.println("Do you have a red car? (Y or N) ");
            String redCar = userInput.nextLine();
            answerArray[0] = redCar;
            System.out.println("What is the name of your favorite pet? ");
            String favoritePet = userInput.nextLine();
            answerArray[1] = favoritePet;
            System.out.println("What is the first name of your favorite actress or actor? ");
            String favAct = userInput.nextLine();
            answerArray[2] = favAct;
            System.out.println("What is the age of your favorite pet?");
            String petAge = userInput.nextLine();
            answerArray[3] = petAge;
            System.out.println("What is your lucky number?");
            String luckyNum = userInput.nextLine();
            answerArray[4] = luckyNum;
            System.out.println("What is your favorite quarterbacks jersey number? ");
            String jerseyNum = userInput.nextLine();
            answerArray[5] = jerseyNum;
            System.out.println("What is the two-digit model year of your car? ");
            String carModel = userInput.nextLine();
            answerArray[6] = carModel;
            System.out.println("Enter a random number between 1 and 50");
            String ranNum = userInput.nextLine();
            answerArray[7] = ranNum;
            System.out.println("Would you like to change your answers? (Y or N) ");
            String tryAgain = userInput.nextLine();
            if (tryAgain.equals("Y") || tryAgain.equals("y")) {
                System.out.println("Resetting Answers, try again.");
                reset_flag = 0;
            } else {
                reset_flag = 1;
                }
            }
            userInput.close();
            return answerArray;
        }

    }

