package com.capstone.components;

import com.capstone.models.Category;
import com.capstone.models.Customer;
import com.capstone.models.Product;
import com.capstone.repositories.CustomerRepository;
import com.capstone.repositories.OrderRepository;
import com.capstone.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    ProductRepository productRepository;

    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    OrderRepository orderRepository;

    public DataLoader(){

    }

    @Override
    public void run(ApplicationArguments args) throws Exception{

        //Customers
        Customer customer1 = new Customer("Rebecca Going", "rebeccagoing@gmail.com", "9, Somewhere Street","1234");

        Customer customer2 = new Customer("Darren Coming", "darrencoming@gmail.com", "10, Next Street","4321");

        // Add more customers
        Customer customer3 = new Customer("John Doe", "johndoe@gmail.com", "123 Main Street", "5678");
        Customer customer4 = new Customer("Jane Smith", "janesmith@gmail.com", "456 Elm Street", "9876");
        Customer customer5 = new Customer("Michael Johnson", "michaeljohnson@gmail.com", "789 Oak Street", "5432");
        Customer customer6 = new Customer("Emily Brown", "emilybrown@gmail.com", "101 Pine Street", "2468");
        Customer customer7 = new Customer("David Wilson", "davidwilson@gmail.com", "222 Cedar Street", "1357");
        Customer customer8 = new Customer("Sarah Lee", "sarahlee@gmail.com", "333 Birch Street", "8642");
        Customer customer9 = new Customer("William Davis", "williamdavis@gmail.com", "444 Maple Street", "3194");
        Customer customer10 = new Customer("Olivia White", "oliviawhite@gmail.com", "555 Walnut Street", "7269");

        customerRepository.saveAll(List.of(customer1, customer2, customer3, customer4, customer5, customer6, customer7, customer8, customer9, customer10));


        // Products (5 in each category)
        Product book1 = new Product("Rich Dad Poor Dad", 999, "Rich Dad Poor Dad is a 1997 book written by Robert T. Kiyosaki and Sharon Lechter. It advocates the importance of financial literacy, financial independence and building wealth through investing in assets, real estate investing, starting and owning businesses, as well as increasing one's financial intelligence.", 25, "https://m.media-amazon.com/images/I/81bsw6fnUiL._AC_UF894,1000_QL80_.jpg", Category.BOOKS);
        Product book2 = new Product("Atomic Habits", 1799, "A supremely practical and useful book. James Clear distils the most fundamental information about habit formation, so you can accomplish more by focusing on less.", 50, "https://m.media-amazon.com/images/I/51-nXsSRfZL._SY445_SX342_.jpg", Category.BOOKS);
        Product book3 = new Product("9 Money Habits Keeping You Poor: My Story to Financial Freedom", 1299, "In 9 Money Habits Keeping You Poor: My Story to Financial Freedom, Adam Rose will take you on a transformative journey from a life of financial struggle to one of freedom, security, and independence. Drawing from his own experiences and the success stories of others, Adam reveals the nine key habits that keep people trapped in poverty and provides actionable steps to break free from them.", 30, "https://m.media-amazon.com/images/I/61Dgqlld0dL._SL1500_.jpg", Category.BOOKS);
        Product book4 = new Product("The Diary of a CEO: The 33 Laws of Business and Life", 1499, "At the very heart of all the success and failure I've been exposed to - both my own entrepreneurial journey and through the thousands of interviews I've conducted on my podcast - are a set of principles that can stand the test of time, apply to any industry, and be used by anyone who is search of building something great or becoming someone great.", 40, "https://m.media-amazon.com/images/I/41gJOF1uHeL.jpg", Category.BOOKS);
        Product book5 = new Product("Elon Musk: by Walter Isaacson", 899, "From the author of Steve Jobs and other bestselling biographies, this is the astonishingly intimate story of Elon Musk, the most fascinating and controversial innovator of our era – a rule-breaking visionary who helped to lead the world into the era of electric vehicles, private space exploration and artificial intelligence. Oh, and took over Twitter.", 20, "https://m.media-amazon.com/images/I/71iWxmst49L._SY522_.jpg", Category.BOOKS);

        // Add more products in the BOOKS category
        Product book6 = new Product("The Great Gatsby", 899, "The Great Gatsby is a classic novel by F. Scott Fitzgerald. It explores themes of wealth, love, and the American Dream in the 1920s. Follow the enigmatic Jay Gatsby and the elusive Daisy Buchanan in this timeless story.", 40, "https://m.media-amazon.com/images/I/71Ai8VgJjpL._SL1024_.jpg", Category.BOOKS);
        Product book7 = new Product("To Kill a Mockingbird", 1099, "Harper Lee's To Kill a Mockingbird is a powerful novel that addresses issues of racial injustice and moral growth. It is a must-read for anyone interested in the complexities of the American South in the 1930s.", 30, "https://m.media-amazon.com/images/I/81gepf1eMqL._SL1500_.jpg", Category.BOOKS);
        Product book8 = new Product("1984", 799, "George Orwell's dystopian masterpiece, 1984, paints a chilling picture of a totalitarian society where freedom of thought and expression are suppressed. It remains a thought-provoking work of fiction.", 35, "https://m.media-amazon.com/images/I/61v3dyzGvVL._SL1500_.jpg", Category.BOOKS);
        Product book9 = new Product("Pride and Prejudice", 1099, "Jane Austen's Pride and Prejudice is a timeless romance novel that explores themes of love, class, and societal expectations in 19th-century England. Follow the headstrong Elizabeth Bennet and the enigmatic Mr. Darcy.", 45, "https://m.media-amazon.com/images/I/613aHpHSOKL._SL1230_.jpg", Category.BOOKS);
        Product book10 = new Product("The Catcher in the Rye", 999, "J.D. Salinger's The Catcher in the Rye is a coming-of-age novel that follows the rebellious Holden Caulfield as he navigates the challenges of adolescence in New York City. It's a classic of American literature.", 25, "https://m.media-amazon.com/images/I/71D6PnMg4WL._SL1500_.jpg", Category.BOOKS);
        Product book11 = new Product("The Hobbit", 1299, "J.R.R. Tolkien's The Hobbit is a fantasy adventure that introduces readers to the world of Middle-earth. Follow Bilbo Baggins on his epic journey to help a group of dwarves reclaim their homeland from the dragon Smaug.", 30, "https://m.media-amazon.com/images/I/71rGUj32JdL._SL1500_.jpg", Category.BOOKS);
        Product book12 = new Product("Harry Potter and the Sorcerer's Stone", 1499, "Enter the magical world of Harry Potter with J.K. Rowling's first book in the series. Follow young Harry as he discovers his true identity as a wizard and embarks on adventures at Hogwarts School of Witchcraft and Wizardry.", 50, "https://m.media-amazon.com/images/I/51DoG9xDIKL.jpg", Category.BOOKS);
        Product book13 = new Product("The Alchemist", 1199, "Paulo Coelho's The Alchemist is a philosophical novel that explores the journey of self-discovery and the pursuit of one's dreams. It has inspired readers around the world with its profound wisdom.", 35, "https://m.media-amazon.com/images/I/517pfctTa9L.jpg", Category.BOOKS);
        Product book14 = new Product("The Hunger Games", 1099, "Suzanne Collins' The Hunger Games is a dystopian adventure that follows Katniss Everdeen as she volunteers to participate in a deadly televised competition. It's a gripping tale of survival and resistance.", 40, "https://m.media-amazon.com/images/I/81gExM+-XtL._AC_UY218_.jpg", Category.BOOKS);
        Product book15 = new Product("The Da Vinci Code", 1399, "Dan Brown's The Da Vinci Code is a thrilling mystery that combines art, history, and religion. Follow Robert Langdon as he unravels the secrets hidden within famous works of art and architecture.", 30, "https://m.media-amazon.com/images/I/81gPg90cAML._AC_UY218_.jpg", Category.BOOKS);


// Add more products in the ELECTRONICS category
        Product electronics1 = new Product("iPhone 15", 50000, "The new Ultra Wideband chip provides improved spatial awareness, allowing iPhone 15 models to more precisely locate other Apple devices with an Ultra Wideband chip. The chip allows two iPhones to connect to each other at three times the range as before.", 100, "https://www.apple.com/newsroom/images/2023/09/apple-debuts-iphone-15-and-iphone-15-plus/article/Apple-iPhone-15-lineup-hero-geo-230912_inline.jpg.large_2x.jpg", Category.ELECTRONICS);
        Product electronics2 = new Product("PlayStation 5", 47900, "Powered by an eight-core AMD Zen 2 CPU and custom AMD Radeon GPU, the PS5 is offered in two models: with and without a 4K Blu-ray drive. Supporting a 120Hz video refresh, the PS5 is considerably more powerful than the PS4 and PS4 Pro. Rather than GDDR5 memory, GDDR6 is supported with capacity doubled from 8 to 16GB.", 99, "https://m.media-amazon.com/images/I/71PMC4DWWFL._AC_SX679_.jpg", Category.ELECTRONICS);
        Product electronics3 = new Product("Amazon Fire TV 43-inch 4-series 4K UHD smart TV", 19999, "Brilliant 4K entertainment: bring films and series to life with support for vivid 4K Ultra HD, HDR 10, HLG and Dolby Digital Plus.", 10, "https://m.media-amazon.com/images/I/51gfEcXBW0L._AC_SX679_.jpg", Category.ELECTRONICS);
        Product electronics4 = new Product("Kindle Scribe", 2499, "The first Kindle for reading, writing, journaling and sketching. Features a 10.2-inch, 300 ppi display and includes Premium Pen | 32 GB + Kindle Unlimited (auto-renewal applies)", 15, "https://m.media-amazon.com/images/I/51t-d5AXeQL._AC_SL1000_.jpg", Category.ELECTRONICS);
        Product electronics5 = new Product(" Studio Display - Standard glass - Tilt-adjustable stand", 2999, "Standard glass has an industry-leading anti-reflective coating for viewing comfort and readability.", 25, "https://store.storeimages.cdn-apple.com/4982/as-images.apple.com/is/studio-display-gallery-1-202203?wid=640&hei=528&fmt=p-jpg&qlt=95&.v=1675709041796", Category.ELECTRONICS);
        // Add more products in the ELECTRONICS category
        Product electronics6 = new Product("Samsung Galaxy Z Fold 5G", 2099, "The Samsung Galaxy Z Fold 5G is the ultimate foldable smartphone. With a large foldable display, powerful specs, and 5G connectivity, it's a game-changer in the smartphone industry.", 50, "https://m.media-amazon.com/images/I/71zDl128yGL._AC_UY218_.jpg", Category.ELECTRONICS);
        Product electronics7 = new Product("DJI Mavic Air 2 Drone", 1299, "The DJI Mavic Air 2 is a compact drone with impressive features. It offers 4K video recording, intelligent flight modes, and a long battery life, making it perfect for aerial photography and videography.", 30, "https://m.media-amazon.com/images/I/61Ci+y2YQUL._AC_UY218_.jpg", Category.ELECTRONICS);
        Product electronics8 = new Product("Sony WH-1000XM4 Wireless Headphones", 299, "Experience industry-leading noise cancellation with the Sony WH-1000XM4 headphones. They offer exceptional sound quality and long-lasting comfort, making them ideal for music enthusiasts.", 70, "https://m.media-amazon.com/images/I/61YHhQzV+KL._AC_UY218_.jpg", Category.ELECTRONICS);
        Product electronics9 = new Product("Apple Watch Series 7", 399, "The Apple Watch Series 7 is the latest and most advanced smartwatch from Apple. It features a larger and always-on display, health and fitness tracking, and a wide range of apps.", 80, "https://m.media-amazon.com/images/I/71kKO0AeR+L._AC_UY218_.jpg", Category.ELECTRONICS);
        Product electronics10 = new Product("LG OLED C1 4K TV", 1799, "Experience stunning visuals with the LG OLED C1 4K TV. It offers OLED technology for deep blacks and vibrant colors, along with smart TV features for streaming and gaming.", 40, "https://m.media-amazon.com/images/I/917gfqBNhuL._AC_UY218_.jpg", Category.ELECTRONICS);
        Product electronics11 = new Product("Bose SoundLink Revolve+ Portable Speaker", 299, "Enjoy 360-degree sound with the Bose SoundLink Revolve+ portable speaker. It's water-resistant, has a long battery life, and delivers impressive audio quality for your outdoor adventures.", 25, "https://m.media-amazon.com/images/I/71Lrnh+yg5L._AC_SL1500_.jpg", Category.ELECTRONICS);
        Product electronics12 = new Product("Microsoft Surface Pro 8", 1199, "The Microsoft Surface Pro 8 is a versatile 2-in-1 laptop and tablet. It offers a high-resolution display, powerful performance, and the flexibility to use it as a laptop or a tablet.", 60, "https://m.media-amazon.com/images/I/51+kjo3YEhL._AC_UY218_.jpg", Category.ELECTRONICS);
        Product electronics13 = new Product("GoPro HERO10 Black", 499, "Capture your adventures in stunning 5.3K video with the GoPro HERO10 Black. It's rugged, waterproof, and packed with advanced features for action photography and videography.", 40, "https://m.media-amazon.com/images/I/81yk8zV4g6L._AC_UY218_.jpg", Category.ELECTRONICS);
        Product electronics14 = new Product("Logitech MX Master 3 Wireless Mouse", 99, "The Logitech MX Master 3 is an ergonomic wireless mouse with customizable buttons and precise tracking. It's perfect for productivity and creative work.", 50, "https://m.media-amazon.com/images/I/51zU9x62BYL._AC_UY218_.jpg", Category.ELECTRONICS);
        Product electronics15 = new Product("Nest Cam Outdoor Security Camera", 199, "Keep an eye on your home with the Nest Cam Outdoor security camera. It offers 24/7 monitoring, weather resistance, and easy setup for home security.", 30, "https://m.media-amazon.com/images/I/51mY41ARYOL._AC_UY218_.jpg", Category.ELECTRONICS);


// Add more products in the HOMEWARE category
        Product homeware1 = new Product("Classic standing desk EG1", 15999, "A standing desk, also called a stand-up desk, is basically a desk that allows you to stand up comfortably while working ( 5 ). Many modern versions are adjustable, so that you can change the height of the desk and alternate between sitting and standing.", 100, "https://image.springbeetle.eu/cdn-cgi/image/dpr=1,format=webp,fit=pad/https://staticprod.sys.flexispot.co.uk/flexispot/catalog/product/e/t/et114-800.jpg", Category.HOMEWARE);
        Product homeware2 = new Product("Ergonomic deskchair", 9999, "This task chair has a 10cm lifting range to meet the needs of people of different heights, it also has a reclining function of 90-115 °which allows you to relax yourselves after work.", 200, "https://m.media-amazon.com/images/I/71rgxPX3ZKL._AC_SX679_.jpg", Category.HOMEWARE);
        Product homeware3 = new Product("Silentnight Comfort Control Electric Blanket ", 7999, "Double - Heated Electric Underblanket with 3 Heat Settings, Fast Heat Up, Overheat Protection and Easy Fit Straps - Machine Washable - Double 135x120cm", 30, "https://m.media-amazon.com/images/I/71oOTJMaiZL._AC_SX679_.jpg", Category.HOMEWARE);
        Product homeware4 = new Product("Utopia Bedding Duvet Cover", 8999, "Double - Soft Microfibre Polyester - Bedding Quilt Cover Set, with Pillow cases (Grey)", 20, "https://m.media-amazon.com/images/I/51AQBj6-a8L._AC_SX679_.jpg", Category.HOMEWARE);
        Product homeware5 = new Product("PRESTIGE Saucepan Set Non Stick", 11999, "5 Piece Induction Hob Pan Set Black with 16cm, 18cm & 20cm Saucepans with Lids, 29cm Non Stick Frying Pan & Milkpan", 25, "https://m.media-amazon.com/images/I/61RlKsaLMqL._AC_SX679_.jpg", Category.HOMEWARE);
        // Add more products in the HOMEWARE category
        Product homeware6 = new Product("Instant Pot Duo 7-in-1 Electric Pressure Cooker", 9999, "The Instant Pot Duo is a versatile electric pressure cooker that can cook meals quickly and easily. It has 7 cooking functions and is perfect for busy households.", 60, "https://m.media-amazon.com/images/I/71WtwEvYDOS._AC_UY218_.jpg", Category.HOMEWARE);
        Product homeware7 = new Product("iRobot Roomba 675 Robot Vacuum", 2999, "The iRobot Roomba 675 is a robot vacuum that can clean your floors automatically. It has smart navigation and can be controlled through a mobile app.", 45, "https://m.media-amazon.com/images/I/61ceYhi31sL._AC_UY218_.jpg", Category.HOMEWARE);
        Product homeware8 = new Product("Nespresso Vertuo Plus Coffee and Espresso Maker", 1499, "Enjoy delicious coffee and espresso with the Nespresso Vertuo Plus. It uses a unique brewing technology to create rich and flavorful beverages.", 50, "https://m.media-amazon.com/images/I/61LspzjFccL._AC_UY218_.jpg", Category.HOMEWARE);
        Product homeware9 = new Product("Dyson V11 Animal Cordless Vacuum Cleaner", 4999, "The Dyson V11 Animal is a powerful cordless vacuum cleaner designed for homes with pets. It offers strong suction and intelligent cleaning modes.", 35, "https://m.media-amazon.com/images/I/41ahK5NhW3L._AC_UY218_.jpg", Category.HOMEWARE);
        Product homeware10 = new Product("KitchenAid Stand Mixer", 3999, "The KitchenAid Stand Mixer is a must-have for any home baker. It can mix, knead, and whip ingredients effortlessly, making baking a breeze.", 40, "https://m.media-amazon.com/images/I/51KFuY9cKES._AC_UY218_.jpg", Category.HOMEWARE);
        Product homeware11 = new Product("Etekcity Digital Kitchen Scale", 1299, "The Etekcity Digital Kitchen Scale is perfect for precise cooking and baking measurements. It's compact and easy to use.", 70, "https://m.media-amazon.com/images/I/7157x4p8zTL._AC_UY218_.jpg", Category.HOMEWARE);
        Product homeware12 = new Product("Lodge Cast Iron Skillet", 2999, "A Lodge Cast Iron Skillet is a versatile kitchen tool that can be used for frying, baking, and more. It's known for its durability and heat retention.", 50, "https://m.media-amazon.com/images/I/71dNg3U3kFL._AC_UY218_.jpg", Category.HOMEWARE);
        Product homeware13 = new Product("Cuisinart 14-Cup Food Processor", 4999, "The Cuisinart 14-Cup Food Processor is a powerful kitchen appliance that can chop, slice, and shred ingredients quickly and efficiently.", 30, "https://m.media-amazon.com/images/I/51Vg1o--kzL._AC_UY218_.jpg", Category.HOMEWARE);
        Product homeware14 = new Product("Breville Smart Oven Air Fryer", 3999, "The Breville Smart Oven Air Fryer is a versatile countertop oven that can bake, roast, and air fry. It's perfect for preparing a wide range of dishes.", 40, "https://m.media-amazon.com/images/I/815wEc5tMXL._AC_UY218_.jpg", Category.HOMEWARE);
        Product homeware15 = new Product("Dining Table and Chairs Set", 5999, "Upgrade your dining area with this elegant dining table and chairs set. It's perfect for family meals and gatherings.", 25, "https://m.media-amazon.com/images/I/81GUcmOTExL._AC_UY218_.jpg", Category.HOMEWARE);


// Add more products in the TOYS category
        Product toys1 = new Product("Hasbro Gaming Bop It!", 1399, "THE CLASSIC GAME OF BOP IT, TWIST IT, PULL IT: Hear the commands and react fast to stay in the game -- this classic electronic game is fun for kids ages 8 and up", 150, "https://m.media-amazon.com/images/I/81T2cGSrsbL._AC_SX679_.jpg", Category.TOYS);
        Product toys2 = new Product("Charlie Bears 2022 - Teensy Weensy", 4000, "What is it about small things that just makes them so cute? Teensy Weensy is a lovable little bear, just the right size for cuddling and to take on all those big adventures. Your heart is sure to melt a little when you see how cute this bear is. Will you take him home today?", 60, "https://m.media-amazon.com/images/I/91HV3NHFljL._AC_SY879_.jpg", Category.TOYS);
        Product toys3 = new Product("Anginne Boy Toys", 999, "Kids Toys Garden Toys Boys Girls Gifts Age 3-9 Year Old Boys Toys Age 3-9 Outdoor Birthday Gifts for Kids Stomp Toy Rockets Garden Games Gifts for Kids", 50, "https://m.media-amazon.com/images/I/71Qp340Eh3L._AC_SX679_.jpg", Category.TOYS);
        Product toys4 = new Product("Bath Basketball Hoop for Baby", 1999, "Bath Toys, Bath Basketball Hoop for Baby, Toddlers, Kids, Boys and Girls with 4 Soft Balls & Strong Suction Cup, Fun Toddler Bath Toys Set, Gift for Boys or Girls", 40, "https://m.media-amazon.com/images/I/81PhwA6XheL._AC_SX679_.jpg", Category.TOYS);
        Product toys5 = new Product("Furby Hasbro Purple Interactive Toy Plush", 2499, "HEY BESTIE, MEET FURBY: give children a friend who's always ready for BFF time with this incredibly interactive toy for girls and boys that moves, talks, sings, lights up, and even responds to speech", 30, "https://m.media-amazon.com/images/I/919N9TFCM+L._AC_SX679_.jpg", Category.TOYS);

        // Add more products in the TOYS category
        Product toys6 = new Product("LEGO Creator Expert Roller Coaster Building Kit", 2999, "Build an amazing amusement park roller coaster with this LEGO Creator Expert set. It's a fun and challenging building project for kids and adults.", 30, "https://m.media-amazon.com/images/I/91CW91MhbOL._AC_UY218_.jpg", Category.TOYS);
        Product toys7 = new Product("Barbie Dreamhouse Dollhouse", 1999, "The Barbie Dreamhouse is a spacious dollhouse with multiple rooms and accessories. It's perfect for imaginative play with Barbie dolls.", 40, "https://m.media-amazon.com/images/I/81slJjm+PNL._AC_UY218_.jpg", Category.TOYS);
        Product toys8 = new Product("NERF N-Strike Elite Disruptor Blaster", 999, "The NERF N-Strike Elite Disruptor Blaster is a fast-firing foam dart blaster. It's great for outdoor and indoor NERF battles.", 100, "https://m.media-amazon.com/images/I/612Q6sZOkvL._AC_UY218_.jpg", Category.TOYS);
        Product toys9 = new Product("LEGO Star Wars Millennium Falcon Building Kit", 7999, "Build the iconic Millennium Falcon from Star Wars with this LEGO kit. It includes minifigures and detailed interior features.", 20, "https://m.media-amazon.com/images/I/81J3BLxzbQL._AC_UY218_.jpg", Category.TOYS);
        Product toys10 = new Product("Hot Wheels Criss Cross Crash Track Set", 2999, "Race your Hot Wheels cars on this thrilling Criss Cross Crash Track Set. It features multiple loops and crashes for high-speed action.", 50, "https://m.media-amazon.com/images/I/710XQPhUNUL._AC_UY218_.jpg", Category.TOYS);
        Product toys11 = new Product("Fisher-Price Little People Caring for Animals Farm Playset", 1999, "The Fisher-Price Little People Farm Playset is a fun and educational toy for toddlers. It includes animal figures and interactive features.", 60, "https://m.media-amazon.com/images/I/71cgVYDaKIL._AC_UY218_.jpg", Category.TOYS);
        Product toys12 = new Product("Melissa & Doug Deluxe Wooden Railway Train Set", 7999, "The Melissa & Doug Wooden Railway Train Set is a high-quality wooden train set with tracks, trains, and accessories for endless play.", 25, "https://m.media-amazon.com/images/I/71ExL765NUL._AC_UY218_.jpg", Category.TOYS);
        Product toys13 = new Product("LEGO Disney Cinderella's Castle Building Kit", 6999, "Build Cinderella's magical castle with this LEGO Disney set. It includes Disney character minifigures and enchanting details.", 30, "https://m.media-amazon.com/images/I/71zYDTPPQnS._AC_UY218_.jpg", Category.TOYS);
        Product toys14 = new Product("Baby Yoda Plush Toy", 1999, "Cuddle up with a cute Baby Yoda plush toy from Star Wars. It's perfect for fans of the Mandalorian series.", 80, "https://m.media-amazon.com/images/I/81V0WCBBEcL._AC_UY218_.jpg", Category.TOYS);
        Product toys15 = new Product("LEGO Harry Potter Hogwarts Castle Building Kit", 13999, "Recreate the magic of Hogwarts with this LEGO Harry Potter Castle Building Kit. It's a challenging and rewarding LEGO project.", 20, "https://m.media-amazon.com/images/I/911ShWKf1YL._AC_UY218_.jpg", Category.TOYS);


// Add more products in the MEDIA category
        Product media1 = new Product("Mission: Impossible Dead Reckoning Part One", 1599, "Ethan Hunt (Tom Cruise) and his IMF team embark on their most dangerous mission yet: To track down a terrifying new weapon that threatens all of humanity before it falls into the wrong hands. With the fate of the world at stake, a deadly race around the globe begins. Confronted by a mysterious, all-powerful enemy, Ethan is forced to consider that nothing can matter more than his mission - not even the lives of those he cares about most.", 300, "https://m.media-amazon.com/images/I/91Hpg4IGfFL._AC_SX522_.jpg", Category.MEDIA);
        Product media2 = new Product("Xbox Gift Card", 10000, "Buy an Xbox Gift Card for yourself or a friend to get great games and entertainment on Xbox consoles and Windows PCs.", 155, "https://m.media-amazon.com/images/I/61XXF9Yvc7L._AC_SY879_.jpg", Category.MEDIA);
        Product media3 = new Product("Portable DVD Player ", 1899, "Rechargeable DVD Player Portable with 10.5 inch HD Swivel and Flip Screen | Mains or Car Powered, Region Free, Anti-Shock Protect, Remote Control | Oakcastle DVD120", 20, "https://m.media-amazon.com/images/I/61Ek77wX43L._AC_SX679_.jpg", Category.MEDIA);
        Product media4 = new Product("The Last of Us: Season 1 ", 2199, "THE LAST OF US story takes place twenty years after modern civilization has been destroyed. Joel, a hardened survivor, is hired to smuggle Ellie, a 14-year-old girl, out of an oppressive quarantine zone. What starts as a small job soon becomes a brutal, heartbreaking journey, as they both must traverse the U.S. and depend on each other for survival.", 25, "https://m.media-amazon.com/images/I/81f4eDNXBfL._AC_SX522_.jpg", Category.MEDIA);
        Product media5 = new Product("Fortnite: Minty Legends Pack (Game Download Code in Box) - Switch", 1499, "Keep it fresh and fierce with the Minty Legends Pack. Everything you need to chill out the competition including Fresh Aura Outfit, Minty Multipack Back Bling, Minty Mountaineer Pickaxe, Minty Bomber Outfit, Spearmint Satchel Back Bling, Freshbreaker Pickaxe, Skellemint Oro Outfit, Minty Mantle Back Bling, Triple Mint Scepter Pickaxe, Fire Mint Wrap and 1,000 V-Bucks! V-Bucks are in-game currency that can be spent in Fortnite Battle Royale, Creative, and Save the World modes. In Battle Royale and Creative you can purchase new customization items like New Outfits, Gliders, Pickaxes, Emotes, and Wraps! In Save the World, you can purchase X-Ray Llamas that contain weapon and trap schematics, plus new Heroes, and more! ", 15, "https://m.media-amazon.com/images/I/611aafW8KfL._AC_SY879_.jpg", Category.MEDIA);

        // Add more products in the MEDIA category
        Product media6 = new Product("Harry Potter and the Chamber of Secrets (Blu-ray)", 1799, "Experience the magic of Harry Potter with the Blu-ray edition of The Chamber of Secrets. Join Harry, Ron, and Hermione on their second year at Hogwarts.", 50, "https://m.media-amazon.com/images/I/91kdGpyuqNL._AC_UY218_.jpg", Category.MEDIA);
        Product media7 = new Product("Game of Thrones: The Complete Series (DVD)", 3999, "Relive the epic saga of Game of Thrones with the complete series on DVD. It includes all seasons and bonus features.", 40, "https://m.media-amazon.com/images/I/81WAkzsd1kL._AC_UY218_.jpg", Category.MEDIA);
        Product media8 = new Product("The Lord of the Rings: The Fellowship of the Ring (4K UHD)", 2499, "Experience Middle-earth in stunning 4K UHD with The Fellowship of the Ring. Follow Frodo and his companions on their quest to destroy the One Ring.", 30, "https://m.media-amazon.com/images/I/814eTntftQL._AC_UY218_.jpg", Category.MEDIA);
        Product media9 = new Product("Star Wars: The Complete Saga (Blu-ray)", 4999, "Own the complete Star Wars saga on Blu-ray. It includes all episodes and bonus content for fans of the galaxy far, far away.", 20, "https://m.media-amazon.com/images/I/91GuFxT0QKL.__AC_SY300_SX300_QL70_ML2_.jpg", Category.MEDIA);
        Product media10 = new Product("Breaking Bad: The Complete Series (DVD)", 2999, "Experience the thrilling journey of Walter White in Breaking Bad. Get the complete series on DVD with all seasons and extras.", 25, "https://m.media-amazon.com/images/I/81SSOEJpWqL._AC_UY218_.jpg", Category.MEDIA);
        Product media11 = new Product("The Witcher: Season 1 (Blu-ray)", 1799, "Dive into the world of The Witcher with the Blu-ray edition of Season 1. Follow Geralt of Rivia in this epic fantasy series.", 60, "https://i.ebayimg.com/images/g/hnMAAOSwEJ5k0alP/s-l500.jpg", Category.MEDIA);
        Product media12 = new Product("The Simpsons: The Complete Series (DVD)", 5999, "Laugh along with the antics of The Simpsons with the complete series on DVD. It's a must-have for fans of the iconic animated show.", 30, "https://m.media-amazon.com/images/I/81L-Zjbuy+L._AC_UY218_.jpg", Category.MEDIA);
        Product media13 = new Product("Marvel's Avengers: Endgame (4K UHD)", 2499, "Witness the epic conclusion of the Avengers saga with Avengers: Endgame in stunning 4K UHD. It's a superhero masterpiece.", 35, "https://m.media-amazon.com/images/I/81seCo5lVpL._AC_UY218_.jpg", Category.MEDIA);
        Product media14 = new Product("Stranger Things: Season 3 (Blu-ray)", 1999, "Return to the Upside Down with the Blu-ray edition of Stranger Things Season 3. Join Eleven and her friends in another thrilling adventure.", 40, "https://m.media-amazon.com/images/I/51mXS1zUn6L._AC_UY218_.jpg", Category.MEDIA);
        Product media15 = new Product("The Matrix Trilogy (4K UHD)", 3999, "Experience the mind-bending world of The Matrix in 4K UHD with the complete trilogy. Follow Neo's journey in this sci-fi classic.", 20, "https://m.media-amazon.com/images/I/81pFgInNfZL._AC_UY218_.jpg", Category.MEDIA);

        productRepository.saveAll(List.of(book1, book2, book3, book4, book5, book6, book7, book8, book9, book10,
                book11, book12, book13, book14, book15, electronics1, electronics2, electronics3, electronics4, electronics5,
                electronics6, electronics7, electronics8, electronics9, electronics10,
                electronics11, electronics12, electronics13, electronics14, electronics15, homeware1, homeware2, homeware3, homeware4, homeware5, homeware6, homeware7, homeware8, homeware9, homeware10,
                homeware11, homeware12, homeware13, homeware14, homeware15, toys1, toys2, toys3, toys4, toys5,  toys6, toys7, toys8, toys9, toys10,
                toys11, toys12, toys13, toys14, toys15, media1, media2, media3, media4, media5, media6, media7, media8, media9, media10,
                media11, media12, media13, media14, media15));



    }
}
