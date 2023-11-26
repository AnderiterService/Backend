INSERT INTO family_status (status)
VALUES ('Холост'),
       ('Женат/Замужем'),
       ('В разводе');

INSERT INTO clients (name, surname, father_name, date_birth, passport,
                     location_reg, location_life, family_status_id, children,
                     workplace, work_experience, work_position, monthly_income,
                     additional_income, additional_income_source_name, has_bank_account)
VALUES ('John', 'Doe', 'Mike', '1990-05-15', 'AB123456', 'City1', 'City2', 1, TRUE, 'Company A', '2005-01-01',
        'Manager', 50000,
        10000, 'Part-time job', TRUE),
       ('Alice', 'Smith', 'David', '1985-08-22', 'CD987654', 'Town1', 'Town3', 2, FALSE, 'Company B', '2008-01-01',
        'Engineer',
        60000, NULL, NULL, FALSE),
       ('Bob', 'Johnson', 'Sam', '1993-04-10', 'EF543219', 'Village2', 'City5', 3, TRUE, NULL, '2015-01-01',
        'Assistant', 45000,
        8000, 'Freelance work', TRUE),
       ('Eva', 'Williams', 'Paul', '1998-11-28', 'GH123987', 'City3', 'City4', 1, TRUE, 'Company C', '2000-01-01',
        'Analyst',
        55000, NULL, NULL, TRUE);

INSERT INTO clients (children, family_status_id, has_bank_account, work_experience, additional_income, monthly_income,
                     additional_income_source_name, date_birth, father_name, location_life, location_reg, name,
                     passport, surname, work_position, workplace)
VALUES (TRUE, 1, TRUE, '2013-01-01', 2000, 50000, 'Source1', '1990-01-01', 'John', 'Location1', 'Location2', 'Client 1',
        'Passport1', 'Surname1', 'Position1', 'Workplace1'),
       (FALSE, 2, FALSE, '2019-01-01', NULL, 60000, NULL, '1988-02-02', 'Alice', 'Location3', 'Location4', 'Client 2',
        'Passport2',
        'Surname2', 'Position2', 'Workplace2'),
       (TRUE, 3, TRUE, '2011-01-01', 8000, 45000, 'Source3', '1995-03-03', 'Bob', 'Location5', 'Location6', 'Client 3',
        'Passport3', 'Surname3', 'Position3', NULL),
       (TRUE, 1, TRUE, '2013-01-01', 2000, 50000, 'Source1', '1990-01-01', 'John', 'Location1', 'Location2', 'Client 4',
        'Passport4', 'Surname4', 'Position4', 'Workplace4'),
       (FALSE, 2, FALSE, '2012-02-01', NULL, 60000, NULL, '1988-02-02', 'Alice', 'Location3', 'Location4', 'Client 5',
        'Passport5',
        'Surname5', 'Position5', 'Workplace5'),
       (TRUE, 3, TRUE, '2013-01-01', 8000, 45000, 'Source3', '1995-03-03', 'Bob', 'Location5', 'Location6', 'Client 6',
        'Passport6', 'Surname6', 'Position6', NULL);

INSERT INTO docs (file, client_id, doc_name)
VALUES (100, 1, 'Document1'),
       (200, 2, 'Document2'),
       (300, 3, 'Document3'),
       (400, 4, 'Document4'),
       (500, 5, 'Document5'),
       (600, 6, 'Document6'),
       (700, 7, 'Document7'),
       (800, 8, 'Document8'),
       (900, 9, 'Document9'),
       (1000, 10, 'Document10');
INSERT INTO delays (type)
VALUES ('1-30'),
       ('31-60'),
       ('61-90'),
       ('91-150'),
       ('>180');

INSERT INTO roles (role)
VALUES ('Заемщик'),
       ('Поручитель'),
       ('Созаемщик');

INSERT INTO type_of_loan (type)
VALUES ('Кредит'),
       ('Залог');



INSERT INTO status_of_obligation (status)
VALUES ('Текущий'),
       ('Завершенный');

INSERT INTO bki (client_id, score)
VALUES (1, 80),
       (2, 75),
       (3, 90),
       (4, 85),
       (5, 70),
       (6, 95),
       (7, 78),
       (8, 92),
       (9, 87),
       (10, 60);


