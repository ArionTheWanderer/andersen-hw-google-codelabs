# Домашние задания по Google Codelabs

Директории с окончанием Challenge - задания по Coding Challenge в соответствующих уроках

# Lesson 1
1.1: Android Studio and Hello World  
Раздел Coding Challenge - HelloWorldChallenge. Один экран с надписью "Happy birthday to me!" Логируется произвольное сообщение и выкинутая вручную ошибка.  

1.2 Part A: Your first interactive UI  
Раздел Coding Challenge - HelloToastChallenge. Изменил UI так, чтобы кнопки отображались слева от textView. TextView не перекрывается кнопками в обоих ориентациях.  

1.2 Part B: The layout editor  
Раздел Homework - HelloToast. 3 кнопки toast, zero и count слева от textView, выровнены по его левому краю и распределены по вертикали между верхней и нижней частью textView. Кнопка Zero имеет исходный серый фон, остальные - фиолетовый. Кнопка toast выводит toast. При нажатии кнопки count происходит увеличение счетчика в textView и изменение цвета кнопки в зависимости от четности значения счетчика. Когда счетчик становится > 0, меняется цвет кнопки zero. При обнулении счетчика нажатием кнопки zero меняются цвета кнопок zero и count на изначальные.  

1.3: Text and scrolling views  
Здесь Coding Challenge и Homework выполнены в одной директории, т.к. не перекрывают друг друга.  
Раздел Coding Challenge - ScrollingText. Добавил кнопку в LinearLayout внутри ScrollView, чтобы она прокручивалась вместе с текстом.  
Раздел Homework - ScrollingText. Изменил подзаголовок так, чтобы он был включен в столбец слева шириной 100dp. Текст статьи поместил справа от подзаголовка. Кнопка на месте.  

1.4: Learn to help yourself  
Раздел Homework - HelloToast и BasicTransitionProjectSample. Новые значки лаунчеров. BasicTransitionProjectSample - sample, скачанный с гитхаба из Android Studio (File -> New -> Import Sample).  

# Lesson 2
2.1: Activities and intents  
Раздел Coding Challenge - TwoActivitiesChallenge. На первом экране 3 кнопки. Каждая из них запускает SecondActivity и кладет в intent код соответствующий своему порядковому номер (1, 2, 3). На втором экране есть заголовок textView и ScrollView, содержащий статью textView. Activity устанавливает в них значения соответствующие пришедшему коду (например: заголовок статьи 1 и статья 1).  
Раздел Homework - HelloToast. Вместо замены кнопки toast на say hello я просто добавил кнопку say hello, чтобы не разрушать функциональность одной из предыдущих домашних работ. По нажатию кнопки say hello создается intent, куда записывается текущее значение счетчика и открывается SecondActivity. SecondActivity выводит надпись Hello! и устанавливает значение счетчика из интента в textView, следующий за textView Hello!.  

2.2: Activity lifecycle and state  
Раздел Homework - CounterHomework. Кнопка count инкрементит значение счетчика, отображаемого в textView. EditText просто существует. При изменении конфигурации сохраняется значение счетчика и заново устанавливается в textView. Сохранение состояния editText происходит автоматически.  
