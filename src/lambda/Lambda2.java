package lambda;

import java.io.File;
import java.util.Arrays;
import java.util.Comparator;

/**
 * Отсортируйте заданный массив объектов типа File  таким образом,
 * чтобы каталоги в нем следовали перед файлами, а в каждой группе элементы были отсортированы по имени пути.
 * Воспользуйтесь для этой цели лямбда-выражением, вместо интерфейса Comparator.
 * Created by Sergej on 26.01.2017.
 */
class Lambda2 {

    Lambda2(String FILE_NAME) {
        File file = new File(FILE_NAME);
        File[] listFiles = file.listFiles();
        ReturnSortedFiles(listFiles);
        ReturnSortedFiles2(listFiles);
    }

    //1 вариант
    private void ReturnSortedFiles(File[] listFiles) {
        Comparator<File> fileComparator = (first, second)-> first.getName().compareTo(second.getName());
        Arrays.sort(listFiles, fileComparator);
    }

    //2 вариант
    private void ReturnSortedFiles2(File[] listFiles)
    {
        assert listFiles != null;
        Arrays.sort(listFiles, (first, second)->{
            Boolean b = first.isFile();
            Boolean b2 = second.isFile();
            return b.compareTo(b2);
        });
        Arrays.asList(listFiles).forEach(System.out::println);
    }
}
