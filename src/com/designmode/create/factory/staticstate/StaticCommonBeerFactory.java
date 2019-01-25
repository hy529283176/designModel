package com.designmode.create.factory.staticstate;

import com.designmode.create.factory.product.Beer;
import com.designmode.create.factory.product.CoronaBeer;
import com.designmode.create.factory.product.LIQUANBeer;
import com.designmode.create.factory.product.PearlRiverBeer;
import com.designmode.create.factory.product.TSINGDAOBeer;


/**
 * 一般工厂类(静态)
 * 
 * @author Southgis_Puppy
 *
 */
public class StaticCommonBeerFactory {

    public static Beer getCorona() {
        return new CoronaBeer();
    }

    public static Beer getLIQUAN() {
        return new LIQUANBeer();
    }

    public static Beer getPearlRiver() {
        return new PearlRiverBeer();
    }

    public static Beer getTSINGDAO() {
        return new TSINGDAOBeer();
    }

}
