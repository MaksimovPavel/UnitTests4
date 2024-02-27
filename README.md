# UnitTests4
1)  Почему использование тестовых заглушек может быть полезным при написании модульных тестов?
Использование тестовых заглушек может быть полезным при написании модульных тестов по следующим причинам:
- Упрощение тестов: Тестовыми заглушками можно заменить сложную функциональность, которую необходимо протестировать. Это позволяет упростить тест и сделать его более управляемым.
- Изоляция тестов: Заглушки помогают изолировать тесты, так как они заменяют только одну часть системы, которую нужно протестировать, оставляя остальную систему нетронутой.
- Повторное использование заглушек: Если заглушки написаны правильно, их можно использовать повторно для тестирования разных частей системы.
- Улучшение производительности тестов: Использование заглушек может ускорить выполнение тестов, так как не нужно ждать, пока сложная функциональность будет выполнена.
- Легче обнаруживать ошибки: Если тестовая заглушка обнаруживает ошибку, это обычно указывает на проблему в самой заглушке, а не в остальной части системы. Это облегчает отладку и устранение ошибок.
- Улучшение читаемости тестов: При использовании заглушек тесты становятся более читаемыми и понятными, так как они фокусируются на одной конкретной вещи, которую нужно проверить.
  
2) Какой тип тестовой заглушки следует использовать, если вам нужно проверить, что метод был вызван с определенными аргументами?
Необходимо использовать Mock заглушку.
3) Какой тип тестовой заглушки следует использовать, если вам просто нужно вернуть определенное значение или исключение в ответ на вызов метода?
Необходимо использовать Stub заглушку.
4) Какой тип тестовой заглушки вы бы использовали для имитации  взаимодействия с внешним API или базой данных?
Необходимо использовать Fake заглушку.
