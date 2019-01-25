package com.designmode.structure.proxy;

/**
 * 代理类
 */
public class ProxyClazz implements Proxyable {

    /**
     * 需要代理的类
     */
    private Source source;

    public ProxyClazz(){
        super();
        this.source = new Source();
    }

    @Override
    public void methodOne() {
        before();
        source.methodOne();
        after();
    }

    private void after() {
        System.out.println("after proxy!");
    }

    private void before() {
        System.out.println("before proxy!");
    }

}
