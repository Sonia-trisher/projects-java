INSERT INTO patients (first_name, last_name, date_of_birth, phone_number, email)
VALUES
('Eric', 'Niyonsaba', '1995-04-10', '0788000010', 'eric.niyonsaba@example.com'),
('Diane', 'Uwase', '1988-08-22', '0788000011', 'diane.uwase@example.com'),
('Jean', 'Mutabazi', '2000-01-15', '0788000012', 'jean.mutabazi@example.com'),
('davis', 'iraduha', '2000-01-15', '0788000013', 'davis@example.com');

INSERT INTO doctors (first_name, last_name, speciality, phone_number, email)
VALUES
('Alice', 'Ngabire', 'Cardiology', '0788000001', 'alice.ngabire@example.com'),
('John', 'Twagirimana', 'Pediatrics', '0788000002', 'john.twagirimana@example.com'),
('Grace', 'Mukamana', 'Dermatology', '0788000003', 'grace.mukamana@example.com'),
('sonia', 'uwamahoro', 'Dermatology', '0788009003', 'uwamahorosonia@example.com');

INSERT INTO OPPOINTMENTS (doctors_id, patient_id, appointment_date, status)
VALUES
(1, 2, '2025-05-15 10:00:00', 'Scheduled'),
(4, 3, '2025-05-16 14:30:00', 'Completed'),
(2, 1, '2025-05-17 09:00:00', 'Canceled');

INSERT INTO medical_records (patient_id, diagnosis, treatment, doctors_id)
VALUES
(1, 'cancel', 'Medication A', 1),
(3, 'Flu', 'Rest and fluids', 1),
(2, 'Acne', 'Cream X', 2),
(4, 'Allergy', 'Antihistamines', 3);

INSERT INTO doctor_patient (doctors_id, patient_id)
VALUES
(3, 1),
(4, 2),
(2, 2),
(1, 4);