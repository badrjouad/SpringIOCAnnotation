package com.supmti.springioc.springtva;

public class TVAFrance  implements TVA {



    @Override
    public double cacluleMontantTva(double montantTva)
    {
        return montantTva*0.3;
    }
}
