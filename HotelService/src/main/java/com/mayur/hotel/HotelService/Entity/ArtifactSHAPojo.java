package com.mayur.hotel.HotelService.Entity;

public class ArtifactSHAPojo {
	
	private String groupid;
	private String artifactid;
	private String version;
	private String shaValue;
	private String status ;
	
	
	
	public ArtifactSHAPojo(String groupid, String artifactid, String version, String shaValue) {
		super();
		this.groupid = groupid;
		this.artifactid = artifactid;
		this.version = version;
		this.shaValue = shaValue;
		this.status=status ;
	}
	
	
	public String getGroupid() {
		return groupid;
	}
	public void setGroupid(String groupid) {
		this.groupid = groupid;
	}
	public String getArtifactid() {
		return artifactid;
	}
	public void setArtifactid(String artifactid) {
		this.artifactid = artifactid;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public String getShaValue() {
		return shaValue;
	}
	public void setShaValue(String shaValue) {
		this.shaValue = shaValue;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}
	
	
	

}
