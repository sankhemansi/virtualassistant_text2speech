public class find_response {
    String fetch_response(String command)
    {
        String response=""; 
        command=command.toLowerCase();
        switch(command)
        {
        case "hi":response="hello how may I help you?";
                break;
        case "hello":response="hello how may I help you?";
                    break;
        case "hey":response="hello how may I help you?";
                break;
        case "":response="hello how may I help you?";
        		break;
        case "how are you?":response="i am fine. how about you?";
				break;
        case "i am fine":response="great!!! how may I help you?";
				break;
        default :response=command;
        		break;
        }        
        return response;
    }

}