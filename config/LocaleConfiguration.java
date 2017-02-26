package quiz.config;

import org.springframework.boot.bind.RelaxedPropertyResolver;
import org.springframework.context.EnvironmentAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;
import quiz.config.locale.AngularCookieLocaleResolver;

@Configuration
public class LocaleConfiguration extends WebMvcConfigurerAdapter implements EnvironmentAware {
   private RelaxedPropertyResolver propertyResolver;

   public void setEnvironment(Environment environment) {
      this.propertyResolver = new RelaxedPropertyResolver(environment, "spring.messages.");
   }

   @Bean(
      name = {"localeResolver"}
   )
   public LocaleResolver localeResolver() {
      AngularCookieLocaleResolver cookieLocaleResolver = new AngularCookieLocaleResolver();
      cookieLocaleResolver.setCookieName("NG_TRANSLATE_LANG_KEY");
      return cookieLocaleResolver;
   }

   public void addInterceptors(InterceptorRegistry registry) {
      LocaleChangeInterceptor localeChangeInterceptor = new LocaleChangeInterceptor();
      localeChangeInterceptor.setParamName("language");
      registry.addInterceptor(localeChangeInterceptor);
   }
}
