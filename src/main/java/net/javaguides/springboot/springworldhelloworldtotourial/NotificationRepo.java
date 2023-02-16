package net.javaguides.springboot.springworldhelloworldtotourial;




import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
 

 

@Mapper
public interface NotificationRepo {
    @Select("select * from notification")
    public List <  Notification > findAll();
    
    @Select("SELECT * FROM notification WHERE id = #{id}")
    public   Notification findById(long id);

    @Delete("DELETE FROM  notification WHERE id = #{id}")
    public int deleteById(long id);

    @Insert("INSERT INTO  notification(id, date, remarks) " +
        " VALUES (#{ id}, #{date}, #{remarks})")
    public int insert( Notification  account);

    @Update("Update  notification set remarks=#{remarks}, " +
        " date=#{date}")
    public int update(Notification account);

     
}
