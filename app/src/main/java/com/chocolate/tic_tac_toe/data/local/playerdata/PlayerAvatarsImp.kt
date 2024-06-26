package com.chocolate.tic_tac_toe.data.local.playerdata

import com.chocolate.tic_tac_toe.data.local.PlayerAvatars
import javax.inject.Inject

class PlayerAvatarsImp @Inject constructor(): PlayerAvatars {
    override fun getPlayerAvatars(): List<String> {
        return listOf(
            "https://png.pngtree.com/png-vector/20230814/ourmid/pngtree-cartoon-cartoon-character-of-a-square-cheese-clipart-vector-png-image_6844868.png",
            "https://png.pngtree.com/png-vector/20240131/ourmid/pngtree-funny-square-cartoon-character-element-png-image_11520739.png",
            "https://png.pngtree.com/png-clipart/20240315/original/pngtree-funny-square-cartoon-character-element-png-image_14594078.png",
            "https://png.pngtree.com/png-vector/20240131/ourmid/pngtree-funny-square-cartoon-character-element-png-image_11520738.png"
        )
    }
}