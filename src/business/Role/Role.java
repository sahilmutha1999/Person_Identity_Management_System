/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.Role;

/**
 *
 * @author meetb007
 */
public abstract class Role {
    
    public enum RoleType {
        Admin("Admin"),
        Applicant("Applicant"),
        University("University"),
        Employer("Employer"),
        HiringManager("HiringManager"),
        Recruiter("Recruiter"),
        PublicationAuthority("PublicationAuthority"),
        CertificationAuthority("CertificationAuthority"),
        AdmissionCommittee("AdmissionCommittee"),
        Registrar("Registrar"),
        Professor("Professor");

        private String value;

        private RoleType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }

    public RoleType type;

    @Override
    public String toString() {
        return (type != null) ? this.type.getValue() : this.getClass().getName();
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Role otherRole = (Role) obj;
        // Your equality logic here
        // Compare fields or whatever makes sense for your application
        return true; // or false based on your logic
    }
}
