package pl.lukaszprasek.databaseFirstApp.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.lukaszprasek.databaseFirstApp.models.BarcodeEntity;
import pl.lukaszprasek.databaseFirstApp.models.BookEntity;
import pl.lukaszprasek.databaseFirstApp.models.CustomerEntity;
import pl.lukaszprasek.databaseFirstApp.models.repositories.BarcodeRepository;
import pl.lukaszprasek.databaseFirstApp.models.repositories.BookRepository;
import pl.lukaszprasek.databaseFirstApp.models.repositories.CustomerRepository;

@Controller

public class MainController {

    @Autowired
    BarcodeRepository barcodeRepository;

    @GetMapping("/")
    @ResponseBody
    public String index() {
        BarcodeEntity barcodeEntity = new BarcodeEntity();
        barcodeEntity.setProductCompany("Fivarto");
        barcodeEntity.setProductName("Kolektor danych");
        barcodeEntity.setBarcode("1231231231239");
        barcodeEntity.setWeight(10);
        barcodeRepository.save(barcodeEntity);
        return "Poszło zapytanie";
    }

    @Autowired
    BookRepository bookRepository;

    @GetMapping("/book")
    @ResponseBody
    public String bookIndex() {
        BookEntity bookEntity = new BookEntity();
        bookEntity.setAuthor("Boleslaw Prus");
        bookEntity.setName("Lalka");
        bookRepository.save(bookEntity);
        return "Poszło zapytanie";
    }
    @Autowired
    CustomerRepository customerRepository;


    @GetMapping("/customer")
    @ResponseBody
    public String customerIndex() {
        CustomerEntity customerEntity=new CustomerEntity();
        customerEntity.setName("Jan");
        customerEntity.setSurname("Nowak");
        customerRepository.save(customerEntity);

        return "Poszło zapytanie";
    }
}
