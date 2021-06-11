var app =getApp()
// pages/update/update.js
Page({

  /**
   * 页面的初始数据
   */
  data: {

  },

  acceptplan:function(){
    wx.request({
      url: 'http://localhost:8080/accept ',
      data:{},
      method:'POST',
      header:{
        'content-type':'application/json'
      },
      success:res=>{
        
      },
      fail:function(res){
        console.log("-----fail-----");
      }
    })
  },

  disacceptplan:function(){
    wx.request({
      url: 'http://localhost:8080/disaccept ',
      data:{},
      method:'POST',
      header:{
        'content-type':'application/json'
      },
      success:res=>{
        
      },
      fail:function(res){
        console.log("-----fail-----");
      }
    })
  },

  updateplan:function(){
    var that=this
    wx.request({
      url: 'http://localhost:8080/update',
      data:{},
      method:'POST',
      header:{
        'content-type':'application/json'
      },
      success:res=>{
        this.setData({
          jihua:res.data
        })
      },
      fail:function(res){
        console.log("-----fail-----");
      }
    })
    
    
  },
  reducehard:function(){
    wx.request({
      url: 'http://localhost:8080/reduce ',
      data:{},
      method:'POST',
      header:{
        'content-type':'application/json'
      },
      success:res=>{
        
      },
      fail:function(res){
        console.log("-----fail-----");
      }
    })
  },



  /**
   * 生命周期函数--监听页面加载
   */
  onLoad: function (options) {

  },

  /**
   * 生命周期函数--监听页面初次渲染完成
   */
  onReady: function () {

  },

  /**
   * 生命周期函数--监听页面显示
   */
  onShow: function () {

  },

  /**
   * 生命周期函数--监听页面隐藏
   */
  onHide: function () {

  },

  /**
   * 生命周期函数--监听页面卸载
   */
  onUnload: function () {

  },

  /**
   * 页面相关事件处理函数--监听用户下拉动作
   */
  onPullDownRefresh: function () {

  },

  /**
   * 页面上拉触底事件的处理函数
   */
  onReachBottom: function () {

  },

  /**
   * 用户点击右上角分享
   */
  onShareAppMessage: function () {

  }
})