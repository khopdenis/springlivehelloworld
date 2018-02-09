package ru.liga;

import ru.liga.service.PersonBusinessService;

public class Main {

    public static void main(String[] args) {
        PersonBusinessService personBusinessService = new PersonBusinessService();
        personBusinessService.printAll();
        personBusinessService.multiplyRate(1.5);
        personBusinessService.printAll();
    }
}
