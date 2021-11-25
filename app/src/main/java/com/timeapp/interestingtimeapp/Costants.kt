package com.timeapp.interestingtimeapp

const val MODE_NUM_HOUR = 0
const val MODE_NUM_MINUTES = 1

val IDS_ALL_ITEMS = arrayListOf(
    arrayListOf(R.id.l1_c7, R.id.l1_c8, R.id.l1_c9, R.id.l1_c10, R.id.l1_c11),
    arrayListOf(R.id.l2_c1, R.id.l2_c2, R.id.l2_c3, R.id.l2_c4, R.id.l2_c5, R.id.l2_c6, R.id.l2_c7, R.id.l2_c8, R.id.l2_c9, R.id.l2_c10, R.id.l2_c11),
    arrayListOf(R.id.l3_c1, R.id.l3_c2, R.id.l3_c3, R.id.l3_c4, R.id.l3_c5, R.id.l3_c6, R.id.l3_c7, R.id.l3_c8, R.id.l3_c9, R.id.l3_c10, R.id.l3_c11),
    arrayListOf(R.id.l4_c1, R.id.l4_c2, R.id.l4_c3, R.id.l4_c4, R.id.l4_c5, R.id.l4_c6, R.id.l4_c7, R.id.l4_c8, R.id.l4_c9, R.id.l4_c10, R.id.l4_c11),
    arrayListOf(R.id.l5_c1, R.id.l5_c2, R.id.l5_c3, R.id.l5_c4, R.id.l5_c5, R.id.l5_c6, R.id.l5_c7, R.id.l5_c8, R.id.l5_c9, R.id.l5_c10, R.id.l5_c11),
    arrayListOf(R.id.l6_c1, R.id.l6_c2, R.id.l6_c3, R.id.l6_c4, R.id.l6_c5, R.id.l6_c6),
    arrayListOf(R.id.l7_c1, R.id.l7_c2, R.id.l7_c3, R.id.l7_c4, R.id.l7_c5, R.id.l7_c6, R.id.l7_c7, R.id.l7_c8, R.id.l7_c9, R.id.l7_c10, R.id.l7_c11),
    arrayListOf(R.id.l8_c1, R.id.l8_c2, R.id.l8_c3, R.id.l8_c4, R.id.l8_c5, R.id.l8_c6, R.id.l8_c7, R.id.l8_c8, R.id.l8_c9, R.id.l8_c10, R.id.l8_c11),
    arrayListOf(R.id.l9_c1, R.id.l9_c2, R.id.l9_c3, R.id.l9_c4, R.id.l9_c5, R.id.l9_c6, R.id.l9_c7, R.id.l9_c8, R.id.l9_c9, R.id.l9_c10, R.id.l9_c11),
    arrayListOf(R.id.l10_c1, R.id.l10_c2, R.id.l10_c3, R.id.l10_c4, R.id.l10_c5, R.id.l10_c6, R.id.l10_c7, R.id.l10_c8, R.id.l10_c9, R.id.l10_c10, R.id.l10_c11),
)

val BASIC_HOUR_NUM_CODE = mapOf(
    "0" to arrayListOf(IDS_ALL_ITEMS[0][4]),
    "1" to arrayListOf(IDS_ALL_ITEMS[2][0], IDS_ALL_ITEMS[2][1], IDS_ALL_ITEMS[2][2], IDS_ALL_ITEMS[2][3]),
    "2" to arrayListOf(IDS_ALL_ITEMS[0][1], IDS_ALL_ITEMS[0][2], IDS_ALL_ITEMS[0][3]),
    "3" to arrayListOf(IDS_ALL_ITEMS[3][0], IDS_ALL_ITEMS[3][1], IDS_ALL_ITEMS[3][2]),
    "4" to arrayListOf(IDS_ALL_ITEMS[1][0], IDS_ALL_ITEMS[1][1], IDS_ALL_ITEMS[1][2], IDS_ALL_ITEMS[1][3], IDS_ALL_ITEMS[1][4], IDS_ALL_ITEMS[1][5]),
    "5" to arrayListOf(IDS_ALL_ITEMS[4][7], IDS_ALL_ITEMS[4][8], IDS_ALL_ITEMS[4][9], IDS_ALL_ITEMS[4][10]),
    "6" to arrayListOf(IDS_ALL_ITEMS[5][0], IDS_ALL_ITEMS[5][1], IDS_ALL_ITEMS[5][2], IDS_ALL_ITEMS[5][3], IDS_ALL_ITEMS[5][4]),
    "7" to arrayListOf(IDS_ALL_ITEMS[3][7], IDS_ALL_ITEMS[3][8], IDS_ALL_ITEMS[3][9], IDS_ALL_ITEMS[3][10]),
    "8" to arrayListOf(IDS_ALL_ITEMS[3][5], IDS_ALL_ITEMS[3][6], IDS_ALL_ITEMS[3][7], IDS_ALL_ITEMS[3][8], IDS_ALL_ITEMS[3][9], IDS_ALL_ITEMS[3][10]),
    "9" to arrayListOf(IDS_ALL_ITEMS[3][3], IDS_ALL_ITEMS[3][4], IDS_ALL_ITEMS[3][5], IDS_ALL_ITEMS[4][3], IDS_ALL_ITEMS[4][4], IDS_ALL_ITEMS[4][5]),
    "10" to arrayListOf(IDS_ALL_ITEMS[4][0], IDS_ALL_ITEMS[4][1], IDS_ALL_ITEMS[4][2], IDS_ALL_ITEMS[4][3], IDS_ALL_ITEMS[4][4], IDS_ALL_ITEMS[4][5])
)

