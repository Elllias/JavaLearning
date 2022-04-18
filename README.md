# JavaLearning

#### Задание:

1) Создать 3 профиля - dev, test, prod, каждый из которых будет включать в себя:
    <br>1.1) конфиг с листом из нескольких значений
    <br>1.2) название приложения
    <br>1.3) конфиг с переменной окружения, по дефолту значение - default
2) 3 бина:
    <br>2.1) один создается, только если профиль test,
    <br>2.3) другой, если существует первый бин,
    <br>2.3) третий, если в конфиге с не “default” (тут в идеале со скриншотом)


### Я решил задание 4 и подумал, что будет легче проверять, как все работает, если я скину скрины:

#### ЧАСТЬ 1:

1. Если наш профиль обычный:

![NoCong](https://user-images.githubusercontent.com/74401943/161486194-8aad0dfd-d320-46e2-886b-313d84d7ba87.png)


2. Если наш профиль dev:

![dev](https://user-images.githubusercontent.com/74401943/161486225-bc68f05d-6a8d-4cba-afa9-e450bc711aec.png)


3. Если наш профиль prod:

![prod](https://user-images.githubusercontent.com/74401943/161486261-3269590b-4944-48d2-bb63-b16acc284433.png)


4. Если наш профиль test:

![test](https://user-images.githubusercontent.com/74401943/161486300-9bfa8483-b9f0-4f5d-b9a3-1435f5d7415d.png)


#### ЧАСТЬ 2:

Работа бинов, если профиль test:

![beans](https://user-images.githubusercontent.com/74401943/161486378-b09e342a-c957-4ac7-87a9-6b5e5fc3e1fb.png)

