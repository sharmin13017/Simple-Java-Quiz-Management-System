import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Utils {

    public static Scanner sc = new Scanner(System.in);
    public static JSONParser jsonParser = new JSONParser();

    public static int generateRandomQuestionNumber(int min , int max){

        return (int) (( Math.random()*(max-min)  ) +min);

    }

    public static   String doLogin() throws ParseException, IOException {

        System.out.print("Enter Username :  " );
        String userName = sc.nextLine();
        System.out.print("Enter Password :  " );
        String password = sc.nextLine();

        JSONArray jsonArray = readJsonArray("user.json");

        JSONObject adminInfo = (JSONObject) jsonArray.get(0);
        JSONObject studentInfo = (JSONObject) jsonArray.get(1);

        if( ( adminInfo.get("username").toString() ).equals(userName)  &&
                ( adminInfo.get("password").toString() ).equals(password) )

            return adminInfo.get("role").toString() ;


        else if( ( studentInfo.get("username").toString() ).equals(userName)  &&
                ( studentInfo.get("password").toString() ).equals(password) )

            return  studentInfo.get("role").toString();

        else
            return null;


    }

    public  static void updateJSONArray(JSONObject jsonObject) throws IOException, ParseException {
        String fileName = "./src/main/resources/quiz.json";
        JSONArray empArray = (JSONArray) jsonParser.parse( new FileReader(fileName));

        empArray.add(jsonObject);

        FileWriter fw = new FileWriter(fileName);
        fw.write(empArray.toJSONString());
        fw.flush();
        fw.close();


    }


    public static JSONArray readJsonArray(String fileName) throws IOException, ParseException {
        String fileLocation = "./src/main/resources/"+fileName;

        JSONArray jsonArray= (JSONArray) jsonParser.parse( new FileReader(fileLocation));
        return jsonArray;
    }

}