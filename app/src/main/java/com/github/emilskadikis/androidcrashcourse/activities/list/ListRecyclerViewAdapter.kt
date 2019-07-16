package com.github.emilskadikis.androidcrashcourse.activities.list

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.AppCompatTextView
import androidx.recyclerview.widget.RecyclerView
import com.github.emilskadikis.androidcrashcourse.R
import com.github.emilskadikis.androidcrashcourse.data.Product

class ListRecyclerViewAdapter(val data: List<Product>) : RecyclerView.Adapter<ListRecyclerViewAdapter.ViewHolder>() {
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(item: Product) = with(itemView) {
            itemView.findViewById<AppCompatTextView>(R.id.textViewTitle).text = item.name
            //TODO 5: Display price and truncated description.
            setOnClickListener {
                // TODO 6: Show a dialog window with the full description
            }
        }
    }



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.list_item, parent, false)
        )
    }

    override fun getItemCount() = data.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) = holder.bind(data[position])

}