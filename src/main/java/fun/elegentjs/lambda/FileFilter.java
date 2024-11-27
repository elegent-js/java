package fun.elegentjs.lambda;

import java.io.File;
import java.util.Arrays;

public class FileFilter {

    public static void main(String[] args) {

        // 传统写法
        var files = new File("/Users/liupeijun/Documents/20_Git/learn/java/src/main/java/fun/elegentjs/lambda").listFiles(new java.io.FileFilter() {
            @Override
            public boolean accept(File file) {
                return file.getName().endsWith(".java");
            }
        });
        print(files);

        // lambda写法
        files = new File("/Users/liupeijun/Documents/20_Git/learn/java/src/main/java/fun/elegentjs/lambda").listFiles(f -> f.getName().endsWith(".java"));
        print(files);
    }


    private static void print(File[] files) {
        Arrays.stream(files).forEach(System.out::println);
    }
}
