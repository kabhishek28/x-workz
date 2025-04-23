package com.xworkz.Interfaceandimplementation.runner;

import com.xworkz.Interfaceandimplementation.external.user.*;
import com.xworkz.Interfaceandimplementation.internal.implementation.*;
import com.xworkz.Interfaceandimplementation.internal.rules.*;



public class AllRunneer {
    public static void main(String[] args) {
        System.out.println("--------------------1------------------");
        ICC icc = new IndianCricketTeamIcc();
        BCCI bcci = new BCCI(icc);
        bcci.getRules();

        System.out.println("------------------------2------------------");
        Consitution consitution = new CitizenConstituion();
        Government government = new Government(consitution);
        government.getConsitution();

        System.out.println("--------------------3-----------------");
        Laptop laptop = new Windows();
        OperatingSystem operatingSystem = new OperatingSystem(laptop);
        operatingSystem.getLaptop();

        System.out.println("--------------------4---------------------");
        HealthCareRegulations healthCareRegulations = new CityHospitalHealthCare();
        Hospital hospital = new Hospital(healthCareRegulations);
        hospital.getHealthCareRegulations();

        System.out.println("--------------------5-----------------------");
        UGC ugc = new StateUniversityUGCImpl();
        University university = new University(ugc);
        university.getUGC();

        System.out.println("----------------6-----------------");
        RBI rbi = new NationalBankRBIImpl();
        Bank bank = new Bank(rbi);
        bank.getRBI();

        System.out.println("-----------------7-------------------");
        DGCA dgca = new IndigoAirlineDGCAImpl();
        Airline airline = new Airline(dgca);
        airline.getDGCA();

        System.out.println("---------------8----------------");
        PollutionControlBoard pollutionControlBoard = new SteelFactoryPollutionImpl();
        Factory factory = new Factory(pollutionControlBoard);
        factory.getPollutionControlBoard();

        System.out.println("----------------9----------------");
        EducationBoard educationBoard = new HighSchoolBoardImpl();
        School school = new School(educationBoard);
        school.getEducationBroad();

        System.out.println("--------------------10-----------------");
        LabourLaw labourLaw = new ITCompanyLabourLawImpl();
        Company company = new Company(labourLaw);
        company.getLabourLaw();

        System.out.println("------------11-------------------");
        FoodSafetyAuthority foodSafetyAuthority = new LuxuryHotelFSSAIImpl();
        Hotel hotel = new Hotel(foodSafetyAuthority);
        hotel.getHotel();


        System.out.println("------------------------12--------------------");
        TRAI trai = new NewsChannelTRAIImpl();
        TVChannel tvChannel = new TVChannel(trai);
        tvChannel.getTV();

        System.out.println("----------------13---------------------");
        DrugControlBoard drugControlBoard = new RetailPharmacyDrugBoardImpl();
        Pharmacy pharmacy = new Pharmacy(drugControlBoard);
        pharmacy.getDrugControlBoard();

        System.out.println("----------------------14-------------------");
        CensorBoard censorBoard = new CinemaTheatre();
        PVRTheatreCensorImpl pvrTheatreCensor = new PVRTheatreCensorImpl(censorBoard);
        pvrTheatreCensor.getCensor();

        System.out.println("-------------------15------------------");
        ConsumerProtection consumerProtection = new OnlineStore();
        AmazonConsumerProtectionImpl amazon = new AmazonConsumerProtectionImpl(consumerProtection);
        amazon.checkPolicy();

        System.out.println("----------------------16-------------------");
        DigitalSecurity digitalSecurity = new AppStore();
        PlayStoreSecurityImpl playStore = new PlayStoreSecurityImpl(digitalSecurity);
        playStore.performAppCheck();


        System.out.println("--------------- 17: TransportRules ----------------");
        TransportRules transportRules = new TaxiService();
        OlaTransportRulesImpl ola = new OlaTransportRulesImpl(transportRules);
        ola.checkRules();

        System.out.println("--------------- 18: SpaceRules ----------------");
        InternationalSpaceRules spaceRules = new SpaceAgency();
        ISROLaunchImpl isro = new ISROLaunchImpl(spaceRules);
        isro.executeLaunch();

        System.out.println("--------------- 19: IOTSecurity ----------------");
        IOTSecurity iotSecurity = new SmartHomeDevice();
        AlexaSecurityImpl alexa = new AlexaSecurityImpl(iotSecurity);
        alexa.secureDevice();

        System.out.println("--------------- 20: PaymentSecurity ----------------");
        PaymentSecurity payment = new ECommercePlatform();
        FlipkartPaymentImpl flipkart = new FlipkartPaymentImpl(payment);
        flipkart.startTransaction();

        System.out.println("--------------- 21: ParentalControl ----------------");
        ParentalControl control = new GameApp();
        PUBGParentalControlImpl pubg = new PUBGParentalControlImpl(control);
        pubg.enforceControl();

        System.out.println("--------------- 22: CopyrightRules ----------------");
        CopyrightRules copyright = new StreamingPlatform();
        NetflixCopyrightImpl netflix = new NetflixCopyrightImpl(copyright);
        netflix.checkContentLicense();

        System.out.println("--------------- 23: TrackingSystem ----------------");
        TrackingSystem tracking = new DeliveryService();
        FedExTrackingImpl fedEx = new FedExTrackingImpl(tracking);
        fedEx.checkPackageStatus();

        System.out.println("--------------- 24: BookRules ----------------");
        BookRules book = new LibrarySystem();
        LocalLibraryBookImpl library = new LocalLibraryBookImpl(book);
        library.verifyBookStatus();

        System.out.println("--------------- 25: ContentModeration ----------------");
        ContentModeration content = new MusicApp();
        SpotifyContentModerationImpl spotify = new SpotifyContentModerationImpl(content);
        spotify.moderateContent();

        System.out.println("--------------- 26: PrivacyPolicy ----------------");
        PrivacyPolicy privacy = new SocialMediaApp();
        FacebookPrivacyImpl facebook = new FacebookPrivacyImpl(privacy);
        facebook.applyPrivacy();

        System.out.println("--------------- 27: ForecastRules ----------------");
        ForecastRules forecast = new WeatherStation();
        AccuWeatherForecastImpl accuWeather = new AccuWeatherForecastImpl(forecast);
        accuWeather.displayForecast();

        System.out.println("--------------- 28: DiscountPolicy ----------------");
        DiscountPolicy discount1 = new OnlineMarket();
        AmazonDiscountImpl amazonDiscount = new AmazonDiscountImpl(discount1);
        amazonDiscount.processDiscount();

        System.out.println("--------------- 29: CancellationPolicy ----------------");
        CancellationPolicy cancellation = new HotelBookingSystem();
        AirbnbCancellationImpl airbnbCancellation = new AirbnbCancellationImpl(cancellation);
        airbnbCancellation.processCancellation();

        System.out.println("--------------- 30: WorkoutPolicy ----------------");
        WorkoutPolicy workout = new FitnessApp();
        FitbitWorkoutImpl fitbit = new FitbitWorkoutImpl(workout);
        fitbit.monitorWorkout();

        System.out.println("--------------- 31: TransactionRules ----------------");
        TransactionRules transaction = new OnlineBanking();
        HDFCTransactionImpl hdfc = new HDFCTransactionImpl(transaction);
        hdfc.completeTransaction();

        System.out.println("--------------- 32: OrderPolicy ----------------");
        OrderPolicy order = new FoodDeliveryApp();
        ZomatoOrderImpl zomato = new ZomatoOrderImpl(order);
        zomato.monitorOrder();

        System.out.println("--------------- 33: RentalPolicy ----------------");
        RentalPolicy rental = new VehicleRental();
        ZoomcarRentalImpl zoomcar = new ZoomcarRentalImpl(rental);
        zoomcar.processRental();


        System.out.println("---------- 34: Digital Wallet - KYC ----------");
        KYCVerification kyc = new DigitalWallet();
        PhonePeKYCImpl phonePe = new PhonePeKYCImpl(kyc);
        phonePe.startVerification();

        System.out.println("---------- 35: HealthCare - Data Privacy ----------");
        DataPrivacyPolicy privacy1 = new HealthCareSystem();
        ApolloPrivacyImpl apollo = new ApolloPrivacyImpl(privacy1);
        apollo.secureData();

        System.out.println("---------- 36: Cloud Storage - Backup ----------");
        BackupPolicy backup = new CloudStorage();
        GoogleDriveBackupImpl googleDrive = new GoogleDriveBackupImpl(backup);
        googleDrive.startBackup();

        System.out.println("---------- 37: RideSharingApp - SafetyPolicy ----------");
        SafetyPolicy safety = new RideSharingApp();
        UberSafetyImpl uber = new UberSafetyImpl(safety);
        uber.ensureSafety();

        System.out.println("---------------------------38 : OnlineLearning - CertificationRules ----------");
        CertificationRules certRules = new OnlineLearning();
        UdemyCertificationImpl udemy = new UdemyCertificationImpl(certRules);
        udemy.generateCertificate();

        System.out.println("------------------- 39: NewsPlatform - ContentApproval ----------");
        ContentApproval contentApproval = new NewsPlatform();
        BBCApprovalImpl bbc = new BBCApprovalImpl(contentApproval);
        bbc.publishNews();

        System.out.println("--------------------- 40: Cyber Security - Firewall ----------");
        FirewallPolicy firewall = new CyberSecuritySystem();
        NortonFirewallImpl norton = new NortonFirewallImpl(firewall);
        norton.protectSystem();

        System.out.println("--------------------- 41: Online Store - Refund ----------");
        RefundPolicy refund = new OnlineShopping();
        AmazonRefundImpl amazon1 = new AmazonRefundImpl(refund);
        amazon1.refundCustomer();

        System.out.println("------------------------ 42: School System - Exam ----------");
        ExamPolicy exam = new SchoolSystem();
        CBSEExamImpl cbse = new CBSEExamImpl(exam);
        cbse.organizeExam();

        System.out.println("------------------------- 43: Banking - Loan Approval ----------");
        LoanApprovalPolicy loan = new BankingSystem();
        HDFCLoanImpl hdfc1 = new HDFCLoanImpl(loan);
        hdfc1.approveCustomerLoan();

        System.out.println("------------------------- 44: Weather App - Climate Reporting ----------");
        ClimateStandard climate = new WeatherApp();
        IMDWeatherImpl imd = new IMDWeatherImpl(climate);
        imd.displayForecast();

        System.out.println("--------------------- 45: Travel Portal - Visa Regulation ----------");
        VisaRegulation visa = new TravelPortal();
        MakeMyTripVisaImpl mmt = new MakeMyTripVisaImpl(visa);
        mmt.processVisa();

        System.out.println("-------------------- 46: Hospital System -----");
        HealthRegulation regulation = new HospitalSystem();
        ApolloHospitalImpl apollo1 = new ApolloHospitalImpl(regulation);
        apollo1.auditSanitation();

        System.out.println("--------------- 47: Delivery App -----");
        PackagingStandards standards = new DeliveryApp();
        SwiggyPackagingImpl swiggy = new SwiggyPackagingImpl(standards);
        swiggy.inspectPackaging();

        System.out.println("----------------------- 48: Airline Booking -----");
        BaggagePolicy baggage = new AirlineBooking();
        IndigoBaggageImpl indigo = new IndigoBaggageImpl(baggage);
        indigo.validateBaggage();


        System.out.println("-------------------------- 49: Ride Sharing App -----");
        DriverConductRules conduct = new TaxiManagementApp();
        UberDriverConductImpl uber1 = new UberDriverConductImpl(conduct);
        uber1.reviewDriverConduct();

        System.out.println("---------------------- 50: E-Wallet Compliance -----");
        TransactionCompliance compliance = new EWallet();
        PhonePeComplianceImpl phonePe1 = new PhonePeComplianceImpl(compliance);
        phonePe1.checkCompliance();

    }
}
