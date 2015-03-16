package sample;

import javax.inject.Inject;

import com.google.inject.assistedinject.Assisted;

public class Impl1<T> implements I {

	private final Class<T> clazz;
	private final String s;

	@Inject
	public Impl1(@Assisted Class<T> clazz, @Assisted String s) {
		this.clazz = clazz;
		this.s = s;
	}

	@Override
	public Class<T> getT() {
		return clazz;
	}

}
