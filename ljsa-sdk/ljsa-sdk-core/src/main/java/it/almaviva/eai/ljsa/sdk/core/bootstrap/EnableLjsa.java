package it.almaviva.eai.ljsa.sdk.core.bootstrap;

import it.almaviva.eai.ljsa.sdk.core.configuration.LjsaConfiguration;
import org.springframework.context.annotation.Import;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Retention(value = java.lang.annotation.RetentionPolicy.RUNTIME)
@Target(value = {java.lang.annotation.ElementType.TYPE})
@Documented
@Import(LjsaConfiguration.class)
public @interface EnableLjsa {
}
