package com.designmode.demo;

import com.designmode.create.factory.abstraction.BeerFactoryBuilder;
import com.designmode.create.factory.abstraction.TSINGDAOFactory;
import com.designmode.create.factory.common.CommonBeerFactory;
import com.designmode.create.factory.product.Beer;
import com.designmode.create.factory.simple.SimpleBeerFactory;
import com.designmode.create.factory.staticstate.StaticCommonBeerFactory;


public class FactoryTest {

    public static void main(String[] args) {
        // 简单工厂(静态工厂就是在方法加static，不用实例化)
        Beer beer1 = SimpleBeerFactory.createBeer("zhujiang");

        // 实例化工厂
        CommonBeerFactory commonBeerFactory = new CommonBeerFactory();
        Beer beer2 = commonBeerFactory.getCorona();

        // 静态工厂
        Beer beer3 = StaticCommonBeerFactory.getLIQUAN();

        // 抽象工厂
        BeerFactoryBuilder beerFactoryBuilder = new TSINGDAOFactory();
        Beer beer4 = beerFactoryBuilder.buildBeer();

        beer1.createBeer();
        beer2.createBeer();
        beer3.createBeer();
        beer4.createBeer();
    }
}
