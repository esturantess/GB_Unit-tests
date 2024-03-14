package seminars.fourth.hotel;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
import static org.assertj.core.api.Assertions.*;


class BookingServiceTest {

    @Test
    void bookingServiceTest() {

        HotelService hotelService = mock(HotelService.class);
        when(hotelService.isRoomAvailable(anyInt())).thenAnswer(i -> (Integer) i.getArgument(0) % 2 == 0);

        BookingService bookingService = new BookingService(hotelService);

        assertTrue(bookingService.bookRoom(2));

        assertFalse(bookingService.bookRoom(3));

        verify(hotelService, times(2)).isRoomAvailable(anyInt());
    }

}