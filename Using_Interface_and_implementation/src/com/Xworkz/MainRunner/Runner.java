package com.Xworkz.MainRunner;

import com.Xworkz.Internal.*;
import com.Xworkz.User.*;
import com.Xworkz.implem.*;

public class Runner {
    public static void main(String[] args) {
        ICCC iccc = new IndianCricketTeamIccImpl();
        BCCI bcci = new BCCI(iccc);
        bcci.Team();

        System.out.println("");
        Consitution consitution = new CitizenConstituionImpl();
        Government government = new Government(consitution);
        government.Vote();

        System.out.println(".........");
        Laptop laptop = new LaptopImpl();
        OperatingSystem operatingSystem = new OperatingSystem(laptop);
        operatingSystem.Ryzen();

        System.out.println("");
        Vehicles vehicles = new VehiclesImpl();
        VehiclesUser vehiclesUser = new VehiclesUser(vehicles);
        vehiclesUser.sell();

        System.out.println("");
        BankAccount bankAccount = new BankAccountImpl();
        AccountUser accountUser = new AccountUser(bankAccount);
        accountUser.crediate();

        System.out.println("");
        Hospital hospital = new HostipaImp();
        HospitalUser hospitalUser = new HospitalUser(hospital);
        hospitalUser.doctor();

        System.out.println("");
        Car car = new CarImp();
        CarUser carUser = new CarUser(car);
        carUser.buy();

        System.out.println("");
        Bike bike = new BikeImp();
        BikeUser bikeUser = new BikeUser(bike);
        bikeUser.sell();

        System.out.println("");
        Bus bus = new BusImp();
        BusUser busUser = new BusUser(bus);
        busUser.line();

        System.out.println("");
        JCB jcb = new JCBIMP();
        JCBUser jcbUser = new JCBUser(jcb);
        jcbUser.time();

        System.out.println("");
        Train train = new TrainImp();
        TrainUser trainUser = new TrainUser(train);
        trainUser.deparch();

        System.out.println("");
        Mobile mobile = new MobileImp();
        MobileUser mobileUser = new MobileUser(mobile);
        mobileUser.Andriod();

        System.out.println("");
        Building building = new BuildingImp();
        BuildingUser buildingUser = new BuildingUser(building);
        buildingUser.base();

        System.out.println("");
        School school=new SchoolImpl();
        SchoolUser schoolUser=new SchoolUser(school);
        schoolUser.teacher();

        System.out.println("");
        College college = new CollegeImpl();
        CollegeUser collegeUser = new CollegeUser(college);
        collegeUser.branch();

        System.out.println("");
        Aakhil aakhil = new AakhilIml();
        AakhilUser aakhilUser = new AakhilUser(aakhil);
        aakhilUser.person();

        System.out.println("");
        Abhi abhi = new AbhiImp();
        AbhiUser abhiUser = new AbhiUser(abhi);
        abhiUser.person();

        System.out.println("");
        Arun arun = new ArunImpl();
        ArunUser arunUser = new ArunUser(arun);
        arunUser.person();

        TrafficRules trafficrules = new BangaloreTrafficPoliceImpl();
        PoliceDept policedept = new PoliceDept(trafficrules);
        policedept.execute();

        Electricity electricity = new MysoreElectricityBoardImpl();
        KEB keb = new KEB(electricity);
        keb.execute();

        Education education = new VTUEducationSystemImpl();
        University university = new University(education);
        university.execute();

        BankPolicy bankpolicy = new SBICompliantBankImpl();
        RBI rbi = new RBI(bankpolicy);
        rbi.execute();

        TaxRules taxrules = new BangaloreTaxOfficeImpl();
        IncomeTaxDept incometaxdept = new IncomeTaxDept(taxrules);
        incometaxdept.execute();

        AirTraffic airtraffic = new KempegowdaAirportImpl();
        AAI aai = new AAI(airtraffic);
        aai.execute();

        Defense defense = new IndianArmyDefenseImpl();
        DRDO drdo = new DRDO(defense);
        drdo.execute();

        Healthcare healthcare = new AIIMSHealthcareImpl();
        WHO who = new WHO(healthcare);
        who.execute();

        Transport transport = new KarnatakaTransportServiceImpl();
        RTO rto = new RTO(transport);
        rto.execute();

        PostalRules postalrules = new ShimogaPostalServiceImpl();
        IndiaPost indiapost = new IndiaPost(postalrules);
        indiapost.execute();

        Environmental environmental = new IndianGreenInitiativeImpl();
        UNEP unep = new UNEP(environmental);
        unep.execute();

        Broadcast broadcast = new DDNewsImpl();
        PrasarBharati prasarbharati = new PrasarBharati(broadcast);
        prasarbharati.execute();

        SportsBoard sportsboard = new IndianOlympicsCommitteeImpl();
        IOA ioa = new IOA(sportsboard);
        ioa.execute();

        Education education = new DelhiCBSESchoolImpl();
        CBSE cbse = new CBSE(education);
        cbse.execute();

        WaterSupply watersupply = new BangaloreWaterBoardImpl();
        JalBoard jalboard = new JalBoard(watersupply);
        jalboard.execute();

        Railways railways = new SouthWesternRailwaysImpl();
        IRCTC irctc = new IRCTC(railways);
        irctc.execute();

        Telecom telecom = new JioTelecomImpl();
        TRAI trai = new TRAI(telecom);
        trai.execute();

        CinemaCensor cinemacensor = new KannadaFilmCensorBoardImpl();
        CBFC cbfc = new CBFC(cinemacensor);
        cbfc.execute();

        FireSafety firesafety = new MangaloreFireServiceImpl();
        FireDept firedept = new FireDept(firesafety);
        firedept.execute();

        Housing housing = new KarnatakaHousingBoardImpl();
        RERA rera = new RERA(housing);
        rera.execute();

        Energy energy = new SolarEnergyBoardImpl();
        MinistryOfEnergy ministryofenergy = new MinistryOfEnergy(energy);
        ministryofenergy.execute();

        Tourism tourism = new KarnatakaTourismBoardImpl();
        MinistryOfTourism ministryoftourism = new MinistryOfTourism(tourism);
        ministryoftourism.execute();

        CyberSecurity cybersecurity = new IndianCyberCellImpl();
        CERT cert = new CERT(cybersecurity);
        cert.execute();

        Weather weather = new KarnatakaWeatherOfficeImpl();
        IMD imd = new IMD(weather);
        imd.execute();

        Aviation aviation = new AirIndiaDGCAComplianceImpl();
        DGCA dgca = new DGCA(aviation);
        dgca.execute();

        Mining mining = new KarnatakaMiningBoardImpl();
        MiningDept miningdept = new MiningDept(mining);
        miningdept.execute();

        Agriculture agriculture = new KarnatakaAgriDevelopmentImpl();
        MinistryOfAgri ministryofagri = new MinistryOfAgri(agriculture);
        ministryofagri.execute();

        LabourLaws labourlaws = new KarnatakaLabourOfficeImpl();
        LabourDept labourdept = new LabourDept(labourlaws);
        labourdept.execute();

        ForestLaws forestlaws = new NagarholeForestBoardImpl();
        ForestDept forestdept = new ForestDept(forestlaws);
        forestdept.execute();

        Wildlife wildlife = new BandipurWildlifeServiceImpl();
        WildlifeBoard wildlifeboard = new WildlifeBoard(wildlife);
        wildlifeboard.execute();

        Technology technology = new DigitalIndiaTechBoardImpl();
        MinistryOfIT ministryofit = new MinistryOfIT(technology);
        ministryofit.execute();

        CivicBody civicbody = new BangaloreMunicipalServiceImpl();
        BBMP bbmp = new BBMP(civicbody);
        bbmp.execute();

        PovertyRelief povertyrelief = new RuralEmploymentBoardImpl();
        NREGA nrega = new NREGA(povertyrelief);
        nrega.execute();

        Trade trade = new KarnatakaExportCouncilImpl();
        MinistryOfTrade ministryoftrade = new MinistryOfTrade(trade);
        ministryoftrade.execute();

        PublicHealth publichealth = new COVIDResponseTeamImpl();
        MinistryOfHealth ministryofhealth = new MinistryOfHealth(publichealth);
        ministryofhealth.execute();

        Cleanliness cleanliness = new BangaloreCleanCityMissionImpl();
        SwachhBharat swachhbharat = new SwachhBharat(cleanliness);
        swachhbharat.execute();

        Education education = new AccreditedCollegeNAACImpl();
        NAAC naac = new NAAC(education);
        naac.execute();

        Electricity electricity = new KarnatakaHydelBoardImpl();
        PowerGrid powergrid = new PowerGrid(electricity);
        powergrid.execute();

        Science science = new ChandrayaanScienceImpl();
        ISRO isro = new ISRO(science);
        isro.execute();

        Justice justice = new KarnatakaHighCourtImpl();
        SupremeCourt supremecourt = new SupremeCourt(justice);
        supremecourt.execute();

        FoodSafety foodsafety = new KarnatakaFoodBoardImpl();
        FSSAI fssai = new FSSAI(foodsafety);
        fssai.execute();

        Commerce commerce = new BangaloreStockTradingBoardImpl();
        SEBI sebi = new SEBI(commerce);
        sebi.execute();

        HumanRights humanrights = new KarnatakaHumanRightsOfficeImpl();
        NHRC nhrc = new NHRC(humanrights);
        nhrc.execute();

        TrafficInfra trafficinfra = new TumkurHighwayAuthorityImpl();
        NHAI nhai = new NHAI(trafficinfra);
        nhai.execute();

        Standards standards = new ISIProductCertifierImpl();
        BIS bis = new BIS(standards);
        bis.execute();

        Insurance insurance = new LICInsuranceComplianceImpl();
        IRDA irda = new IRDA(insurance);
        irda.execute();

        Environment environment = new KarnatakaPollutionBoardImpl();
        PollutionControl pollutioncontrol = new PollutionControl(environment);
        pollutioncontrol.execute();

        Finance finance = new DigitalPaymentComplianceImpl();
        MinistryOfFinance ministryoffinance = new MinistryOfFinance(finance);
        ministryoffinance.execute();






    }
}
