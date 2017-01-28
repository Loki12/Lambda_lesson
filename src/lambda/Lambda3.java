package lambda;

/**
 * Задание 9
 * Created by Sergej on 28.01.2017.
 *
 * Напишите статический метод andThen(), принимающий
 * в качестве параметров два экземпляра интерфейса Runnable и возвращающий
 * экземпляр интерфейса Runnable, который выполняет сначала первый экземпляр, а затем второй.
 * Передайте в методе main() два лямбда-выражения вызываемому методу andThen,
 * а затем выполните возвращаемый из него экземпляр.
 */
class Lambda3 {


    Lambda3() {
        andThen(new Runner("Вова"), new Runner("Петя")).run();
    }

    private static Runnable andThen(Runnable run1, Runnable run2)
    {
        return () ->{
          run1.run();
            run2.run();
        };
    }

    private static class Runner implements Runnable
    {

        String name;

        @Override
        public void run() {
            System.out.print(name);
        }

        Runner(String name) {
            this.name = name;
        }
    }
}
