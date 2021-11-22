package com.timeapp.interestingtimeapp

val IDS_ALL_ITEMS = arrayListOf(
    arrayListOf(R.id.l1_c7, R.id.l1_c8, R.id.l1_c9, R.id.l1_c10, R.id.l1_c11),
    arrayListOf(R.id.l2_c1, R.id.l2_c2, R.id.l2_c3, R.id.l2_c4, R.id.l2_c5, R.id.l2_c6, R.id.l2_c7, R.id.l2_c8, R.id.l2_c9, R.id.l2_c10, R.id.l2_c11),
    arrayListOf(R.id.l3_c1, R.id.l3_c2, R.id.l3_c3, R.id.l3_c4, R.id.l3_c5, R.id.l3_c6, R.id.l3_c7, R.id.l3_c8, R.id.l3_c9, R.id.l3_c10, R.id.l3_c11),
    arrayListOf(R.id.l4_c1, R.id.l4_c2, R.id.l4_c3, R.id.l4_c4, R.id.l4_c5, R.id.l4_c6, R.id.l4_c7, R.id.l4_c8, R.id.l4_c9, R.id.l4_c10, R.id.l4_c11),
    arrayListOf(R.id.l5_c1, R.id.l5_c2, R.id.l5_c3, R.id.l5_c4, R.id.l5_c5, R.id.l5_c6, R.id.l5_c7, R.id.l5_c8, R.id.l5_c9, R.id.l5_c10, R.id.l5_c11),
    arrayListOf(R.id.l6_c1, R.id.l6_c2, R.id.l6_c3, R.id.l6_c4, R.id.l6_c5, R.id.l6_c6),
    arrayListOf(R.id.l7_c1, R.id.l7_c2, R.id.l7_c3, R.id.l7_c4, R.id.l7_c5, R.id.l7_c6, R.id.l7_c7, R.id.l7_c8, R.id.l7_c9, R.id.l7_c10, R.id.l7_c11),
)

val BASIC_HOUR_NUM_CODE = mapOf(
    "0" to arrayListOf(IDS_ALL_ITEMS[0][3]),
    "1" to arrayListOf(IDS_ALL_ITEMS[2][0], IDS_ALL_ITEMS[2][1], IDS_ALL_ITEMS[2][2], IDS_ALL_ITEMS[2][3]),
    "2" to arrayListOf(IDS_ALL_ITEMS[0][1], IDS_ALL_ITEMS[0][2], IDS_ALL_ITEMS[0][3]),
    "3" to arrayListOf(IDS_ALL_ITEMS[3][0], IDS_ALL_ITEMS[3][1], IDS_ALL_ITEMS[3][2]),
    "4" to arrayListOf(IDS_ALL_ITEMS[1][0], IDS_ALL_ITEMS[1][1], IDS_ALL_ITEMS[1][2], IDS_ALL_ITEMS[1][3], IDS_ALL_ITEMS[1][4], IDS_ALL_ITEMS[1][5]),
    "5" to arrayListOf(IDS_ALL_ITEMS[1][9], IDS_ALL_ITEMS[1][10], IDS_ALL_ITEMS[2][9], IDS_ALL_ITEMS[2][10]),
    "6" to arrayListOf(IDS_ALL_ITEMS[5][0], IDS_ALL_ITEMS[5][1], IDS_ALL_ITEMS[5][2], IDS_ALL_ITEMS[5][3], IDS_ALL_ITEMS[5][4]),
    "7" to arrayListOf(IDS_ALL_ITEMS[3][7], IDS_ALL_ITEMS[3][8], IDS_ALL_ITEMS[3][9], IDS_ALL_ITEMS[3][10]),
    "8" to arrayListOf(IDS_ALL_ITEMS[3][5], IDS_ALL_ITEMS[3][6], IDS_ALL_ITEMS[3][7], IDS_ALL_ITEMS[3][8], IDS_ALL_ITEMS[3][9], IDS_ALL_ITEMS[3][10]),
    "9" to arrayListOf(IDS_ALL_ITEMS[3][3], IDS_ALL_ITEMS[3][4], IDS_ALL_ITEMS[3][5], IDS_ALL_ITEMS[4][3], IDS_ALL_ITEMS[4][4], IDS_ALL_ITEMS[4][5]),
    "10" to arrayListOf(IDS_ALL_ITEMS[3][0], IDS_ALL_ITEMS[3][1], IDS_ALL_ITEMS[3][2], IDS_ALL_ITEMS[3][3], IDS_ALL_ITEMS[3][4], IDS_ALL_ITEMS[3][5])
)

val EXPAND_CODE = mapOf(
    "н" to arrayListOf(IDS_ALL_ITEMS[2][3]),
    "на" to arrayListOf(IDS_ALL_ITEMS[2][4], IDS_ALL_ITEMS[2][5]),
    "дцать" to arrayListOf(IDS_ALL_ITEMS[2][6], IDS_ALL_ITEMS[2][7], IDS_ALL_ITEMS[2][8], IDS_ALL_ITEMS[2][9], IDS_ALL_ITEMS[2][10]),
    "надцать" to arrayListOf(IDS_ALL_ITEMS[2][4], IDS_ALL_ITEMS[2][5], IDS_ALL_ITEMS[2][6], IDS_ALL_ITEMS[2][7], IDS_ALL_ITEMS[2][8], IDS_ALL_ITEMS[2][9], IDS_ALL_ITEMS[2][10]),
    "две" to arrayListOf(IDS_ALL_ITEMS[1][6], IDS_ALL_ITEMS[1][7], IDS_ALL_ITEMS[1][8])
)

val STATE_HOUR_CODE = mapOf(
    "часов" to arrayListOf(R.id.hour),
    "часа" to arrayListOf(IDS_ALL_ITEMS[6][0], IDS_ALL_ITEMS[6][1], IDS_ALL_ITEMS[6][2], IDS_ALL_ITEMS[6][3]),
    "час" to arrayListOf(IDS_ALL_ITEMS[6][0], IDS_ALL_ITEMS[6][1], IDS_ALL_ITEMS[6][2])
)