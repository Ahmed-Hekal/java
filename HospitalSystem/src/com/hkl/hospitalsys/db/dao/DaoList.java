/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hkl.hospitalsys.db.dao;

import java.util.List;

/**
 *
 * @author LNV-HK-LB
 */
public interface DaoList <T> {
    public List<T> loadAll();
    public String insert();
    public String update();
    public String delete();
    public T getData(T t);
}
