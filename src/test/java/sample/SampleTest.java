package sample;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class SampleTest {

	private Injector injector = Guice.createInjector(new Module());
	private Factory factory = injector.getInstance(Factory.class);

	@Test
	public void test() {
		Impl1<Integer> i1 = factory.build(Integer.class, "string");
		assertTrue("i1 should be an instance of Impl1", i1 instanceof Impl1);
		Impl2<Double> i2 = factory.build(Double.class, 1l);
		assertTrue("i2 should be an instance of Impl2", i2 instanceof Impl2);
	}

}
