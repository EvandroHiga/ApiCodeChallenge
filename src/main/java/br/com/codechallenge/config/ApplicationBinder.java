package br.com.codechallenge.config;

import javax.enterprise.context.ApplicationScoped;

import org.glassfish.hk2.api.JustInTimeInjectionResolver;
import org.glassfish.jersey.internal.inject.AbstractBinder;
import org.glassfish.jersey.process.internal.RequestScoped;

//TODO
@ApplicationScoped
public class ApplicationBinder extends AbstractBinder {

	@Override
	protected void configure() {
		bind(ApplicationJustInTimeInjectionResolver.class).to(JustInTimeInjectionResolver.class).in(RequestScoped.class);
	}

}
