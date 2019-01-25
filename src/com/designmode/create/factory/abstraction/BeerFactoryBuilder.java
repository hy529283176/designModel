package com.designmode.create.factory.abstraction;

import com.designmode.create.factory.product.Beer;

/**
 * 抽象工厂
 */
public interface BeerFactoryBuilder {
    public Beer buildBeer();
}
