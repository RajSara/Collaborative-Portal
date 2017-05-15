package com.darshan.dao;

import java.util.List;

import com.darshan.model.Job;

public interface JobDao {
	
	void saveJobDetails(Job job);

	List<Job> getAllJobDetails();

	 Job getJobById(int id);
}
