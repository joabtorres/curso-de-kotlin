package co.tiagoaguiar.fitnesstracker

import android.content.Context
import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var rvMain: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mainItens = mutableListOf<MainItem>()
        mainItens.add(
            MainItem(
                id = 1,
                drawableId = R.drawable.ic_baseline_accessibility_new_24,
                textStringId = R.string.imc,
                color = Color.GREEN
            )
        )
        mainItens.add(
            MainItem(
                id = 2,
                drawableId = R.drawable.ic_baseline_admin_panel_settings_24,
                textStringId = R.string.tmb,
                color = Color.BLUE
            )
        )
        mainItens.add(
            MainItem(
                id = 3,
                drawableId = R.drawable.ic_baseline_admin_panel_settings_24,
                textStringId = R.string.app_name,
                color = Color.BLUE
            )
        )
        mainItens.add(
            MainItem(
                id = 4,
                drawableId = R.drawable.ic_baseline_admin_panel_settings_24,
                textStringId = R.string.age,
                color = Color.CYAN
            )
        )

        val adapter = MainAdpter(mainItens) { id ->
            when (id) {
                1 -> {
                    startActivity(Intent(this@MainActivity, ImcActivity::class.java))
                }
                2 -> {
                    //aqui vem outra
                }
            }
            Log.i("test", "ID: $id")
        }
        rvMain = findViewById(R.id.rv_main)
        rvMain.adapter = adapter
        rvMain.layoutManager = GridLayoutManager(this, 2)

    }

    //
    private inner class MainAdpter(
        private val mainItens: List<MainItem>,
        private val onItemClickListener: (Int) -> Unit
    ) :
        RecyclerView.Adapter<MainAdpter.MainViewHolder>() {
        //1 - qual e o layout da celula especifica
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainViewHolder {
            val view = layoutInflater.inflate(R.layout.main_item, parent, false)
            return MainViewHolder(view)
        }

        //2 - disparado toda vez que houver uma rolagem na tela e for ncessario trocar o conteúdo da celula
        override fun onBindViewHolder(holder: MainViewHolder, position: Int) {
            val itemCurrent = mainItens[position]
            holder.bind(itemCurrent)
        }

        //3 - informa a quantidade de celulas
        override fun getItemCount(): Int {
            return mainItens.size
        }

        //classe de celula em si
        private inner class MainViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
            fun bind(item: MainItem) {
                val container: LinearLayout = itemView.findViewById(R.id.item_container)
                val image: ImageView = itemView.findViewById(R.id.item_img_icon)
                val name: TextView = itemView.findViewById(R.id.item_txt_name)

                container.setBackgroundColor(item.color)
                image.setImageResource(item.drawableId)
                name.setText(item.textStringId)

                container.setOnClickListener {
                    onItemClickListener.invoke(item.id)
                }

            }
        }
    }


}