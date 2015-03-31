package sample;

import javax.inject.Inject;

import com.google.inject.assistedinject.Assisted;

public class FooB<T> implements Foo<T> {

	private final Class<T> clazz;
	private final Long l;

	@Inject
	public FooB(@Assisted final Class<T> clazz, @Assisted final Long l) {
		this.clazz = clazz;
		this.l = l;
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
