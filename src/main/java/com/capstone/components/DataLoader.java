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

//        //Products
//        Product book1 = new Product("Rich Dad Poor Dad",999,"Rich Dad Poor Dad is a 1997 book written by Robert T. Kiyosaki and Sharon Lechter. It advocates the importance of financial literacy, financial independence and building wealth through investing in assets, real estate investing, starting and owning businesses, as well as increasing one's financial intelligence.",25,"https://m.media-amazon.com/images/I/81bsw6fnUiL._AC_UF894,1000_QL80_.jpg", Category.BOOKS);
//
//        Product book2 = new Product("Atomic Habits", 1799, "A supremely practical and useful book. James Clear distils the most fundamental information about habit formation, so you can accomplish more by focusing on less.", 50, "https://m.media-amazon.com/images/I/51-nXsSRfZL._SY445_SX342_.jpg", Category.BOOKS);
//
//        Product electronics1 = new Product("iPhone 15", 50000, "The new Ultra Wideband chip provides improved spatial awareness, allowing iPhone 15 models to more precisely locate other Apple devices with an Ultra Wideband chip. The chip allows two iPhones to connect to each other at three times the range as before.", 100, "https://www.apple.com/newsroom/images/2023/09/apple-debuts-iphone-15-and-iphone-15-plus/article/Apple-iPhone-15-lineup-hero-geo-230912_inline.jpg.large_2x.jpg", Category.ELECTRONICS);
//
//        Product electronics2 = new Product("PlayStation 5", 47900, "Powered by an eight-core AMD Zen 2 CPU and custom AMD Radeon GPU, the PS5 is offered in two models: with and without a 4K Blu-ray drive. Supporting a 120Hz video refresh, the PS5 is considerably more powerful than the PS4 and PS4 Pro. Rather than GDDR5 memory, GDDR6 is supported with capacity doubled from 8 to 16GB.", 99, "https://m.media-amazon.com/images/I/71PMC4DWWFL._AC_SX679_.jpg", Category.ELECTRONICS);
//
//        Product homeware1 = new Product("Classic standing desk EG1", 15999, "A standing desk, also called a stand-up desk, is basically a desk that allows you to stand up comfortably while working ( 5 ). Many modern versions are adjustable, so that you can change the height of the desk and alternate between sitting and standing.", 100, "https://image.springbeetle.eu/cdn-cgi/image/dpr=1,format=webp,fit=pad/https://s3.springbeetle.eu/prod-eu-s3/trantor/attachments/UK/E1_20230828514.png", Category.HOMEWARE);
//
//        Product homeware2 = new Product("Ergonomic deskchair", 9999, "This task chair has a 10cm lifting range to meet the needs of people of different heights, it also has a reclining function of 90-115 °which allows you to relax yourselves after work.", 200, "https://m.media-amazon.com/images/I/71rgxPX3ZKL._AC_SX679_.jpg", Category.HOMEWARE);
//
//        Product toys1 = new Product("Hasbro Gaming Bop It!", 1399, "THE CLASSIC GAME OF BOP IT, TWIST IT, PULL IT: Hear the commands and react fast to stay in the game -- this classic electronic game is fun for kids ages 8 and up", 150, "https://m.media-amazon.com/images/I/81T2cGSrsbL._AC_SX679_.jpg", Category.TOYS);
//
//        Product toys2 = new Product("Charlie Bears 2022 - Teensy Weensy", 4000, "What is it about small things that just makes them so cute? Teensy Weensy is a lovable little bear, just the right size for cuddling and to take on all those big adventures. Your heart is sure to melt a little when you see how cute this bear is. Will you take him home today?", 60, "https://m.media-amazon.com/images/I/91HV3NHFljL._AC_SY879_.jpg", Category.TOYS);
//
//        Product media1 = new Product("Mission: Impossible Dead Reckoning Part One", 1599, "Ethan Hunt (Tom Cruise) and his IMF team embark on their most dangerous mission yet: To track down a terrifying new weapon that threatens all of humanity before it falls into the wrong hands. With the fate of the world at stake, a deadly race around the globe begins. Confronted by a mysterious, all-powerful enemy, Ethan is forced to consider that nothing can matter more than his mission - not even the lives of those he cares about most.", 300, "https://m.media-amazon.com/images/I/91Hpg4IGfFL._AC_SX522_.jpg", Category.MEDIA);
//
//        Product media2 = new Product("Xbox Gift Card", 10000, "Buy an Xbox Gift Card for yourself or a friend to get great games and entertainment on Xbox consoles and Windows PCs.", 155, "https://m.media-amazon.com/images/I/61XXF9Yvc7L._AC_SY879_.jpg", Category.MEDIA);
//
//        productRepository.saveAll(List.of(book1, book2, electronics1, electronics2, homeware1, homeware2, toys1, toys2, media1, media2));

        // Products (5 in each category)
        Product book1 = new Product("Rich Dad Poor Dad", 999, "Rich Dad Poor Dad is a 1997 book written by Robert T. Kiyosaki and Sharon Lechter. It advocates the importance of financial literacy, financial independence and building wealth through investing in assets, real estate investing, starting and owning businesses, as well as increasing one's financial intelligence.", 25, "https://m.media-amazon.com/images/I/81bsw6fnUiL._AC_UF894,1000_QL80_.jpg", Category.BOOKS);
        Product book2 = new Product("Atomic Habits", 1799, "A supremely practical and useful book. James Clear distils the most fundamental information about habit formation, so you can accomplish more by focusing on less.", 50, "https://m.media-amazon.com/images/I/51-nXsSRfZL._SY445_SX342_.jpg", Category.BOOKS);
        Product book3 = new Product("9 Money Habits Keeping You Poor: My Story to Financial Freedom", 1299, "In 9 Money Habits Keeping You Poor: My Story to Financial Freedom, Adam Rose will take you on a transformative journey from a life of financial struggle to one of freedom, security, and independence. Drawing from his own experiences and the success stories of others, Adam reveals the nine key habits that keep people trapped in poverty and provides actionable steps to break free from them.", 30, "https://m.media-amazon.com/images/I/61Dgqlld0dL._SL1500_.jpg", Category.BOOKS);
        Product book4 = new Product("The Diary of a CEO: The 33 Laws of Business and Life", 1499, "At the very heart of all the success and failure I've been exposed to - both my own entrepreneurial journey and through the thousands of interviews I've conducted on my podcast - are a set of principles that can stand the test of time, apply to any industry, and be used by anyone who is search of building something great or becoming someone great.", 40, "https://m.media-amazon.com/images/I/41gJOF1uHeL.jpg", Category.BOOKS);
        Product book5 = new Product("Elon Musk: by Walter Isaacson", 899, "From the author of Steve Jobs and other bestselling biographies, this is the astonishingly intimate story of Elon Musk, the most fascinating and controversial innovator of our era – a rule-breaking visionary who helped to lead the world into the era of electric vehicles, private space exploration and artificial intelligence. Oh, and took over Twitter.", 20, "https://m.media-amazon.com/images/I/71iWxmst49L._SY522_.jpg", Category.BOOKS);

