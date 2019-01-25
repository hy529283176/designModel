package com.designmode.create.factory.abstraction;

import com.designmode.create.factory.product.Beer;
import com.designmode.create.factory.product.TSINGDAOBeer;


public class TSINGDAOFactory implements BeerFactoryBuilder {

    @Override
    public Beer buildBeer() {
        return new TSINGDAOBeer();
    }

}
