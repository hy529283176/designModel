package com.designmode.create.factory.abstraction;

import com.designmode.create.factory.product.Beer;
import com.designmode.create.factory.product.LIQUANBeer;


public class LIQUANFactory implements BeerFactoryBuilder{

    @Override
    public Beer buildBeer() {
        return new LIQUANBeer();
    }

}
