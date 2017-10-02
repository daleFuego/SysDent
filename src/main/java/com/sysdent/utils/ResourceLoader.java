package com.sysdent.utils;

import java.awt.Image;
import java.awt.Toolkit;

/*****************************
 * Project: SysDent
 * Class:   ResourceLoader
 * Author:  Magdalena Matusiak
 * Created: 2 paü 2017
 *****************************/

public class ResourceLoader {

    public static Image getIconImage(String iconPath){
	return Toolkit.getDefaultToolkit().getImage(ResourceLoader.class.getResource(iconPath));
    }
}
