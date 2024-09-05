## Выполнение блока кода с помощью интерфейса Runnable

```java

// java.lang.Runnable
public interface Runnable {
    void run();
}
```

например

```java
Thread t = new Thread(new Ruunable(){
    public void run(){
        System.out.println("Run");
    }
});
```

или

```java
Thread t = new Thread(() -> System.out.println("Run"));
```
