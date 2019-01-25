package com.designmode.demo;

import com.designmode.structure.adapter.Source;
import com.designmode.structure.adapter.Targetable;
import com.designmode.structure.adapter.classadapter.Adapter;
import com.designmode.structure.adapter.interadapter.SourceSubjectOne;
import com.designmode.structure.adapter.interadapter.SourceSubjectTwo;
import com.designmode.structure.adapter.interadapter.Sourceable;
import com.designmode.structure.adapter.objectadapter.Wrapper;

public class AdapterTest {

    public static void main(String[] args) {
        Targetable targetable = new Adapter();
        targetable.methodOne();
        targetable.methodTwo();
        Source source = new Source();
        Targetable targetable2 = new Wrapper(source);
        targetable2.methodOne();
        targetable2.methodTwo();
        Sourceable sourceable = new SourceSubjectOne();
        Sourceable sourceable2 = new  SourceSubjectTwo();
        sourceable.methodOne();
        sourceable.methodTwo();
        sourceable2.methodOne();
        sourceable2.methodTwo();
    }
}
