package com.src.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.src.dao.IncomeTaxDao;
import com.src.model.TdsMaster;


@Component("incomeTaxService")  //object which we have used in myController
@Service                        //as it is service we need to write service annotation
@Transactional                //Used to perform CRUD operations
public class IncomeTaxServiceImpl implements IncomeTaxService {

	
	@Autowired
	IncomeTaxDao incomeTaxDao;
	@Override
	public TdsMaster getById(int id) {
		// TODO Auto-generated method stub
		return incomeTaxDao.getById(id);
	}

}
