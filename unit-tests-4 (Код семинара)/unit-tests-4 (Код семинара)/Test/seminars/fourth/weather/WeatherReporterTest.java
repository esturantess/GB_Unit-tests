package seminars.fourth.weather;


import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;
import static org.assertj.core.api.Assertions.*;

class WeatherReporterTest {

    @Test
    void weatherReporterTest() {

        WeatherService weatherServiceMock = mock(WeatherService.class);

        when(weatherServiceMock.getCurrentTemperature()).thenReturn(45);

        WeatherReporter weatherReporter = new WeatherReporter(weatherServiceMock);

        assertThat(weatherReporter.generateReport()).isEqualTo("Текущая температура: " + 45 + " градусов.");
    }

}