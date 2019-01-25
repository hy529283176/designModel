package com.designmode.create.factory.simple;

import com.designmode.create.factory.product.Beer;
import com.designmode.create.factory.product.CoronaBeer;
import com.designmode.create.factory.product.LIQUANBeer;
import com.designmode.create.factory.product.PearlRiverBeer;
import com.designmode.create.factory.product.TSINGDAOBeer;


/**
 * 简单工厂 啤酒厂
 * 
 * @author Southgis_Puppy
 *
 */
public class SimpleBeerFactory {

    private static final String PEARLRIVER = "zhujiang";
    private static final String CORONA     = "corona";
    private static final String LIQUAN     = "liquan";
    private static final String TSINGDAO   = "qingdao";

    public static Beer createBeer(String type) {
        switch (type) {
            case PEARLRIVER:
                return new PearlRiverBeer();
            case CORONA:
                return new CoronaBeer();
            case LIQUAN:
                return new LIQUANBeer();
            case TSINGDAO:
                return new TSINGDAOBeer();
            default:
                return null;
        }
    }
}
