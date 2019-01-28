package com.yulang.project.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.time.LocalDate;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 
 * </p>
 *
 * @author yulang
 * @since 2019-01-28
 */
@ApiModel(value="God对象", description="")
public class God extends Model<God> {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键")
    @TableId(value = "pkid", type = IdType.INPUT)
    private String pkid;

    @ApiModelProperty(value = "创建时间")
    @TableField("createTime")
    private LocalDateTime createTime;

    @ApiModelProperty(value = "更新时间")
    @TableField("updateTime")
    private LocalDateTime updateTime;

    @ApiModelProperty(value = "顾客姓名")
    private String name;

    @ApiModelProperty(value = "电话号码")
    private String phone;

    @ApiModelProperty(value = "微信号")
    @TableField("weiXinNo")
    private String weiXinNo;

    @ApiModelProperty(value = "QQ号")
    @TableField("qqNo")
    private String qqNo;

    @ApiModelProperty(value = "顾客的性别，值为1时是男性，值为2时是女性，值为0时是未知")
    private String sex;

    @ApiModelProperty(value = "年龄")
    private Integer age;

    @ApiModelProperty(value = "会员等级")
    private String level;

    @ApiModelProperty(value = "注册渠道（平台，A门店，B..）")
    @TableField("comeChannel")
    private String comeChannel;

    @ApiModelProperty(value = "会员地址")
    private String address;

    @ApiModelProperty(value = "盐")
    private String salt;

    @ApiModelProperty(value = "密码")
    @TableField("loginKey")
    private String loginKey;

    @TableField("nickName")
    private String nickName;

    @ApiModelProperty(value = "微信开放Id")
    @TableField("wxOpenId")
    private String wxOpenId;

    @ApiModelProperty(value = "头像地址（获取微信的头像）")
    @TableField("headImgUrl")
    private String headImgUrl;

    @ApiModelProperty(value = "是否绑定微信（1绑定成功,0未绑定）")
    @TableField("isBindWx")
    private Integer isBindWx;

    @ApiModelProperty(value = "顾客常去地址")
    @TableField("favAddr")
    private String favAddr;

    @ApiModelProperty(value = "会员编号")
    @TableField("godNo")
    private String godNo;

    @ApiModelProperty(value = "1为正常，0为删除")
    @TableField("isValid")
    @TableLogic
    private Integer isValid;

    @ApiModelProperty(value = "1为绑定，0为未绑定")
    @TableField("isBindOldGOd")
    private Integer isBindOldGOd;

    @ApiModelProperty(value = "用户热搜字")
    private String words;

    @ApiModelProperty(value = "记录上一次下单的手机号码")
    @TableField("orderPhone")
    private String orderPhone;

    @ApiModelProperty(value = "老顾客金额")
    @TableField("oldAmount")
    private BigDecimal oldAmount;

    @ApiModelProperty(value = "是否是老顾客")
    @TableField("isOld")
    private String isOld;

    @ApiModelProperty(value = "0：扫码注册，1，后台创建")
    @TableField("createChannel")
    private String createChannel;

    @ApiModelProperty(value = "1：新客、2：准会员、3：老客")
    @TableField("godType")
    private String godType;

    @ApiModelProperty(value = "成为新客时间记录")
    @TableField("newTime")
    private LocalDateTime newTime;

    @ApiModelProperty(value = "专属员工")
    @TableField("employeeId")
    private String employeeId;

    @ApiModelProperty(value = "注册来源（1:持线下免费券进店;2:持线下有价券进店;3:持线下自由进店;4:持线上免费券进店;5:持线上有价券进店;6:持线上自由进店）")
    @TableField("comeFrom")
    private String comeFrom;

    @ApiModelProperty(value = "是否标记注册来源 （0是未标记，1标记）")
    @TableField("isMarkComeFrom")
    private String isMarkComeFrom;

    @ApiModelProperty(value = "成为准会员时间记录")
    @TableField("newTime2")
    private LocalDateTime newTime2;

    @ApiModelProperty(value = "成为老客时间记录")
    @TableField("newTime3")
    private LocalDateTime newTime3;

    @ApiModelProperty(value = "客人当天购买了套餐并且服务了套餐内项目 第二天需要自动升级为会员（1为需要升级会员，2为处理过升级动作，空或NUll 未不处理）")
    @TableField("godTypeFlag")
    private String godTypeFlag;

