package edu.iesam.alarma

import android.view.View
import android.widget.Toast
import android.widget.Toast.LENGTH_SHORT
import androidx.recyclerview.widget.RecyclerView
import edu.iesam.alarma.databinding.ItemAlarmViewBinding

class AlarmViewHolder (val view: View) : RecyclerView.ViewHolder(view) {

    private val binding = ItemAlarmViewBinding.bind(view)

    fun bind(model : Alarm){
        binding.apply {
            hour.text = model.hour
            iteration.text = model.iteration
            description.text = model.description
            onOff.setChecked(model.cheked)

            if (!model.cheked){
                view.setAlpha(0.5f)
            }

            onOff.setOnCheckedChangeListener { buttonView, isChecked ->
                if (!isChecked){
                    view.setAlpha(0.5f)
                    Toast.makeText(view.context, "${model.description.toString()} | Desactivada", LENGTH_SHORT).show()
                }
                if (isChecked){
                    view.setAlpha(1.0f)
                    Toast.makeText(view.context, "${model.description.toString()} | Activada", LENGTH_SHORT).show()

                }


            }
        }
    }


}