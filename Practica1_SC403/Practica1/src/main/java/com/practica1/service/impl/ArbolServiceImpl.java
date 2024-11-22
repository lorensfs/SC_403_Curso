package com.practica1.service.impl;

import com.practica1.dao.ArbolDao;
import com.practica1.domain.Arbol;
import com.practica1.service.ArbolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ArbolServiceImpl implements ArbolService {
    @Autowired
    private ArbolDao arbolDao;

    @Override
    @Transactional(readOnly=true)
    public List<Arbol> getArboles() {
        var lista = arbolDao.findAll();
        return lista.stream().filter(e-> e.isActivo()).collect(Collectors.toList());
    }
}