    @ApiModelProperty(value = "最近一次登录时间")
    @TableField("lastLoginTime")
    private LocalDateTime lastLoginTime;

    @ApiModelProperty(value = "邀约类型")
    @TableField("inviteType")
    private String inviteType;

    @ApiModelProperty(value = "娜米币数量")
    @TableField("nmCoin")
    private Integer nmCoin;

    @ApiModelProperty(value = "娜米成长值（积分）")
    @TableField("nmScore")
    private Integer nmScore;

    @ApiModelProperty(value = "营销门店")
    @TableField("mktStoreId")
    private String mktStoreId;

    @ApiModelProperty(value = "营销社区")
    @TableField("mktCommunity")
    private String mktCommunity;

    @ApiModelProperty(value = "是否关注公众号 0未关注 1关注")
    @TableField("isSubscribe")
    private String isSubscribe;

    @ApiModelProperty(value = "是否享受过免费项目 0未享受 1享受过")
    @TableField("isFreeOrder")
    private String isFreeOrder;

    @ApiModelProperty(value = "用户编号")
    @TableField("userNo")
    private String userNo;

    @ApiModelProperty(value = "历史用户范围：2017年12月、2018年1月、2018年3月三个月份满足门槛1的顾客 0不是社群标记 1是社群标记")
    @TableField("isCommunity")
    private String isCommunity;

    private LocalDate birthday;

    @TableField("passWord")
    private String passWord;


    public String getPkid() {
        return pkid;
    }

