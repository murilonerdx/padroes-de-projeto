package org.example;

import org.example.creational.abstractfactory.AbstractFactory;
import org.example.creational.abstractfactory.AbstractProduct;
import org.example.creational.abstractfactory.Application;
import org.example.creational.abstractfactory.ConcretProduct;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )

    {
        AbstractProduct abstractProduct = new ConcretProduct();
        Application app = new Application(abstractProduct);
        app.print();
    }
}