// Add more products in the ELECTRONICS category
        Product electronics1 = new Product("iPhone 15", 50000, "The new Ultra Wideband chip provides improved spatial awareness, allowing iPhone 15 models to more precisely locate other Apple devices with an Ultra Wideband chip. The chip allows two iPhones to connect to each other at three times the range as before.", 100, "https://www.apple.com/newsroom/images/2023/09/apple-debuts-iphone-15-and-iphone-15-plus/article/Apple-iPhone-15-lineup-hero-geo-230912_inline.jpg.large_2x.jpg", Category.ELECTRONICS);
        Product electronics2 = new Product("PlayStation 5", 47900, "Powered by an eight-core AMD Zen 2 CPU and custom AMD Radeon GPU, the PS5 is offered in two models: with and without a 4K Blu-ray drive. Supporting a 120Hz video refresh, the PS5 is considerably more powerful than the PS4 and PS4 Pro. Rather than GDDR5 memory, GDDR6 is supported with capacity doubled from 8 to 16GB.", 99, "https://m.media-amazon.com/images/I/71PMC4DWWFL._AC_SX679_.jpg", Category.ELECTRONICS);
        Product electronics3 = new Product("Amazon Fire TV 43-inch 4-series 4K UHD smart TV", 1999, "Brilliant 4K entertainment: bring films and series to life with support for vivid 4K Ultra HD, HDR 10, HLG and Dolby Digital Plus.", 10, "https://m.media-amazon.com/images/I/51gfEcXBW0L._AC_SX679_.jpg", Category.ELECTRONICS);
        Product electronics4 = new Product("Kindle Scribe", 2499, "The first Kindle for reading, writing, journaling and sketching. Features a 10.2-inch, 300 ppi display and includes Premium Pen | 32 GB + Kindle Unlimited (auto-renewal applies)", 15, "https://m.media-amazon.com/images/I/51t-d5AXeQL._AC_SL1000_.jpg", Category.ELECTRONICS);
        Product electronics5 = new Product(" Studio Display - Standard glass - Tilt-adjustable stand", 2999, "Standard glass has an industry-leading anti-reflective coating for viewing comfort and readability.", 25, "https://store.storeimages.cdn-apple.com/4982/as-images.apple.com/is/studio-display-gallery-1-202203?wid=640&hei=528&fmt=p-jpg&qlt=95&.v=1675709041796", Category.ELECTRONICS);

