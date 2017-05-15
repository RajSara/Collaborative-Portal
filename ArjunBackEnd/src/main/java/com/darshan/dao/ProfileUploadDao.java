package com.darshan.dao;

import com.darshan.model.ProfilePicture;

public interface ProfileUploadDao {
	void save(ProfilePicture profilePicture);
	ProfilePicture getProfilePic(String username);

}
