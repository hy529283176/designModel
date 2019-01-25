package com.designmode.create.builder;

import java.util.ArrayList;
import java.util.List;

import com.designmode.create.factory.product.Beer;
import com.designmode.create.factory.product.CoronaBeer;
import com.designmode.create.factory.product.LIQUANBeer;
import com.designmode.create.factory.product.PearlRiverBeer;
import com.designmode.create.factory.product.TSINGDAOBeer;


/**
 * 建造者模式，在工厂模式的基础上
 * 
 * @author Southgis_Puppy
 *
 */
public class BeerBuilder {

    private List<Beer> list = new ArrayList<Beer>();

    public void createCoronaBeer(int count) {
        for (int i = 0; i < count; i++) {
            list.add(new CoronaBeer());
        }
    }

    public void createPearlRiverBeer(int count) {
        for (int i = 0; i < count; i++) {
            list.add(new PearlRiverBeer());
        }
    }

    public void createTSINGDAOBeer(int count) {
        for (int i = 0; i < count; i++) {
            list.add(new TSINGDAOBeer());
        }
    }

    public void createLIQUANBeer(int count) {
        for (int i = 0; i < count; i++) {
            list.add(new LIQUANBeer());
        }
    }
}
