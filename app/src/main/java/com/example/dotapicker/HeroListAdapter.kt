package com.example.dotapicker

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.example.root.data.Hero

class HeroListAdapter : ListAdapter<Hero, HeroListAdapter.HeroViewHolder>(DiffCallback<Hero>()) {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HeroViewHolder {
        return HeroViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.hero_item, parent, false)
        )
    }

    override fun onBindViewHolder(holder: HeroViewHolder, position: Int) {
        val itemView = getItem(position) as Hero
        holder.bind(itemView)
    }

    class HeroViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val heroName: TextView = itemView.findViewById(R.id.heroName)
        private val attackType: TextView = itemView.findViewById(R.id.attackType)
        private val roles: TextView = itemView.findViewById(R.id.roles)
        private val icon: ImageView = itemView.findViewById(R.id.icon)

        fun bind(hero: Hero) {
            heroName.text = hero.name
            attackType.text = hero.attackType
            for (role in hero.roles) {
                roles.text = (role+ "\n")
            }
            Glide.with(itemView.context)
                .load(hero.icon)
                .diskCacheStrategy(DiskCacheStrategy.DATA)
                .placeholder(R.drawable.ic_launcher_background)
                .error(R.drawable.ic_launcher_background)
                .into(icon)
        }
    }
}