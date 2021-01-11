package com.tioad.videodemo.entity;

import java.util.Date;

/**
 * @author : Chenyu
 * @version : 0.0.0
 * @time : 2020/10/21
 */
public class Play {
    private int id;
    private String name;    //剧本名称
    private String cameraNumber;   //分镜序号
    private String theme;   //主题
    private String environment; //环境
    private String time;    //时间
    private String scene;   //场景
    private String scenery;     //景别
    private String people;      //人物
    private String role;    //角色
    private String cameraPosition;     //机位
    private String cameraMovement;     //镜头运动
    private String cameraPositionDirection;   //机位方向
    private String collectMusic;   //收音
    private String music;   //音乐
    private String visualEffect;      //视效
    private String contentDialogueDescribe;   //内容及对白描述
    private String clipPointDescribe; //剪辑点描述
    private String visualEffectRequirementDescribe;  //视效需求描述
    private String remarks; //备注
    private Date addTime;
    private int userId;
    private int deleted;

    public Play() {
    }

    public Play(String name, String cameraNumber, String theme, String environment, String time, String scene, String scenery, String people, String role, String cameraPosition, String cameraMovement, String cameraPositionDirection, String collectMusic, String music, String visualEffect) {
        this.name = name;
        this.cameraNumber = cameraNumber;
        this.theme = theme;
        this.environment = environment;
        this.time = time;
        this.scene = scene;
        this.scenery = scenery;
        this.people = people;
        this.role = role;
        this.cameraPosition = cameraPosition;
        this.cameraMovement = cameraMovement;
        this.cameraPositionDirection = cameraPositionDirection;
        this.collectMusic = collectMusic;
        this.music = music;
        this.visualEffect = visualEffect;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCameraNumber() {
        return cameraNumber;
    }

    public void setCameraNumber(String cameraNumber) {
        this.cameraNumber = cameraNumber;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public String getEnvironment() {
        return environment;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getScene() {
        return scene;
    }

    public void setScene(String scene) {
        this.scene = scene;
    }

    public String getScenery() {
        return scenery;
    }

    public void setScenery(String scenery) {
        this.scenery = scenery;
    }

    public String getPeople() {
        return people;
    }

    public void setPeople(String people) {
        this.people = people;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getCameraPosition() {
        return cameraPosition;
    }

    public void setCameraPosition(String cameraPosition) {
        this.cameraPosition = cameraPosition;
    }

    public String getCameraMovement() {
        return cameraMovement;
    }

    public void setCameraMovement(String cameraMovement) {
        this.cameraMovement = cameraMovement;
    }

    public String getCameraPositionDirection() {
        return cameraPositionDirection;
    }

    public void setCameraPositionDirection(String cameraPositionDirection) {
        this.cameraPositionDirection = cameraPositionDirection;
    }

    public String getCollectMusic() {
        return collectMusic;
    }

    public void setCollectMusic(String collectMusic) {
        this.collectMusic = collectMusic;
    }

    public String getMusic() {
        return music;
    }

    public void setMusic(String music) {
        this.music = music;
    }

    public String getVisualEffect() {
        return visualEffect;
    }

    public void setVisualEffect(String visualEffect) {
        this.visualEffect = visualEffect;
    }

    public String getContentDialogueDescribe() {
        return contentDialogueDescribe;
    }

    public void setContentDialogueDescribe(String contentDialogueDescribe) {
        this.contentDialogueDescribe = contentDialogueDescribe;
    }

    public String getClipPointDescribe() {
        return clipPointDescribe;
    }

    public void setClipPointDescribe(String clipPointDescribe) {
        this.clipPointDescribe = clipPointDescribe;
    }

    public String getVisualEffectRequirementDescribe() {
        return visualEffectRequirementDescribe;
    }

    public void setVisualEffectRequirementDescribe(String visualEffectRequirementDescribe) {
        this.visualEffectRequirementDescribe = visualEffectRequirementDescribe;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getDeleted() {
        return deleted;
    }

    public void setDeleted(int deleted) {
        this.deleted = deleted;
    }
}
