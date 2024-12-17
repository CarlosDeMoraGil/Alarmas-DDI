package edu.iesam.alarma

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import android.widget.Toast.LENGTH_LONG
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.android.material.button.MaterialButton
import com.google.android.material.floatingactionbutton.FloatingActionButton
import edu.iesam.alarma.databinding.AlarmBinding

class MainActivity : AppCompatActivity() {

    // Binding para acceder a las vistas
    private lateinit var binding: AlarmBinding

    // Adaptador para el RecyclerView
    private val adapter = AlarmAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Inflar el layout con View Binding
        binding = AlarmBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Configuración inicial
        setUpView()
        setUpData()

        botones()
    }

    // Configuración de la vista (RecyclerView)
    private fun setUpView() {
        binding.apply {
            recycler.layoutManager = LinearLayoutManager(
                this@MainActivity,
                LinearLayoutManager.VERTICAL,
                false
            )
            recycler.adapter = adapter
        }
    }

    // Cargar datos en el adaptador
    private fun setUpData() {
        val alarms = AlarmMockRemoteDataSource().alarms
        adapter.setDataList(alarms)
    }

    private fun botones(){
        findViewById<FloatingActionButton>(R.id.add).setOnClickListener {
            Toast.makeText(this, "Añadir Alarma", LENGTH_LONG).show()

        }
    }

}
