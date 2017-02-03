/**
 * 
 */
package model;

/**
 * @author gfalk
 *
 */
public class monitoringPt {

	private String siteName;
	private String sitePoint;
	private String latitude;
	private String longitude;
	private String description;
	private String siteUse;
	
	/**
	default constructor
	 */
	public monitoringPt() {
		this.siteName = "No siteName";
		this.sitePoint = "No sitePoint";
		this.latitude = "No latitude";
		this.longitude = "No longitude";
		this.description = "No description";
		this.siteUse = "No siteUse";
	}
	
	/**
	 * @param siteName
	 * @param sitePoint
	 * @param latitude
	 * @param longitude
	 * @param description
	 * @param siteUse
	 */
	public monitoringPt(String siteName, String sitePoint, String latitude, String longitude, String description,
			String siteUse) {
		this.siteName = siteName;
		this.sitePoint = sitePoint;
		this.latitude = latitude;
		this.longitude = longitude;
		this.description = description;
		this.siteUse = siteUse;
	}



	/**
	 * @return the siteName
	 */
	public String getSiteName() {
		return siteName;
	}



	/**
	 * @param siteName the siteName to set
	 */
	public void setSiteName(String siteName) {
		this.siteName = siteName;
	}



	/**
	 * @return the sitePoint
	 */
	public String getSitePoint() {
		return sitePoint;
	}



	/**
	 * @param sitePoint the sitePoint to set
	 */
	public void setSitePoint(String sitePoint) {
		this.sitePoint = sitePoint;
	}



	/**
	 * @return the latitude
	 */
	public String getLatitude() {
		return latitude;
	}



	/**
	 * @param latitude the latitude to set
	 */
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}



	/**
	 * @return the longitude
	 */
	public String getLongitude() {
		return longitude;
	}



	/**
	 * @param longitude the longitude to set
	 */
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}



	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}



	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}



	/**
	 * @return the siteUse
	 */
	public String getSiteUse() {
		return siteUse;
	}



	/**
	 * @param siteUse the siteUse to set
	 */
	public void setSiteUse(String siteUse) {
		this.siteUse = siteUse;
	}



	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "monitoringPt [siteName=" + siteName + ", sitePoint=" + sitePoint + ", latitude=" + latitude
				+ ", longitude=" + longitude + ", description=" + description + ", siteUse=" + siteUse + "]";
	}
	
	
	
	
	
}
