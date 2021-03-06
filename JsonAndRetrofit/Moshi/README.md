# Обмен данными по сети. Библиотека Retrofit
### Moshi

Задача
Цели домашнего задания
Поработать с библиотекой Moshi, научиться сериализовать объекты в JSON и десериализовать JSON в объекты.



Что нужно сделать
Реализуйте получение фильма по названию. Для этого используйте OMDB API с URL: http://www.omdbapi.com/?t=title. За основу можете взять код из предыдущего модуля.
Десериализуйте фильм, вернувшийся с сервера, с помощью библиотеки Moshi.
У фильма должны быть следующие свойства:
название — строка;
год — число;
рейтинг — enum;
жанр — строка;
постер — URL;
оценки — список объектов класса «Оценки».
У оценок должны быть следующие свойства:
источник оценки — строка;
оценка — строка.
Отобразите полученный фильм на экране.
Обработайте ситуацию, когда фильм не найден по заголовку.
Измените класс фильма. Оценки должны представлять из себя объект типа Map<String, String>. Чтобы десериализация прошла корректно, напишите класс адаптера, который будет преобразовывать List<MovieScore> в Map<String, String>.
Добавьте на экран кнопку «Добавить оценку», по нажатию на которую фильму будет присваиваться оценка.
Добавление оценки реализуйте по желанию: можно настроить добавление случайной оценки программно или вводить вручную источник и значение оценки в диалоге/экране добавления оценки.
После добавления оценки сериализуйте объект класса фильма в JSON и выведите его в лог.


Критерии оценки
Код оформлен в соответствии с правилами Coding conventions.
Соблюдён принцип инкапсуляции с помощью модификаторов доступа.
Классы являются нефинальными (open, abstract) только при необходимости.
Текстовые строки не захардкожены и используются из ресурсов.
Код разнесён по сущностям в соответствии с их ответственностями.
Выполнены все пункты задания.
