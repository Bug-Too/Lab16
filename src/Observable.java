public interface Observable<E> {
    void subscribe(Observer<E> observer);
}