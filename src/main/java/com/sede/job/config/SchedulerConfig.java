package com.sede.job.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@Configuration
@EnableScheduling
// @EnableSchedulerLock(defaultLockAtMostFor = "10m")
@EnableAsync
@ConditionalOnProperty(name="scheduler.enabled", matchIfMissing = true)
public class SchedulerConfig {
	
	// @Bean
	// public LockProvider lockProvider(DataSource dataSource) {
	//             return new JdbcTemplateLockProvider(
	//                 JdbcTemplateLockProvider.Configuration.builder()
	//                 .withJdbcTemplate(new JdbcTemplate(dataSource))
	//                 .usingDbTime() // Works on Postgres, MySQL, MariaDb, MS SQL, Oracle, DB2, HSQL and H2
	//                 .build()
	//             );
	// }

}