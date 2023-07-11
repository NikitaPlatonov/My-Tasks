![GitHub language count](https://img.shields.io/github/languages/count/NikitaPlatonov/My-Tasks) ![GitHub top language](https://img.shields.io/github/languages/top/NikitaPlatonov/My-Tasks) 
 
# Мои задачи
## Описание
Веб-приложение "Мои задачи" позволяет управлять своими задачами. Приложение написано на [Spring Boot](https://spring.io/projects/spring-boot) и запускается на локальной сети.
## Функционал
1. **Создание задачи.** Создать задачу можно двумя способами: С подробным описанием ее и без.
2. **Просмотр задач.** В приложении предусмотрено отдельная страница для просмотри и управления задачами.
3. **Удаление задач.** Удаление задач можно осуществить в окне *просмотра задач*.
## Пример использования
1. Создание задачи:


![гиф создания задачи](https://github.com/NikitaPlatonov/My-Tasks/blob/master/gifs/20230711_173145.gif)


2. Просмотр задач: 


![гиф анимация просмотра задач](https://github.com/NikitaPlatonov/My-Tasks/blob/master/gifs/20230711_173034.gif)


3. Удаление задач:


![гиф удаления задач](https://github.com/NikitaPlatonov/My-Tasks/blob/master/gifs/удаление.gif)


## Установка

Установка в Intellij IDEA:

1. Клонируйте репозиторий:

```git
git clone https://github.com/NikitaPlatonov/My-Tasks.git
```

2. Перейдите в каталог проекта:

```git
cd My-Tasks
```

3. Соберите проект с помощью инструмента сборки, такого как Apache Maven:

```git
mvn clean install
```

4. После успешной сборки проекта вы можете запустить его с помощью команды:

```git
java -jar target/название_файла.jar
```
> Замените название_файла.jar на фактическое имя JAR-файла, сгенерированного в результате сборки проекта.
## Требования

Для успешной установки и работы данного проекта необходимо удовлетворять следующим требованиям:

* Java Development Kit (JDK) версии 17 или выше. Вы можете [скачать JDK](https://www.oracle.com/java/technologies/downloads/#java17) с официального веб-сайта Oracle или использовать другой надежный источник.

* Установленная среда разработки (например, IntelliJ IDEA, Eclipse и т. д.) для открытия проекта и удобной разработки.

* Apache Maven для сборки проекта и управления зависимостями. Вы можете [скачать Apache Maven](https://maven.apache.org/download.cgi) и следовать инструкциям по его установке.

* Все необходимые зависимости указаны в pom-файле репозитория.
