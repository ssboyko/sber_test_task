# sber_test_task
sber_task

Web - Сервис перевода средств с карты на карту.
Должен обладать следующим функционалом:
1)	Форма логина
2)	Регистрация новых клиентов.
Атрибуты клиента (все поля – обязательные):
●	ФИО
●	Логин
●	Пароль

3)	Личный кабинет клиента
Должен обладать возможностью:
▪	Добавления карт и просмотра их баланса
▪	Пополнение баланса карты
▪	Перевода средств на карты других клиентов
▪	Пользователь должен ввести номер карты того, кому переводятся деньги. 
▪	После этого система должна запросить подтверждение перевода и отобразить ФИО того, кому переводятся деньги
▪	После перевода, средства должны быть списаны с исходящей карты в счёт входящей
▪	Сумма перевода не может превышать текущий остаток (баланс)
Пожелания к реализации
1)	Приложение – Spring Boot
2)	Слой доступа к данных. В качестве хранилища – любая СУБД (например, h2, mysql, postgresql и тд) либо текстовые файлы. Для доступа использовать jdbc/jooq/hibernate/java.io.* (в случае хранения в текстовых файлах)
3)	Веб-формы с использованием любого шаблонизатора, например thymeleaf
4)	Для передачи данных на веб форму с бэкенда должны быть реализованы контроллеры Spring MVC с необходимыми rest’ами