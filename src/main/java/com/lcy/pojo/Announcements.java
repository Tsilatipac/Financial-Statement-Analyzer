/**
 * Copyright 2020 bejson.com
 */
package com.lcy.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

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
public class Announcements {
    private String id;
    private String secCode;
    private String secName;
    private String orgId;
    private String announcementId;
    private String announcementTitle;
    private long announcementTime;
    private String adjunctUrl;
    private int adjunctSize;
    private String adjunctType;
    private String storageTime;
    private String columnId;
    private String pageColumn;
    private String announcementType;
    private String associateAnnouncement;
    private String important;
    private String batchNum;
    private String announcementContent;
    private String orgName;
    private String announcementTypeName;
}