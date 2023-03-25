package com.nastirlex.test

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.nastirlex.test.databinding.ItemCardListBinding

class CardListAdapter: RecyclerView.Adapter<CardListAdapter.CardlistViewHolder>() {
    val colors = arrayListOf(
        0xff8E97FD.toInt(),
        0xffFA6E5A.toInt(),
        0xffFFCF86.toInt(),
        0xffFEB18F.toInt(),
        0xff6CB28E.toInt(),
        0xff3F414E.toInt(),
        0xff8E97FD.toInt(),
        0xffD9A5B5.toInt(),
    )

    val textColors = arrayListOf(
        0xffFFECCC.toInt(),
        0xffFEF9F3.toInt(),
        0xff3F414E.toInt(),
        0xff3F414E.toInt(),

        0xffFFECCC.toInt(),
        0xffEBEAEC.toInt(),
        0xffFEF9F3.toInt(),
        0xffFEF9F3.toInt(),

        )

    val text = arrayListOf(
        "Reduce Stress",
        "Improve Perfomanee",

        "Reduce Anxiety",
        "Increase Happiness",
        "Personal Growth",
        "Better Sleep",
        "Reduce Stress",
        "Reduce Stress",
    )

    val images = arrayListOf(
        R.drawable.reduce,
        R.drawable.perfomance,
        R.drawable.reduce_anxiety,
        R.drawable.increase,
        R.drawable.personal,
        R.drawable.better,
        R.drawable.reduce,
        R.drawable.almost
    )

    class CardlistViewHolder(view: View): RecyclerView.ViewHolder(view) {
        private val viewBinding = ItemCardListBinding.bind(view)

        fun bind(text: String, color: Int, image: Int, textColor: Int) {
            val b = itemView.layoutParams
            viewBinding.textView7.text = text
            viewBinding.cardView.setCardBackgroundColor(color)
            viewBinding.imageView.setImageResource(image)
            viewBinding.textView7.setTextColor(textColor)
            if (itemViewType == 0) {
                b.height = 550
            } else {
                b.height = 490
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardlistViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_card_list, parent, false)
        return CardlistViewHolder(view)
    }

    override fun getItemCount(): Int {
        return 8
    }

    override fun onBindViewHolder(holder: CardlistViewHolder, position: Int) {
        holder.bind(text[position], colors[position], images[position], textColors[position])
    }

    override fun getItemViewType(position: Int): Int {
        when(position) {
            0, 2, 4, 6 -> {
                return 0
            }
            1, 3, 5, 7 -> {
                return 1
            }
        }
        return super.getItemViewType(position)
    }
}