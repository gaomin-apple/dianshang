package com.gm.dsadmin.service;

import com.gm.dsadmin.po.Administrator;

public interface AdministratorService {
    Administrator getByUsername(String username);
}
