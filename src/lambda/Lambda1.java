package lambda;

import java.io.File;
import java.io.FileFilter;
import java.util.Arrays;


/**
 * Ипользуя методы listFiles(FileFilter) и isDirectory() из класса java.io.File,
 * напишите метод, возвращающий все подкаталоги из данного каталога.
 * Воспользуетесь лямбда-выражением вместо объекта типа FileFilter.
 * Сделайте то же самое с помощью ссылки на метод.
 * Created by Sergej on 26.01.2017.
 */
class Lambda1 {

    Lambda1(String FILE_NAME) {
        File file  = new File(FILE_NAME);
        File[] files = ReturnCatalogs(file);
        Arrays.stream(files).forEach(System.out::println);

//        FileFilter fileFilter = ReturnCatalogs();
//        System.out.println(fileFilter.accept(new File("C:\\Users\\Sergej\\Desktop\\English")));
    }

    //1 вариант
    private static File[] ReturnCatalogs(File file)
    {
        if (file.isDirectory())
        {
            return file.listFiles();
        }
        else
        {
            return null;
        }
    }

    //        2 вариант
    private static File[] ReturnCatalogs2(File file) {
        FileFilter fileFilter = (first) -> {
            return first.isDirectory();
        };
        return file.listFiles(fileFilter);
    }

    //        3 вариант
    private static File[] ReturnCatalogs3(File file) {
        return file.listFiles(
                (first) -> { return first.isDirectory(); }
        );
    }

    //      4 вариант
    private static File[] ReturnCatalogs4(File file) {
        return file.listFiles(File::isDirectory);
    }

}
