package seminars.fourth.database;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

    /*
        4.6.Вам требуется протестировать класс, который обрабатывает запросы к базе данных.
        Условие: У вас есть класс Database с методом public List<String> query(String sql),
        который выполняет SQL-запрос и возвращает результат.
        Вам необходимо проверить правильность работы класса DataProcessor, который использует
        Database для выполнения запроса и обработки результатов.

     */
//    public static void main(String[] args) {
//        // Создаём экземпляр класса Database
//        Database database = new Database();
//
//        // Создаём экземпляр класса DataProcessor, передавая в конструктор database
//        DataProcessor dataProcessor = new DataProcessor(database);
//
//        // Вызываем метод processData и выводим результаты
//        List<String> data = dataProcessor.processData("SELECT * FROM table");
//        for (String datum : data) {
//            System.out.println(datum);
//        }
//    }

class DataProcessorTest {

    @Test
    void dataProcessorTest() {

        Database database = mock(Database.class);

        when(database.query(anyString())).thenReturn(Arrays.asList("First", "Second", "Third"));

        DataProcessor dataProcessor = new DataProcessor(database);

        List<String> data = dataProcessor.processData("SELECT * FROM table");

        assertEquals(3, data.size());
    }
}