package zad1;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class ListCreator<T> {
    private List<T> list;

    private ListCreator(List<T> src) {
        this.list = src;
    }

    public static <T> ListCreator<T> collectFrom(List<T> src) {
        return new ListCreator<>(src);
    }

    public ListCreator<T> when(Predicate<T> pred) {
        list = list.stream().filter(pred).collect(Collectors.toList());
        return this;
    }

    public <R> List<R> mapEvery(Function<T, R> fun) {
        return list.stream().map(fun).collect(Collectors.toList());
    }
}

