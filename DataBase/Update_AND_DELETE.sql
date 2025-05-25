SELECT p.*
FROM oppointments o
JOIN patients p ON o.patient_id = p.id
WHERE o.doctors_id = 1; 

SELECT *
from medical_records 
where patient_id = 2;

SELECT d.id,d.first_name,d.last_name ,COUNT(O.id) AS total_oppointments 	
from doctors d
left join oppointments o ON d.id = o.doctors_id
group by d.id,d.first_name,d.last_name 
order by total_Oppointments asc;


SELECT d.id,d.first_name,d.last_name,COUNT(dp.patient_id) AS total_patients
from doctors d
left join doctor_patient dp ON d.id =dp.doctors_id
group by d.id,d.first_name,d.last_name
order by total_patients DESC

update oppointments
set status = 'Completed'
where id = 1;

delete from patients
where id = 2;


delete from  patients
where id =2;

select d.id,d.first_name,d.last_name,COUNT(dp.patient_id) AS total_patients
from doctors d 
JOIN doctor_patient dp ON d.id = dp.doctors_id
group by  d.id, d.first_name, d.last_name
HAVING COUNT(dp.patient_id) > 5;

SELECT p.id, p.first_name, p.last_name, COUNT(m.id) AS diagnosis_count
FROM patients p
JOIN medical_records m ON p.id = m.patient_id
GROUP BY p.id, p.first_name, p.last_name
HAVING COUNT(m.id) > 1;

SELECT 
    DATE_TRUNC('month', appointment_date) AS month,
    COUNT(*) AS total_appointments
FROM oppointments
GROUP BY DATE_TRUNC('month', appointment_date)
ORDER BY month;

ALTER TABLE doctors
ADD CONSTRAINT unique_doctor_email UNIQUE (email);

ALTER TABLE patients
ADD CONSTRAINT unique_patient_email UNIQUE (email);

CREATE INDEX idx_appointment_date ON oppointments(appointment_date)