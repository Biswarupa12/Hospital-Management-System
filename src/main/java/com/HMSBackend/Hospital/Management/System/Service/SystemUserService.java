package com.HMSBackend.Hospital.Management.System.Service;

import com.HMSBackend.Hospital.Management.System.Entity.SystemUser;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SystemUserService {
    SystemUser createUser(SystemUser user);
    List<SystemUser> getAllUsers();
    SystemUser getUserById(Long userId);
    SystemUser getUserByUsername(String username);
    SystemUser updateUser(Long id, SystemUser updatedUser);
    void deleteUser(Long id);
}
