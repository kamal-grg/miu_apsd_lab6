package asd;

import asd.model.Address;
import asd.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AdsSurgeryDentalCliApplication implements CommandLineRunner {
    @Autowired
    private AddressRepository addressRepository;
    public static void main(String[] args) {
        SpringApplication.run(AdsSurgeryDentalCliApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        createAddress();
        System.out.println("Hello data Persistent using spring data JPA");
    }

    private  void createAddress(){
        var address = new Address(null,"aaa","aaa","bbb","ccc");
        Address save = addressRepository.save(address);
        System.out.println(save);
    }
}
