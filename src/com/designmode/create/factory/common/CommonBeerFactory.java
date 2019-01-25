package com.designmode.create.factory.common;

import com.designmode.create.factory.product.Beer;
import com.designmode.create.factory.product.CoronaBeer;
import com.designmode.create.factory.product.LIQUANBeer;
import com.designmode.create.factory.product.PearlRiverBeer;
import com.designmode.create.factory.product.TSINGDAOBeer;


/**
 * 一般工厂类
 * 
 * @author Southgis_Puppy
 *
 */
public class CommonBeerFactory {

    public Beer getCorona() {
        return new CoronaBeer();
    }

    public Beer getLIQUAN() {
        return new LIQUANBeer();
    }

    public Beer getPearlRiver() {
        return new PearlRiverBeer();
    }

    public Beer getTSINGDAO() {
        return new TSINGDAOBeer();
    }

}
