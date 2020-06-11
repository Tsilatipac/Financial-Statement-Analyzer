/**
  * Copyright 2020 bejson.com 
  */
package com.lcy.pojo;
import java.util.List;

/**
 * Auto-generated: 2020-05-05 17:31:56
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
public class JsonRootBean {

    private String classifiedAnnouncements;
    private int totalSecurities;
    private int totalAnnouncement;
    private int totalRecordNum;
    private List<Announcements> announcements;
    private String categoryList;
    private boolean hasMore;
    private int totalpages;
    public void setClassifiedAnnouncements(String classifiedAnnouncements) {
         this.classifiedAnnouncements = classifiedAnnouncements;
     }
     public String getClassifiedAnnouncements() {
         return classifiedAnnouncements;
     }

    public void setTotalSecurities(int totalSecurities) {
         this.totalSecurities = totalSecurities;
     }
     public int getTotalSecurities() {
         return totalSecurities;
     }

    public void setTotalAnnouncement(int totalAnnouncement) {
         this.totalAnnouncement = totalAnnouncement;
     }
     public int getTotalAnnouncement() {
         return totalAnnouncement;
     }

    public void setTotalRecordNum(int totalRecordNum) {
         this.totalRecordNum = totalRecordNum;
     }
     public int getTotalRecordNum() {
         return totalRecordNum;
     }

    public void setAnnouncements(List<Announcements> announcements) {
         this.announcements = announcements;
     }
     public List<Announcements> getAnnouncements() {
         return announcements;
     }

    public void setCategoryList(String categoryList) {
         this.categoryList = categoryList;
     }
     public String getCategoryList() {
         return categoryList;
     }

    public void setHasMore(boolean hasMore) {
         this.hasMore = hasMore;
     }
     public boolean getHasMore() {
         return hasMore;
     }

    public void setTotalpages(int totalpages) {
         this.totalpages = totalpages;
     }
     public int getTotalpages() {
         return totalpages;
     }
	@Override
	public String toString() {
		return "JsonRootBean [classifiedAnnouncements=" + classifiedAnnouncements + ", totalSecurities="
				+ totalSecurities + ", totalAnnouncement=" + totalAnnouncement + ", totalRecordNum=" + totalRecordNum
				+ ", announcements=" + announcements + ", categoryList=" + categoryList + ", hasMore=" + hasMore
				+ ", totalpages=" + totalpages + "]";
	}

}