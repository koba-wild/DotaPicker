package com.example.root.data

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Entity(tableName = "hero_table")
@Parcelize
data class Hero (
    @SerializedName("id") @PrimaryKey val id: Int,
    @SerializedName("localized_name") val name: String,
    @SerializedName("primary_attr") val primaryAttr: String,
    @SerializedName("attack_type") val attackType: String,
    @SerializedName("roles") val roles: ArrayList<String>,
    @SerializedName("img") val img: String,
    @SerializedName("icon") val icon: String,
    @SerializedName("base_health") val baseHealth: Int,
    @SerializedName("base_health_regen") val baseHealthRegen: Int,
    @SerializedName("base_mana") val baseMana: Int,
    @SerializedName("base_mana_regen") val baseManaRegen: Int,
    @SerializedName("base_armor") val baseArmor: Int,
    @SerializedName("base_attack_min") val baseAttack: Int,
    @SerializedName("attack_range") val attackRange: Int,
    @SerializedName("move_speed") val moveSpeed: Int
) : Parcelable