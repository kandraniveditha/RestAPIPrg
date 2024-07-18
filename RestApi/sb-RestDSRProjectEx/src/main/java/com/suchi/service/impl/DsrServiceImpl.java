package com.suchi.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.suchi.Entity.DsrEntity;
import com.suchi.exception.RecordNotFoundException;
import com.suchi.model.Dsr;
import com.suchi.repo.DSRRepository;
import com.suchi.service.DsrService;


@Service
public class DsrServiceImpl implements DsrService {

	@Autowired
	private DSRRepository dsrRepo;

	@Override
	public Dsr saveDsr(Dsr d) {
		// TODO Auto-generated method stub
		DsrEntity dsrEn=new DsrEntity();
		BeanUtils.copyProperties(d, dsrEn);
		dsrEn.setVisibility(true);
		DsrEntity dsr = dsrRepo.save(dsrEn);
		Dsr d1=new Dsr();
		BeanUtils.copyProperties(dsr, d1);
		
		return d1;
		
		
	}

	@Override
	public List<Dsr> getAllDsr() {
		// TODO Auto-generated method stub
		List<DsrEntity> findAllEmployeeInfo = dsrRepo.findAllEmployeeInfo();
		List<Dsr>addEmployeeInfo=new ArrayList<Dsr>();
		findAllEmployeeInfo.forEach(d->{
			
			Dsr dsr=new Dsr();
			BeanUtils.copyProperties(d, dsr);
			addEmployeeInfo.add(dsr);
			
		});
	
		return addEmployeeInfo;
	}

	@Override
	public Dsr findEmployeeInfoById(long id) throws RecordNotFoundException {
		// TODO Auto-generated method stub
		DsrEntity dsrEntity = dsrRepo.findById(id).get();		
		Dsr d=new Dsr();

				if(dsrEntity.getId()!=0)
				{
					BeanUtils.copyProperties(dsrEntity, d);
				}
				else
				{
					throw new RecordNotFoundException("Given Record is Not Exist");
				}
				
				return d;

	}

	@Override
	public Dsr updateEmployeeInfo(Dsr d, long id) throws RecordNotFoundException {
		// TODO Auto-generated method stub
		DsrEntity dsrEntity = dsrRepo.findById(id).get();
		if(dsrEntity.getId()!=0)
		{
			BeanUtils.copyProperties(d, dsrEntity);
		}
		else
		{
			throw new RecordNotFoundException("Given Record is Not Exist");
		}
		DsrEntity saveEnt= dsrRepo.save(dsrEntity);
		//Copy Entity Object Into Product
		Dsr dsr=new Dsr();
		BeanUtils.copyProperties(saveEnt, dsr);
		return dsr;
	}

	@Override
	public boolean deleteEmployeeInfo(long id) throws RecordNotFoundException {
		// TODO Auto-generated method stub
		DsrEntity dsrEntity =dsrRepo.findById(id).get();
		boolean flag=false;
		if(dsrEntity.getId()!=0)
		{
			dsrRepo.deleteEmployeeInfo(id);
			flag=true;
		}
		else
		throw new RecordNotFoundException("Given Record is Not Exist");
		return flag;
	}	}

	
