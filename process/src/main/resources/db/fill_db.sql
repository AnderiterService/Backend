INSERT INTO clients (
    name, surname, father_name, date_birth, passport,
    location_reg, location_life, family_status, children,
    workplace, work_experience, work_position, monthly_income,
    additional_income, additional_income_source_name, has_bank_account
) VALUES
      ('John', 'Doe', 'Mike', '1990-05-15', 'AB123456', 'City1', 'City2', 1, TRUE, 'Company A', 5, 'Manager', 50000, 10000, 'Part-time job', TRUE),
      ('Alice', 'Smith', 'David', '1985-08-22', 'CD987654', 'Town1', 'Town3', 2, FALSE, 'Company B', 3, 'Engineer', 60000, NULL, NULL, FALSE),
      ('Bob', 'Johnson', 'Sam', '1993-04-10', 'EF543219', 'Village2', 'City5', 3, TRUE, NULL, 2, 'Assistant', 45000, 8000, 'Freelance work', TRUE),
      ('Eva', 'Williams', 'Paul', '1998-11-28', 'GH123987', 'City3', 'City4', 1, TRUE, 'Company C', 4, 'Analyst', 55000, NULL, NULL, TRUE);


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