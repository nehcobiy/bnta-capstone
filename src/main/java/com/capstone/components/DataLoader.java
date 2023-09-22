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

        customerRepository.saveAll(List.of(customer1, customer2));

        //Products
        Product book1 = new Product("Rich Dad Poor Dad",999,"Rich Dad Poor Dad is a 1997 book written by Robert T. Kiyosaki and Sharon Lechter. It advocates the importance of financial literacy, financial independence and building wealth through investing in assets, real estate investing, starting and owning businesses, as well as increasing one's financial intelligence.",25,"https://m.media-amazon.com/images/I/81bsw6fnUiL._AC_UF894,1000_QL80_.jpg", Category.BOOKS);

        Product book2 = new Product("Atomic Habits", 1799, "A supremely practical and useful book. James Clear distils the most fundamental information about habit formation, so you can accomplish more by focusing on less.", 50, "https://m.media-amazon.com/images/I/51-nXsSRfZL._SY445_SX342_.jpg", Category.BOOKS);

        Product electronics1 = new Product("iPhone 15", 50000, "The new Ultra Wideband chip provides improved spatial awareness, allowing iPhone 15 models to more precisely locate other Apple devices with an Ultra Wideband chip. The chip allows two iPhones to connect to each other at three times the range as before.", 100, "https://www.apple.com/newsroom/images/2023/09/apple-debuts-iphone-15-and-iphone-15-plus/article/Apple-iPhone-15-lineup-hero-geo-230912_inline.jpg.large_2x.jpg", Category.ELECTRONICS);

        Product electronics2 = new Product("PlayStation 5", 47900, "Powered by an eight-core AMD Zen 2 CPU and custom AMD Radeon GPU, the PS5 is offered in two models: with and without a 4K Blu-ray drive. Supporting a 120Hz video refresh, the PS5 is considerably more powerful than the PS4 and PS4 Pro. Rather than GDDR5 memory, GDDR6 is supported with capacity doubled from 8 to 16GB.", 99, "https://m.media-amazon.com/images/I/71PMC4DWWFL._AC_SX679_.jpg", Category.ELECTRONICS);

        Product homeware1 = new Product("Classic standing desk EG1", 15999, "A standing desk, also called a stand-up desk, is basically a desk that allows you to stand up comfortably while working ( 5 ). Many modern versions are adjustable, so that you can change the height of the desk and alternate between sitting and standing.", 100, "https://image.springbeetle.eu/cdn-cgi/image/dpr=1,format=webp,fit=pad/https://s3.springbeetle.eu/prod-eu-s3/trantor/attachments/UK/E1_20230828514.png", Category.HOMEWARE);

        Product homeware2 = new Product("Ergonomic deskchair", 9999, "This task chair has a 10cm lifting range to meet the needs of people of different heights, it also has a reclining function of 90-115 °which allows you to relax yourselves after work.", 200, "https://m.media-amazon.com/images/I/71rgxPX3ZKL._AC_SX679_.jpg", Category.HOMEWARE);

        Product toys1 = new Product("Hasbro Gaming Bop It!", 1399, "THE CLASSIC GAME OF BOP IT, TWIST IT, PULL IT: Hear the commands and react fast to stay in the game -- this classic electronic game is fun for kids ages 8 and up", 150, "https://m.media-amazon.com/images/I/81T2cGSrsbL._AC_SX679_.jpg", Category.TOYS);

        Product toys2 = new Product("Charlie Bears 2022 - Teensy Weensy", 4000, "What is it about small things that just makes them so cute? Teensy Weensy is a lovable little bear, just the right size for cuddling and to take on all those big adventures. Your heart is sure to melt a little when you see how cute this bear is. Will you take him home today?", 60, "https://m.media-amazon.com/images/I/91HV3NHFljL._AC_SY879_.jpg", Category.TOYS);

        Product media1 = new Product("Mission: Impossible Dead Reckoning Part One", 1599, "Ethan Hunt (Tom Cruise) and his IMF team embark on their most dangerous mission yet: To track down a terrifying new weapon that threatens all of humanity before it falls into the wrong hands. With the fate of the world at stake, a deadly race around the globe begins. Confronted by a mysterious, all-powerful enemy, Ethan is forced to consider that nothing can matter more than his mission - not even the lives of those he cares about most.", 300, "https://m.media-amazon.com/images/I/91Hpg4IGfFL._AC_SX522_.jpg", Category.MEDIA);

        Product media2 = new Product("Xbox Gift Card", 10000, "Buy an Xbox Gift Card for yourself or a friend to get great games and entertainment on Xbox consoles and Windows PCs.", 155, "https://m.media-amazon.com/images/I/61XXF9Yvc7L._AC_SY879_.jpg", Category.MEDIA);

        productRepository.saveAll(List.of(book1, book2, electronics1, electronics2, homeware1, homeware2, toys1, toys2, media1, media2));



    }
}
