package statsbot.messages.regex;

import MessagesModel.Message;

public interface IRegex 
{
	Message tryCreatingMessage(String input);
}
