package lk.ijse.spring.service;

import lk.ijse.spring.dto.AdminDTO;
import lk.ijse.spring.dto.Drive_SheduleDTO;

public interface Driver_SheduleService {
    void saveDriverShedule(Drive_SheduleDTO drive_sheduleDTO);

    void deleteDriverShedule(String sheduleId);

    void updateDriverShedule(Drive_SheduleDTO drive_sheduleDTO);

    Drive_SheduleDTO searchDriverShedule(String id);
}
