import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class GiveQuiz {

    public static Scanner sc = new Scanner(System.in);


    public static void studentActivity() throws IOException, ParseException {

        System.out.println("Welcome salman to the quiz! We will throw you 10 questions. Each MCQ mark is 1 and no negative marking. \n" +
                "Are you ready? Press 's' to start.");
        String nextStep = sc.nextLine();

        if(!nextStep.equals("s")){
            System.out.println("Invalid input. Quiz is terminated");
            return;}

        JSONArray questionBank = Utils.readJsonArray("quiz.json");

        int count = 0;
        String repeat;
        while (true) {
            HashSet<Integer> set = new HashSet<>();
            for (int i = 1; i <= 10; i++) {

                int questionNumber = Utils.generateRandomQuestionNumber(0, questionBank.size() - 1);
                if(i==1) set.add(questionNumber);

                while( set.contains(questionNumber)  ){
                    questionNumber = Utils.generateRandomQuestionNumber(0, questionBank.size() - 1);
                }

                set.add(questionNumber);

                JSONObject qsnObj = (JSONObject) questionBank.get(questionNumber);


                System.out.println("[Question " + i + "] " + qsnObj.get("question").toString());
                System.out.println("1. " + qsnObj.get("option 1").toString());
                System.out.println("2. " + qsnObj.get("option 2").toString());
                System.out.println("3. " + qsnObj.get("option 3").toString());
                System.out.println("4. " + qsnObj.get("option 4").toString());

                String actualAns = qsnObj.get("answerkey").toString();

                String givenAns = sc.nextLine();

                if (actualAns.equals(givenAns))
                    count++;

            }

            if (count >= 8) System.out.println("Excellent! You have got " + count + " out of 10");
            else if (count >= 5) System.out.println("Good. You have got " + count + " out of 10");
            else if (count >= 2) System.out.println("Very poor! You have got " + count + " out of 10");
            else System.out.println("Very sorry you are failed. You have got " + count + "  out of 10");

            System.out.println("Would you like to start again? press s for start or q for quit");
            repeat = sc.nextLine();
            while ( !repeat.equals("q") && !repeat.equals("s") ){

                System.out.println("Invalid input. Please press s for start and q for quit");
                repeat = sc.nextLine();

            }

            if ( repeat.equals("q") ){
                System.out.println("You Quited"); break; }
        }
    }



}