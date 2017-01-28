package lambda;

import java.util.Collection;
import java.util.function.Consumer;
import java.util.function.Predicate;


/** Задание 12
 * Created by Sergej on 28.01.2017.
 *
 * Сформируйте подкласс Collection2 из интерфейса Collection и введите в него метод по умолчанию
 * void forEachIf(Consumer<T> action, Predicate<T> filter), применяющий параметр action к кажому элементу,
 * для которого параметр filter возвращает логическое значение true. Как можно воспользоваться таким методом?
 */

public interface Lambda4<T> extends Collection<T>
{

//    1 вариант
    default void forEachIf(Consumer<? super T> action, Predicate<? super T> filter) {
        this.stream().filter(t -> filter.test(t)).forEach(a -> action.accept(a));
    }

//    2 вариант

    default void forEachIf2(Consumer<? super T> action, Predicate<? super T> filter) {
        this.stream().filter(filter).forEach(action);
    }
}
