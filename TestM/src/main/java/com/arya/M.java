package com.arya;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.util.FileCopyUtils;

public class M {
    public static void main(String[] args) throws IOException {

        File photo = new File("/Users/apple/Desktop/backup/");
        File photo2 = new File("/Users/apple/Desktop/photos2/");
        File photo3 = new File("/Users/apple/Desktop/photos3/");

        Set<String> fileNameTobeIgnore = readFile();


        for (File f : photo.listFiles()) {
            if (fileNameTobeIgnore.contains(f.getName())) {
                FileCopyUtils.copy(f, new File(photo3.getAbsolutePath() + File.separator + f.getName()));

            } else {
                FileCopyUtils.copy(f, new File(photo2.getAbsolutePath() + File.separator + f.getName()));
            }
        }


    }

    public static Set<String> readFile() throws IOException {

        InputStream data = M.class.getClassLoader().getResourceAsStream("data");
        String[] split = new String(data.readAllBytes()).split("\n");
        return Arrays.asList(split).stream().map(String::trim).map(i -> "DSC_4" + i + ".JPG").collect(Collectors.toSet());

    }
}
