package statsbot.messages.regex;

import java.util.regex.*;

import MessagesModel.Message;
import MessagesModel.ModelFactory;
import MessagesModel.RoundRestartMessage;

public class RoundRestartRegex implements IRegex
{
	private static final String regex = "!World triggered \"Restart_Round_\\((\\d+)_(second|seconds)\\)\"!";
	
	public RoundRestartRegex()
	{
		RegexParser.getInstance().registerRegex(this);
	}

	@Override
	public Message tryCreatingMessage(String input)
	{
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(input);
		RoundRestartMessage message = null;
		
		if(m.find())
		{
			message = ModelFactory.eINSTANCE.createRoundRestartMessage();
		}
		
		return message;
	}
}
