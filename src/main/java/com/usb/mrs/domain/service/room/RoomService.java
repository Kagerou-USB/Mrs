package com.usb.mrs.domain.service.room;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.usb.mrs.domain.model.ReservableRoom;
import com.usb.mrs.domain.repository.room.ReservableRoomRepository;

@Service
@Transactional
public class RoomService {

    @Autowired
    ReservableRoomRepository reservableRoomRepository;

    public List<ReservableRoom> findReservableRooms(LocalDate date) {
        return reservableRoomRepository.findByReservableRoomId_reservedDateOrderByReservableRoomId_roomIdAsc(date);
    }
}