// Add more products in the HOMEWARE category
        Product homeware1 = new Product("Classic standing desk EG1", 15999, "A standing desk, also called a stand-up desk, is basically a desk that allows you to stand up comfortably while working ( 5 ). Many modern versions are adjustable, so that you can change the height of the desk and alternate between sitting and standing.", 100, "https://image.springbeetle.eu/cdn-cgi/image/dpr=1,format=webp,fit=pad/https/s3.springbeetle.eu/prod-eu-s3/trantor/attachments/UK/E1_20230828514.png", Category.HOMEWARE);
        Product homeware2 = new Product("Ergonomic deskchair", 9999, "This task chair has a 10cm lifting range to meet the needs of people of different heights, it also has a reclining function of 90-115 °which allows you to relax yourselves after work.", 200, "https://m.media-amazon.com/images/I/71rgxPX3ZKL._AC_SX679_.jpg", Category.HOMEWARE);
        Product homeware3 = new Product("Silentnight Comfort Control Electric Blanket ", 7999, "Double - Heated Electric Underblanket with 3 Heat Settings, Fast Heat Up, Overheat Protection and Easy Fit Straps - Machine Washable - Double 135x120cm", 30, "https://m.media-amazon.com/images/I/71oOTJMaiZL._AC_SX679_.jpg", Category.HOMEWARE);
        Product homeware4 = new Product("Utopia Bedding Duvet Cover", 8999, "Double - Soft Microfibre Polyester - Bedding Quilt Cover Set, with Pillow cases (Grey)", 20, "https://m.media-amazon.com/images/I/51AQBj6-a8L._AC_SX679_.jpg", Category.HOMEWARE);
        Product homeware5 = new Product("PRESTIGE Saucepan Set Non Stick", 11999, "5 Piece Induction Hob Pan Set Black with 16cm, 18cm & 20cm Saucepans with Lids, 29cm Non Stick Frying Pan & Milkpan", 25, "https://m.media-amazon.com/images/I/61RlKsaLMqL._AC_SX679_.jpg", Category.HOMEWARE);

// Add more products in the TOYS category
        Product toys1 = new Product("Hasbro Gaming Bop It!", 1399, "THE CLASSIC GAME OF BOP IT, TWIST IT, PULL IT: Hear the commands and react fast to stay in the game -- this classic electronic game is fun for kids ages 8 and up", 150, "https://m.media-amazon.com/images/I/81T2cGSrsbL._AC_SX679_.jpg", Category.TOYS);
        Product toys2 = new Product("Charlie Bears 2022 - Teensy Weensy", 4000, "What is it about small things that just makes them so cute? Teensy Weensy is a lovable little bear, just the right size for cuddling and to take on all those big adventures. Your heart is sure to melt a little when you see how cute this bear is. Will you take him home today?", 60, "https://m.media-amazon.com/images/I/91HV3NHFljL._AC_SY879_.jpg", Category.TOYS);
        Product toys3 = new Product("Anginne Boy Toys", 999, "Kids Toys Garden Toys Boys Girls Gifts Age 3-9 Year Old Boys Toys Age 3-9 Outdoor Birthday Gifts for Kids Stomp Toy Rockets Garden Games Gifts for Kids", 50, "https://m.media-amazon.com/images/I/71Qp340Eh3L._AC_SX679_.jpg", Category.TOYS);
        Product toys4 = new Product("Bath Basketball Hoop for Baby", 1999, "Bath Toys, Bath Basketball Hoop for Baby, Toddlers, Kids, Boys and Girls with 4 Soft Balls & Strong Suction Cup, Fun Toddler Bath Toys Set, Gift for Boys or Girls", 40, "https://m.media-amazon.com/images/I/81PhwA6XheL._AC_SX679_.jpg", Category.TOYS);
        Product toys5 = new Product("Furby Hasbro Purple Interactive Toy Plush", 2499, "HEY BESTIE, MEET FURBY: give children a friend who's always ready for BFF time with this incredibly interactive toy for girls and boys that moves, talks, sings, lights up, and even responds to speech", 30, "https://m.media-amazon.com/images/I/919N9TFCM+L._AC_SX679_.jpg", Category.TOYS);

