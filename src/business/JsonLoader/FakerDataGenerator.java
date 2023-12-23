/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.JsonLoader;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;


/**
 *
 * @author adwaitrelekar
 */

public class FakerDataGenerator {
    
    public static void main(String[] args) {
        
        // Employer Organization
        Map<String, Object> employerOrg = new LinkedHashMap<>();
        employerOrg.put("name", "LDC");
        employerOrg.put("industry", "Fintech");
        employerOrg.put("country", "India");

        // Employee Array
        Map<String, Object>[] employees = new LinkedHashMap[3];

        // Creating Employee objects
        employees[0] = createEmployee("Hiring Manager", "hm@gmail.com", "123213122", "Male", 23, "h", "h", "HiringManagerRole");
        employees[1] = createEmployee("admin", "admin@gmail.com", "123213122", "Male", 23, "a", "a", "AdminRole");
        employees[2] = createEmployee("Recruiter", "r@gmail.com", "123213122", "Male", 23, "r", "r", "RecruiterRole");

        // JobRole Array
        Map<String, Object>[] jobRoles = new LinkedHashMap[4];

        // Creating JobRole objects
        jobRoles[0] = createJobRole("SDE-1", "Technology", "Software development", "Boston", 56.5, "Fall 2024");
        jobRoles[1] = createJobRole("SDE-2", "Technology", "Software development", "NY", 100.5, "Spring 2024");
        jobRoles[2] = createJobRole("Sales Representative", "Sales", "Software development", "Boston", 41.5, "Fall 2024");
        jobRoles[3] = createJobRole("Digital Marketing Executive", "Marketing", "Software development", "TX", 66.5, "Spring 2024");

        // Creating the final structure in order
        Map<String, Object> jsonObject = new LinkedHashMap<>();
        jsonObject.put("EmployerOrganization", employerOrg);
        jsonObject.put("Employee", employees);
        jsonObject.put("JobRole", jobRoles);

        // Writing to a file
        try (FileWriter file = new FileWriter("src/data/InputData.json")) {
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            file.write(gson.toJson(jsonObject));
            file.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    
 
    }
    
    private static Map<String, Object> createEmployee(String name, String email, String contactNumber, String gender, int age, String username, String password, String role) {
        Map<String, Object> person = new LinkedHashMap<>();
        person.put("name", name);
        person.put("emailAddress", email);
        person.put("contactNumber", contactNumber);
        person.put("__gender", "Male / Female");
        person.put("gender", gender);
        person.put("age", age);

        Map<String, Object> userAccount = new LinkedHashMap<>();
        userAccount.put("username", username);
        userAccount.put("password", password);

        Map<String, Object> employee = new LinkedHashMap<>();
        employee.put("Person", person);
        employee.put("UserAccount", userAccount);
        employee.put("Role", role);

        return employee;
    }

    private static Map<String, Object> createJobRole(String name, String domain, String description, String location, double pay, String intakePeriod) {
        Map<String, Object> jobRole = new LinkedHashMap<>();
        jobRole.put("name", name);
        jobRole.put("domain", domain);
        jobRole.put("description", description);
        jobRole.put("location", location);
        jobRole.put("pay", pay);
        jobRole.put("intakePeriod", intakePeriod);

        return jobRole;
    }
    
//    private static String formatJson(JSONObject jsonObject) {
//        return jsonObject.toString(4); // Indentation of 4 spaces
//    }
}
