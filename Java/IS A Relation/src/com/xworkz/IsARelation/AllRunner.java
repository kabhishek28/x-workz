package com.xworkz.IsARelation;

import com.xworkz.IsARelation.casting.*;
import com.xworkz.IsARelation.external.*;
import com.xworkz.IsARelation.internal.*;

public class AllRunner {
    public static  void main(String[] args) {
        System.out.println("******************  1   ***************");
        Forest forest = new Forest();
        River river = new Amazon();
        forest.forestName(river);

        System.out.println("******************  2   ***************");
        PlayStore playStore = new PlayStore();
        Game game = new Amongus();
        playStore.getGame(game);

        System.out.println("******************  3   ***************");
        FruitMarket fruitMarket = new FruitMarket();
        Fruit fruit = new Apple();
        fruitMarket.getFruit(fruit);

        System.out.println("******************  4   ***************");
        Cycle cycle = new Cycle();
        AutoMobile autoMobile = new Bicycle();
        cycle.getBiCycle(autoMobile);
        System.out.println("******************  5  ***************");
        TwoWheelerShowRoom twoWheelerShowRoom = new TwoWheelerShowRoom();
        TwoWheeler twoWheeler = new Bike();
        twoWheelerShowRoom.getTwoWheeler(twoWheeler);
        System.out.println("******************  6   ***************");
        BulletTrainStation bulletTrainStation = new BulletTrainStation();
        Train train = new BulletTrain();
        bulletTrainStation.getBulletTrain(train);
        System.out.println("******************  7   ***************");
        FlyingInsect flyingInsect = new FlyingInsect();
        Insect insect = new Butterfly();
        flyingInsect.getButterFly(insect);
        System.out.println("******************  8   ***************");
        CakeFactory cakeFactory = new CakeFactory();
        Bakery bakery = new Cake();
        cakeFactory.getCake(bakery);
        System.out.println("******************  9   ***************");
        CarShowroom carShowroom = new CarShowroom();
        FourWheeler fourWheeler = new Car();
        carShowroom.getCar(fourWheeler);

        System.out.println("******************  10   ***************");
        CardiologistDoctor cardiologistDoctor = new CardiologistDoctor();
        Doctor doctor = new com.xworkz.IsARelation.external.Cardiologist();
        cardiologistDoctor.getDoctor(doctor);
        System.out.println("****************** 11   ***************");
        CarFactoryArea carFactoryArea = new CarFactoryArea();
        Factory factory = new CarFactory();
        carFactoryArea.getCarFactory(factory);
        System.out.println("****************** 12   ***************");
        AirlineBooking airlineBooking = new AirlineBooking();
        Airline airline = new CargoAirline();
        airlineBooking.getAirline(airline);

        System.out.println("****************** 13   ***************");
        FurnitureUtil furnitureUtil = new FurnitureUtil();
        Furniture furniture = new Chair();
        furnitureUtil.getFurniture(furniture);
        System.out.println("****************** 14   ***************");
        AISystemUtil aiSystemUtil = new AISystemUtil();
        AISystem aiSystem = new Chatbot();
        aiSystemUtil.getAISystem(aiSystem);
        System.out.println("****************** 15   ***************");
        GameUtil gameUtil = new GameUtil();
        Game game1 = new Chess();
        gameUtil.getGame(game1);
        System.out.println("****************** 16   ***************");
        ShapeUtil shapeUtil = new ShapeUtil();
        Shape shape1 = new Circle();
        shapeUtil.getShape(shape1);
        System.out.println("****************** 17   ***************");
        PharmacistUtil pharmacistUtil = new PharmacistUtil();
        Pharmacist pharmacist = new ClinicalPharmacist();
        pharmacistUtil.getPharmacist(pharmacist);

        System.out.println("****************** 18   ***************");
        PsychologistUtil psychologistUtil = new PsychologistUtil();
        Psychologist psychologist = new ClinicalPsychologist();
        psychologistUtil.getPsychologist(psychologist);

        System.out.println("****************** 19   ***************");
        CarromUtil carromUtil = new CarromUtil();
        Carrom carrom = new Coins();
        carromUtil.getCarrom(carrom);

        System.out.println("****************** 20   ***************");
        OutdoorGameUtil outdoorGameUtil = new OutdoorGameUtil();
        OutdoorGame outdoorGame = new Cricket();
        outdoorGameUtil.getOutdoorGame(outdoorGame);

        System.out.println("****************** 21   ***************");
        AthleteUtil athleteUtil = new AthleteUtil();
        Athlete athlete = new Cricketer();
        athleteUtil.getAthlete(athlete);

        System.out.println("****************** 22   ***************");
        ShipService shipService = new ShipService();
        Ship ship = new CruiseShip();
        shipService.getShipDetails(ship);


        System.out.println("****************** 23   ***************");
        DessertService dessertService = new DessertService();
        Dessert dessert = new CupCake();
        dessertService.getDessertDetails(dessert);

        System.out.println("****************** 24   ***************");
        FestivalUtil util = new FestivalUtil();
        Festival festival = new Dasara();
        util.showFestivalDetails(festival);

        System.out.println("****************** 25   ***************");
        UnderwaterDroneUtil underwaterDroneUtil = new UnderwaterDroneUtil();
        UnderwaterDrone drone = new DeepSeaExplorer();
        underwaterDroneUtil.exploreOcean(drone);

        System.out.println("******************   26   ***************");
        AnimalUtil animalUtil = new AnimalUtil();
        Animal animal = new Dog();
        animalUtil.showAnimalBehavior(animal);
        System.out.println("******************   27   ***************");
        PlanetUtil planetUtil = new PlanetUtil();
        Planet planet = new Earth();
        planetUtil.explorePlanet(planet);

        System.out.println("****************** 28   ***************");
        MountainInfo mountainInfo = new MountainInfo();
        Mountain mountain = new Everest();
        mountainInfo.getMountainDetails(mountain);

        System.out.println("****************** 29   ***************");
        CyberUtil cyberUtil = new CyberUtil();
        CyberSecuritySystem system = new Firewall();
        cyberUtil.getCyberSecurityDetails(system);
        System.out.println("****************** 30   ***************");
        MenuUtil menuUtil = new MenuUtil();
        Menu menu = new Food();
        menuUtil.getMenuDetails(menu);
        System.out.println("****************** 31   ***************");
        FreeFireGame freeFireGame = new FreeFireGame();
        OnlineGame onlineGame = new FreeFire();
        freeFireGame.getGameDetails(onlineGame);
        System.out.println("****************** 32   ***************");
        AmphibianUtil amphibianUtil = new AmphibianUtil();
        Amphibian amphibian = new Frog();
        amphibianUtil.getAmphibianDetails(amphibian);
        System.out.println("****************** 33   ***************");
        IslandUtil islandUtil = new IslandUtil();
        Island island = new Greenland();
        islandUtil.getIslandDetails(island);
        System.out.println("****************** 34   ***************");
        InstrumentUtil instrumentUtil = new InstrumentUtil();
        MusicalInstrument instrument = new Guitar();
        instrumentUtil.getInstrumentDetails(instrument);
        System.out.println("****************** 35   ***************");
        GuitaristMusician guitaristMusician = new GuitaristMusician();
        Musician musician = new Guitarist();
        guitaristMusician.getMusicianDetails(musician);
        System.out.println("****************** 36   ***************");
        BuildingUtil buildingUtil = new BuildingUtil();
        Building building = new House();
        buildingUtil.getBuildingDetails(building);
        System.out.println("****************** 37   ***************");
        RobotUtil robotUtil = new RobotUtil();
        Robot robot = new HumanoidRobot();
        robotUtil.getRobotDetails(robot);
        System.out.println("****************** 38   ***************");
        NurseUtil nurseUtil = new NurseUtil();
        Nurse nurse = new ICUNurse();
        nurseUtil.getNurseDetails(nurse);
        System.out.println("****************** 39   ***************");
        CurrencyUtil currencyUtil = new CurrencyUtil();
        Currency currency = new INR();
        currencyUtil.getCurrencyDetails(currency);
        System.out.println("****************** 40   ***************");
        SpaceProbeRunner spaceProbeRunner = new SpaceProbeRunner();
        SpaceProbe spaceProbe = new MarsRover();
        spaceProbeRunner.handleProbe(spaceProbe);
        System.out.println("****************** 41   ***************");
        Phone phone = new IPhone();
        PhoneFeatures features = new PhoneFeatures();
        features.getPhoneFeatures(phone);
        System.out.println("****************** 42   ***************");
        Shop shop = new Item();
        ShopBilling billing = new ShopBilling();
        billing.generateBill(shop);
        System.out.println("****************** 43   ***************");
        ConstructionHandler constructionHandler = new ConstructionHandler();
        ConstructionMachine constructionMachine = new JCB();
        constructionHandler.handleMachine(constructionMachine);
        System.out.println("****************** 44   ***************");
        ComputerHandler computerHandler = new ComputerHandler();
        Computer computer = new Laptop();
        computerHandler.handleComputer(computer);
        System.out.println("****************** 45   ***************");
        GameHandler handler = new GameHandler();
        BoardGame game2 = new Ludo();
        handler.handleGame(game2);
        System.out.println("****************** 46   ***************");
        SpaceMissionHandler handler1 = new SpaceMissionHandler();
        Spacecraft spacecraft = new LunarLander();
        handler1.handleMission(spacecraft);
        System.out.println("****************** 47   ***************");
        HotelServiceHandler handler2 = new HotelServiceHandler();
        Hotel hotel = new LuxuryHotel();
        handler2.handleHotel(hotel);
        System.out.println("****************** 48   ***************");
        YachtServiceHandler yachtServiceHandler = new YachtServiceHandler();
        Yacht yacht = new LuxuryYacht();
        yachtServiceHandler.handleYacht(yacht);
        System.out.println("****************** 49   ***************");
        EmployeeHandler employeeHandler = new EmployeeHandler();
        Employee employee = new Manager();
        employeeHandler.handleEmployee(employee);
        System.out.println("******************   50  ***************");
        TreeHandler treeHandler = new TreeHandler();
        Tree tree = new MangoTree();
        treeHandler.handleTree(tree);
    }
}
