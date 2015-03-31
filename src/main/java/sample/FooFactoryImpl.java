package sample;

public class FooFactoryImpl implements FooFactory {

	@Override
	public <T> FooA<T> build(final Class<T> clazz, final String s) {
		return new FooA<>(clazz, s);
	}

	@Override
	public <T> FooB<T> build(final Class<T> clazz, final Long l) {
		return new FooB<>(clazz, l);
	}

}
