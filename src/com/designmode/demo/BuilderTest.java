package com.designmode.demo;

import com.designmode.create.builder.BeerBuilder;

public class BuilderTest {

    public static void main(String[] args) {
        BeerBuilder beerBuilder = new BeerBuilder();
        beerBuilder.createCoronaBeer(5);
        beerBuilder.createLIQUANBeer(1);
        beerBuilder.createPearlRiverBeer(2);
        beerBuilder.createTSINGDAOBeer(3);
    }
}
