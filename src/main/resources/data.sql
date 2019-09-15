INSERT INTO library_system.author (author_id, first_name, last_name) VALUES 
(1, 'Bryan', 'Basham'),
(2, 'Kathy', 'Sierra'),
(3, 'Bert', 'Bates'),
(4, 'Brian', 'Goetz'),
(5, 'Joshua', 'Bloch'),
(6, 'Harry', 'Harrison'),
(7, 'Александр', 'Пушкин'),
(8, 'Михайло', 'Коцюбинський');

INSERT INTO library_system.book (book_id, title, year, description) VALUES
(1, 'Servlets&JSP', 2008, "This book will get you way up to speed on the technology you'll know it so well, in fact, that you can pass the brand new J2EE 1.5 exam. If that's what you want to do, that is. Maybe you don't care about the exam, but need to use servlets and JSPs in your next project. You're working on a deadline. You're over the legal limit for caffeine. You can't waste your time with a book that makes sense only AFTER you're an expert (or worse, one that puts you to sleep)."),
(2, 'Java Concurrency in Practice', 2010, "Threads are a fundamental part of the Java platform. As multicore processors become the norm, using concurrency effectively becomes essential for building high-performance applications. Java SE 5 and 6 are a huge step forward for the development of concurrent applications, with improvements to the Java Virtual Machine to support high-performance, highly scalable concurrent classes and a rich set of new concurrency building blocks."),
(3, 'Effective Java', 2018, "The Definitive Guide to Java Platform Best Practices–Updated for Java 7, 8, and 9"),
(4, 'The Stainless Steel Rat', 1994, "In the vastness of space, the crimes just get bigger and Slippery Jim diGriz, the Stainless Steel Rat, is the biggest criminal of them all. He can con humans, aliens and any number of robots time after time. Jim is so slippery that all the inter-galactic cops can do is make him one of their own"),
(5, 'Капитанская дочка', 2002, '"Капитанская дочка" - роман, в котором удивительным образом сплелись исторические факты, фольклор, предания и рассказы очевидцев пугачевского восстания и авторский вымысел. Знакомство с героями романа - путь к познанию русского национального характера - его силы и слабости, наивности и величественности, вспыльчивости и великодушия.'),
(6, 'Тіні забутих предків', 2012, '“Тіні забутих предків” Михайла Коцюбинського (1864-1913) - шедевр української літератури. Серед таємничої природи Карпат розгортається історія кохання юних Івана та Марічки. Ні ворожість сімей, ні життєві випробування, ні навіть смерть не змогли стати на перешкоді цьому почуттю.');

INSERT INTO library_system.book_author (author_id, book_id) VALUES
(1, 1),
(2, 1),
(3, 1),
(4, 2),
(5, 2),
(5, 3),
(6, 4),
(7, 5),
(8, 6);

INSERT INTO library_system.keyword (keyword_id, word) VALUES
(1, 'IT'),
(2, 'Java'),
(3, 'English'),
(4, 'Русский'),
(5, 'Українська');

INSERT INTO library_system.book_keyword (book_id, keyword_id) VALUES
(1, 1),
(2, 1),
(3, 1),
(1, 2),
(2, 2),
(3, 2),
(1, 3),
(2, 3),
(3, 3),
(4, 3),
(5, 4),
(6, 5);

INSERT INTO library_system.bookcase (bookcase_id, shelf_quantity, cell_quantity) value (1, 2, 4);

INSERT INTO library_system.location (location_id, bookcase_id, shelf_number, cell_number, book_id, is_occupied) VALUES
(1, 1, 1, 1, 1, true),
(2, 1, 1, 2, 1, false),
(3, 1, 1, 3, 2, true),
(4, 1, 1, 4, 2, true),
(5, 1, 2, 1, 3, true),
(6, 1, 2, 2, 4, true),
(7, 1, 2, 3, 5, true),
(8, 1, 2, 4, 6, true);

/*Passwords are hashed. Admin's password is "officer", users' password is "borrower"*/
INSERT INTO library_system.user (user_id, email, password, phone, first_name, last_name, role, karma) VALUES
(1, 'admin@gmail.com', '��íӴ�c��bz˩�#�!�6-��9�����y*m<�U�n�I�3������e:', '+49257367367', 'Linus', 'Torvalds', 0, 3),
(2, 'borrower@gmail.com', 'M�鹴4 �d�dF��Qrh�5q�d�%/��Ɨ�<����8���:������Gl0�V�jcG', '+380501112233', 'Evgeniy', 'Kovalchuk', 1, 3),
(3, 'evil_user@mail.ru', 'm��=/箠s�yI��ɾ�MѦ��F)��!��%�:�f��?|�nUއUqrgu��Z��ď�-w�', '+380631234567', 'Tomas', 'Smith', 1, 2),
(4, 'sweetie@yahoo.com', 'm��=/箠s�yI��ɾ�MѦ��F)��!��%�:�f��?|�nUއUqrgu��Z��ď�-w�', '+380675557777', 'Nastya', 'Stremilova', 1, 3);


INSERT INTO library_system.loan (loan_id, book_id, user_id, apply_date, loan_date, expired_date, return_date) VALUES
(1, 3, 4, '2019-03-07', '2019-03-07', '2019-04-07', '2019-04-03'),
(2, 6, 3, '2019-02-14', '2019-02-14', '2019-03-14', '2019-04-14'),
(3, 1, 3, SUBDATE(CURDATE(), INTERVAL 10 DAY), SUBDATE(CURDATE(), INTERVAL 10 DAY), ADDDATE(CURDATE(), INTERVAL 20 DAY), NULL),
(4, 1, 2, curdate(), NULL, NULL, NULL),
(5, 2, 4, curdate(), NULL, NULL, NULL);
