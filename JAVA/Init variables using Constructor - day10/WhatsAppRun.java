class WhatsAppRun{
	public static void main(String[] args){
		int noOfGroup;
		int noOfContacts;
		int noOfCommunity;
		
		noOfGroup = 4;
		noOfContacts = 25;
		noOfCommunity = 5;
		WhatsApp whatapp1 = new WhatsApp(noOfGroup,noOfContacts,noOfCommunity);
		System.out.println("noOfGroup : "+whatapp1.noOfGroup+" noOfContacts : "+whatapp1.noOfContacts+"noOfCommunity : "+whatapp1.noOfCommunity);
		
		noOfGroup = 6;
		noOfContacts = 30;
		noOfCommunity = 2;
		WhatsApp whatapp2 = new WhatsApp(noOfGroup,noOfContacts,noOfCommunity);
		System.out.println("noOfGroup : "+whatapp2.noOfGroup+" noOfContacts : "+whatapp2.noOfContacts+"noOfCommunity : "+whatapp2.noOfCommunity);
		
		noOfGroup = 10;
		noOfContacts = 60;
		noOfCommunity = 12;
		WhatsApp whatapp3 = new WhatsApp(noOfGroup,noOfContacts,noOfCommunity);
		System.out.println("noOfGroup : "+whatapp3.noOfGroup+" noOfContacts : "+whatapp3.noOfContacts+"noOfCommunity : "+whatapp3.noOfCommunity);
		
		noOfGroup = 14;
		noOfContacts = 250;
		noOfCommunity = 25;
		WhatsApp whatapp4 = new WhatsApp(noOfGroup,noOfContacts,noOfCommunity);
		System.out.println("noOfGroup : "+whatapp4.noOfGroup+" noOfContacts : "+whatapp4.noOfContacts+"noOfCommunity : "+whatapp4.noOfCommunity);
		
		noOfGroup = 40;
		noOfContacts = 955;
		noOfCommunity = 37;
		WhatsApp whatapp5 = new WhatsApp(noOfGroup,noOfContacts,noOfCommunity);
		System.out.println("noOfGroup : "+whatapp5.noOfGroup+" noOfContacts : "+whatapp5.noOfContacts+"noOfCommunity : "+whatapp5.noOfCommunity);
		
	}
}