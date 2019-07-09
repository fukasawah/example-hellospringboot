package dev.fukasawah.example.hellospringboot.configurations;

import com.microsoft.applicationinsights.TelemetryConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppInsightsConfig {
    @Bean
    public String telemetryConfig() {
        String telemetryKey = System.getenv("INSTRUMENTATION_KEY");
        if (telemetryKey != null) {
            TelemetryConfiguration.getActive().setInstrumentationKey(telemetryKey);
        }
        return telemetryKey;
    }
}