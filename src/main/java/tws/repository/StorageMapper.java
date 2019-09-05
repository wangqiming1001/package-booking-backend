package tws.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import tws.entity.Storage;

@Mapper
public interface StorageMapper {
	List<Storage> selectAll();
	
    void insertStorage(@Param("storage") Storage storage);
    
    void updatetTimeOfAppointment(@Param("storage") Storage storage);
}
