package com.designmode.create.factory.abstraction;

import com.designmode.create.factory.product.Beer;
import com.designmode.create.factory.product.PearlRiverBeer;


public class PearlRiverFactory implements BeerFactoryBuilder {

    @Override
    public Beer buildBeer() {
        return new PearlRiverBeer();
    }

}
