class IPLCup{
    public static void tournamentName() {
		
		System.out.println("invoking the methods RCB class from 5.6 to 5.10");
		RCB.iplTitles();
        RCB.sponsors();
        RCB.jerseyColor();
        RCB.fanBase();
        RCB.socialMedia();
       System.out.println("invoking the methods iplCup class from 6.1 to 6.5");

        System.out.println("6.1.Tournament Name: Indian Premier League (IPL)");
		organizer();
    }

    public static void organizer() {
        System.out.println("6.2.Organizer: Board of Control for Cricket in India (BCCI)");
		firstSeason();
    }

    public static void firstSeason() {
        System.out.println("6.3.First Season: 2008");
		teams();
    }

    public static void teams() {
        System.out.println("6.4.Total Teams: 10");
		format();
    }

    public static void format() {
        System.out.println("6.5.Format: T20 League with Round-Robin and Playoffs");
    }

    public static void currentChampion() {
        System.out.println("6.6.Current Champion: Chennai Super Kings (CSK)");
		mostTitles();
    }

    public static void mostTitles() {
        System.out.println("6.7.Most Titles: Mumbai Indians & Chennai Super Kings (5 titles each)");
		venues();
		
    }

    public static void venues() {
        System.out.println("6.8.Venues: Various stadiums across India");
		sponsorship();
    }

    public static void sponsorship() {
        System.out.println("6.9.Sponsorship: Tata Group (Title Sponsor)");
		prizeMoney();
    }

    public static void prizeMoney() {
        System.out.println("6.10.Prize Money: ₹20 Crore for Winners");
    }

    public static void main(String[] args) {
		tournamentName();
		
       
		
        
	}
        
}