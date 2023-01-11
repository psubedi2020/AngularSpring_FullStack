package com.devguru.nbdash;

import com.devguru.nbdash.JhipsterNeighborHoodDashApp;
import com.devguru.nbdash.config.AsyncSyncConfiguration;
import com.devguru.nbdash.config.EmbeddedKafka;
import com.devguru.nbdash.config.EmbeddedSQL;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;

/**
 * Base composite annotation for integration tests.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@SpringBootTest(classes = { JhipsterNeighborHoodDashApp.class, AsyncSyncConfiguration.class })
@EmbeddedKafka
@EmbeddedSQL
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_CLASS)
public @interface IntegrationTest {
}
