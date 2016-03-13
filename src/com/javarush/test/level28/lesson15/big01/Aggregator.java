package com.javarush.test.level28.lesson15.big01;

import com.javarush.test.level28.lesson15.big01.model.Provider;
import com.javarush.test.level28.lesson15.big01.model.Strategy;

/**
 * Created by
 * Polurival on 13.03.2016.
 */
public class Aggregator
{
    public static void main(String[] args)
    {
        Provider provider = new Provider(new Strategy()
        {
        });
        Controller controller = new Controller(provider);
        System.out.println(controller);
    }
}
