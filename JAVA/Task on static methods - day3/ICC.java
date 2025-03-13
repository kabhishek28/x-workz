class ICC{
    
    public static void headquarters() {
		System.out.println("invoking the methods MncCompany class from 3.6 to 3.10");

		MncCompany.legalCompliance();
        MncCompany.revenue();
        MncCompany.technology();
        MncCompany.customerBase();
        MncCompany.culturalAdaptation();
		System.out.println("invoking the methods ICC class from 4.1 to 4.5");
    
        System.out.println("4.1.ICC Headquarters: Dubai, UAE.");
		tournaments();
    }


    public static void tournaments() {
        System.out.println("4.2.Major Tournaments: ICC World Cup, T20 World Cup, Champions Trophy.");
		rankings();
    }

    
    public static void rankings() {
        System.out.println("4.3.ICC maintains rankings for Teams, Batsmen, Bowlers, and All-rounders.");
		memberNations();
    }

    
    public static void memberNations() {
        System.out.println("4.4.ICC has 108 member nations (Full & Associate Members).");
		rulesAndRegulations();
    }

    
    public static void rulesAndRegulations() {
        System.out.println("4.5.ICC creates and enforces cricket rules worldwide.");
    }

   
    public static void umpiresAndReferees() {
        System.out.println("4.6.Elite Panel of Umpires & Match Referees oversee international matches.");
    }

    
    public static void antiCorruptionUnit() {
        System.out.println("4.7.ICC has an Anti-Corruption Unit to prevent match-fixing and illegal betting.");
    }

    
    public static void revenue() {
        System.out.println("4.8.ICC earns revenue through broadcasting rights, sponsorships, and events.");
    }

    
    public static void playerAwards() {
        System.out.println("4.9.ICC Awards: Cricketer of the Year, Emerging Player, Spirit of Cricket Award.");
    }

    
    public static void developmentPrograms() {
        System.out.println("4.10.ICC promotes cricket through development programs in Associate Nations.");
    }

    public static void main(String[] args) {
        

		

        headquarters();
		
		
    }
}
