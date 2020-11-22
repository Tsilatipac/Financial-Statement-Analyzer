/**
  * Copyright 2020 json.cn 
  */
package com.lcy.pojo;
import java.util.List;

/**
 * Auto-generated: 2020-11-22 12:41:14
 *
 * @author json.cn (i@json.cn)
 * @website http://www.json.cn/java2pojo/
 */
public class SearchOrgIdBean {

    private List<KeyBoardList> keyBoardList;
    private List<ClassifiedAnnouncements> classifiedAnnouncements;
    public void setKeyBoardList(List<KeyBoardList> keyBoardList) {
         this.keyBoardList = keyBoardList;
     }
     public List<KeyBoardList> getKeyBoardList() {
         return keyBoardList;
     }

    public void setClassifiedAnnouncements(List<ClassifiedAnnouncements> classifiedAnnouncements) {
         this.classifiedAnnouncements = classifiedAnnouncements;
     }
     public List<ClassifiedAnnouncements> getClassifiedAnnouncements() {
         return classifiedAnnouncements;
     }

}