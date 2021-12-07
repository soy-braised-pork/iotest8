package org.language.Thread;

import java.util.Random;
import java.util.concurrent.Callable;

/**
 * @author zlx <zhulx3@>
 * Creat on 2021-12-06
 */
public class MyTest5 implements Callable {
    @Override
    public Object call() throws Exception {
        return new Random().nextInt(10);
    }
}
