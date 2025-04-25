INSERT INTO ingredients (name, allergen) VALUES
( 'Tomato', 0),
( 'Cheese', 1),
( 'Chicken', 0),
( 'Lettuce', 0),
( 'Chocolate', 1);

INSERT INTO options (name, description, price) VALUES
('Extra Cheese', 'Add more cheese', 1.50),
('No Onion', 'Remove onions', 0.00);

INSERT INTO meals (title, description, image, type) VALUES
('Chicken Salad', 'A fresh salad with grilled chicken', 'chicken_salad.jpg', 'MAIN_MEAL'),
('Chocolate Cake', 'Delicious chocolate dessert', 'chocolate_cake.jpg', 'DESSERT_MEAL');

INSERT INTO meal_ingredients (ingredient_id, meal_id) VALUES
(3, 1),
(4, 1),
(5, 2);

INSERT INTO orders (price, paid, datetime_order, email, pay_method, reference) VALUES
(15.99, 1, '2025-02-28 12:34:56', 'customer@example.com', 'Credit Card', 'ORD12345');

INSERT INTO menus (dessert_meal_id, main_meal_id, eat_date, order_id) VALUES
(2, 1, '2025-03-01', 1);

INSERT INTO menu_options (menu_id, option_id) VALUES
(1, 1);
