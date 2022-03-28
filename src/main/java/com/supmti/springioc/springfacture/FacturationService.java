package com.supmti.springioc.springfacture;

import com.supmti.springioc.springtva.TVA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
public class FacturationService {

   private TVA t;

   @Autowired
   @Qualifier("TVAMaroc")
   public void setT(TVA t) {
      this.t = t;
   }

   //calcule le montant TVA
   public double cacluleMontantTTC(double montantHT)
   {
       return t.cacluleMontantTva(montantHT)+montantHT;
   }





}
