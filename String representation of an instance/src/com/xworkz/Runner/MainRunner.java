package com.xworkz.runner;
import com.xworkz.external.*;


public class MainRunner {
    public static void main(String[] args) {
        Persian persian1 = new Persian("whiskey", 11, 3);
        Persian persian = new Persian("whiskey", 11, 3);
        System.out.println("Same Persian: " + persian1.equals(persian));
        System.out.println(persian1);
        System.out.println(persian1.hashCode());
        System.out.println(persian);
        System.out.println(persian.hashCode());

        Husky husky1 = new Husky("rony", 7, 5);
        Husky husky = new Husky("rony", 7, 5);
        System.out.println("Same Husky: " + husky1.equals(husky));
        System.out.println(husky1);
        System.out.println(husky1.hashCode());
        System.out.println(husky);
        System.out.println(husky.hashCode());

        GoldenRetriver goldenRetriver1 = new GoldenRetriver("rocky", 7, 6);
        GoldenRetriver goldenRetriver = new GoldenRetriver("rocky", 7, 6);
        System.out.println("Same GoldenRetriver: " + goldenRetriver1.equals(goldenRetriver));
        System.out.println(goldenRetriver1);
        System.out.println(goldenRetriver1.hashCode());
        System.out.println(goldenRetriver);
        System.out.println(goldenRetriver.hashCode());

        Nike nike1 = new Nike("Nike", 7, 67);
        Nike nike = new Nike("Nike", 7, 67);
        String nikeString = nike1.toString();
        System.out.println("Same Nike: " + nike1.equals(nike));
        System.out.println(nike1);
        System.out.println(nike1.hashCode());
        System.out.println(nikeString);

        Puma puma1 = new Puma("Puma", 8, 9);
        Puma puma = new Puma("Puma", 8, 9);
        System.out.println("Same Puma: " + puma1.equals(puma));
        System.out.println(puma1);
        System.out.println(puma1.hashCode());
        System.out.println(puma);
        System.out.println(puma.hashCode());

        Asian asian1 = new Asian("Asian", 7, 9);
        Asian asian = new Asian("Asian", 7, 9);
        System.out.println("Same Asian: " + asian1.equals(asian));
        System.out.println(asian1);
        System.out.println(asian1.hashCode());
        System.out.println(asian);
        System.out.println(asian.hashCode());

        Zyadan zyadan1 = new Zyadan("Zaydan", 8, 9);
        Zyadan zyadan = new Zyadan("zyadan", 8, 9);
        System.out.println("Both are same: " + zyadan1.equals(zyadan));
        System.out.println(zyadan1);
        System.out.println(zyadan1.hashCode());
        System.out.println(zyadan);
        System.out.println(zyadan.hashCode());

        AirJordan airJordan1 = new AirJordan("AirJordan", 6, 8);
        AirJordan airJordan= new AirJordan("airjordan", 56, 89);
        System.out.println("Same AirJordan: " + airJordan1.equals(airJordan));
        System.out.println(airJordan1);
        System.out.println(airJordan1.hashCode());
        System.out.println(airJordan);
        System.out.println(airJordan.hashCode());


        Tiger tiger1 = new Tiger("Tiger", "67", "white");
        Tiger tiger = new Tiger("Tiger", "67", "white");
        System.out.println("Same Tiger: " + tiger1.equals(tiger));
        System.out.println(tiger1);
        System.out.println(tiger1.hashCode());
        System.out.println(tiger);
        System.out.println(tiger.hashCode());

        Cow cow1 = new Cow("cow", "56", "black");
        Cow cow= new Cow("cow", "56", "black");
        System.out.println("Same Cow: " + cow1.equals(cow));
        System.out.println(cow1);
        System.out.println(cow1.hashCode());
        System.out.println(cow);
        System.out.println(cow.hashCode());

        Cat cat1 = new Cat("cat", "56", "orange");
        Cat cat = new Cat("cat", "56", "orange");
        System.out.println("Same Cat: " + cat1.equals(cat));
        System.out.println(cat1);
        System.out.println(cat1.hashCode());
        System.out.println(cat);
        System.out.println(cat.hashCode());

        Algea algea1 = new Algea("Algea", "plant", "water");
        Algea algea = new Algea("Algea", "plant", "water");
        System.out.println("Same Algea: " + algea1.equals(algea));
        System.out.println(algea1);
        System.out.println(algea1.hashCode());
        System.out.println(algea);
        System.out.println(algea.hashCode());

        Bamboo bamboo1 = new Bamboo("bamboo", "plant", "earth");
        Bamboo bamboo = new Bamboo("bamboo", "plant", "earth");
        System.out.println("Same Bamboo: " + bamboo1.equals(bamboo));
        System.out.println(bamboo1);
        System.out.println(bamboo1.hashCode());
        System.out.println(bamboo);
        System.out.println(bamboo.hashCode());

        Cactus cactus1 = new Cactus("Cactus", "plant", "dessert");
        Cactus cactus = new Cactus("Cactus", "plant", "dessert");
        System.out.println("Same Cactus: " + cactus1.equals(cactus));
        System.out.println(cactus1);
        System.out.println(cactus1.hashCode());
        System.out.println(cactus);
        System.out.println(cactus.hashCode());

        Fern fern1 = new Fern("fern", "plant", "water");
        Fern fern = new Fern("fern", "plant", "water");
        System.out.println("Same Fern: " + fern1.equals(fern));
        System.out.println(fern1);
        System.out.println(fern1.hashCode());
        System.out.println(fern);
        System.out.println(fern.hashCode());

        Hearb hearb1 = new Hearb("hearb", "plant", "bush");
        Hearb hearb = new Hearb("hearb", "plant", "bush");
        System.out.println("Same Hearb: " + hearb1.equals(hearb));
        System.out.println(hearb1);
        System.out.println(hearb1.hashCode());
        System.out.println(hearb);
        System.out.println(hearb.hashCode());

        Bush bush1 = new Bush("bush", "plant", "bush");
        Bush bush = new Bush("bush", "plant", "bush");
        System.out.println("Same Bush: " + bush1.equals(bush));
        System.out.println(bush1);
        System.out.println(bush1.hashCode());
        System.out.println(bush);
        System.out.println(bush.hashCode());

        Moss moss1 = new Moss("moss", "plant", "water");
        Moss moss = new Moss("moss", "plant", "water");
        System.out.println("Same Moss: " + moss1.equals(moss));
        System.out.println(moss1);
        System.out.println(moss1.hashCode());
        System.out.println(moss);
        System.out.println(moss.hashCode());

        Shrub shrub1 = new Shrub("shrub", "plant", "mud");
        Shrub shrub = new Shrub("shrub", "plant", "mud");
        System.out.println("Same Shrub: " + shrub1.equals(shrub));
        System.out.println(shrub1);
        System.out.println(shrub1.hashCode());
        System.out.println(shrub);
        System.out.println(shrub.hashCode());

        Tree tree1 = new Tree("tree", "plant", "ground");
        Tree tree = new Tree("tree", "plant", "ground");
        System.out.println("Same Tree: " + tree1.equals(tree));
        System.out.println(tree1);
        System.out.println(tree1.hashCode());
        System.out.println(tree);
        System.out.println(tree.hashCode());

        Pine pine1 = new Pine("pine", "plant", "forest");
        Pine pine = new Pine("pine", "plant", "forest");
        System.out.println("Same Pine: " + pine1.equals(pine));
        System.out.println(pine1);
        System.out.println(pine1.hashCode());
        System.out.println(pine);
        System.out.println(pine.hashCode());

        Vine vine1 = new Vine("vine", "plant", "forest");
        Vine vine = new Vine("vine", "plant", "forest");
        System.out.println("Same Vine: " + vine1.equals(vine));
        System.out.println(vine1);
        System.out.println(vine1.hashCode());
        System.out.println(vine);
        System.out.println(vine.hashCode());


        Chisel chisel1 = new Chisel("chisEl", "tool", 7);
        Chisel chisel = new Chisel("chisEl", "tool", 7);
        System.out.println("Same Chisel: " + chisel1.equals(chisel));
        System.out.println(chisel1);
        System.out.println(chisel1.hashCode());
        System.out.println(chisel);
        System.out.println(chisel.hashCode());

        Drill drill1 = new Drill("drill", "tool", 8);
        Drill drill = new Drill("drill", "tool", 8);
        System.out.println("Same Drill: " + drill1.equals(drill));
        System.out.println(drill1);
        System.out.println(drill1.hashCode());
        System.out.println(drill);
        System.out.println(drill.hashCode());

        Hammer hammer1 = new Hammer("hammer", "tools", 9);
        Hammer hammer = new Hammer("hammer", "tools", 9);
        System.out.println("Same Hammer: " + hammer1.equals(hammer));
        System.out.println(hammer1);
        System.out.println(hammer1.hashCode());
        System.out.println(hammer);
        System.out.println(hammer.hashCode());

        Nail nail1 = new Nail("nail", "tool", 100);
        Nail nail= new Nail("nail", "tool", 100);
        System.out.println("Same Nail: " + nail1.equals(nail));
        System.out.println(nail1);
        System.out.println(nail1.hashCode());
        System.out.println(nail);
        System.out.println(nail.hashCode());

        Pliers pliers1 = new Pliers("pliers", "tool", 9);
        Pliers pliers = new Pliers("pliers", "tool", 9);
        System.out.println("Same Pliers: " + pliers1.equals(pliers));
        System.out.println(pliers1);
        System.out.println(pliers1.hashCode());
        System.out.println(pliers);
        System.out.println(pliers.hashCode());

        Saw saw1 = new Saw("saw", "tools", 9);
        Saw saw = new Saw("saw", "tools", 9);
        System.out.println("Same Saw: " + saw1.equals(saw));
        System.out.println(saw1);
        System.out.println(saw1.hashCode());
        System.out.println(saw);
        System.out.println(saw.hashCode());

        ScrewDriver screwDriver1 = new ScrewDriver("Screwdriver", "tools", 9);
        ScrewDriver screwDriver = new ScrewDriver("Screwdriver", "tools", 9);
        System.out.println("Same ScrewDriver: " + screwDriver1.equals(screwDriver));
        System.out.println(screwDriver1);
        System.out.println(screwDriver1.hashCode());
        System.out.println(screwDriver);
        System.out.println(screwDriver.hashCode());

        Tape tape1 = new Tape("tape", "tools", 9);
        Tape tape = new Tape("tape", "tools", 9);
        System.out.println("Same Tape: " + tape1.equals(tape));
        System.out.println(tape1);
        System.out.println(tape1.hashCode());
        System.out.println(tape);
        System.out.println(tape.hashCode());

        Wrench wrench1 = new Wrench("wrench", "tool", 9);
        Wrench wrench = new Wrench("wrench", "tool", 9);
        System.out.println("Same Wrench: " + wrench1.equals(wrench));
        System.out.println(wrench1);
        System.out.println(wrench1.hashCode());
        System.out.println(wrench);
        System.out.println(wrench.hashCode());

        Level level1 = new Level("level", "tool", 8);
        Level level = new Level("level", "tool", 8);
        System.out.println("Same Level: " + level1.equals(level));
        System.out.println(level1);
        System.out.println(level1.hashCode());
        System.out.println(level);
        System.out.println(level.hashCode());

        PaintBrush paintBrush1 = new PaintBrush("pain brush", "tool", 8);
        PaintBrush paintBrush = new PaintBrush("pain brush", "tool", 8);
        System.out.println("Same PaintBrush: " + paintBrush1.equals(paintBrush));
        System.out.println(paintBrush1);
        System.out.println(paintBrush1.hashCode());
        System.out.println(paintBrush);
        System.out.println(paintBrush.hashCode());




        Maths math1 = new Maths("maths", "A", 78);
        Maths math = new Maths("maths", "A", 78);
        System.out.println("Same Maths: " + math1.equals(math));
        System.out.println(math1);
        System.out.println(math1.hashCode());
        System.out.println(math);
        System.out.println(math.hashCode());

        Physics physics1 = new Physics("physics", "B", 67);
        Physics physics = new Physics("physics", "B", 67);
        System.out.println("Same Physics: " + physics1.equals(physics));
        System.out.println(physics1);
        System.out.println(physics1.hashCode());
        System.out.println(physics);
        System.out.println(physics.hashCode());

        Psychology psychology1 = new Psychology("psychology", "A", 89);
        Psychology psychology = new Psychology("psychology", "A", 89);
        System.out.println("Same Psychology: " + psychology1.equals(psychology));
        System.out.println(psychology1);
        System.out.println(psychology1.hashCode());
        System.out.println(psychology);
        System.out.println(psychology.hashCode());

        English english1 = new English("english", "A", 78);
        English english = new English("english", "A", 78);
        System.out.println("Same English: " + english1.equals(english));
        System.out.println(english1);
        System.out.println(english1.hashCode());
        System.out.println(english);
        System.out.println(english.hashCode());

        Economics economics1 = new Economics("economics", "A", 89);
        Economics economics = new Economics("economics", "A", 89);
        System.out.println("Same Economics: " + economics1.equals(economics));
        System.out.println(economics1);
        System.out.println(economics1.hashCode());
        System.out.println(economics);
        System.out.println(economics.hashCode());

        ComputerScience computerScience1 = new ComputerScience("computerscience", "a", 89);
        ComputerScience computerScience = new ComputerScience("computerscience", "a", 89);
        System.out.println("Same ComputerScience: " + computerScience1.equals(computerScience));
        System.out.println(computerScience1);
        System.out.println(computerScience1.hashCode());
        System.out.println(computerScience);
        System.out.println(computerScience.hashCode());

        Geography geography1 = new Geography("geo", "A", 78);
        Geography geography = new Geography("geo", "A", 78);
        System.out.println("Same Geography: " + geography1.equals(geography));
        System.out.println(geography1);
        System.out.println(geography1.hashCode());
        System.out.println(geography);
        System.out.println(geography.hashCode());

        History history1 = new History("history", "G", 56);
        History history = new History("history", "G", 56);
        System.out.println("Same History: " + history1.equals(history));
        System.out.println(history1);
        System.out.println(history1.hashCode());
        System.out.println(history);
        System.out.println(history.hashCode());

        Biology biology1 = new Biology("bio", "s", 78);
        Biology biology = new Biology("bio", "s", 78);
        System.out.println("Same Biology: " + biology1.equals(biology));
        System.out.println(biology1);
        System.out.println(biology1.hashCode());
        System.out.println(biology);
        System.out.println(biology.hashCode());

        Chemistry chemistry1 = new Chemistry("chem", "A", 89);
        Chemistry chemistry = new Chemistry("chem", "A", 89);
        System.out.println("Same Chemistry: " + chemistry1.equals(chemistry));
        System.out.println(chemistry1);
        System.out.println(chemistry1.hashCode());
        System.out.println(chemistry);
        System.out.println(chemistry.hashCode());


        CreditCard creditCard1 = new CreditCard("go", 89, 89);
        CreditCard creditCard = new CreditCard("go", 89, 89);
        System.out.println("Same CreditCard: " + creditCard1.equals(creditCard));
        System.out.println(creditCard1);
        System.out.println(creditCard1.hashCode());
        System.out.println(creditCard);
        System.out.println(creditCard.hashCode());

        DebitCard debitCard1 = new DebitCard("unio", 7, 9);
        DebitCard debitCard = new DebitCard("unio", 7, 9);
        System.out.println("Same DebitCard: " + debitCard1.equals(debitCard));
        System.out.println(debitCard1);
        System.out.println(debitCard1.hashCode());
        System.out.println(debitCard);
        System.out.println(debitCard.hashCode());

        PayPal payPal1 = new PayPal("paypal", 89, 90);
        PayPal payPal = new PayPal("paypal", 89, 90);
        System.out.println("Same PayPal: " + payPal1.equals(payPal));
        System.out.println(payPal1);
        System.out.println(payPal1.hashCode());
        System.out.println(payPal);
        System.out.println(payPal.hashCode());

        GooglePay googlePay1 = new GooglePay("google pay", 89, 89);
        GooglePay googlePay = new GooglePay("google pay", 89, 89);
        System.out.println("Same GooglePay: " + googlePay1.equals(googlePay));
        System.out.println(googlePay1);
        System.out.println(googlePay1.hashCode());
        System.out.println(googlePay);
        System.out.println(googlePay.hashCode());

        ApplePay applePay1 = new ApplePay("apple", 89, 76);
        ApplePay applePay = new ApplePay("apple", 89, 76);
        System.out.println("Same ApplePay: " + applePay1.equals(applePay));
        System.out.println(applePay1);
        System.out.println(applePay1.hashCode());
        System.out.println(applePay);
        System.out.println(applePay.hashCode());

        Bitcoin bitcoin1 = new Bitcoin("bitcoin", 65, 56);
        Bitcoin bitcoin = new Bitcoin("bitcoin", 65, 56);
        System.out.println("Same Bitcoin: " + bitcoin1.equals(bitcoin));
        System.out.println(bitcoin1);
        System.out.println(bitcoin1.hashCode());
        System.out.println(bitcoin);
        System.out.println(bitcoin.hashCode());

        BankTransfer bankTransfer1 = new BankTransfer("union", 67, 89);
        BankTransfer bankTransfer = new BankTransfer("union", 67, 89);
        System.out.println("Same BankTransfer: " + bankTransfer1.equals(bankTransfer));
        System.out.println(bankTransfer1);
        System.out.println(bankTransfer1.hashCode());
        System.out.println(bankTransfer);
        System.out.println(bankTransfer.hashCode());

        Cash cash1 = new Cash("cash", 8, 3);
        Cash cash = new Cash("cash", 8, 3);
        System.out.println("Same Cash: " + cash1.equals(cash));
        System.out.println(cash1);
        System.out.println(cash1.hashCode());
        System.out.println(cash);
        System.out.println(cash.hashCode());

        GiftCard giftCard1 = new GiftCard("giftcard", 7, 4);
        GiftCard giftCard = new GiftCard("giftcard", 7, 4);
        System.out.println("Same GiftCard: " + giftCard1.equals(giftCard));
        System.out.println(giftCard1);
        System.out.println(giftCard1.hashCode());
        System.out.println(giftCard);
        System.out.println(giftCard.hashCode());

        Crypto crypto1 = new Crypto("crypto", 67, 4);
        Crypto crypto = new Crypto("crypto", 67, 4);
        System.out.println("Same Crypto: " + crypto1.equals(crypto));
        System.out.println(crypto1);
        System.out.println(crypto1.hashCode());
        System.out.println(crypto);
        System.out.println(crypto.hashCode());


        Electronics electronics1 = new Electronics("electronics", 56, 78);
        Electronics electronics = new Electronics("electronics", 56, 78);
        System.out.println("Same Electronics: " + electronics1.equals(electronics));
        System.out.println(electronics1);
        System.out.println(electronics1.hashCode());
        System.out.println(electronics);
        System.out.println(electronics.hashCode());

        Clothing clothing1 = new Clothing("clothing", 78, 89);
        Clothing clothing = new Clothing("clothing", 78, 89);
        System.out.println("Same Clothing: " + clothing1.equals(clothing));
        System.out.println(clothing1);
        System.out.println(clothing1.hashCode());
        System.out.println(clothing);
        System.out.println(clothing.hashCode());

        Grocery grocery1 = new Grocery("grocery", 67, 3);
        Grocery grocery = new Grocery("grocery", 67, 3);
        System.out.println("Same Grocery: " + grocery1.equals(grocery));
        System.out.println(grocery1);
        System.out.println(grocery1.hashCode());
        System.out.println(grocery);
        System.out.println(grocery.hashCode());

        Furniture furniture1 = new Furniture("furniture", 6, 7);
        Furniture furniture = new Furniture("furniture", 6, 7);
        System.out.println("Same Furniture: " + furniture1.equals(furniture));
        System.out.println(furniture1);
        System.out.println(furniture1.hashCode());
        System.out.println(furniture);
        System.out.println(furniture.hashCode());

        Toys toys1 = new Toys("toys", 8, 8);
        Toys toys = new Toys("toys", 8, 8);
        System.out.println("Same Toys: " + toys1.equals(toys));
        System.out.println(toys1);
        System.out.println(toys1.hashCode());
        System.out.println(toys);
        System.out.println(toys.hashCode());

        Books books1 = new Books("books", 6, 8);
        Books books = new Books("books", 6, 8);
        System.out.println("Same Books: " + books1.equals(books));
        System.out.println(books1);
        System.out.println(books1.hashCode());
        System.out.println(books);
        System.out.println(books.hashCode());

        Beauty beauty1 = new Beauty("beauty", 8, 9);
        Beauty beauty = new Beauty("beauty", 8, 9);
        System.out.println("Same Beauty: " + beauty1.equals(beauty));
        System.out.println(beauty1);
        System.out.println(beauty1.hashCode());
        System.out.println(beauty);
        System.out.println(beauty.hashCode());

        Sports sports1 = new Sports("sports", 8, 9);
        Sports sports = new Sports("sports", 8, 9);
        System.out.println("Same Sports: " + sports1.equals(sports));
        System.out.println(sports1);
        System.out.println(sports1.hashCode());
        System.out.println(sports);
        System.out.println(sports.hashCode());

        Footwear footwear1 = new Footwear("footwear", 8, 9);
        Footwear footwear = new Footwear("footwear", 8, 9);
        System.out.println("Same Footwear: " + footwear1.equals(footwear));
        System.out.println(footwear1);
        System.out.println(footwear1.hashCode());
        System.out.println(footwear);
        System.out.println(footwear.hashCode());

        Jewelry jewelry1 = new Jewelry("jewelry", 8, 9);
        Jewelry jewelry = new Jewelry("jewelry", 8, 9);
        System.out.println("Same Jewelry: " + jewelry1.equals(jewelry));
        System.out.println(jewelry1);
        System.out.println(jewelry1.hashCode());
        System.out.println(jewelry);
        System.out.println(jewelry.hashCode());


        House house1 = new House("house", 7, "manglore");
        House house = new House("house", 7, "manglore");
        System.out.println("Same House: " + house1.equals(house));
        System.out.println(house1);
        System.out.println(house1.hashCode());
        System.out.println(house);
        System.out.println(house.hashCode());

        Hospital hospital1 = new Hospital("hospital", 7, "shivmoga");
        Hospital hospital = new Hospital("hospital", 7, "shivmoga");
        System.out.println("Same Hospital: " + hospital1.equals(hospital));
        System.out.println(hospital1);
        System.out.println(hospital1.hashCode());
        System.out.println(hospital);
        System.out.println(hospital.hashCode());

        School school1 = new School("school", 78, "banglore");
        School school = new School("school", 78, "banglore");
        System.out.println("Same School: " + school1.equals(school));
        System.out.println(school1);
        System.out.println(school1.hashCode());
        System.out.println(school);
        System.out.println(school.hashCode());

        Library library1 = new Library("library", 4, "manglore");
        Library library = new Library("library", 4, "manglore");
        System.out.println("Same Library: " + library1.equals(library));
        System.out.println(library1);
        System.out.println(library1.hashCode());
        System.out.println(library);
        System.out.println(library.hashCode());

        Hotel hotel1 = new Hotel("hotel", 8, "mang");
        Hotel hotel = new Hotel("hotel", 8, "mang");
        System.out.println("Same Hotel: " + hotel1.equals(hotel));
        System.out.println(hotel1);
        System.out.println(hotel1.hashCode());
        System.out.println(hotel);
        System.out.println(hotel.hashCode());

        Office office1 = new Office("office", 3, "banglore");
        Office office = new Office("office", 3, "banglore");
        System.out.println("Same Office: " + office1.equals(office));
        System.out.println(office1);
        System.out.println(office1.hashCode());
        System.out.println(office);
        System.out.println(office.hashCode());

        Mall mall1 = new Mall("mall", 7, "location");
        Mall mall = new Mall("mall", 7, "location");
        System.out.println("Same Mall: " + mall1.equals(mall));
        System.out.println(mall1);
        System.out.println(mall1.hashCode());
        System.out.println(mall);
        System.out.println(mall.hashCode());

        Factory factory1 = new Factory("factory", 7, "location");
        Factory factory = new Factory("factory", 7, "location");
        System.out.println("Same Factory: " + factory1.equals(factory));
        System.out.println(factory1);
        System.out.println(factory1.hashCode());
        System.out.println(factory);
        System.out.println(factory.hashCode());

        Museum museum1 = new Museum("museum", 8, "kerala");
        Museum museum = new Museum("museum", 8, "kerala");
        System.out.println("Same Museum: " + museum1.equals(museum));
        System.out.println(museum1);
        System.out.println(museum1.hashCode());
        System.out.println(museum);
        System.out.println(museum.hashCode());

        SuperMarket superMarket1 = new SuperMarket("superMarket", 6, "location");
        SuperMarket superMarket = new SuperMarket("superMarket", 6, "location");
        System.out.println("Same SuperMarket: " + superMarket1.equals(superMarket));
        System.out.println(superMarket1);
        System.out.println(superMarket1.hashCode());
        System.out.println(superMarket);
        System.out.println(superMarket.hashCode());


        Car car1 = new Car("red", 8, 76);
        Car car = new Car("red", 8, 76);
        System.out.println("Same Car: " + car1.equals(car));
        System.out.println(car1);
        System.out.println(car1.hashCode());
        System.out.println(car);
        System.out.println(car.hashCode());

        Bike bike1 = new Bike("blue", 4, 7);
        Bike bike = new Bike("blue", 4, 7);
        System.out.println("Same Bike: " + bike1.equals(bike));
        System.out.println(bike1);
        System.out.println(bike1.hashCode());
        System.out.println(bike);
        System.out.println(bike.hashCode());

        Truck truck1 = new Truck("blue", 8, 9);
        Truck truck = new Truck("blue", 8, 9);
        System.out.println("Same Truck: " + truck1.equals(truck));
        System.out.println(truck1);
        System.out.println(truck1.hashCode());
        System.out.println(truck);
        System.out.println(truck.hashCode());

        Bus bus1 = new Bus("blue", 5, 4);
        Bus bus = new Bus("blue", 5, 4);
        System.out.println("Same Bus: " + bus1.equals(bus));
        System.out.println(bus1);
        System.out.println(bus1.hashCode());
        System.out.println(bus);
        System.out.println(bus.hashCode());

        Scooter scooter1 = new Scooter("red", 6, 8);
        Scooter scooter = new Scooter("red", 6, 8);
        System.out.println("Same Scooter: " + scooter1.equals(scooter));
        System.out.println(scooter1);
        System.out.println(scooter1.hashCode());
        System.out.println(scooter);
        System.out.println(scooter.hashCode());

        Train train1 = new Train("red", 9, 9);
        Train train = new Train("red", 9, 9);
        System.out.println("Same Train: " + train1.equals(train));
        System.out.println(train1);
        System.out.println(train1.hashCode());
        System.out.println(train);
        System.out.println(train.hashCode());

        Airplane airplane1 = new Airplane("airplane", 89, 90);
        Airplane airplane = new Airplane("airplane", 89, 90);
        System.out.println("Same Airplane: " + airplane1.equals(airplane));
        System.out.println(airplane1);
        System.out.println(airplane1.hashCode());
        System.out.println(airplane);
        System.out.println(airplane.hashCode());

        Ship ship1 = new Ship("red", 9, 8);
        Ship ship = new Ship("red", 9, 8);
        System.out.println("Same Ship: " + ship1.equals(ship));
        System.out.println(ship1);
        System.out.println(ship1.hashCode());
        System.out.println(ship);
        System.out.println(ship.hashCode());

        Tractor tractor1 = new Tractor("red", 7, 0);
        Tractor tractor = new Tractor("red", 7, 0);
        System.out.println("Same Tractor: " + tractor1.equals(tractor));
        System.out.println(tractor1);
        System.out.println(tractor1.hashCode());
        System.out.println(tractor);
        System.out.println(tractor.hashCode());

        Ambulance ambulance1 = new Ambulance("white", 8, 9);
        Ambulance ambulance = new Ambulance("white", 8, 9);
        System.out.println("Same Ambulance: " + ambulance1.equals(ambulance));
        System.out.println(ambulance1);
        System.out.println(ambulance1.hashCode());
        System.out.println(ambulance);
        System.out.println(ambulance.hashCode());


        Phone phone1 = new Phone("phone", 67, 9);
        Phone phone = new Phone("phone", 67, 9);
        System.out.println("Same Phone: " + phone1.equals(phone));
        System.out.println(phone1);
        System.out.println(phone1.hashCode());
        System.out.println(phone);
        System.out.println(phone.hashCode());

        Laptop laptop1 = new Laptop("laptop", 67, 9);
        Laptop laptop = new Laptop("laptop", 67, 9);
        System.out.println("Same Laptop: " + laptop1.equals(laptop));
        System.out.println(laptop1);
        System.out.println(laptop1.hashCode());
        System.out.println(laptop);
        System.out.println(laptop.hashCode());

        TV tv1 = new TV("tv", 89, 9);
        TV tv = new TV("tv", 89, 9);
        System.out.println("Same TV: " + tv1.equals(tv));
        System.out.println(tv1);
        System.out.println(tv1.hashCode());
        System.out.println(tv);
        System.out.println(tv.hashCode());

        SmartWatch smartWatch1 = new SmartWatch("watch", 78, 9);
        SmartWatch smartWatch = new SmartWatch("watch", 78, 9);
        System.out.println("Same SmartWatch: " + smartWatch1.equals(smartWatch));
        System.out.println(smartWatch1);
        System.out.println(smartWatch1.hashCode());
        System.out.println(smartWatch);
        System.out.println(smartWatch.hashCode());

        Printer printer1 = new Printer("printer", 89, 9);
        Printer printer = new Printer("printer", 89, 9);
        System.out.println("Same Printer: " + printer1.equals(printer));
        System.out.println(printer1);
        System.out.println(printer1.hashCode());
        System.out.println(printer);
        System.out.println(printer.hashCode());

        Monitor monitor1 = new Monitor("monitor", 9, 8);
        Monitor monitor = new Monitor("monitor", 9, 8);
        System.out.println("Same Monitor: " + monitor1.equals(monitor));
        System.out.println(monitor1);
        System.out.println(monitor1.hashCode());
        System.out.println(monitor);
        System.out.println(monitor.hashCode());

        Speaker speaker1 = new Speaker("speaker", 8,22 );
        Speaker speaker = new Speaker("speaker", 8,222 );
        System.out.println("Same Speaker: " + speaker1.equals(speaker));
        System.out.println(speaker1);
        System.out.println(speaker1.hashCode());
        System.out.println(speaker);
        System.out.println(speaker.hashCode());

        Console console1 = new Console("console", 8, 3);
        Console console = new Console("console", 8, 3);
        System.out.println("Same Console: " + console1.equals(console));
        System.out.println(console1);
        System.out.println(console1.hashCode());
        System.out.println(console);
        System.out.println(console.hashCode());

        Tablet tablet1 = new Tablet("tablet", 7, 9);
        Tablet tablet = new Tablet("tablet", 7, 9);
        System.out.println("Same Tablet: " + tablet1.equals(tablet));
        System.out.println(tablet1);
        System.out.println(tablet1.hashCode());
        System.out.println(tablet);
        System.out.println(tablet.hashCode());

        Router router1 = new Router("router", 8, 8);
        Router router = new Router("router", 8, 8);
        System.out.println("Same Router: " + router1.equals(router));
        System.out.println(router1);
        System.out.println(router1.hashCode());
        System.out.println(router);
        System.out.println(router.hashCode());


        TwistedLove twistedLove1 = new TwistedLove("twisted love", "smut", 10);
        TwistedLove twistedLove = new TwistedLove("twisted love", "smut", 10);
        System.out.println("Same TwistedLove: " + twistedLove1.equals(twistedLove));
        System.out.println(twistedLove1);
        System.out.println(twistedLove1.hashCode());
        System.out.println(twistedLove);
        System.out.println(twistedLove.hashCode());

        TwistedHate twistedHate1 = new TwistedHate("twisted hate", "smut", 10);
        TwistedHate twistedHate = new TwistedHate("twisted hate", "smut", 10);
        System.out.println("Same TwistedHate: " + twistedHate1.equals(twistedHate));
        System.out.println(twistedHate1);
        System.out.println(twistedHate1.hashCode());
        System.out.println(twistedHate);
        System.out.println(twistedHate.hashCode());

        TwistedLie twistedLie1 = new TwistedLie("twisted love", "smut", 10);
        TwistedLie twistedLie = new TwistedLie("twisted love", "smut", 10);
        System.out.println("Same TwistedLie: " + twistedLie1.equals(twistedLie));
        System.out.println(twistedLie1);
        System.out.println(twistedLie1.hashCode());
        System.out.println(twistedLie);
        System.out.println(twistedLie.hashCode());

        TwistedGame twistedGame1 = new TwistedGame("twisted lie", "smut", 10);
        TwistedGame twistedGame = new TwistedGame("twisted lie", "smut", 10);
        System.out.println("Same TwistedGame: " + twistedGame1.equals(twistedGame));
        System.out.println(twistedGame1);
        System.out.println(twistedGame1.hashCode());
        System.out.println(twistedGame);
        System.out.println(twistedGame.hashCode());

        IgniteMe igniteMe1 = new IgniteMe("ignite me", "fantasy", 9);
        IgniteMe igniteMe = new IgniteMe("ignite me", "fantasy", 9);
        System.out.println("Same IgniteMe: " + igniteMe1.equals(igniteMe));
        System.out.println(igniteMe1);
        System.out.println(igniteMe1.hashCode());
        System.out.println(igniteMe);
        System.out.println(igniteMe.hashCode());

        ShatterMe shatterMe1 = new ShatterMe("Shatter me", "fantasy", 10);
        ShatterMe shatterMe = new ShatterMe("Shatter me", "fantasy", 10);
        System.out.println("Same ShatterMe: " + shatterMe1.equals(shatterMe));
        System.out.println(shatterMe1);
        System.out.println(shatterMe1.hashCode());
        System.out.println(shatterMe);
        System.out.println(shatterMe.hashCode());

        YourName yourName1 = new YourName("your name", "fantasy", 10);
        YourName yourName = new YourName("your name", "fantasy", 10);
        System.out.println("Same YourName: " + yourName1.equals(yourName));
        System.out.println(yourName1);
        System.out.println(yourName1.hashCode());
        System.out.println(yourName);
        System.out.println(yourName.hashCode());





        Tshirt tshirt1=new Tshirt();
        tshirt1.setBrand("nike");
        tshirt1.setSize(4);
        tshirt1.setPrice(300);

        Tshirt tshirt=new Tshirt();
        tshirt.setBrand("xworkz");
        tshirt.setSize(4);
        tshirt.setPrice(300);

    }
}
