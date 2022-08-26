package dev.cross.model;

import java.sql.Date;

public class Chat {

	int chatID;
	int senderID;
	int recipientID;
	int convoID;
	Date timestamp;
	boolean reported;
	boolean deleted;
	
	
	public Chat(int chatID, int senderID, int recipientID, int convoID, Date timestamp) {
		this.chatID = chatID;
		this.senderID = senderID;
		this.recipientID = recipientID;
		this.convoID = convoID;
		this.timestamp = timestamp;
		this.reported = false;
		this.deleted = false;
	}
	
	
	
}
