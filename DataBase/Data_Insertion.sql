INSERT INTO doctors (first_name, last_name, speciality, phone_number, email)
VALUES
  ('Alice', 'Ngabire', 'Cardiology', '0788000001', 'alice.ngabire@example.com'),
  ('John', 'Twagirimana', 'Pediatrics', '0788000002', 'john.twagirimana@example.com'),
  ('Grace', 'Mukamana', 'Dermatology', '0788000003', 'grace.mukamana@example.com');
  INSERT INTO patients (first_name, last_name, date_of_birth, phone_number, email)
VALUES
  ('Eric', 'Niyonsaba', '1995-04-10', '0788000010', 'eric.niyonsaba@example.com'),
  ('Diane', 'Uwase', '1988-08-22', '0788000011', 'diane.uwase@example.com'),
  ('Jean', 'Mutabazi', '2000-01-15', '0788000012', 'jean.mutabazi@example.com');
  INSERT INTO OPPOINTMENTS (doctors_id, patient_id, appointment_date, status)
VALUES
  (1, 1, '2025-05-15 10:00:00', 'Scheduled'),
  (2, 2, '2025-05-16 14:30:00', 'Completed'),
  (3, 3, '2025-05-17 09:00:00', 'Canceled');
 
  INSERT INTO medical_records (patient_id, diagnosis, treatment, doctors_id)
VALUES
(1, 'cancel', 'Medication A', 1),
(2, 'Flu', 'Rest and fluids', 2),
(3, 'Acne', 'Cream X', 3),
(2, 'Allergy', 'Antihistamines', 1);

INSERT INTO doctor_patient (doctors_id, patient_id)
VALUES
(1, 1),
(2, 2),
(3, 3),
(1, 2); 