package com.kkaka.wanandroid.system.viewmodel

import android.app.Application
import android.arch.lifecycle.MutableLiveData
import com.kkaka.common.https.BaseResponse
import com.kkaka.wanandroid.common.article.viewmodel.ArticleViewModel
import com.kkaka.wanandroid.system.data.SystemAtricleRsp
import com.kkaka.wanandroid.system.data.SystemRepository
import com.kkaka.wanandroid.system.data.TopMenuRsp

/**
 * @author Laizexin on 2019/12/17
 * @description
 */
class SystemViewModel(application: Application) : ArticleViewModel<SystemRepository>(application) {
    val mTopMuneData : MutableLiveData<BaseResponse<List<TopMenuRsp>>> = MutableLiveData()
    val mArticleData : MutableLiveData<BaseResponse<SystemAtricleRsp>> = MutableLiveData()

    fun getTopMenu() {
        mRespository.getTopMenu(mTopMuneData)
    }

    fun getSystemArticles(id: Int, page: Int) {
        mRespository.getSystemArticles(page,id,mArticleData)
    }

}