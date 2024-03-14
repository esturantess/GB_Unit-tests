package seminars.fourth.message;

import org.junit.jupiter.api.Test;
import seminars.fourth.hotel.BookingService;
import seminars.fourth.hotel.HotelService;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
import static org.assertj.core.api.Assertions.*;

class NotificationServiceTest {

    @Test
    void notificationServiceTest() {

        MessageService messageServiceMock = mock(MessageService.class);
        NotificationService notificationService = new NotificationService(messageServiceMock);

        notificationService.sendNotification("Привет", "Ольга");

        verify(messageServiceMock, times(1)).sendMessage("Привет", "Ольга");
    }

}