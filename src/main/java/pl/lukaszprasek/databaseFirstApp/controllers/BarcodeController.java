package pl.lukaszprasek.databaseFirstApp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import pl.lukaszprasek.databaseFirstApp.models.BarcodeEntity;
import pl.lukaszprasek.databaseFirstApp.models.BarcodeForm;
import pl.lukaszprasek.databaseFirstApp.models.repositories.BarcodeRepository;

import javax.validation.Valid;

@Controller
public class BarcodeController {
    @Autowired
    BarcodeRepository barcodeRepository;

    @GetMapping("/barcode")
    public String get(Model model) {
        model.addAttribute("barcodeObject", new BarcodeForm());
        return "barcodeTemplate";
    }

    @RequestMapping(value = "/barcode", method = RequestMethod.POST)

    public String postBarcode(@ModelAttribute @Valid BarcodeForm barcodeForm,
                              BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            return "barcodeTemplate";
        }
        BarcodeEntity barcodeEntity = new BarcodeEntity();
        barcodeEntity.setProductName(barcodeForm.getProductName());
        barcodeEntity.setProductCompany(barcodeForm.getProductCompany());
        barcodeEntity.setBarcode(barcodeForm.getBarcode());
        barcodeEntity.setWeight(barcodeForm.getWeight());
        System.out.println("NAzwa produktu***************************:"+barcodeForm.getProductName());
        System.out.println("NAzwa produktu***************************:"+barcodeForm.getProductCompany());
        barcodeRepository.save(barcodeEntity);
        return "Poszło zapytanie";
    }

}
