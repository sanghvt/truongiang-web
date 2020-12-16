package com.laptrinhweb.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.laptrinhweb.entity.Room;


@Repository
public interface RoomRepository extends JpaRepository<Room, Long> {

	Room findOneByRoomNumber(String roomNumber);

	Room findOneById(Long id);

}