    public void setPkid(String pkid) {
        this.pkid = pkid;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getWeiXinNo() {
        return weiXinNo;
    }

    public void setWeiXinNo(String weiXinNo) {
        this.weiXinNo = weiXinNo;
    }

    public String getQqNo() {
        return qqNo;
    }

    public void setQqNo(String qqNo) {
        this.qqNo = qqNo;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getComeChannel() {
        return comeChannel;
    }

    public void setComeChannel(String comeChannel) {
        this.comeChannel = comeChannel;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getLoginKey() {
        return loginKey;
    }

    public void setLoginKey(String loginKey) {
        this.loginKey = loginKey;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getWxOpenId() {
        return wxOpenId;
    }

    public void setWxOpenId(String wxOpenId) {
        this.wxOpenId = wxOpenId;
    }

    public String getHeadImgUrl() {
        return headImgUrl;
    }

    public void setHeadImgUrl(String headImgUrl) {
        this.headImgUrl = headImgUrl;
    }

    public Integer getIsBindWx() {
        return isBindWx;
    }

    public void setIsBindWx(Integer isBindWx) {
        this.isBindWx = isBindWx;
    }

    public String getFavAddr() {
        return favAddr;
    }

    public void setFavAddr(String favAddr) {
        this.favAddr = favAddr;
    }

    public String getGodNo() {
        return godNo;
    }

    public void setGodNo(String godNo) {
        this.godNo = godNo;
    }

    public Integer getIsValid() {
        return isValid;
    }

    public void setIsValid(Integer isValid) {
        this.isValid = isValid;
    }

    public Integer getIsBindOldGOd() {
        return isBindOldGOd;
    }

    public void setIsBindOldGOd(Integer isBindOldGOd) {
        this.isBindOldGOd = isBindOldGOd;
    }

    public String getWords() {
        return words;
    }

    public void setWords(String words) {
        this.words = words;
    }

    public String getOrderPhone() {
        return orderPhone;
    }

    public void setOrderPhone(String orderPhone) {
        this.orderPhone = orderPhone;
    }

    public BigDecimal getOldAmount() {
        return oldAmount;
    }

    public void setOldAmount(BigDecimal oldAmount) {
        this.oldAmount = oldAmount;
    }

    public String getIsOld() {
        return isOld;
    }

    public void setIsOld(String isOld) {
        this.isOld = isOld;
    }

    public String getCreateChannel() {
        return createChannel;
    }

    public void setCreateChannel(String createChannel) {
        this.createChannel = createChannel;
    }

    public String getGodType() {
        return godType;
    }

    public void setGodType(String godType) {
        this.godType = godType;
    }

    public LocalDateTime getNewTime() {
        return newTime;
    }

    public void setNewTime(LocalDateTime newTime) {
        this.newTime = newTime;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getComeFrom() {
        return comeFrom;
    }

    public void setComeFrom(String comeFrom) {
        this.comeFrom = comeFrom;
    }

    public String getIsMarkComeFrom() {
        return isMarkComeFrom;
    }

    public void setIsMarkComeFrom(String isMarkComeFrom) {
        this.isMarkComeFrom = isMarkComeFrom;
    }

    public LocalDateTime getNewTime2() {
        return newTime2;
    }

    public void setNewTime2(LocalDateTime newTime2) {
        this.newTime2 = newTime2;
    }

    public LocalDateTime getNewTime3() {
        return newTime3;
    }

    public void setNewTime3(LocalDateTime newTime3) {
        this.newTime3 = newTime3;
    }

    public String getGodTypeFlag() {
        return godTypeFlag;
    }

    public void setGodTypeFlag(String godTypeFlag) {
        this.godTypeFlag = godTypeFlag;
    }

    public LocalDateTime getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(LocalDateTime lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public String getInviteType() {
        return inviteType;
    }

    public void setInviteType(String inviteType) {
        this.inviteType = inviteType;
    }

    public Integer getNmCoin() {
        return nmCoin;
    }

    public void setNmCoin(Integer nmCoin) {
        this.nmCoin = nmCoin;
    }

    public Integer getNmScore() {
        return nmScore;
    }

    public void setNmScore(Integer nmScore) {
        this.nmScore = nmScore;
    }

    public String getMktStoreId() {
        return mktStoreId;
    }

    public void setMktStoreId(String mktStoreId) {
        this.mktStoreId = mktStoreId;
    }

    public String getMktCommunity() {
        return mktCommunity;
    }

    public void setMktCommunity(String mktCommunity) {
        this.mktCommunity = mktCommunity;
    }

    public String getIsSubscribe() {
        return isSubscribe;
    }

    public void setIsSubscribe(String isSubscribe) {
        this.isSubscribe = isSubscribe;
    }

    public String getIsFreeOrder() {
        return isFreeOrder;
    }

    public void setIsFreeOrder(String isFreeOrder) {
        this.isFreeOrder = isFreeOrder;
    }

    public String getUserNo() {
        return userNo;
    }

    public void setUserNo(String userNo) {
        this.userNo = userNo;
    }

    public String getIsCommunity() {
        return isCommunity;
    }

    public void setIsCommunity(String isCommunity) {
        this.isCommunity = isCommunity;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    @Override
    protected Serializable pkVal() {
        return this.pkid;
    }

    @Override
    public String toString() {
        return "God{" +
        "pkid=" + pkid +
        ", createTime=" + createTime +
        ", updateTime=" + updateTime +
        ", name=" + name +
        ", phone=" + phone +
        ", weiXinNo=" + weiXinNo +
        ", qqNo=" + qqNo +
        ", sex=" + sex +
        ", age=" + age +
        ", level=" + level +
        ", comeChannel=" + comeChannel +
        ", address=" + address +
        ", salt=" + salt +
        ", loginKey=" + loginKey +
        ", nickName=" + nickName +
        ", wxOpenId=" + wxOpenId +
        ", headImgUrl=" + headImgUrl +
        ", isBindWx=" + isBindWx +
        ", favAddr=" + favAddr +
        ", godNo=" + godNo +
        ", isValid=" + isValid +
        ", isBindOldGOd=" + isBindOldGOd +
        ", words=" + words +
        ", orderPhone=" + orderPhone +
        ", oldAmount=" + oldAmount +
        ", isOld=" + isOld +
        ", createChannel=" + createChannel +
        ", godType=" + godType +
        ", newTime=" + newTime +
        ", employeeId=" + employeeId +
        ", comeFrom=" + comeFrom +
        ", isMarkComeFrom=" + isMarkComeFrom +
        ", newTime2=" + newTime2 +
        ", newTime3=" + newTime3 +
        ", godTypeFlag=" + godTypeFlag +
        ", lastLoginTime=" + lastLoginTime +
        ", inviteType=" + inviteType +
        ", nmCoin=" + nmCoin +
        ", nmScore=" + nmScore +
        ", mktStoreId=" + mktStoreId +
        ", mktCommunity=" + mktCommunity +
        ", isSubscribe=" + isSubscribe +
        ", isFreeOrder=" + isFreeOrder +
        ", userNo=" + userNo +
        ", isCommunity=" + isCommunity +
        ", birthday=" + birthday +
        ", passWord=" + passWord +
        "}";
    }
}
