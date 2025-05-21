CREATE TABLE IF NOT EXISTS doctors(
id SERIAL PRIMARY KEY,
first_name VARCHAR(30),
last_name VARCHAR(30),
speciality VARCHAR(30),
phone_number INT,
email VARCHAR(30),
CREATE_AT TIMESTAMP DEFAULT CURRENT_TIMESTAMP 
);
CREATE TABLE IF NOT EXISTS Patients(
id SERIAL PRIMARY KEY,
first_name VARCHAR(30),
last_name VARCHAR(30),
DATE_OF_BIRTH DATE,
email VARCHAR(30),
phone_number INT,
CREATE_AT TIMESTAMP DEFAULT CURRENT_TIMESTAMP 
);
CREATE TABLE IF NOT EXISTS OPPOINTMENTS(
id SERIAL PRIMARY KEY,
doctors_id int references doctors(id)ON DELETE CASCADE,
patientS_id int references patients(id),
appointment_date timestamp,
status VARCHAR(10),
phone_number INT,
CREATE_AT TIMESTAMP DEFAULT CURRENT_TIMESTAMP 
);
CREATE TABLE IF NOT EXISTS medical_records(
id SERIAL PRIMARY KEY,
patient_id int references patients(id) ON DELETE CASCADE,
diagnosis VARCHAR(10),
treatment VARCHAR(30),
doctors_id int references doctors(id)ON DELETE CASCADE,
CREATE_AT TIMESTAMP DEFAULT CURRENT_TIMESTAMP 
);
CREATE TABLE IF NOT EXISTS doctor_patient(
id SERIAL PRIMARY KEY,
patient_id int references patients(id) ON DELETE CASCADE,
doctors_id int references doctors(id)ON DELETE CASCADE,
CREATE_AT TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);