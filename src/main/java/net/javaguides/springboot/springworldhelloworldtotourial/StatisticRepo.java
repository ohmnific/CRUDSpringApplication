package net.javaguides.springboot.springworldhelloworldtotourial;




import java.util.List;


import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

 

@Mapper
public interface StatisticRepo {
    @Select("select * from statistic")
    public List <  Statistic > findAllStat();

     
}
