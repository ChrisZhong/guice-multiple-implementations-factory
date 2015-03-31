package sample;

public interface FooFactory {

	@A
	<T> Foo<T> build(Class<T> clazz, String s);

	@B
	<T> Foo<T> build(Class<T> clazz, Long l);

}
