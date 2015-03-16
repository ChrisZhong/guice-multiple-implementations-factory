package sample;

public class FactoryImpl implements Factory {

	@Override
	public <T> Impl1<T> build(Class<T> clazz, String s) {
		return new Impl1<>(clazz, s);
	}

	@Override
	public <T> Impl2<T> build(Class<T> clazz, Long l) {
		return new Impl2<>(clazz, l);
	}

}
