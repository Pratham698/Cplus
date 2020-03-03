package com.hexaware.MLP203.persistence;

import java.sql.Date;
import java.util.List;

import org.skife.jdbi.v2.sqlobject.Bind;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.SqlUpdate;
import org.skife.jdbi.v2.sqlobject.customizers.Mapper;

public interface LeaveDAO {

    @SqlUpdate("insert into leaves values(: leave_id, : leave_from, : leave_to, : no_ldays, : lapply_date, : l_status)")
      void insertLeave(@Bind("leave_id") int leave_id, @Bind("leave_from") Date leave_from, @Bind("leave_to") Date leave_to,
                   @Bind("no_ldays") int no_ldays, @Bind("lapply_date") Date lapply_date, @Bind("l_status") String l_status);

    @SqlQuery("select * from Leave")
      List<LeaveDAO> listAllLeaves();
               
    @SqlQuery("select * from Leave = :leave_id")
    @Mapper(LeaveMapper.class)
      void list_EmployeesID(@Bind("leave_id") int leave_id);

    @SqlQuery("select * from Leave = :leave_from")
    @Mapper(LeaveMapper.class)
      void list_fromdates(@Bind("leave_from") Date leave_from);
    
    @SqlQuery("select * from Leave = :leave_to")
    @Mapper(LeaveMapper.class)
      void list_todates(@Bind("leave_to") Date leave_to);
    
    @SqlQuery("select * from Leave = :no_ldays")
    @Mapper(LeaveMapper.class)
      void list_no_ofleavedays(@Bind("no_ldays") int no_ldays);

    @SqlQuery("select * from Leave = :lapply_date")
    @Mapper(LeaveMapper.class)
        void list_lapplydates(@Bind("leave_from") Date lapply_date);

    @SqlQuery("select * from Leave = :l_status")
    @Mapper(LeaveMapper.class)
      void list_leavestatus(@Bind("l_status") Date l_status);
    
    @SqlUpdate("update leave set l_status where l_status = :l_status")
    @Mapper(LeaveMapper.class)
       void updatel_status(@Bind("l_status") String l_status);
    
    @SqlUpdate("update leave set leave_from where leave_from = :leave_from")
    @Mapper(LeaveMapper.class)
       void update_leavefrom(@Bind("leave_from") String leave_from);
    
    @SqlUpdate("update leave set leave_to where leave_to = :leave_to")
    @Mapper(LeaveMapper.class)
       void update_leaveto(@Bind("leave_to") String leave_to);
    

    @SqlUpdate("Delete from Leave where leave_id = :leave_id")
    @Mapper(LeaveMapper.class)
      void deleteEmployee(@Bind("leave_id") int leave_id);
}