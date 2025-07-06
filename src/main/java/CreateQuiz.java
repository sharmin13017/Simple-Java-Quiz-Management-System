import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.util.Scanner;

public class CreateQuiz {

    public static Scanner sc = new Scanner(System.in);

    public static void adminActivity() throws IOException, ParseException {




        System.out.println("Welcome admin! Please create new questions in the question bank.\n");

        String nextStep ;

        while ( true ) {


            System.out.println("Input your question");
            String qusn = sc.nextLine();
            System.out.println();
            System.out.println("Input option 1:");
            String optn1 = sc.nextLine();
            System.out.println("Input option 2:");
            String optn2 = sc.nextLine();
            System.out.println("Input option 3:");
            String optn3 = sc.nextLine();
            System.out.println("Input option 4:");
            String optn4 = sc.nextLine();
            System.out.println("What is the answer key?");
            int ans = sc.nextInt();

            // Create a JSONObject using the above data
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("question",qusn);
            jsonObject.put("option 1",optn1);
            jsonObject.put("option 2", optn2 );
            jsonObject.put("option 3", optn3);
            jsonObject.put("option 4", optn4 );
            jsonObject.put("answerkey", ans);
            sc.nextLine();  // used this bcz compiler ignores string input just after integer / double input


            Utils.updateJSONArray(jsonObject);


            System.out.println("Saved successfully! Do you want to add more questions?\n (press s for start and q for quit)");
            nextStep = sc.nextLine();

            while ( !nextStep.equals("q") && !nextStep.equals("s") ){

                System.out.println("Invalid input. Please press s for start and q for quit");
                nextStep = sc.nextLine();

            }

            if ( nextStep.equals("q") ) break;

        }

        System.out.println("You Quited !!");

    }

}