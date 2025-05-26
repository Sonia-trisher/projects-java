public class quetions {
//    Task 1: Database and Table Creation
    
//1. Create a database named HospitalManagement .



//2. Create the following tables:

//doctors:
//id : Primary key, auto-incremented identifier for each doctor.
//first_name : Stores the first name of the doctor.
//last_name : Stores the last name of the doctor.
//specialty : Represents the area of expertise of the doctor (e.g., Cardiology, Pediatrics).
//phone_number : Contact number of the doctor.
//email : Unique email address for communication.
//created_at : Timestamp of when the doctor was added to the system.


//patients:
//id : Primary key, auto-incremented identifier for each patient.
//first_name : Stores the first name of the patient.
//last_name : Stores the last name of the patient.
//date_of_birth : Stores the birth date of the patient.
//gender : Indicates the gender of the patient.
//phone_number : Contact number of the patient.
//email : Unique email address for communication.
//created_at : Timestamp of when the patient was added to the system.


//appointments:
//id : Primary key, auto-incremented identifier for each appointment.
//doctor_id : Foreign key that links to the id of the doctor (One-to-Many relationship).
//patient_id : Foreign key that links to the id of the patient (One-to-Many relationship).
//appointment_date : The scheduled date and time for the appointment.
//status : Indicates the status of the appointment (e.g., Scheduled, Completed, Canceled).
//created_at : Timestamp of when the appointment was created.


//medical_records:
//id : Primary key, auto-incremented identifier for each medical record.
//patient_id : Foreign key linking to the id of the patient.
//diagnosis : Stores the diagnosis information.
//treatment : Details about the treatment prescribed.
//doctor_id : Foreign key linking to the id of the doctor who handled the case.
//created_at : Timestamp of when the medical record was created.


//Task 2: Relationships
//1. Establish the following relationships:
//One-to-Many: A doctor can have multiple appointments, but each appointment is linked to one doctor.
//One-to-Many: A patient can have multiple medical records, but each medical record is linked to one patient.
//Many-to-Many: Patients can have many doctors, and doctors can have many patients (Implement this through a pivot
//table named doctor_patient ).


//Task 3: Data Insertion
//1. Insert sample data into doctors and patients .
//2. Create some appointments and medical records using the IDs from doctors and patients .


//Task 4: Queries
//1. Retrieve all patients who have appointments with a specific doctor.
//2. List all medical records for a specific patient.
//3. Find the total number of appointments for each doctor.
//4. Display the list of doctors and the number of patients they are attending to.

//Task 5: Update and Delete
//1. Update the status of an appointment.
//2. Delete a patient's record from the system and handle all related records properly (cascade delete where necessary).



//Task 6: Advanced Queries
//1. Retrieve the list of doctors who have more than 5 patients.
//2. Get the list of patients who have been diagnosed more than once.
//3. Display the total number of appointments scheduled per month.


//Task 7: Constraints and Indexing
//1. Apply constraints to prevent duplicate entries for emails in both doctors and patients .
//2. Create indexes to optimize search on appointments based on appointment_date .
//Submission
}
