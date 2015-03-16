package sample;

import javax.inject.Inject;

import com.google.inject.assistedinject.Assisted;

public class Impl2<T> implements I<T> {

	private final Class<T> clazz;
	private final Long l;

	@Inject
	public Impl2(@Assisted Class<T> clazz, @Assisted Long l) {
		this.clazz = clazz;
		this.l = l;
	}

	@Override
	public Class<T> getT() {
		return clazz;
	}

}
