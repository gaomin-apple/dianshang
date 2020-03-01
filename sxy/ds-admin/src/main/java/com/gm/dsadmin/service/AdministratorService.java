package com.gm.dsadmin.service;

import com.gm.dsadmin.po.Administrator;

public interface AdministratorService {

    Administrator getById(Integer administratorId);

    Administrator getByUsername(String username);

    void update(Administrator administrator);
}
