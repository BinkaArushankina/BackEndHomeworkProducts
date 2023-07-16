package de.ait.backendhomeworkproducts.models;

import lombok.*;
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Products {
    private Long id;
    private String name;
    private int quantity;
    private boolean expired;

}
//1. Нужно пересмотреть урок
//2. Сделать аналогичный проект, но с товарами (Products, Goods)
//    - Название
//    - Количество
//    - Вышел срок годности или нет (boolean)
//3. В личку скинуть ссылку на проект и скриншот браузера со списков товаров