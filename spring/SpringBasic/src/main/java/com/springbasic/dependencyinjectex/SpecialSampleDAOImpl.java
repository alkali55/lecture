package com.springbasic.dependencyinjectex;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

@Repository
@Qualifier("special")
public class SpecialSampleDAOImpl implements SampleDAO {

	@Override
	public void sampleMethod() {
		System.out.println("SpecialSampleDAOImpl......");
	}

}