// Add more products in the MEDIA category
        Product media1 = new Product("Mission: Impossible Dead Reckoning Part One", 1599, "Ethan Hunt (Tom Cruise) and his IMF team embark on their most dangerous mission yet: To track down a terrifying new weapon that threatens all of humanity before it falls into the wrong hands. With the fate of the world at stake, a deadly race around the globe begins. Confronted by a mysterious, all-powerful enemy, Ethan is forced to consider that nothing can matter more than his mission - not even the lives of those he cares about most.", 300, "https://m.media-amazon.com/images/I/91Hpg4IGfFL._AC_SX522_.jpg", Category.MEDIA);
        Product media2 = new Product("Xbox Gift Card", 10000, "Buy an Xbox Gift Card for yourself or a friend to get great games and entertainment on Xbox consoles and Windows PCs.", 155, "https://m.media-amazon.com/images/I/61XXF9Yvc7L._AC_SY879_.jpg", Category.MEDIA);
        Product media3 = new Product("Portable DVD Player ", 1899, "Rechargeable DVD Player Portable with 10.5 inch HD Swivel and Flip Screen | Mains or Car Powered, Region Free, Anti-Shock Protect, Remote Control | Oakcastle DVD120", 20, "https://m.media-amazon.com/images/I/61Ek77wX43L._AC_SX679_.jpg", Category.MEDIA);
        Product media4 = new Product("The Last of Us: Season 1 ", 2199, "THE LAST OF US story takes place twenty years after modern civilization has been destroyed. Joel, a hardened survivor, is hired to smuggle Ellie, a 14-year-old girl, out of an oppressive quarantine zone. What starts as a small job soon becomes a brutal, heartbreaking journey, as they both must traverse the U.S. and depend on each other for survival.", 25, "https://m.media-amazon.com/images/I/81f4eDNXBfL._AC_SX522_.jpg", Category.MEDIA);
        Product media5 = new Product("Fortnite: Minty Legends Pack (Game Download Code in Box) - Switch", 1499, "Keep it fresh and fierce with the Minty Legends Pack. Everything you need to chill out the competition including Fresh Aura Outfit, Minty Multipack Back Bling, Minty Mountaineer Pickaxe, Minty Bomber Outfit, Spearmint Satchel Back Bling, Freshbreaker Pickaxe, Skellemint Oro Outfit, Minty Mantle Back Bling, Triple Mint Scepter Pickaxe, Fire Mint Wrap and 1,000 V-Bucks! V-Bucks are in-game currency that can be spent in Fortnite Battle Royale, Creative, and Save the World modes. In Battle Royale and Creative you can purchase new customization items like New Outfits, Gliders, Pickaxes, Emotes, and Wraps! In Save the World, you can purchase X-Ray Llamas that contain weapon and trap schematics, plus new Heroes, and more! ", 15, "https://m.media-amazon.com/images/I/611aafW8KfL._AC_SY879_.jpg", Category.MEDIA);

        productRepository.saveAll(List.of(book1, book2, book3, book4, book5, electronics1, electronics2, electronics3, electronics4, electronics5, homeware1, homeware2, homeware3, homeware4, homeware5, toys1, toys2, toys3, toys4, toys5, media1, media2, media3, media4, media5));



    }
}
