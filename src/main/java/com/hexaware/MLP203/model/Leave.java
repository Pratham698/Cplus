package com.hexaware.MLP203.model;

import com.hexaware.MLP203.persistence.DbConnection;
import com.hexaware.MLP203.persistence.EmployeeDAO;

import java.util.Objects;
import java.util.List;
import java.util.Date;

public class Leave{

    private int leave_id;
    private Date leave_from;
    private Date leave_to;
    private int no_ldays;
    private Date lapply_date;
    private String l_status;

    //default constructor
    public Leave(){ }

    //parameterized constructor
    public Leave(final int l_Id,final Date l_from,final Date l_to,final int l_nd,final Date l_ad,final String ls) {
        this.leave_id = l_Id;
        this.leave_from = l_from;
        this.leave_to = l_to;
        this.no_ldays = l_nd;
        this.lapply_date = l_ad;
        this.l_status = ls;
      }

    //getters
    public final int getLeaveId(){
        return leave_id;
    }  
    public final Date getLeaveFrom(){
        return leave_from;
    }  
    public final Date getLeaveTo(){
        return leave_to;
    }  
    public final int getNoLeaveDays(){
        return no_ldays;
    }  
    public final Date getLeaveApplyDate(){
        return lapply_date;
    }  
    public final String getLeaveStatus(){
        return l_status;
    }
    
    //setters

    public final void setLeaveId(final int L_id){
        this.leave_id = L_id;
    }  
    public final void setLeaveFrom(final Date L_from){
        this.leave_from = L_from;
    }  
    public final void setLeaveTo(final Date L_to){
        this.leave_to = L_to;
    }  
    public final void setNoLeaveDays(final int L_nodays){
        this.no_ldays = L_nodays;
    }  
    public final void setLeaveApplyDate(final Date L_applydate){
        this.lapply_date = L_applydate;
    }  
    public final void setLeaveStatus(final String L_status){
        this.l_status = L_status;
    }


    //method to apply for leave



      //method to check the leave status
      public void check_leave_status(){
        if(l_status.equals("APPROVED")){
          System.out.println("leave status: " +l_status);
        }
        else if(l_status.equals("DENIED")){
          System.out.println("leave status: " + l_status);
        }
        else
        {
          System.out.println("leave status: PENDING");
        }

      }

      //method to update leave status
      
      public void update_leave_status(String l_status,int available_leaves,int total_leaves){
        
        
        if(l_status.equals("APPROVED")){
          System.out.println("Present Available leaves: " +(total_leaves-available_leaves-1));
        }
        else if(l_status.equals("DENIED")){
          System.out.println("Present Available leaves: " + (total_leaves-available_leaves));
        }

      }


       //method for leaveAvailabilityCheck()
       void leaveAvailabilityCheck( int available_leave)
       {
           if(available_leave==0)
           {
               System.out.println("Cannot apply further leave.");
           }
           else
           {
               
               System.out.println("You can apply for leave.");
           }
       }
    
   
       //method for cancelPendingLeaves()
       void cancelPendingLeaves(String l_status)
       {
           if(l_status=="pending")
           {
               System.out.println("Leave application can be cancelled");
           }
           else
           {
            System.out.println("Cannot cancel applied leave");
           }
       }


    //equals

    @Override
    public final boolean equals(final Object obj) {
        if (obj == null) {
          return false;
        }
        if (getClass() != obj.getClass()) {
          return false;
        }
        Leave l = (Leave) obj;
        if (Objects.equals(leave_id, l.leave_id) && Objects.equals(leave_from,l.leave_from) && Objects.equals(leave_to,l.leave_to) && Objects.equals(no_ldays,l.no_ldays) && Objects.equals(lapply_date,l.lapply_date) && Objects.equals(l_status,l.l_status)) {
          return true;
        }
        return false;
      }

      

    //toString
  @Override
  public String toString() {
    
    return "Leave Id: " + leave_id + "Leave From: " + leave_from + "Leave to: " + leave_to + "No. of Leave Days: " + no_ldays + "Leave Apply date: " + lapply_date + "Leave Status " + l_status;
  } 
  
  




}
