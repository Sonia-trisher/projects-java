CREATE TABLE IF NOT EXISTS doctors(
id INT PRIMARY KEY,
fast_name VARCHAR(30),
last_name VARCHAR(30),
speciality VARCHAR(30),
email VARCHAR(30),
CREATE_AT TIMESTAMP DEFAULT CURRENT_TIMESTAMP 
);
CREATE TABLE IF NOT EXISTS Patients(
id INT PRIMARY KEY,
fast_name VARCHAR(30),
last_name VARCHAR(30),
DATE_OF_BIRTH DATE,
email VARCHAR(30),
phone_number INT,
CREATE_AT TIMESTAMP DEFAULT CURRENT_TIMESTAMP 
);
CREATE TABLE IF NOT EXISTS OPPOINTMENTS(
id INT PRIMARY KEY,
doctors_id int references doctors(id),
patient_id int references patients(id),
appointment_date timestamp,
status VARCHAR(10),
phone_number INT,
CREATE_AT TIMESTAMP DEFAULT CURRENT_TIMESTAMP 
);
CREATE TABLE IF NOT EXISTS medical_records(
id INT PRIMARY KEY,
patient_id int references patients(id) ON DELETE CASCADE,
diagnosis VARCHAR(10),
treatment VARCHAR(30),
doctors_id int references doctors(id)ON DELETE CASCADE,
CREATE_AT TIMESTAMP DEFAULT CURRENT_TIMESTAMP 
);
