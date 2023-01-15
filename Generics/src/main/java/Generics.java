public class Generics <T>{
    private T object;

    public Generics(T object) {
        this.object = object;
    }

    public T getObject() {
        return object;
    }
}
