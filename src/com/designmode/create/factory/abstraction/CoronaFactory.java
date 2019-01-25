package com.designmode.create.factory.abstraction;

import com.designmode.create.factory.product.Beer;
import com.designmode.create.factory.product.CoronaBeer;


public class CoronaFactory implements BeerFactoryBuilder {

    @Override
    public Beer buildBeer() {
        return new CoronaBeer();
    }

}
