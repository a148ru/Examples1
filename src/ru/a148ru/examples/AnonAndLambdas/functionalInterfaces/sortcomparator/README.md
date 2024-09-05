## Сортировка с помощью интерфейса Comporator

Сортировка коллекции

Начиная с Java 8,  в интерфейсе __List__ имеется метод __sort__ (можно также воспользоваться методом _Collections.sort_).
Параметризовать поведение метода __sort__ можно с помощью объекта __java.util.Comparator__ .

```java
// java.util.Comparator
public interface Comporator<T>{
    int compare(T o1, T o2);
}
```

Например для сортировки яблок.

```java

inventory.sort(new Comparator<Apple>(){
    public int compare(Apple a1, Apple a2){
        return a1.getWeigth().compareTo(a2.getWeigth())
    }
});

```

или

```java

inventory.sort((Apple a1, Apple a2) ->  a1.getWeigth().compareTo(a2.getWeigth()));
```
