# JavaLearning

### Задание:

<pre>
Реализовать приложение с разделением прав доступа

АПИ:	
  1. public/api - доступ разрешен для всех
  2. admin/api - доступ разрешен для пользователей с ролью admin
  3. support/api - доступ разрешен для пользователей с ролью support
	
Все приватные АПИ должны возвращать имя и роль пользователя
Хранение пользователей в памяти приложения (использование InMemoryUserDetailsManager)
Для хеширования паролей использовать BCryptPasswordEncoder
Basic аутентификация
</pre>

### Скрины демонстрации работы:

#### Заходим под SUPPORT'ом:

![image](https://user-images.githubusercontent.com/74401943/163111509-bdd8915f-1668-4c1d-aa43-d6d2b6f8b755.png)
![image](https://user-images.githubusercontent.com/74401943/163111364-9b2b0ef5-b114-4ef1-8021-94b83aa57364.png)
![image](https://user-images.githubusercontent.com/74401943/163111422-38868020-9684-4c17-bd97-669a2b953111.png)

#### Заходим под ADMIN'ом: 

![image](https://user-images.githubusercontent.com/74401943/163111680-a1a19379-1328-475c-affb-625a8039d0da.png)
![image](https://user-images.githubusercontent.com/74401943/163111724-042aa18b-dae5-4cf2-b22c-ef90bcd3b894.png)
![image](https://user-images.githubusercontent.com/74401943/163111738-761a59cf-559c-4404-87fd-4e3971a5456e.png)

#### Заходим любым пользователем на public/api:

![image](https://user-images.githubusercontent.com/74401943/163111831-57878237-1da0-4900-991c-b000c1c64d91.png)
