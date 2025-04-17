package com.xworkz.InterfaceandImplentation.runner;

import com.xworkz.InterfaceandImplentation.RulesClass.*;
import com.xworkz.InterfaceandImplentation.internal.*;

public class Runner {
    public static void main(String[] args) {
        System.out.println("----------------------1-----------------------");
        CollegeRules collegeRules = new Xworkz();
        collegeRules.wearFormals();
        collegeRules.wearID();
        collegeRules.wearShoue();

        Xworkz xworkz = new Xworkz();
        xworkz.wearFormals();
        xworkz.wearID();
        xworkz.wearShoue();

        OfficeRules officeRules = new IBM();
        officeRules.Timing();
        officeRules.wearID();
        officeRules.wearShoue();

        DroneSprayer droneSprayer = new AgroDrone();
        droneSprayer.returnHome();
        droneSprayer.sprayPesticides();
        droneSprayer.takeOff();

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
       university.enrollStudent();university.publishResult();

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

















    }
}
