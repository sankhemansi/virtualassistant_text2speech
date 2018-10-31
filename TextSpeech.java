import java.util.Locale; 
import javax.speech.Central; 
import javax.speech.synthesis.Synthesizer; 
import javax.speech.synthesis.SynthesizerModeDesc; 
import java.util.*;
public class TextSpeech 
{ 

    public static void main(String[] args) 
    { 
        //System.out.println(java.time.LocalTime.now());  
        respose_speech rs=new respose_speech();
        find_response fr=new find_response();
        Scanner sc = new Scanner(System.in);
        String s;
        while(true)
        {
            System.out.println("Enter String");
            s=sc.nextLine();
            String res=fr.fetch_response(s);
            rs.speech(res);
        }     
    } 
} 