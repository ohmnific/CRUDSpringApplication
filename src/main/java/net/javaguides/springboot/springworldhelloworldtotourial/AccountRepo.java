package net.javaguides.springboot.springworldhelloworldtotourial;




import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

 

@Mapper
public interface AccountRepo {
    @Select("select * from bankusers")
    public List <  Account > findAll();

    @Select("SELECT * FROM bankusers WHERE accountNumber = #{accountNumber}")
    public  Account findById(long accountNumber);

    @Delete("DELETE FROM bankusers WHERE accountNumber = #{accountNumber}")
    public int deleteById(long accountNumber);

    @Insert("INSERT INTO bankusers(accountNumber, firstName, branchName,balance) " +
        " VALUES (#{ accountNumber}, #{firstName}, #{branchName}, #{balance})")
    public int insert( Account  account);

    @Update("Update bankusers set firstName=#{firstName}, " +
        " branchName=#{branchName}, balance=#{balance} where accountNumber=#{accountNumber}")
    public int update( Account account);
}

