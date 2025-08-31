package com.javarush.minka;

import java.io.File;

public class DefaultFilePathBuilder {
    public String buildAbsolutePath(String fileName) {
        return new File(fileName).getAbsolutePath();
    }
}
