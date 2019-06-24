package com.murilokr.pads.logic

import org.json.JSONObject

data class PadSequence(val color: String, val pad: Int, val time: Double)



fun createSequence(): ArrayList<PadSequence>{
    var sequence = ArrayList<PadSequence>()
    val obj = getJSONSequence()

    //println(obj.getJSONObject("sequence").length())

    val arr = obj.getJSONArray("sequence")
    for (i in 0 until arr.length()) {
        val color = arr.getJSONObject(i).getString("color")
        val pad = arr.getJSONObject(i).getInt("pad")
        val time = arr.getJSONObject(i).getDouble("time")

        sequence.add(PadSequence(color, pad, time))
    }
    return sequence
}

fun getJSONSequence() = JSONObject("{\n" +
        "\t\"sequence\": \n" +
        "\t[\n" +
        "\t  {\n" +
        "\t\t\"color\": \"page\", \n" +
        "\t\t\"pad\": 100, \n" +
        "\t\t\"state\": 1, \n" +
        "\t\t\"time\": 0\n" +
        "\t  }, \n" +
        "\t  {\n" +
        "\t\t\"color\": \"green\", \n" +
        "\t\t\"pad\": 1, \n" +
        "\t\t\"state\": 1, \n" +
        "\t\t\"time\": 6.183232125011273\n" +
        "\t  }, \n" +
        "\t  {\n" +
        "\t\t\"color\": \"pink\", \n" +
        "\t\t\"pad\": 3, \n" +
        "\t\t\"state\": 1, \n" +
        "\t\t\"time\": 6.18331770831719\n" +
        "\t  }, \n" +
        "\t  {\n" +
        "\t\t\"color\": \"green\", \n" +
        "\t\t\"pad\": 4, \n" +
        "\t\t\"state\": 1, \n" +
        "\t\t\"time\": 6.7820847916882485\n" +
        "\t  }, \n" +
        "\t  {\n" +
        "\t\t\"color\": \"pink\", \n" +
        "\t\t\"pad\": 6, \n" +
        "\t\t\"state\": 1, \n" +
        "\t\t\"time\": 7.384627374995034\n" +
        "\t  }, \n" +
        "\t  {\n" +
        "\t\t\"color\": \"green\", \n" +
        "\t\t\"pad\": 7, \n" +
        "\t\t\"state\": 1, \n" +
        "\t\t\"time\": 7.384750291646924\n" +
        "\t  }, \n" +
        "\t  {\n" +
        "\t\t\"color\": \"green\", \n" +
        "\t\t\"pad\": 10, \n" +
        "\t\t\"state\": 1, \n" +
        "\t\t\"time\": 7.991352166689467\n" +
        "\t  }, \n" +
        "\t  {\n" +
        "\t\t\"color\": \"pink\", \n" +
        "\t\t\"pad\": 9, \n" +
        "\t\t\"state\": 1, \n" +
        "\t\t\"time\": 8.61035266664112\n" +
        "\t  }, \n" +
        "\t  {\n" +
        "\t\t\"color\": \"green\", \n" +
        "\t\t\"pad\": 1, \n" +
        "\t\t\"state\": 1, \n" +
        "\t\t\"time\": 8.610441749973688\n" +
        "\t  }, \n" +
        "\t  {\n" +
        "\t\t\"color\": \"green\", \n" +
        "\t\t\"pad\": 4, \n" +
        "\t\t\"state\": 1, \n" +
        "\t\t\"time\": 9.2253607083112\n" +
        "\t  }, \n" +
        "\t  {\n" +
        "\t\t\"color\": \"green\", \n" +
        "\t\t\"pad\": 7, \n" +
        "\t\t\"state\": 1, \n" +
        "\t\t\"time\": 9.81747829169035\n" +
        "\t  }, \n" +
        "\t  {\n" +
        "\t\t\"color\": \"pink\", \n" +
        "\t\t\"pad\": 12, \n" +
        "\t\t\"state\": 1, \n" +
        "\t\t\"time\": 9.8342857916723\n" +
        "\t  }, \n" +
        "\t  {\n" +
        "\t\t\"color\": \"green\", \n" +
        "\t\t\"pad\": 10, \n" +
        "\t\t\"state\": 1, \n" +
        "\t\t\"time\": 10.426727958314586\n" +
        "\t  }, \n" +
        "\t  {\n" +
        "\t\t\"color\": \"pink\", \n" +
        "\t\t\"pad\": 3, \n" +
        "\t\t\"state\": 1, \n" +
        "\t\t\"time\": 11.020058625028469\n" +
        "\t  }, \n" +
        "\t  {\n" +
        "\t\t\"color\": \"green\", \n" +
        "\t\t\"pad\": 1, \n" +
        "\t\t\"state\": 1, \n" +
        "\t\t\"time\": 11.020156083337497\n" +
        "\t  }, \n" +
        "\t  {\n" +
        "\t\t\"color\": \"green\", \n" +
        "\t\t\"pad\": 4, \n" +
        "\t\t\"state\": 1, \n" +
        "\t\t\"time\": 11.619872166658752\n" +
        "\t  }, \n" +
        "\t  {\n" +
        "\t\t\"color\": \"pink\", \n" +
        "\t\t\"pad\": 6, \n" +
        "\t\t\"state\": 1, \n" +
        "\t\t\"time\": 12.195833250007126\n" +
        "\t  }, \n" +
        "\t  {\n" +
        "\t\t\"color\": \"green\", \n" +
        "\t\t\"pad\": 7, \n" +
        "\t\t\"state\": 1, \n" +
        "\t\t\"time\": 12.195960291661322\n" +
        "\t  }, \n" +
        "\t  {\n" +
        "\t\t\"color\": \"green\", \n" +
        "\t\t\"pad\": 10, \n" +
        "\t\t\"state\": 1, \n" +
        "\t\t\"time\": 12.79520970833255\n" +
        "\t  }, \n" +
        "\t  {\n" +
        "\t\t\"color\": \"pink\", \n" +
        "\t\t\"pad\": 9, \n" +
        "\t\t\"state\": 1, \n" +
        "\t\t\"time\": 13.390162916679401\n" +
        "\t  }, \n" +
        "\t  {\n" +
        "\t\t\"color\": \"green\", \n" +
        "\t\t\"pad\": 1, \n" +
        "\t\t\"state\": 1, \n" +
        "\t\t\"time\": 13.390277333324775\n" +
        "\t  }, \n" +
        "\t  {\n" +
        "\t\t\"color\": \"green\", \n" +
        "\t\t\"pad\": 4, \n" +
        "\t\t\"state\": 1, \n" +
        "\t\t\"time\": 13.995673249999527\n" +
        "\t  }, \n" +
        "\t  {\n" +
        "\t\t\"color\": \"green\", \n" +
        "\t\t\"pad\": 7, \n" +
        "\t\t\"state\": 1, \n" +
        "\t\t\"time\": 14.580070666677784\n" +
        "\t  }, \n" +
        "\t  {\n" +
        "\t\t\"color\": \"green\", \n" +
        "\t\t\"pad\": 10, \n" +
        "\t\t\"state\": 1, \n" +
        "\t\t\"time\": 15.170116958324797\n" +
        "\t  }, \n" +
        "\t  {\n" +
        "\t\t\"color\": \"green\", \n" +
        "\t\t\"pad\": 1, \n" +
        "\t\t\"state\": 1, \n" +
        "\t\t\"time\": 15.779950583353639\n" +
        "\t  }, \n" +
        "\t  {\n" +
        "\t\t\"color\": \"pink\", \n" +
        "\t\t\"pad\": 3, \n" +
        "\t\t\"state\": 1, \n" +
        "\t\t\"time\": 15.796198041643947\n" +
        "\t  }, \n" +
        "\t  {\n" +
        "\t\t\"color\": \"green\", \n" +
        "\t\t\"pad\": 5, \n" +
        "\t\t\"state\": 1, \n" +
        "\t\t\"time\": 16.33891200000653\n" +
        "\t  }, \n" +
        "\t  {\n" +
        "\t\t\"color\": \"green\", \n" +
        "\t\t\"pad\": 7, \n" +
        "\t\t\"state\": 1, \n" +
        "\t\t\"time\": 16.956151958322152\n" +
        "\t  }, \n" +
        "\t  {\n" +
        "\t\t\"color\": \"pink\", \n" +
        "\t\t\"pad\": 6, \n" +
        "\t\t\"state\": 1, \n" +
        "\t\t\"time\": 16.97156654164428\n" +
        "\t  }, \n" +
        "\t  {\n" +
        "\t\t\"color\": \"green\", \n" +
        "\t\t\"pad\": 11, \n" +
        "\t\t\"state\": 1, \n" +
        "\t\t\"time\": 17.563881958310958\n" +
        "\t  }, \n" +
        "\t  {\n" +
        "\t\t\"color\": \"green\", \n" +
        "\t\t\"pad\": 1, \n" +
        "\t\t\"state\": 1, \n" +
        "\t\t\"time\": 18.147990958357695\n" +
        "\t  }, \n" +
        "\t  {\n" +
        "\t\t\"color\": \"pink\", \n" +
        "\t\t\"pad\": 9, \n" +
        "\t\t\"state\": 1, \n" +
        "\t\t\"time\": 18.16429366666125\n" +
        "\t  }, \n" +
        "\t  {\n" +
        "\t\t\"color\": \"green\", \n" +
        "\t\t\"pad\": 5, \n" +
        "\t\t\"state\": 1, \n" +
        "\t\t\"time\": 18.731306999980006\n" +
        "\t  }, \n" +
        "\t  {\n" +
        "\t\t\"color\": \"green\", \n" +
        "\t\t\"pad\": 7, \n" +
        "\t\t\"state\": 1, \n" +
        "\t\t\"time\": 19.33174254168989\n" +
        "\t  }, \n" +
        "\t  {\n" +
        "\t\t\"color\": \"pink\", \n" +
        "\t\t\"pad\": 12, \n" +
        "\t\t\"state\": 1, \n" +
        "\t\t\"time\": 19.365655999979936\n" +
        "\t  }, \n" +
        "\t  {\n" +
        "\t\t\"color\": \"green\", \n" +
        "\t\t\"pad\": 11, \n" +
        "\t\t\"state\": 1, \n" +
        "\t\t\"time\": 19.90721670835046\n" +
        "\t  }, \n" +
        "\t  {\n" +
        "\t\t\"color\": \"green\", \n" +
        "\t\t\"pad\": 1, \n" +
        "\t\t\"state\": 1, \n" +
        "\t\t\"time\": 20.490605416649487\n" +
        "\t  }, \n" +
        "\t  {\n" +
        "\t\t\"color\": \"pink\", \n" +
        "\t\t\"pad\": 3, \n" +
        "\t\t\"state\": 1, \n" +
        "\t\t\"time\": 20.5073483333108\n" +
        "\t  }, \n" +
        "\t  {\n" +
        "\t\t\"color\": \"green\", \n" +
        "\t\t\"pad\": 8, \n" +
        "\t\t\"state\": 1, \n" +
        "\t\t\"time\": 21.057604999979958\n" +
        "\t  }, \n" +
        "\t  {\n" +
        "\t\t\"color\": \"green\", \n" +
        "\t\t\"pad\": 7, \n" +
        "\t\t\"state\": 1, \n" +
        "\t\t\"time\": 21.659688041661866\n" +
        "\t  }, \n" +
        "\t  {\n" +
        "\t\t\"color\": \"pink\", \n" +
        "\t\t\"pad\": 6, \n" +
        "\t\t\"state\": 1, \n" +
        "\t\t\"time\": 21.659796125022694\n" +
        "\t  }, \n" +
        "\t  {\n" +
        "\t\t\"color\": \"green\", \n" +
        "\t\t\"pad\": 11, \n" +
        "\t\t\"state\": 1, \n" +
        "\t\t\"time\": 22.241300874971785\n" +
        "\t  }, \n" +
        "\t  {\n" +
        "\t\t\"color\": \"green\", \n" +
        "\t\t\"pad\": 2, \n" +
        "\t\t\"state\": 1, \n" +
        "\t\t\"time\": 22.82718908332754\n" +
        "\t  }, \n" +
        "\t  {\n" +
        "\t\t\"color\": \"pink\", \n" +
        "\t\t\"pad\": 3, \n" +
        "\t\t\"state\": 1, \n" +
        "\t\t\"time\": 22.82728708331706\n" +
        "\t  }, \n" +
        "\t  {\n" +
        "\t\t\"color\": \"page\", \n" +
        "\t\t\"pad\": 101, \n" +
        "\t\t\"state\": 1, \n" +
        "\t\t\"time\": 23.686882916663308\n" +
        "\t  }, \n" +
        "\t  {\n" +
        "\t\t\"color\": \"blue\", \n" +
        "\t\t\"pad\": 16, \n" +
        "\t\t\"state\": 1, \n" +
        "\t\t\"time\": 25.195323666674085\n" +
        "\t  }, \n" +
        "\t  {\n" +
        "\t\t\"color\": \"pink\", \n" +
        "\t\t\"pad\": 13, \n" +
        "\t\t\"state\": 1, \n" +
        "\t\t\"time\": 25.19643654167885\n" +
        "\t  }, \n" +
        "\t  {\n" +
        "\t\t\"color\": \"pink\", \n" +
        "\t\t\"pad\": 14, \n" +
        "\t\t\"state\": 1, \n" +
        "\t\t\"time\": 29.30379158334108\n" +
        "\t  }, \n" +
        "\t  {\n" +
        "\t\t\"color\": \"pink\", \n" +
        "\t\t\"pad\": 15, \n" +
        "\t\t\"state\": 1, \n" +
        "\t\t\"time\": 29.92977608332876\n" +
        "\t  }, \n" +
        "\t  {\n" +
        "\t\t\"color\": \"pink\", \n" +
        "\t\t\"pad\": 17, \n" +
        "\t\t\"state\": 1, \n" +
        "\t\t\"time\": 30.53062149998732\n" +
        "\t  }, \n" +
        "\t  {\n" +
        "\t\t\"color\": \"pink\", \n" +
        "\t\t\"pad\": 18, \n" +
        "\t\t\"state\": 1, \n" +
        "\t\t\"time\": 31.138504333328456\n" +
        "\t  }, \n" +
        "\t  {\n" +
        "\t\t\"color\": \"pink\", \n" +
        "\t\t\"pad\": 20, \n" +
        "\t\t\"state\": 1, \n" +
        "\t\t\"time\": 32.0140969583299\n" +
        "\t  }, \n" +
        "\t  {\n" +
        "\t\t\"color\": \"pink\", \n" +
        "\t\t\"pad\": 21, \n" +
        "\t\t\"state\": 1, \n" +
        "\t\t\"time\": 32.6146092916606\n" +
        "\t  }, \n" +
        "\t  {\n" +
        "\t\t\"color\": \"pink\", \n" +
        "\t\t\"pad\": 22, \n" +
        "\t\t\"state\": 1, \n" +
        "\t\t\"time\": 33.223914291651454\n" +
        "\t  }, \n" +
        "\t  {\n" +
        "\t\t\"color\": \"pink\", \n" +
        "\t\t\"pad\": 23, \n" +
        "\t\t\"state\": 1, \n" +
        "\t\t\"time\": 33.82334233331494\n" +
        "\t  }, \n" +
        "\t  {\n" +
        "\t\t\"color\": \"pink\", \n" +
        "\t\t\"pad\": 24, \n" +
        "\t\t\"state\": 1, \n" +
        "\t\t\"time\": 34.40714687498985\n" +
        "\t  }, \n" +
        "\t  {\n" +
        "\t\t\"color\": \"pink\", \n" +
        "\t\t\"pad\": 13, \n" +
        "\t\t\"state\": 1, \n" +
        "\t\t\"time\": 34.70695474999957\n" +
        "\t  }, \n" +
        "\t  {\n" +
        "\t\t\"color\": \"pink\", \n" +
        "\t\t\"pad\": 14, \n" +
        "\t\t\"state\": 1, \n" +
        "\t\t\"time\": 38.81923570833169\n" +
        "\t  }, \n" +
        "\t  {\n" +
        "\t\t\"color\": \"pink\", \n" +
        "\t\t\"pad\": 15, \n" +
        "\t\t\"state\": 1, \n" +
        "\t\t\"time\": 39.43597450002562\n" +
        "\t  }, \n" +
        "\t  {\n" +
        "\t\t\"color\": \"pink\", \n" +
        "\t\t\"pad\": 17, \n" +
        "\t\t\"state\": 1, \n" +
        "\t\t\"time\": 40.03588124999078\n" +
        "\t  }, \n" +
        "\t  {\n" +
        "\t\t\"color\": \"pink\", \n" +
        "\t\t\"pad\": 18, \n" +
        "\t\t\"state\": 1, \n" +
        "\t\t\"time\": 40.63636716664769\n" +
        "\t  }, \n" +
        "\t  {\n" +
        "\t\t\"color\": \"pink\", \n" +
        "\t\t\"pad\": 20, \n" +
        "\t\t\"state\": 1, \n" +
        "\t\t\"time\": 41.51990675000707\n" +
        "\t  }, \n" +
        "\t  {\n" +
        "\t\t\"color\": \"green\", \n" +
        "\t\t\"pad\": 19, \n" +
        "\t\t\"state\": 1, \n" +
        "\t\t\"time\": 41.82218266668497\n" +
        "\t  }, \n" +
        "\t  {\n" +
        "\t\t\"color\": \"blue\", \n" +
        "\t\t\"pad\": 16, \n" +
        "\t\t\"state\": 0, \n" +
        "\t\t\"time\": 41.822288875002414\n" +
        "\t  }, \n" +
        "\t  {\n" +
        "\t\t\"color\": \"pink\", \n" +
        "\t\t\"pad\": 21, \n" +
        "\t\t\"state\": 1, \n" +
        "\t\t\"time\": 42.128625416662544\n" +
        "\t  }, \n" +
        "\t  {\n" +
        "\t\t\"color\": \"pink\", \n" +
        "\t\t\"pad\": 22, \n" +
        "\t\t\"state\": 1, \n" +
        "\t\t\"time\": 42.71254316664999\n" +
        "\t  }, \n" +
        "\t  {\n" +
        "\t\t\"color\": \"pink\", \n" +
        "\t\t\"pad\": 23, \n" +
        "\t\t\"state\": 1, \n" +
        "\t\t\"time\": 43.31329887500033\n" +
        "\t  }, \n" +
        "\t  {\n" +
        "\t\t\"color\": \"pink\", \n" +
        "\t\t\"pad\": 24, \n" +
        "\t\t\"state\": 1, \n" +
        "\t\t\"time\": 43.86338062497089\n" +
        "\t  }\n" +
        "\t]\n" +
        "}")