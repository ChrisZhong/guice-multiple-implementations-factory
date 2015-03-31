package sample;

import com.google.inject.AbstractModule;
import com.google.inject.TypeLiteral;
import com.google.inject.assistedinject.FactoryModuleBuilder;

public class Module extends AbstractModule {

	@Override
	protected void configure() {
		 solution1();

		// solution2();

		// solution3();

		// solution4();

		// solution5();
	}

	void solution1() {
		bind(FooFactory.class).to(FooFactoryImpl.class);
	}

	void solution2() {
		bind(TypeLiteral.get(Foo.class)).to(TypeLiteral.get(FooA.class));
		bind(TypeLiteral.get(Foo.class)).to(TypeLiteral.get(FooA.class));
	}

	void solution3() {
		FactoryModuleBuilder fmb = new FactoryModuleBuilder().implement(Foo.class, FooA.class).implement(Foo.class, FooB.class);
		install(fmb.build(FooFactory.class));
	}

	void solution4() {
		FactoryModuleBuilder fmb = new FactoryModuleBuilder().implement(Foo.class, A.class, FooA.class).implement(Foo.class, B.class, FooB.class);
		install(fmb.build(FooFactory.class));
	}

	void solution5() {
		FactoryModuleBuilder fmb = new FactoryModuleBuilder().implement(TypeLiteral.get(Foo.class), A.class, TypeLiteral.get(FooA.class)).implement(
				TypeLiteral.get(Foo.class), B.class, TypeLiteral.get(FooB.class));
		install(fmb.build(TypeLiteral.get(FooFactory.class)));
	}

}
