package com.designmode.create.prototype.normal;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * 一般原型模式
 * @author Southgis_Puppy
 *
 */
public class NormalPrototype implements Cloneable, Serializable {

    private static final long serialVersionUID = 1L;
    private String            string;

    private SerializableOject obj;

    /* 浅复制 */
    public Object clone() throws CloneNotSupportedException {
        NormalPrototype prototype = (NormalPrototype) super.clone();
        return prototype;
    }
    
    /*深复制*/
    public Object deepClone() throws IOException, ClassNotFoundException {
        /* 写入当前对象的二进制流 */
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(this);

        /* 读出二进制流产生的新对象 */
        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        return ois.readObject();
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public SerializableOject getObj() {
        return obj;
    }

    public void setObj(SerializableOject obj) {
        this.obj = obj;
    }

}


class SerializableOject implements Serializable {

    private static final long serialVersionUID = 1L;

}
