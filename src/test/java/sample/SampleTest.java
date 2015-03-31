package sample;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class SampleTest {

	private final Injector injector = Guice.createInjector(new Module());
	private final FooFactory fooFactory = injector.getInstance(FooFactory.class);

	@Test
	public void test() {
		final Foo<Integer> i1 = fooFactory.build(Integer.class, "string");
		final Foo<String> i2 = fooFactory.build(String.class, 1l);

		assertThat(i1, is(not(nullValue())));
		assertThat(i1, is(instanceOf(FooA.class)));
		assertThat(i2, is(instanceOf(FooB.class)));
	}

}