INSERT INTO loan_information (balance_due, interest_rate, overdue_amount, sum, bki_id, client_id, date_from, date_to,
                              delay, final_date, role, status, type, monthly_pay)
VALUES (10000.00, 5.0, 200.00, 1200.00, 1, 1, '2023-01-01', '2023-12-31', 1, '2024-01-01', 1, 1, 1, 3445),
       (15000.00, 6.0, 300.00, 1800.00, 2, 2, '2023-02-01', '2023-12-31', 2, '2024-02-01', 2, 2, 2, 3445),
       (20000.00, 7.0, 400.00, 2400.00, 3, 3, '2023-03-01', '2023-12-31', 3, '2024-03-01', 3, 1, 1, 3445),
       (10000.00, 5.0, 200.00, 1200.00, 1, 1, '2023-01-01', '2023-12-31', 1, '2024-01-01', 1, 1, 1, 3445),
       (15000.00, 5.5, 200.00, 1700.00, 2, 2, '2023-02-01', '2023-12-31', 2, '2024-02-01', 2, 2, 2, 3445),
       (20000.00, 6.0, 400.00, 2400.00, 3, 1, '2023-03-01', '2023-12-31', 3, '2024-03-01', 3, 1, 1, 13445),
       (20000.00, 6.0, 400.00, 2400.00, 3, 3, '2023-03-01', '2023-12-31', 3, '2024-03-01', 3, 1, 1, 13445),
       (25000.00, 6.5, 600.00, 3100.00, 4, 4, '2023-04-01', '2023-12-31', 4, '2024-04-01', 4, 2, 1, 64533),
       (30000.00, 7.0, 800.00, 3800.00, 5, 1, '2023-05-01', '2023-12-31', 5, '2024-05-01', 5, 2, 2, 6453),
       (3500.00, 7.5, 1000.00, 4500.00, 6, 6, '2023-06-01', '2023-12-31', 4, '2024-06-01', 6, 1, 1, 3445),
       (4000.00, 8.0, 1200.00, 5200.00, 7, 7, '2023-07-01', '2023-12-31', 3, '2024-07-01', 7, 2, 1, 34);


INSERT INTO request_status (status)
VALUES ('Новая'),
       ('В разработке'),
       ('Дозапрос информации'),
       ('На доработке');


INSERT INTO requests (sla_id, start_timestamp, status_id, uid, application_analysis, credit_history_analysis,
                      final_decision)
VALUES (TIMESTAMP '2023-01-01 12:00:00', 1234567890, 1, 1001, 'Analysis 1', 'Credit History 1', 'Decision 1'),
       (TIMESTAMP '2023-02-02 12:00:00', 2345678901, 2, 1002, 'Analysis 2', 'Credit History 2', 'Decision 2'),
       (TIMESTAMP '2023-03-03 12:00:00', 3456789012, 1, 1003, 'Analysis 3', 'Credit History 3', 'Decision 3'),
       (TIMESTAMP '2023-04-04 12:00:00', 4567890123, 1, 1004, 'Analysis 4', 'Credit History 4', 'Decision 4'),
       (TIMESTAMP '2023-05-05 12:00:00', 5678901234, 1, 1005, 'Analysis 5', 'Credit History 5', 'Decision 5'),
       (TIMESTAMP '2023-06-06 12:00:00', 6789012345, 1, 1006, 'Analysis 6', 'Credit History 6', 'Decision 6'),
       (TIMESTAMP '2023-07-07 12:00:00', 7890123456, 2, 1007, 'Analysis 7', 'Credit History 7', 'Decision 7'),
       (TIMESTAMP '2023-08-08 12:00:00', 8901234567, 1, 1008, 'Analysis 8', 'Credit History 8', 'Decision 8'),
       (TIMESTAMP '2023-09-09 12:00:00', 9012345678, 1, 1009, 'Analysis 9', 'Credit History 9', 'Decision 9'),
       (TIMESTAMP '2023-10-10 12:00:00', 1234567890, 2, 1010, 'Analysis 10', 'Credit History 10', 'Decision 10');


INSERT INTO client_requests (client_id, request_uid, role_id)
VALUES (1, 1, 1),
       (2, 1, 2),
       (3, 1, 3),
       (5, 2, 1),
       (6, 3, 1),
       (7, 5, 1),
       (8, 8, 1),
       (9, 8, 2);