Цель домашнего задания

Поработать с методами equals, hashcode, toString и data class.

 

Что нужно сделать

Создайте класс Person со свойствами height (рост), weight (вес), name (имя).
Создайте два объекта класса Person с полностью одинаковыми параметрами.
Объявите изменяемый set для хранения Person. Добавьте два объекта внутрь.
Выведите количество итоговых элементов в сете.
Сделайте так, чтобы в сете в итоге был один объект. Для этого реализуйте методы equals и hashcode. Для реализации методов воспользуйтесь автоматической генерацией кода в Android Studio. В этих методах должны учитываться все свойства класса Person: height, weight, name.
Добавьте ещё один объект Person в сет, отличающийся от первых двух.
Выведите содержимое сета в консоль. Для этого реализуйте метод toString в классе Person. С помощью forEach выведите описание всех пользователей c их свойствами в консоль.
Создайте data class Animal с полями energy, weight, name.
Добавьте в класс Person поле pets, которое хранит hashSet домашних животных типа Animal.
Добавьте метод buyPet(), который создаёт объект класса Animal, проинициализированный случайными значениями полей, и добавляет его в pets.
У класса Person перегенерируйте методы equals, hashcode и toString с учётом нового поля pets.
Для каждой персоны из пункта №6 купите несколько домашних животных; проверьте, что в лог корректно выводится список домашних животных при обращении к полю pets.
 

Что оценивается

Названия переменных должны отражать суть данных, на которые они ссылаются.
Переменные, которые не изменяются в программе, должны быть объявлены неизменяемыми.
Различные выводы в консоль должны начинаться с новой строки.
Методы должны иметь корректную область видимости. Например, если метод или свойство не должны быть доступны извне, то у них должен быть модификатор private.
Названия классов и интерфейсов должны отражать их назначение.
Классы должны называться в соответствии с соглашениями.
Классы должны быть открыты для наследования (open) только в случае необходимости.
Методы должны быть открыты для переопределения (open) только в случае необходимости.
Должны быть выполнены все пункты задания.