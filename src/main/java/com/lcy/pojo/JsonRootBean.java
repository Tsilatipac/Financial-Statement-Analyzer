/**
 * Copyright 2020 bejson.com
 */
package com.lcy.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

/**
 * Auto-generated: 2020-05-05 17:31:56
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class JsonRootBean {
    private String classifiedAnnouncements;
    private int totalSecurities;
    private int totalAnnouncement;
    private int totalRecordNum;
    private List<Announcements> announcements;
    private String categoryList;
    private boolean hasMore;
    private int totalpages;
}