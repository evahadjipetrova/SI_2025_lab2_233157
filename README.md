# SI_2025_lab2_233157
**Име:** Ева 
**Презиме:** Хаџипетрова 
**Индекс:** 233157
## Контролен дијаграм (Control Flow Graph)
![Control Flow Graph](https://github.com/evahadjipetrova/SI_2025_lab2_233157/blob/main/Lab2CFG.drawio.png?raw=true)
## Цикломатска комплексност
Цикломатската комплексност на овој граф е 6. Истата ја добив преку формулата M=P+1, каде М-цикломатска комплексност, а Р-број на предикатни јазли Р=5
## Тест случаи според критериумот Every statement
За да го покриеме секој Statement во кодот, потребни ни се барем 9 тест случаи.

тест 1- случај во кој се проверува дали allitems e null

тест 2,3- случај во кој се проверува дали item.getName() е null или празно 

тест 4,5,6- случај во кој се проверува условот item.getPrice() > 300 || item.getDiscount() > 0 || item.getQuantity() > 10

тест 7- се проверува условот item.getDiscount() > 0

тест 8- се проверува дали cardNumber не е null и дали cardNumber.length() е 16

тест 9- дали allowed.indexOf(c) е -1
## Тест случаи според критериумот Multiple Condition 
Условот што се тестира: 

if (item.getPrice() > 300 || item.getDiscount() > 0 || item.getQuantity() > 10)

Овој услов има три подуслови:

A: item.getPrice() > 300

B: item.getDiscount() > 0

C: item.getQuantity() > 10

Според критериумот за Multiple Condition, потребно е да ги покриеме сите можни комбинации на True/False вредности на овие три услови. Тоа значи дека се потребни 8 тест случаи, бидејќи 2³ = 8.
