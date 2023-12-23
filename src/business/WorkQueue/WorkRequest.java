/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.WorkQueue;

import business.Applicant.Applicant;
import business.UserAccount.UserAccount;
import java.util.Date;

/**
 *
 * @author meetb007
 */
public class WorkRequest {
    private Applicant sender;
    private UserAccount receiver;
    private String message;
    private String status;
    private Date requestDate;
    private Date resolveDate;
    private Object subject;
    
    public WorkRequest() {
        requestDate = new Date();
    }
    
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(Date requestDate) {
        this.requestDate = requestDate;
    }

    public Date getResolveDate() {
        return resolveDate;
    }

    public void setResolveDate(Date resolveDate) {
        this.resolveDate = resolveDate;
    }
    
    public Applicant getSender() {
        return sender;
    }

    public void setSender(Applicant sender) {
        this.sender = sender;
    }

    public UserAccount getReceiver() {
        return receiver;
    }

    public void setReceiver(UserAccount receiver) {
        this.receiver = receiver;
    }

    public Object getSubject() {
        return subject;
    }

    public void setSubject(Object subject) {
        this.subject = subject;
    }
    
    @Override
    public String toString(){
        return this.sender.getPerson().getName();
    }
}
