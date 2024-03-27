package com.wavydaves.api.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.wavydaves.api.models.CreditCard;
import com.wavydaves.api.repositories.CreditCardRepository;

public class CreditCardService {

    private final CreditCardRepository creditCardRepository;

    @Autowired
    public CreditCardService(CreditCardRepository creditCardRepository) {
        this.creditCardRepository = creditCardRepository;
    }

    public boolean authorizeCard(Integer cardNumber) {
        var result = creditCardRepository.getCreditCardByCardNumber(cardNumber);
        if (result.isPresent()) {
            return true;
        }
        else {
            return false;
        }
    }

    public CreditCard getCreditCardbyId(Integer id) {
        var result = creditCardRepository.getCreditCardById(id);
        if (result.isPresent()) {
            return result.get();
        }
        else {
            System.out.println("Credit Card with Id " + id + " not found.");
        }
        return null;
    }

    public List<CreditCard> getCreditCardsByUserId(Integer userId) {
        var result = creditCardRepository.getCreditCardsByUserId(userId);
        if (result.isPresent()) {
            return result.get();
        }
        else {
            System.out.println("No credit cards found for user with Id " + userId);
        }
        return null;
    }

    public CreditCard upsertCreditCard(CreditCard creditCard) {
        return creditCardRepository.save(creditCard);
    }

    public void deleteCreditCardById(Integer id) {
        deleteCreditCardById(id);
    }
}