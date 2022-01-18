public interface Observer<E> {
    void notify(E event);
}