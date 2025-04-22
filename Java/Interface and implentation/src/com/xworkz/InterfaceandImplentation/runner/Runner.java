package com.xworkz.InterfaceandImplentation.runner;

import com.xworkz.InterfaceandImplentation.RulesClass.*;
import com.xworkz.InterfaceandImplentation.external.twoInterface.*;
import com.xworkz.InterfaceandImplentation.internal.*;

public class Runner extends Object {
    public static void main(String[] args) {
        System.out.println("----------------------1-----------------------");

//        Object object = new Xworkz();
//
//        int[] values={5};
//        values.eq
//
//
//        CollegeRules collegeRules = new Xworkz();
//        collegeRules.wearFormals();
//        collegeRules.wearID();
//        collegeRules.wearShoue();
//
//
//
//
//
//        Xworkz xworkz = new Xworkz();





        Xworkz xworkz = new Xworkz();
        xworkz.wearFormals();
        xworkz.wearID();
        xworkz.wearShoue();


        OfficeRules officeRules = new IBM();
        officeRules.Timing();
        officeRules.wearID();
        officeRules.wearShoue();

        System.out.println("-----------------");
        DroneSprayer droneSprayer = new AgroDrone();
        droneSprayer.returnHome();
        droneSprayer.sprayPesticides();
        droneSprayer.takeOff();
        droneSprayer.reiseSpeed();


        SmartWatch smartWatch = new AppleWatch();
        smartWatch.displayTime();
        smartWatch.monitorHeartRate();
        smartWatch.runApps();

        ControlTower controlTower = new ATCStation();
        controlTower.authorizeLanding();
        controlTower.authorizeTakeOff();
        controlTower.monitorAirspace();

       ATMMachine atmMachine = new BankATM();
       atmMachine.acceptCard();
       atmMachine.dispenseCash();
       atmMachine.printReceipt();

       OnlineGame onlineGame = new BattleArena();
       onlineGame.endGame();
       onlineGame.startGame();
       onlineGame.updateScore();

       SpaService spaService = new BlissfulSpa();
       spaService.bookAppointment();
       spaService.collectFeedback();
       spaService.provideService();

       ConstructionSite constructionSite = new BuilderCrew();

       constructionSite.buildStructure();
       constructionSite.layFoundation();
       constructionSite.paintWalls();

       Ship ship = new CargoShip();
       ship.anchor();
       ship.dock();
       ship.sail();

       MedicalLab medicalLab = new CentralMedicalLab();
       medicalLab.collectSample();
       medicalLab.deliverResults();
       medicalLab.processSample();

       Hospital hospital = new CityHospital();
       hospital.admitPatient();
       hospital.calculateBill();
       hospital.dischargePatient();

       IDE ide = new CodeStudio();
       ide.compileCode();
       ide.debugCode();
       ide.writeCode();

       CafeService cafeService = new CoffeeCafe();
       cafeService.prepareOrder();
       cafeService.serveCustomer();
       cafeService.takeOrder();

       CryptocurrencyExchange cryptocurrencyExchange = new CryptoXchange();
       cryptocurrencyExchange.executeTrade();
       cryptocurrencyExchange.listCoin();
       cryptocurrencyExchange.updateMarketData();

       Train train = new DemoTrain();
       train.runTrain();
       train.announceStop();
       train.boardPassengers();

       NavalVessel navalVessel = new Destroyer();
       navalVessel.activateSonar();
       navalVessel.deployTorpedoes();
       navalVessel.returnToBase();


       VirtualClassroom virtualClassroom = new EClassroom();
       virtualClassroom.joinClass();
       virtualClassroom.participateDiscussion();
       virtualClassroom.submitAssignment();

       PollutionControl pollutionControl = new EcoSystemManager();
       pollutionControl.monitorAirQuality();
       pollutionControl.reduceEmissions();
       pollutionControl.reportStatus();


       VotingMachine votingMachine = new ElectronicVotingMachine();
       votingMachine.castVote();
       votingMachine.tallyVotes();
       votingMachine.generateReport();


       Tractor tractor = new FarmingTractor();
       tractor.harvest();
       tractor.plowField();
       tractor.sowSeeds();

       CourierService courierService = new FastCourier();
       courierService.deliverPackage();
       courierService.pickUpPackage();
       courierService.trackPackage();

       IrrigationSystem irrigationSystem = new FieldIrrigationSystem();
       irrigationSystem.startIrrigation();
       irrigationSystem.stopIrrigation();
       irrigationSystem.monitorSoilMoisture();

       FitnessTracker fitnessTracker = new FitBand();
       fitnessTracker.calculateCalories();
       fitnessTracker.recordWorkout();
       fitnessTracker.syncData();

       FitnessApp fitnessApp = new FitTrack();
       fitnessApp.calculateDistance();
       fitnessApp.showProgress();
       fitnessApp.trackExercise();

       AirlineReservation airlineReservation = new GlobalAirlines();
       airlineReservation.bookSeat();
       airlineReservation.cancelBooking();
       airlineReservation.searchFlights();

       MapService mapService = new GoogleMapsService();
       mapService.loadMap();
       mapService.getRoute();
       mapService.zoomIn();

       Instrument instrument = new Guitar();
       instrument.play();
       instrument.stop();
       instrument.tune();

       MedicalDevice medicalDevice = new HeartRateMonitor();
       medicalDevice.analyzePatientData();
       medicalDevice.startMonitoring();
       medicalDevice.triggerAlarm();

       PropertyDealer propertyDealer = new HomeFinder();
       propertyDealer.listProperty();
       propertyDealer.showProperty();
       propertyDealer.finalizeDeal();

       SurveillanceSystem surveillanceSystem = new HomeSurveillance();
       surveillanceSystem.alertSecurity();
       surveillanceSystem.recordFootage();
       surveillanceSystem.startMonitoring();

       Telescope telescope = new HubbleTelescope();
       telescope.adjustLens();
       telescope.captureImage();
       telescope.trackCelestialBody();

       Robot robot = new IndustrialRobot();
       robot.move();
       robot.pickObject();
       robot.recharge();

       RobotArm robotArm = new IndustrialRobotArm();
       robotArm.moveArm();
       robotArm.initialize();
       robotArm.shutdown();

       AirCraft airCraft = new Jet();
       airCraft.cruisingSpeed();
       airCraft.land();
       airCraft.takeOff();

       Hotel hotel = new LuxuryInn();
       hotel.bookRoom();
       hotel.checkIn();
       hotel.checkOut();

       SmartFarm smartFarm = new ModernSmartFarm();
       smartFarm.analyzeSoil();
       smartFarm.automateIrrigation();
       smartFarm.monitorCrops();

       Cinema cinema = new MovieHouse();
       cinema.bookTickets();
       cinema.cancelTickets();
       cinema.showTimings();

       WaterTreatment waterTreatment = new MunicipalWaterTreatment();
       waterTreatment.purifyWater();
       waterTreatment.adjustPressure();
       waterTreatment.monitorFlow();

       SocialMediaPlatform socialMediaPlatform = new MySocialPlatform();
       socialMediaPlatform.postStatus();
       socialMediaPlatform.sendMessage();
       socialMediaPlatform.shareContent();

       OnlineStore onlineStore = new MyStore();
       onlineStore.addToCart();
       onlineStore.makePayment();
       onlineStore.trackOrder();

       Metro metro = new Nammametro();
       metro.dropPoint();
       metro.pickUpPoint();
       metro.price();

       Bank bank = new NationalBank();
       bank.createAccount();
       bank.getIntrest();
       bank.saveAmount();

       NewsChannel newsChannel = new NationalNews();
       newsChannel.broadcastNews();
       newsChannel.airAdvertisement();
       newsChannel.schedulePrograms();

       StreamingService streamingService = new NetStream();
       streamingService.pauseStream();
       streamingService.stopStream();
       streamingService.streamMovie();

       ELearningPlatform eLearningPlatform = new OnlineAcademy();
       eLearningPlatform.deliverLecture();
       eLearningPlatform.enrollCourse();
       eLearningPlatform.gradeAssignment();

       VetClinic vetClinic = new PetCareCenter();
       vetClinic.examinePet();
       vetClinic.giveVaccination();
       vetClinic.suggestDiet();

       DigitalArtSoftware digitalArtSoftware = new Photoshop();
       digitalArtSoftware.applyFilter();
       digitalArtSoftware.createArtwork();
       digitalArtSoftware.exportFile();

       VideoGameConsole videoGameConsole = new PlayStation();
       videoGameConsole.loadGame();
       videoGameConsole.powerOn();
       videoGameConsole.powerOff();

       Drone drone= new Quadcopter();
       drone.captureVideo();
       drone.land();
       drone.takeOff();

       FoodDeliveryApp foodDeliveryApp = new QuickEats();
       foodDeliveryApp.assignDelivery();
       foodDeliveryApp.deliverFood();
       foodDeliveryApp.placeOrder();

       PropertyManagement propertyManagement = new RealEstateAgency();
       propertyManagement.collectRent();
       propertyManagement.scheduleMaintenance();
       propertyManagement.updateListing();

       Telemedicine telemedicine = new RemoteMedConsult();
       telemedicine.conductVideoCall();
       telemedicine.scheduleConsultation();
       telemedicine.transmitMedicalRecords();

       DataAnalyzer dataAnalyzer = new ResearchAnalyzer();
       dataAnalyzer.analyzeData();
       dataAnalyzer.reportFindings();
       dataAnalyzer.loadData();

       SolarPanel solarPanel = new ResidentialSolar();
       solarPanel.captureSunlight();
       solarPanel.generateElectricity();
       solarPanel.reportEfficiency();

       PointOfSale pointOfSale = new RetailPOS();
       pointOfSale.printReceipt();
       pointOfSale.processTransaction();
       pointOfSale.updateInventory();

       ArcadeMachine arcadeMachine = new RetroArcade();
       arcadeMachine.insertCoin();
       arcadeMachine.selectGame();
       arcadeMachine.startGame();

       HydroPowerPlant hydroPowerPlant = new RiverHydroPlant();
       hydroPowerPlant.shutdownPlant();
       hydroPowerPlant.regulateFlow();
       hydroPowerPlant.startTurbine();

       AccessControl accessControl = new SecureAccessControl();
       accessControl.auditAccess();
       accessControl.grantAccess();
       accessControl.revokeAccess();

       Firewall firewall = new SecureFirewall();
       firewall.blockIntrusion();
       firewall.monitorTraffic();
       firewall.updateRules();

       AutonomousVehicle autonomousVehicle = new SelfDrivingCar();
       autonomousVehicle.avoidObstacles();
       autonomousVehicle.startNavigation();
       autonomousVehicle.stopNavigation();

       SmartDevice smartDevice = new SmartLight();
       smartDevice.operate();
       smartDevice.turnOff();
       smartDevice.turnOn();

       SmartHomeAppliance smartHomeAppliance = new SmartRefrigerator();
       smartHomeAppliance.activate();
       smartHomeAppliance.deactivate();
       smartHomeAppliance.performTask();

       LabEquipment labEquipment = new Spectrometer();
       labEquipment.collectData();
       labEquipment.shutdownExperiment();
       labEquipment.startExperiment();

       Courier courier = new SpeedCourier();
       courier.deliverParcel();
       courier.dispatchParcel();
       courier.trackParcel();

       InventoryManagement inventoryManagement = new StoreInventory();
       inventoryManagement.addItem();
       inventoryManagement.checkStock();
       inventoryManagement.removeItem();

       University university = new TechUniversity();
       university.conductExam();
       university.enrollStudent();
       university.publishResult();

       ElectricCar electricCar = new TeslaModelS();
       electricCar.chargeBattery();
       electricCar.drive();
       electricCar.showStatus();

       FashionBoutique fashionBoutique = new TrendyBoutique();
       fashionBoutique.assistCustomer();
       fashionBoutique.displayCollection();
       fashionBoutique.processPurchase();

       BikeSharing bikeSharing = new UrbanBikeShare();
       bikeSharing.lockBike();
       bikeSharing.unlockBike();
       bikeSharing.trackUsage();

       MobileNetwork mobileNetwork = new VerizonNetwork();
       mobileNetwork.connectInternet();
       mobileNetwork.sendSMS();
       mobileNetwork.makeCall();

       ChatBot chatBot = new VirtualAssistant();
       chatBot.processMessage();
       chatBot.receiveMessage();
       chatBot.sendResponse();

       StockBroker stockBroker = new WallStreetBroker();
       stockBroker.buyStocks();
       stockBroker.sellStocks();
       stockBroker.checkPortfolio();

       Satellite satellite = new WeatherSatellite();
       satellite.launch();
       satellite.orbit();
       satellite.transmitData();

       WindTurbine windTurbine = new WindMillTurbine();
       windTurbine.shutdownTurbine();
       windTurbine.adjustBlades();
       windTurbine.startTurbine();


        Agriculture agriculture = new Agriculture();
        agriculture.startTurbine();
        agriculture.regulateFlow();
        agriculture.shutdownPlant();
        agriculture.startIrrigation();
        agriculture.monitorSoilMoisture();
        agriculture.stopIrrigation();

        System.out.println("*-------------------------------------*");
        IrrigationSystem irrigationSystem1 = new Agriculture();
        irrigationSystem1.startIrrigation();
        irrigationSystem1.stopIrrigation();
        irrigationSystem1.monitorSoilMoisture();
        HydroPowerPlant hydroPowerPlant1 = new Agriculture();
        hydroPowerPlant1.startTurbine();
        hydroPowerPlant1.shutdownPlant();
        hydroPowerPlant1.regulateFlow();


        SpaService spaService1 = new AstroResearch();
        spaService1.bookAppointment();
        spaService1.provideService();
        spaService1.collectFeedback();
        Telemedicine telemedicine1 = new AstroResearch();
        telemedicine1.transmitMedicalRecords();
        telemedicine1.scheduleConsultation();
        telemedicine1.conductVideoCall();

        Courier courier1 = new CourierSystem();
        courier1.trackParcel();
        courier1.dispatchParcel();
        courier1.deliverParcel();
        CourierService courierService1 = new CourierSystem();
        courierService1.trackPackage();
        courierService1.pickUpPackage();
        courierService1.deliverPackage();


        DroneSprayer droneSprayer1 = new FarmingDrone();
        droneSprayer1.returnHome();
        droneSprayer1.takeOff();
        droneSprayer1.sprayPesticides();
        SmartDevice smartDevice1 = new FarmingDrone();
        smartDevice1.turnOn();
        smartDevice1.operate();
        smartDevice1.turnOff();

        FashionBoutique fashionBoutique1 = new FashionProduct();
        fashionBoutique1.processPurchase();
        fashionBoutique1.displayCollection();
        fashionBoutique1.assistCustomer();
        FitnessApp fitnessApp1 = new FashionProduct();
        fitnessApp1.trackExercise();
        fitnessApp1.showProgress();
        fitnessApp1.calculateDistance();


        FitnessTracker fitnessTracker1 = new FitnessMonitor();
        fitnessTracker1.syncData();
        fitnessTracker1.recordWorkout();
        fitnessTracker1.calculateCalories();
        SmartWatch smartWatch1 = new FitnessMonitor();
        smartWatch1.displayTime();
        smartWatch1.runApps();
        smartWatch1.monitorHeartRate();



        OnlineGame onlineGame1 = new GameZone();
        onlineGame1.endGame();
        onlineGame1.startGame();
        onlineGame1.updateScore();
        VideoGameConsole videoGameConsole1 = new GameZone();
        videoGameConsole1.powerOff();
        videoGameConsole1.loadGame();
        videoGameConsole1.powerOn();


        ElectricCar electricCar1 = new HybridVehicle();
        electricCar1.showStatus();
        electricCar1.drive();
        electricCar1.chargeBattery();
        AutonomousVehicle autonomousVehicle1 = new HybridVehicle();
        autonomousVehicle1.stopNavigation();
        autonomousVehicle1.avoidObstacles();
        autonomousVehicle1.startNavigation();


        MedicalDevice medicalDevice1 = new MedicalInstrument();
        medicalDevice1.triggerAlarm();
        medicalDevice1.startMonitoring();
        medicalDevice1.analyzePatientData();
        MedicalLab medicalLab1 = new MedicalInstrument();
        medicalLab1.collectSample();
        medicalLab1.deliverResults();
        medicalLab1.processSample();


        WaterTreatment waterTreatment1 = new NaturalResources();
        waterTreatment1.monitorFlow();
        waterTreatment1.purifyWater();
        waterTreatment1.adjustPressure();
        WindTurbine windTurbine1 = new NaturalResources();
        windTurbine1.startTurbine();
        windTurbine1.shutdownTurbine();
        windTurbine1.adjustBlades();


        NewsChannel newsChannel1 = new NewsBroadcaster();
        newsChannel1.schedulePrograms();
        newsChannel1.broadcastNews();
        newsChannel1.airAdvertisement();
        StreamingService streamingService1 = new NewsBroadcaster();
        streamingService1.streamMovie();
        streamingService1.stopStream();
        streamingService1.pauseStream();


        ELearningPlatform eLearningPlatform1 = new OnlineEducator();
        eLearningPlatform1.gradeAssignment();
        eLearningPlatform1.enrollCourse();
        eLearningPlatform1.deliverLecture();
        VirtualClassroom virtualClassroom1 = new OnlineEducator();
        virtualClassroom1.submitAssignment();
        virtualClassroom1.joinClass();
        virtualClassroom1.participateDiscussion();


        PropertyDealer propertyDealer1 = new PropertyDetails();
        propertyDealer1.finalizeDeal();
        propertyDealer1.showProperty();
        propertyDealer1.listProperty();
        PropertyManagement propertyManagement1 = new PropertyDetails();
        propertyManagement1.updateListing();
        propertyManagement1.scheduleMaintenance();
        propertyManagement1.collectRent();


        Robot robot1  = new RoboAssistant();
        robot1.recharge();
        robot1.move();
        robot1.pickObject();
        ChatBot chatBot1 = new RoboAssistant();
        chatBot1.sendResponse();
        chatBot1.receiveMessage();
        chatBot1.processMessage();

        Robot robot2 = new RoboticArmCraft();
        robot2.pickObject();
        robot2.move();
        robot2.recharge();
        RobotArm robotArm1 = new RoboticArmCraft();
        robotArm1.shutdown();
        robotArm1.initialize();
        robotArm1.moveArm();


        AccessControl accessControl1 = new SecuritySystem();
        accessControl1.revokeAccess();
        accessControl1.grantAccess();
        accessControl1.auditAccess();
        Firewall firewall1 = new SecuritySystem();
        firewall1.updateRules();
        firewall1.blockIntrusion();
        firewall1.monitorTraffic();


        SmartHomeAppliance smartHomeAppliance1 = new SmartAppliance();
        smartHomeAppliance1.performTask();
        smartHomeAppliance1.deactivate();smartHomeAppliance1.activate();
        SmartDevice smartDevice2 = new SmartAppliance();
        smartDevice2.turnOff();
        smartDevice2.turnOn();
        smartDevice2.operate();


        SmartFarm smartFarm1 = new SmartCar();
        smartFarm1.monitorCrops();
        smartFarm1.automateIrrigation();
        smartFarm1.analyzeSoil();
        SmartDevice smartDevice3 = new SmartCar();
        smartDevice3.operate();
        smartDevice3.turnOff();smartDevice3.turnOn();


        SmartHomeAppliance smartHomeAppliance2 = new SmartHomeHub();
        smartHomeAppliance2.activate();
        smartHomeAppliance2.deactivate();
        smartHomeAppliance2.performTask();
        SmartDevice smartDevice4 = new SmartHomeHub();
        smartDevice4.turnOn();
        smartDevice4.turnOff();
        smartDevice4.operate();

        Drone drone1 = new SurveillanceDrone();
        drone1.takeOff();
        drone1.land();
        drone1.captureVideo();
        SurveillanceSystem surveillanceSystem1 = new SurveillanceDrone();
        surveillanceSystem1.startMonitoring();
        surveillanceSystem1.recordFootage();
        surveillanceSystem1.alertSecurity();

        Telemedicine telemedicine2 = new Telecom();
        telemedicine2.conductVideoCall();
        telemedicine2.scheduleConsultation();
        telemedicine2.transmitMedicalRecords();
        Telescope telescope1 = new Telecom();
        telescope1.trackCelestialBody();
        telescope1.captureImage();telescope1.adjustLens();

        Train train1 = new TrainCafe();
        train1.boardPassengers();
        train1.runTrain();
        train1.announceStop();
        CafeService cafeService1 = new TrainCafe();
        cafeService1.takeOrder();
        cafeService1.serveCustomer();
        cafeService1.prepareOrder();

    }
}