val BASIC_MINUTES_NUM_CODE = mapOf<String, MutableList<Int>>(
    "0" to arrayListOf(IDS_ALL_ITEMS[8][9]),
    "1" to arrayListOf(),
    "2" to arrayListOf(IDS_ALL_ITEMS[6][5], IDS_ALL_ITEMS[6][6], IDS_ALL_ITEMS[6][7]),
    "3" to arrayListOf(IDS_ALL_ITEMS[6][10], IDS_ALL_ITEMS[6][9], IDS_ALL_ITEMS[6][8]),
    "4" to arrayListOf(),
    "5" to arrayListOf(IDS_ALL_ITEMS[9][0], IDS_ALL_ITEMS[9][1], IDS_ALL_ITEMS[9][2], IDS_ALL_ITEMS[9][3]),
    "6" to arrayListOf(),
    "7" to arrayListOf(),
    "8" to arrayListOf(),
    "9" to arrayListOf(),
    "10" to arrayListOf(IDS_ALL_ITEMS[8][1], IDS_ALL_ITEMS[8][2], IDS_ALL_ITEMS[8][3], IDS_ALL_ITEMS[8][4], IDS_ALL_ITEMS[8][5], IDS_ALL_ITEMS[9][3])
)

val EXPAND_CODE_HOUR = mapOf(
    "дцать" to arrayListOf(IDS_ALL_ITEMS[2][6], IDS_ALL_ITEMS[2][7], IDS_ALL_ITEMS[2][8], IDS_ALL_ITEMS[2][9], IDS_ALL_ITEMS[2][10]),
    "надцать" to arrayListOf(IDS_ALL_ITEMS[2][4], IDS_ALL_ITEMS[2][5], IDS_ALL_ITEMS[2][6], IDS_ALL_ITEMS[2][7], IDS_ALL_ITEMS[2][8], IDS_ALL_ITEMS[2][9], IDS_ALL_ITEMS[2][10]),
    "две" to arrayListOf(IDS_ALL_ITEMS[1][6], IDS_ALL_ITEMS[1][7], IDS_ALL_ITEMS[1][8]),
)

val EXPAND_CODE_MINUTES = mapOf(
    "дцать" to arrayListOf(IDS_ALL_ITEMS[7][5], IDS_ALL_ITEMS[7][6], IDS_ALL_ITEMS[7][7], IDS_ALL_ITEMS[7][8], IDS_ALL_ITEMS[7][9]),
    "надцать" to arrayListOf(IDS_ALL_ITEMS[7][3], IDS_ALL_ITEMS[7][4], IDS_ALL_ITEMS[7][5], IDS_ALL_ITEMS[7][6], IDS_ALL_ITEMS[7][7], IDS_ALL_ITEMS[7][8], IDS_ALL_ITEMS[7][9]),
    "две" to arrayListOf(),
    "десят" to arrayListOf(IDS_ALL_ITEMS[9][1], IDS_ALL_ITEMS[9][2], IDS_ALL_ITEMS[9][3], IDS_ALL_ITEMS[9][4], IDS_ALL_ITEMS[9][5]),
    "40" to arrayListOf(IDS_ALL_ITEMS[9][6], IDS_ALL_ITEMS[9][7], IDS_ALL_ITEMS[9][8], IDS_ALL_ITEMS[9][9], IDS_ALL_ITEMS[9][10]),
    "5v2" to arrayListOf(IDS_ALL_ITEMS[7][0], IDS_ALL_ITEMS[7][1], IDS_ALL_ITEMS[7][2], IDS_ALL_ITEMS[7][3], IDS_ALL_ITEMS[8][0]),
)

val STATE_HOUR_CODE = mapOf(
    "часов" to arrayListOf(R.id.hour),
    "часа" to arrayListOf(IDS_ALL_ITEMS[6][0], IDS_ALL_ITEMS[6][1], IDS_ALL_ITEMS[6][2], IDS_ALL_ITEMS[6][3]),
    "час" to arrayListOf(IDS_ALL_ITEMS[6][0], IDS_ALL_ITEMS[6][1], IDS_ALL_ITEMS[6][2])
)