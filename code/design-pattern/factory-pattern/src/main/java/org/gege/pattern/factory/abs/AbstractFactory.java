package org.gege.pattern.factory.abs;

import org.gege.pattern.factory.Furits;
import org.gege.pattern.factory.Vagetables;

/**
 * @Author: gege
 * @Date: 2019/3/14 23:42
 * @Version 1.0
 */
public interface AbstractFactory {

    Furits createFurits();

    Vagetables createVagetables();

}
