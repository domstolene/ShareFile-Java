
// ------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated by a tool.
//  
//     Changes to this file may cause incorrect behavior and will be lost if
//     the code is regenerated.
//     
//	   Copyright (c) 2014 Citrix ShareFile. All rights reserved.
// </auto-generated>
// ------------------------------------------------------------------------------

package com.sharefile.api.models;

import java.util.ArrayList;

public class SFDeviceStatus extends SFODataObject {

	private ArrayList<SFUser> LockedUsers;
	private ArrayList<SFDeviceUserWipe> UsersToWipe;

		/**
		* Locked users
		*/
	public ArrayList<SFUser> getLockedUsers() {
		return LockedUsers;
	}

		/**
		* Locked users
		*/
	public void setLockedUsers(ArrayList<SFUser> lockedusers) {
		LockedUsers = lockedusers;
	}
		/**
		* Users to wipe
		*/
	public ArrayList<SFDeviceUserWipe> getUsersToWipe() {
		return UsersToWipe;
	}

		/**
		* Users to wipe
		*/
	public void setUsersToWipe(ArrayList<SFDeviceUserWipe> userstowipe) {
		UsersToWipe = userstowipe;
	}
}