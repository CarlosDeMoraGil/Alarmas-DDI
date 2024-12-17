package edu.iesam.alarma

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder

class AlarmAdapter : RecyclerView.Adapter<AlarmViewHolder>() {

    private val dataList: MutableList<Alarm> = mutableListOf()

    fun setDataList(list: List<Alarm>) {
        dataList.addAll(list)
        notifyDataSetChanged()

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AlarmViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.item_alarm_view, parent, false)
        return AlarmViewHolder(view)
    }

    override fun getItemCount() = dataList.size

    override fun onBindViewHolder(holder: AlarmViewHolder, position: Int) {
        holder.bind(dataList[position])
    }


}