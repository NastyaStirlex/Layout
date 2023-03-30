package com.nastirlex.test

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.nastirlex.test.databinding.ItemCardListBinding

class CardListAdapter : RecyclerView.Adapter<CardListAdapter.CardlistViewHolder>() {
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
        "Improve Performanee",
        "Reduce Anxiety",
        "Increase Happiness",
        "Personal Growth",
        "Better Sleep",
        "Reduce Stress",
        "Reduce Stress",
    )

    val images = arrayListOf(
        R.drawable.ic_reduce_stress,
        R.drawable.ic_improve_performance,
        R.drawable.ic_reduce_anxiety,
        R.drawable.ic_increase_happiness,
        R.drawable.ic_personal_growth,
        R.drawable.ic_better_sleep,
        R.drawable.ic_reduce_stress,
        R.drawable.ic_extra
    )

    class CardlistViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        private val viewBinding = ItemCardListBinding.bind(view)

        fun bind(text: String, color: Int, image: Int, textColor: Int) {
            viewBinding.textView7.text = text
            viewBinding.cardView.setCardBackgroundColor(color)
            viewBinding.imageView.setImageResource(image)
            viewBinding.textView7.setTextColor(textColor)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardlistViewHolder {
        val view = if (viewType == 0) LayoutInflater.from(parent.context)
            .inflate(R.layout.item_big_card_list, parent, false)
        else LayoutInflater.from(parent.context).inflate(R.layout.item_card_list, parent, false)
        return CardlistViewHolder(view)
    }

    override fun getItemCount(): Int {
        return 8
    }

    override fun onBindViewHolder(holder: CardlistViewHolder, position: Int) {
        holder.bind(text[position], colors[position], images[position], textColors[position])
    }

    override fun getItemViewType(position: Int): Int {
        when (position) {
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