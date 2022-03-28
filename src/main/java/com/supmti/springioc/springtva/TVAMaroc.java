package com.supmti.springioc.springtva;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class TVAMaroc implements TVA {
    
    @Override
    public double cacluleMontantTva(double montantTva)
    {
        return montantTva*0.20;
    }
}
