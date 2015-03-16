package sample;

import com.google.inject.AbstractModule;
import com.google.inject.TypeLiteral;
import com.google.inject.assistedinject.FactoryModuleBuilder;

public class Module extends AbstractModule {

	@Override
	protected void configure() {
//		bind(new TypeLiteral<Impl1<?>>(){});
		bind(Factory.class).to(FactoryImpl.class);
		
//		install(new FactoryModuleBuilder().implement(Impl1.class, Impl1.class).implement(Impl2.class, Impl2.class).build(Factory.class));
//		install(new FactoryModuleBuilder().implement(new TypeLiteral<Impl1<?>>(){}, Impl1.class).implement(new TypeLiteral<Impl2<?>>(){}, Impl2.class).build(Factory.class));
	}
}
