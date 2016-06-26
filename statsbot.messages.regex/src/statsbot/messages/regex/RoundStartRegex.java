package statsbot.messages.regex;

import java.util.regex.*;

import MessagesModel.Message;
import MessagesModel.ModelFactory;
import MessagesModel.RoundStartMessage;

public class RoundStartRegex implements IRegex
{
	private static final String regex = "World triggered \"Round_Start\"";

	public RoundStartRegex()
	{
		RegexParser.getInstance().registerRegex(this);
	}
	
	@Override
	public Message tryCreatingMessage(String input)
	{
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(input);
		RoundStartMessage message = null;
		
		if(m.find())
		{
			message = ModelFactory.eINSTANCE.createRoundStartMessage();
		}
		
		return message;
	}
}
