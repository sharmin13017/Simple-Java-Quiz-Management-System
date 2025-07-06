import org.json.simple.parser.ParseException;

import java.io.IOException;

public class QuizExecutionMain {

    public static void main(String[] args) throws ParseException, IOException {

        String userRole = Utils.doLogin();

        if(userRole == null)
        {
            System.out.println("Incorrect Username or Password. Exiting From System.");
            return;
        }


        if(userRole.equals( "admin" ) )
            CreateQuiz.adminActivity();

        else
            GiveQuiz.studentActivity();

    }


}