import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Word_Counter{
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter text or provide File's name to count the words :-");

        String userInput = sc.nextLine();
        sc.close();

        String text = "";

        if(userInput.endsWith(".txt")){
            try {
                File file = new File(userInput);
                Scanner fileReader = new Scanner(file);
                while(fileReader.hasNextLine()){
                    text+= fileReader.nextLine();
                }
                fileReader.close();
            } catch (FileNotFoundException e) {
                System.out.println("File not found, Please enter valid file name");
                return;
            }
        } else{
            text= userInput;
        }

        String[] words = text.split("[\\p{Punct}\\s]+");
        int totalWords= words.length;

        System.out.println("total Number Of Words :- " + totalWords);
        

    }
}