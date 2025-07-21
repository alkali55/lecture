package com.springbasic.dependencyinjectex;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository
//@Primary
@Qualifier("sample")
public class SampleDAOImpl implements SampleDAO {

	@Override
	public void sampleMethod() {
		System.out.println("SampleDAOImpl .......");

	}

}
