/**
 * Created by Sergej on 27.01.2017.
 */
public class Lambda_lesson1 {
    /*    public static void main(String args[])
    {
        File[] files = ReturnCatalogs();
        Arrays.stream(files).forEach(System.out::println);
//        FileFilter fileFilter = ReturnCatalogs();
//        System.out.println(fileFilter.accept(new File("C:\\Users\\Sergej\\Desktop\\English")));
    }

    public static File[] ReturnCatalogs()
    {
        File file  = new File("C:\\Users\\Sergej\\Desktop\\English");
        //1 вариант
        if (file.isDirectory())
        {
            return file.listFiles();
        }
        else
        {
            return null;
        }

//        2 вариант
        FileFilter fileFilter = (first) -> {
            return first.isDirectory();
        };

        return file.listFiles(fileFilter);

//        3 вариант
        return file.listFiles(
                (first) -> { return first.isDirectory(); }
        );
    }
        //4 вариант
        return file.listFiles(File::isDirectory);
    }*/
}
