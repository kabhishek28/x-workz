// Method which takes account number and return balance; 17 account number

class Balance{
	public static long getBalance(String account_number){
		if(account_number == "1234567890123456"){
			return 52000;
		}
		else if(account_number == "2345678901234567"){
			return 120500;
		}
		else if(account_number == "3456789012345678"){
			return 87900;
		}
		else if(account_number == "4567890123456789"){
			return 15300;
		}
		else if(account_number == "5678901234567890"){
			return 980750;
		}
		else if(account_number == "6789012345678901"){
			return 450600;
		}
		else if(account_number == "7890123456789012"){
			return 234000;
		}
		else if(account_number == "8901234567890123"){
			return 69400;
		}
		else if(account_number == "9012345678901234"){
			return 175900;
		}
		else if(account_number == "1122334455667788"){
			return 560320;
		}
		else if(account_number == "2233445566778899"){
			return 310750;
		}
		else if(account_number == "3344556677889900"){
			return 48600;
		}
		else if(account_number == "4455667788990011"){
			return 890200;
		}
		else if(account_number == "5566778899001122"){
			return 742500;
		}
		else if(account_number == "6677889900112233"){
			return 215000;
		}
		else if(account_number == "7788990011223344"){
			return 198750;
		}
		else if(account_number == "8899001122334455"){
			return 670420;
		}
		else {
			System.out.println("Enter this many account numbers \n1234567890123456\n2345678901234567\n3456789012345678\n4567890123456789\n5678901234567890\n6789012345678901\n7890123456789012\n8901234567890123\n9012345678901234\n1122334455667788\n2233445566778899\n3344556677889900\n4455667788990011\n5566778899001122\n6677889900112233\n7788990011223344\n8899001122334455");
			
		}
		return 0;
	}
}