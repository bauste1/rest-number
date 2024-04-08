package org.bauste1.quarkus.microservices.number.service;

import jakarta.enterprise.context.ApplicationScoped;
import org.bauste1.quarkus.microservices.number.model.IsbNumbers;

import java.time.Instant;
import java.util.Random;

@ApplicationScoped
public class IsbNumberService {

 public IsbNumbers generateIsbNumbers() {
   IsbNumbers isbNumbers = new IsbNumbers();
   isbNumbers.isbn10 = "10-" + new Random().nextInt(1_000_000);
   isbNumbers.isbn13 = "13-" + new Random().nextInt(1_000_000_000);
   
   isbNumbers.generationDate = Instant.now();

   return isbNumbers;
 }
}
