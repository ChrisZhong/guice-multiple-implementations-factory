package sample;

public interface Factory {

	<T> Impl1<T> build(Class<T> clazz, String s);
	
	<T> Impl2<T> build(Class<T> clazz, Long l);
	
}
