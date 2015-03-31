package sample;

import javax.inject.Inject;

import com.google.inject.assistedinject.Assisted;

public class FooA<T> implements Foo<T> {

	private final Class<T> clazz;
	private final String s;

	@Inject
	public FooA(@Assisted final Class<T> clazz, @Assisted final String s) {
		this.clazz = clazz;
		this.s = s;
	}

	@Override
	public T get() {
		try {
			return clazz.newInstance();
		} catch (InstantiationException | IllegalAccessException e) {
			return null;
		}
	}

}
