package com.lysensoone.tdandroid

import android.service.media.MediaBrowserService
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_and_version.view.*

data class AndVersion(var name: String="Default", var verNum: String="1.0", var img:Int = R.drawable.android) {}